package com.yizijob.www.dagger2demo.module.coffee;

import javax.inject.Inject;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/7/26  14:28
 * @Desc :
 */

public class Thermosiphon implements  Pump
{

    private final Heater heater;

    @Inject
    public Thermosiphon(Heater heater)
    {
        this.heater = heater;
    }

    @Override
    public void pump()
    {
        if (heater.isHot()) {
            System.out.println("=> => pumping => =>");
        }

    }
}
