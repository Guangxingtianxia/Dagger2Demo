package com.yizijob.www.dagger2demo.module.coffee;

import dagger.Binds;
import dagger.Module;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/7/26  14:27
 * @Desc :
 */
@Module
public abstract class PumpModule
{
    @Binds
    abstract Pump providePump(Thermosiphon pump);

}
