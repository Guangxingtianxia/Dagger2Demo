package com.yizijob.www.dagger2demo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/7/20  17:41
 * @Desc :
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity
{
}
