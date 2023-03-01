package com.oz.march1.quiz;

import java.util.Random;
import java.util.Scanner;

public class Friend {
    Random brain = new Random();
    public int FriendAns(){
        return brain.nextInt(100)+1;
    }
}
