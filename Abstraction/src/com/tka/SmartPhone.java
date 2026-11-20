package com.tka;

public class SmartPhone implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Smart takes Photo");
    }

    @Override
    public void playMusic() {
        System.out.println("Smart Phone Play Music");
    }
}