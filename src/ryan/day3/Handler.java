package ryan.day3;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class Handler {

    public static void main(String[] args) throws Exception {
        // 只有该属性具有 getter 或者 setter 方法才会在 BeanInfo 中
        BeanInfo info = Introspector.getBeanInfo(PracticeJavaBean.class);
        for (PropertyDescriptor pd : info.getPropertyDescriptors()){
            System.out.println(pd.getName());
            System.out.println(" " + pd.getReadMethod());
            System.out.println(" " + pd.getWriteMethod());
        }

        System.out.printf("test enum class sat: %d", PracticeEnum.SAT.getValue());
    }
}
