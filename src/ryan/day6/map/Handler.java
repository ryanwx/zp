package ryan.day6.map;

import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class Handler {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 20);
        map.put("banana", 8);
        map.put("orange", 25);
        for (Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.printf("key => value, %s => %d\n", entry.getKey(), entry.getValue());
        }

        // enum 枚举 map
        Map<DayOfWeek, String> enumMap = new  EnumMap<>(DayOfWeek.class);
        enumMap.put(DayOfWeek.MONDAY, "星期一");
        enumMap.put(DayOfWeek.TUESDAY, "星期二");
        enumMap.put(DayOfWeek.WEDNESDAY, "星期三");
        enumMap.put(DayOfWeek.THURSDAY, "星期四");
        enumMap.put(DayOfWeek.FRIDAY, "星期五");
        enumMap.put(DayOfWeek.SATURDAY, "星期六");
        enumMap.put(DayOfWeek.SUNDAY, "星期日");

        System.out.printf("thursday: %s\n", enumMap.get(DayOfWeek.THURSDAY));
    }
}
