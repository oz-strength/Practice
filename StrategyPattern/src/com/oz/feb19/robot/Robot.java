package com.oz.feb19.robot;

import com.oz.feb19.robotinterface.IFly;
import com.oz.feb19.robotinterface.IKnife;
import com.oz.feb19.robotinterface.IMissile;

public abstract class Robot {

    IFly fly;
    IMissile missile;
    IKnife knife;
    public Robot() {
    }
    public void actionWalk(){
        System.out.println("걸을 수 있습니다.");
    }
    public void actionRun(){
        System.out.println("달릴 수 있습니다. ");
    }
    public abstract void shape();
    public void setFly(IFly fly) {
        this.fly = fly;
    }

    public void setMissile(IMissile missile) {
        this.missile = missile;
    }

    public void setKnife(IKnife knife) {
        this.knife = knife;
    }

    public void actionFly(){
        this.fly.fly();
    }
    public void actionMissile(){
        this.missile.missile();
    }
    public void actionKnife(){
        this.knife.knife();
    }
}
