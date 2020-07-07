package ryan.day5.annotation;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Handler {
    public static void main(String[] args) throws Exception {
        Person person = new Person(26, "zq");
        for (Field field : person.getClass().getDeclaredFields()){
            ValidatorAnnotation validator = field.getAnnotation(ValidatorAnnotation.class);
            if (validator != null){
                // 使用 PropertyDescriptor 类构造 javabean 类的 getter, setter 方法
                PropertyDescriptor descriptor = new PropertyDescriptor(field.getName(), person.getClass());
                Method readMethod = descriptor.getReadMethod();
                Object o = readMethod.invoke(person);
                ValidatorImpl validatorImpl = new ValidatorImpl(validator.max(), validator.min(), validator.len());
                if (o instanceof String){
                    System.out.printf("field %s validate result is : %b\n", field.getName(), validatorImpl.validate(o.toString()));
                }else if(o instanceof Number) {
                    System.out.printf("field %s validate result is : %b\n", field.getName(), validatorImpl.validate(((Number) o).intValue()));
                }
            }
        }
    }
}
