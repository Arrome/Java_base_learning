import com.arrome.entity.Box;
import org.junit.Test;

/**
 * Created by Arrome on 2019/4/27.
 */
public class TestDemo {

    @Test
    public void test(){
        Box<String> name = new Box<String>("Arrome");
        Box<Integer> age = new Box<Integer>(20);

        System.out.println(name.getClass());
        System.out.println(age.getClass());
        System.out.println(age.getClass() == name.getClass());
    }

    private static void getData(Box<Number> box){
        System.out.println(box.getData());
    }

    private static void getData1(Box<?> box){
        System.out.println(box.getData());
    }

    /*
     * 类型通配符上限,自身及其子类可用
     */
    private static void getData2(Box<? extends Number> box){
        System.out.println(box.getData());
    }

    /*
     * 类型通配符下限
     */
    private static void getData3(Box<? super Number> box){
        System.out.println(box.getData());
    }

    @Test
    public void test1(){
        Box<Number> numberBox = new Box<Number>(22);
        Box<Integer> integerBox = new Box<Integer>(20);

        TestDemo.getData(numberBox);
        //TestDemo.getData(integerBox); //报错
        Box integerBox1 = new Box<Integer>(20);
        TestDemo.getData(integerBox1);

        TestDemo.getData1(integerBox);

        //TestDemo.getData3(integerBox);//报错
    }
}
