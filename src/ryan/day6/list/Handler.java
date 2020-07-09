package ryan.day6.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Handler {
    public static void main(String[] args) {
        final int start = 11;
        final int end = 20;
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++){
            list.add(i);
        }

        Collections.shuffle(list);
        int removed = list.remove((int) (Math.random()) * list.size());
        int found = findMissingNumber(start, end, list);
        System.out.println(list.size());
        System.out.println(list.toString());
        System.out.printf("find missing number: %d\n", found);
        System.out.println(removed == found ? "Success" : "failed");
    }

    public static int findMissingNumber(int start, int end, List<Integer> list){
        if ((start + end) % 2 != 0){        // 若首位两数相加为奇数，则需要填充一个数，使其计算中间数时是一个整数
            end++;
            list.add(end);
        }
        int middle = (start + end) / 2;
        int sumDiff = 0;
        for (Integer v : list){
            sumDiff += v - middle;
        }
        return middle - sumDiff;
    }
}
