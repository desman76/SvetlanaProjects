package lesson62;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
@interface FilterIt {
    boolean show();
}

public class My621Project {
    public static void main(String[] args) {
        Class2 class2 = new Class2();
        showClassInfo(class2.getClass());
    }

    static void showClassInfo(Class _class) {
        System.out.println(_class.getSimpleName());
        for (Field field : _class.getDeclaredFields()) {
            if (field.isAnnotationPresent (FilterIt.class)){
                FilterIt f = field.getAnnotation(FilterIt.class);
                if (f.show()){
                    System.out.println(field.getName());
                }
            }
        }
       for (Method method : _class.getDeclaredMethods()) {
         if (method.isAnnotationPresent (FilterIt.class)){
             FilterIt f = method.getAnnotation(FilterIt.class);
             if (f.show()){
                 System.out.println(method.getName());
             }
         }
       }
       System.out.println();
       Class parentClass = _class.getSuperclass();
       if (parentClass != null) {
           showClassInfo(parentClass);
       }
    }

}



