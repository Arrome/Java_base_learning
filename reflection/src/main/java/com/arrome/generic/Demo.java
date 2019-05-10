package com.arrome.generic;

import com.arrome.entity.User;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * Created by Arrome on 2019/4/27.
 */
public class Demo {

    public void test1(Map<String,User> map,List<User> list){
        System.out.println("Demo.test1()");
    }

    public Map<Integer,User> test2(){
        System.out.println("Demo.test2()");
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method m = Demo.class.getMethod("test1",Map.class,List.class);
        Type[] types = m.getGenericParameterTypes();
        for(Type type: types){
            System.out.println("#"+type);
            if(type instanceof ParameterizedType){
                Type[] genericTypes = ((ParameterizedType) type).getActualTypeArguments();
                for(Type genericType : genericTypes){
                    System.out.println("泛型类型：" + genericType);
                }
            }
        }
        System.out.println("------------------：");
        Method m2 = Demo.class.getMethod("test2");
        Type type = m2.getGenericReturnType();

        System.out.println("#"+type);
        if(type instanceof ParameterizedType){
            Type[] genericTypes = ((ParameterizedType) type).getActualTypeArguments();
            for(Type genericType : genericTypes){
                System.out.println("泛型类型：" + genericType);
            }
        }

    }
}
