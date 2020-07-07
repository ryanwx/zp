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
    }
}
