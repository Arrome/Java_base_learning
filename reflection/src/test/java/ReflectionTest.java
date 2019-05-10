import com.arrome.entity.User;
import org.junit.Test;

/**
 * Created by Arrome on 2019/4/27.
 */
public class ReflectionTest {

    /*
     * 反射class获取方式
     */
    @Test
    public void testGetways() throws ClassNotFoundException {
        String path = "com.arrome.entity.User";

        //方式一：通过Class.forName(String path)
        Class<?> clazz1 = Class.forName(path);
        System.out.println(clazz1.hashCode());

        Class<?> clazz11 = Class.forName(path);
        System.out.println(clazz11.hashCode());

        User user = new User("test",1);
        System.out.println(user.getClass().hashCode());
        User user1 = new User("test1",10);
        System.out.println(user1.getClass().hashCode());

        //方式二：object.getClass()
        Class<?> clazz2 = path.getClass();
        System.out.println(clazz2.hashCode());
        //方式三：Class.class
        System.out.println(String.class.hashCode());
    }

    /*
     * 对于数组，元素类型和维数相同，对象class相同
     */
    @Test
    public void testArray() {
        int[] arr1 = new int[10];
        int[] arr2 = new int[30];
        int[][] arr3 = new int[10][2];
        double[] arr4 = new double[10];
        System.out.println(arr1.getClass().hashCode());
        System.out.println(arr2.getClass().hashCode());
        System.out.println(arr3.getClass().hashCode());
        System.out.println(arr4.getClass().hashCode());
    }
}
