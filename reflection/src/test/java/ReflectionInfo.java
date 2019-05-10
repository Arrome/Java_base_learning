import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Arrome on 2019/4/27.
 */
public class ReflectionInfo {

    @Test
    public void getFieldInfo(){
        try {
            Class<?> clazz = Class.forName("com.arrome.entity.User");
            Field[] fileld = clazz.getFields();//只能获取public的字段信息
            System.out.println(fileld.length);

            Field[] fileldAll = clazz.getDeclaredFields();//获取所有声明的字段信息
            System.out.println(fileldAll.length);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getMethodsInfo(){
        try {
            Class<?> clazz = Class.forName("com.arrome.entity.User");
            Method[] methods = clazz.getMethods();//只能获取public的信息
            System.out.println(methods.length);
            for (int i = 0; i < methods.length; i++){
                Method method = methods[i];
                System.out.println(method);
            }

            Method[] MethodAll = clazz.getDeclaredMethods();//获取声明所有的信息
            System.out.println(MethodAll.length);

            Method method = clazz.getMethod("getName",null);
            System.out.println(method.getName());
            Method method2 = clazz.getMethod("setName",String.class);
            System.out.println(method2.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getConstructorsInfo(){
        try {
            Class<?> clazz = Class.forName("com.arrome.entity.User");
            Constructor[] constructors = clazz.getConstructors();//只能获取public的字段信息
            System.out.println(constructors.length);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
