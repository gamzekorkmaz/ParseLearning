package com.gamzekorkmaz.parselearning;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterClass extends Application
{
    @Override
    public void onCreate() {
        super.onCreate();

        //set log level
        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);


        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("2I7zy0aPTLsOB6dwvPfLisiVlfVKPA07jHyAJT9m")
                .clientKey("rP8McNnFGtOqF9tGk1CUWUTwZgwR7wADuzyP1Wjc")
                .server("https://parseapi.back4app.com/")
                .build()
        );



    }
}
