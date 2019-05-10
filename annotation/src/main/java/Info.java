import java.lang.annotation.*;

/**
 * Created by Arrome on 2019/4/26.
 * 自定义注解，不能继承其他注解或接口
 *
 * 4个元注解类型：
 * @Inherited 表明被标注的注解类型是被继承的。(即@Inherited修饰的annotation作用于class，同时也作用于这个class的子类)
 * @Documented 标记注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Inherited
public @interface Info {
    public String name() default "";
    //经常使用""空串和0,
    public int info() default 0;
    public String[] like();
    public Color color();
}
