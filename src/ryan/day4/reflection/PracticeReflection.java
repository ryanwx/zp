package ryan.day4.reflection;

import ryan.day2.*;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class PracticeReflection {
    public static void main(String[] args) {
        Student student = new Student(new PersonEyes("grey"), new Leg(), new Heart(), "第二中学", new Sequence());
        Class c = student.getClass();
        for ( Field field : c.getDeclaredFields()){
            try{
                System.out.printf("field name is : %s, field value is : %s\n", field.getName(), field.get(student));
            }catch (Exception e){   // 私有属性不能调用field.get
               System.out.printf("get a exception: %s\n", e);
            }
        }

        for (Method method : c.getMethods()){
            System.out.printf("method name: %s\n", method.getName());
        }
        try{
            Method m = c.getMethod("run", String.class);    // 反射获取方法时，需要同时判断方法的参数是否一致(这是优越java的重载特性导致的)
            m.invoke(student, "test");
        }catch (Exception e){
            System.out.printf("get a exception: %s\n", e);
        }

        try{
            Method m = c.getMethod("run");
            m.invoke(student);
        }catch (Exception e){
            System.out.printf("get a exception: %s\n", e);
        }

        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method);
                if(method.getName().equals("hello")){
                    System.out.println("PracticeInvocation hello " + args[0]);
                }
                return null;
            }
        };

        PracticeInvocation invocation = (PracticeInvocation) Proxy.newProxyInstance(PracticeInvocation.class.getClassLoader(),
                new Class[]{PracticeInvocation.class}, handler);
        invocation.hello(new String("a"));
    }
}
