package com.yizijob.www.dagger2demo.module.coffee;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/7/26  14:14
 * @Desc :
 */

public class CoffeeApp
{

    @Singleton
    @Component(modules = DripCoffeeModule.class)
    public interface CoffeeComponent
    {
        CoffeeMaker maker();

    }

    public static void main(String[] args)
    {

        CoffeeComponent coffee =   DaggerCoffeeApp_CoffeeComponent.builder().build();
        coffee.maker().brew();

    }







}
