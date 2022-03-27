package com.yousef.el_mufassir.model;

public class Constants {
    public final String NUM_OF_OPEN_SOURA="numOfOpenSoura";
    public final String NUM_OF_OPEN_AYA="numOfOpenAya";
    public final String CHANNEL_ID = "المُفَسِّر";
    public final String CHANNEL = "Channel";
    public final String NUMBER = "Number";
    public final String AYA = "Aya";
    public final String LOCK = "lock";
    public final String COUNT="Count";
    public final String DAY="Day";
    public final String MODE="Mode";

    public static Constants constants;

    private Constants (){
    }

    public static Constants newInstance(){
        if(constants==null){
            constants=new Constants();
        }
        return constants;
    }
}
