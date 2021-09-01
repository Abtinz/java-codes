package com.company;
public  class  Main {
    public static void main(String[] args) {

        System.out.println("please enter your clock");
        ClockDisplay clock = new ClockDisplay(23, 30);
        clock.timeTick();
        System.out.println(clock.getTime());
    }
}