package com.yizijob.www.dagger2demo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/7/20  17:26
 * @Desc :
 * <p>
 * <p>
 * ，当某个对象需要注入依赖时，
 * Dagger2就会根据Module中标记了@Provide的方法的返回值来确定由谁为这个变量提供实例。
 * 那问题来了，如果有两个一样的返回类型，该用谁呢。我们把这种场景叫做依赖迷失，
 * 见名知意，Dagger这时候就不知道用谁来提供依赖，自然就迷失了。
 * 所以我们引入了@Qulifier这个东西，通过自定义Qulifier，
 * 可以告诉Dagger2去需找具体的依赖提供者。
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface A
{
}
