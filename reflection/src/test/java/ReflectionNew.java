import com.arrome.entity.User;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Arrome on 2019/4/27.
 */
public class ReflectionNew {
    String path = "com.arrome.entity.User";

    @Test
    public void newUser() throws Exception {
        Class<User>  clazz = (Class<User>) Class.forName(path);
        //只能使用无参构造器创建,JavaBean要有无参构造器
        User user = clazz.newInstance();
        System.out.println(user);

        Constructor constructor = clazz.getDeclaredConstructor(String.class,int.class);
        User constructorNewUser = (User)constructor.newInstance("Arrome",2);
        System.out.println(constructorNewUser + "," + constructorNewUser.getName());
    }

    @Test
    public void callUserMethod() throws Exception {
        Class<User>  clazz = (Class<User>) Class.forName(path);
        User user = clazz.newInstance();
        //可通过此方法动态的设置
        Method method = clazz.getMethod("setName",String.class);
        method.invoke(user,"Arrome");
        System.out.println(user.getName());
    }

    @Test
    public void callUserField() throws Exception {
        Class<User>  clazz = (Class<User>) Class.forName(path);
        User user = clazz.newInstance();
        //可通过此方法动态的设置
        Field field = clazz.getDeclaredField("name");
        //不执行安全检查
        field.setAccessible(true);
        field.set(user,"Arrome");
        System.out.println(user.getName());
    }
}
