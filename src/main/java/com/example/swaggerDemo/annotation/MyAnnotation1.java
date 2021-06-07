package com.example.swaggerDemo.annotation;

import java.lang.annotation.*;

/**
 * @author zhousuhua
 * @date 2021/6/7 7:40 下午
 */


/**
 *
 * 指定 Annotation 的类型
 *
 *public enum ElementType {
 *     TYPE,               /* 类、接口（包括注释类型）或枚举声明
 *
         *FIELD,              /* 字段声明（包括枚举常量）

         *METHOD,             /* 方法声明

         *PARAMETER,          /* 参数声明

         *CONSTRUCTOR,        /* 构造方法声明

         *LOCAL_VARIABLE,     /* 局部变量声明

         *ANNOTATION_TYPE,    /* 注释类型声明

         *PACKAGE             /* 包声明
         }
 *
 */


/**
 *用来指定 Annotation 的策略
 *
 *public enum RetentionPolicy {
 *     SOURCE,            /* Annotation信息仅存在于编译器处理期间，编译器处理完之后就没有该Annotation信息了

         *CLASS,             /* 编译器将Annotation存储于类对应的.class文件中。默认行为

         *RUNTIME            /* 编译器将Annotation存储于class文件中，并且可由JVM读入
         }
 */

/**
 * 常用注解
 *
 * @Deprecated  -- @Deprecated 所标注内容，不再被建议使用。
 * @Override    -- @Override 只能标注方法，表示该方法覆盖父类中的方法。
 * @Documented  -- @Documented 所标注内容，可以出现在javadoc中。
 * @Inherited   -- @Inherited只能被用来标注“Annotation类型”，它所标注的Annotation具有继承性。
 * @Retention   -- @Retention只能被用来标注“Annotation类型”，而且它被用来指定Annotation的RetentionPolicy属性。
 * @Target      -- @Target只能被用来标注“Annotation类型”，而且它被用来指定Annotation的ElementType属性。
 * @SuppressWarnings -- @SuppressWarnings 所标注内容产生的警告，编译器会对这些警告保持静默。
 */

// @interface 用来声明 Annotation
@Documented  // 使用 @Documented 修饰该 Annotation，则表示它可以出现在 javadoc 中。   缺省情况下是不出现
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation1 {

}
