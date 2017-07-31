package com.yizijob.www.dagger2demo.module.coffee;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/7/26  14:32
 * @Desc : 电热器
 */

public class ElectricHeater implements Heater
{
    boolean heating;

    @Override
    public void on()
    {
        System.out.println("~ ~ ~ heating ~ ~ ~");
        this.heating = true;
    }

    @Override
    public void off()
    {
        this.heating = false;
    }

    @Override
    public boolean isHot()
    {
        return heating;
    }
}
