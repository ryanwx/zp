package ryan.day4.generic;

import java.util.ArrayList;

public class Handler {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("hello ArrayList<T>");

        System.out.printf("arrayList<String> index 0, value: %s\n", stringArrayList.get(0));

        Leopard leopard = new Leopard(68);

        Cheetah cheetah = new Cheetah(120);

        switch (cheetah.raceTo(leopard)){
            case 1:
                System.out.println("cheetah more fasted then leopard");
                break;
            case -1:
                System.out.println("leopard more fasted then cheetah");
                break;
            default:
                System.out.println("leopard speed equals cheetah");
        }

        Pair<Integer> p = new Pair<>(123, 456);

        setPair(p, 223, 556);
        int n = add(p);
        System.out.println(n);

    }

    public static int add(Pair<? extends Number> p){
        // ? extends Number，getter 返回一个 T 类型，T 类型必然继承 Number 或者 Number 本身
        // java 多态特性，规定返回值是一个 Number 类型，这是合法的
        Number first = p.getFirst();
        Number last = p.getLast();

        // p.setFist(100); 无法设置，? extends Number，T 可能是Number 的任何一个子类，
        // set 时 需要一个与Pair(T) 相同类型的 T 类型参数，编译器无法是否正确，编译不通过
        return first.intValue() + last.intValue();
    }

    public static void setPair(Pair<? super Integer> p, Integer first, Integer last){
        // ? super Integer，setter 是需要一个 T 类型的参数，T 必然是 Integer 的父类 或者 Integer 本身
        // java 的多态特性，传入一个 Integer 是合法的
        p.setFirst(first);
        p.setLast(last);
        // Integer first = p.getFirst(); ? super Integer，T 可能是 Integer 的任何一个父类，
        // getter 时返回一个 T 类型与 Pair(T) 的 T 类型相同，但编译器只知道 T 是 子类是 Integer 不能确认 T 是具体的哪个类
    }
}
