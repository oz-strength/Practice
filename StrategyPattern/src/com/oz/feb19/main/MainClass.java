package com.oz.feb19.main;

import com.oz.feb19.robot.Robot;
import com.oz.feb19.robot.SuperRobot;
import com.oz.feb19.robotinterface.FLyNo;
import com.oz.feb19.robotinterface.FLyYes;
import com.oz.feb19.robotinterface.KnifeLazer;
import com.oz.feb19.robotinterface.MissileYes;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("SuperRobot을 만들어 주세요");
        Robot superRobot = new SuperRobot();
        superRobot.shape();
        superRobot.actionWalk();
        superRobot.actionRun();

        superRobot.setFly(new FLyYes());
        superRobot.actionFly();
        superRobot.setMissile(new MissileYes());
        superRobot.actionMissile();
        superRobot.setKnife(new KnifeLazer());
        superRobot.actionKnife();


    }
}
