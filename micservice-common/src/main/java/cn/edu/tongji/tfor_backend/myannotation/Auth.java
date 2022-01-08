package cn.edu.tongji.tfor_backend.myannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//接口的权限控制
//验证token是否合法
//控制使用范围和生命周期
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Auth {
    boolean required() default true;
}
