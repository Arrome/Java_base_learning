/**
 * Created by Arrome on 2019/4/27.
 */
public class Demo {
    public static String name;

    static {
        System.out.println("static block");
        name = "Arrome-staticBlock";
        age = 20;
        //System.out.println(age);
    }

    public static int age = 30;

    public Demo() {

    }

    public void outputLine(){
        System.out.println(Demo.name);
        System.out.println(Demo.age);
    }
}

class Parent {
    public static int a = 1;

    static {
        a = 2;
        b = 3;
    }

    public static int b;
}

class Sub extends Parent {
    public static int b = a;

    public static void outputParentParams(){
        System.out.println(Parent.a);
    }
}