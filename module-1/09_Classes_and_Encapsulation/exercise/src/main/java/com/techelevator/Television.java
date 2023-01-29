package com.techelevator;

public class Television {
    private boolean isOn;
    private int currentChannel = 3;
    private int currentVolume = 2;

    public int getCurrentChannel(){
        return currentChannel;
    }
    public boolean isOn(){
        return isOn;
    }
    public int getCurrentVolume(){
        return currentVolume;
    }

    public void turnOff(){
        isOn = false;

    }
    public void turnOn(){
        isOn = true;
        currentChannel =3;
        currentVolume =2;

    }

    public void changeChannel(int newChannel){
        if (isOn && currentChannel >= 3 && currentChannel < 18){
            currentChannel = newChannel;
        }

    }

    public void channelUp(){
        if (isOn && currentChannel >= 3){
            currentChannel = currentChannel + 1;
        }

    }
    public void channelDown(){
        if (isOn && currentChannel > 4 && isOn && currentChannel <= 18){
            currentChannel = currentChannel - 1;
        }

    }
    public void raiseVolume(){
        if(isOn && currentVolume >= 1 && currentVolume <= 9){
            currentVolume = currentVolume + 1;
        }

    }
    public void lowerVolume(){
        if(isOn && currentVolume >= 1){
            currentVolume = currentVolume -1;
        }

    }



}



