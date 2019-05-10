import org.junit.Test;

/**
 * Created by Arrome on 2019/4/27.
 */
public class StaticTest {

    @Test
    public void testDemo(){
        Demo demo = new Demo();
        demo.outputLine();
    }

    @Test
    public void testExtends(){
        Sub sub = new Sub();
        System.out.println(Sub.b);
        System.out.println(Parent.b);

        System.out.println("---------------");
        Sub.outputParentParams();
    }
}
