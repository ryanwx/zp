package ryan.day6.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class Handler {
    public static void main(String[] args) throws Exception {
        String f = "D:\\Users\\ryan.zhu\\project\\java\\zp\\zp\\src\\ryan\\day6\\properties\\dev-config.properties";
        Properties properties = new Properties();
        properties.load(new FileInputStream(f));
        String key = "db.name";
        System.out.printf("read properties key = %s, value = %s\n", key, properties.get(key));  // root

        key = "mysql";
        System.out.printf("read properties key = %s, value = %s\n", key, properties.get(key));  // null

        key = "project.name";
        System.out.printf("read properties key = %s, value = %s\n", key, properties.get(key));  // 乱码，new FileInputStream 时未指定 utf-8 ，默认时 ascii

        Properties properties1 = new Properties();
        properties1.load(new FileReader(f, StandardCharsets.UTF_8));

        System.out.println("中国");

        System.out.printf("read properties key = %s, value = %s\n", key, properties1.get(key));  //
    }
}
