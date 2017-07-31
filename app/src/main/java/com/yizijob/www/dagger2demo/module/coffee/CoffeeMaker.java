package com.yizijob.www.dagger2demo.module.coffee;

import javax.inject.Inject;

import dagger.Lazy;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/7/26  14:17
 * @Desc : 濾泡式咖啡機需要把水加熱、加壓後沖泡：
 */

public class CoffeeMaker
{
    private final Lazy<Heater> heater;
    public  final  Pump pump;


    @Inject
    public CoffeeMaker(Lazy<Heater> heater, Pump pump)
    {
        this.heater = heater;
        this.pump = pump;
    }

    public void brew() {
        heater.get().on();
        pump.pump();
        System.out.println(" [_]P coffee! [_]P ");
        heater.get().off();
    }

}
