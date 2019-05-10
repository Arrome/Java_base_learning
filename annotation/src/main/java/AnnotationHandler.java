import java.lang.annotation.Annotation;

/**
 * Created by Arrome on 2019/4/26.
 *
 * 自定义运行时注解解释器：通过反射API java.lang.reflect 包读取运行时Annotation信息
 */
public class AnnotationHandler {
    public static void main(String[] args){
        try {
            Class clazz = Class.forName("Cat");
            Annotation annotation = clazz.getAnnotation(Info.class);
            System.out.println(annotation);

            Annotation[] allAnnoArr = clazz.getAnnotations();

            Annotation[] declaredAnnoArr = clazz.getDeclaredAnnotations();

            if(clazz.isAnnotationPresent(Info.class)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
