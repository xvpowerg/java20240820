/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch14_20241010.Ch14_6_annotation2;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 *
 * @author xvpow
 */
//反射只可看到RUNTIME
//@Retention(RetentionPolicy.RUNTIME)
// SOURCE 註解，只存在於源碼中
//@Retention(RetentionPolicy.SOURCE)
//註解保留到編譯後的 .class 文件中，但運行時不可見，適合編譯時工具或分析。
//@Retention(RetentionPolicy.CLASS)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation {
    String value() default "default value";
    int version() default 1;
}
