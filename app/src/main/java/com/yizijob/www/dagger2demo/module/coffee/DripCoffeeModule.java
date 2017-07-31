package com.yizijob.www.dagger2demo.module.coffee;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/7/26  14:33
 * @Desc :
 */
@Module(includes = PumpModule.class)
public class DripCoffeeModule
{
    @Provides
    @Singleton
    Heater provideHeater()
    {
        return new ElectricHeater();
    }

}
