package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);


        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("9rEUQEGD4gmicYa8RVHbMC6so4B8kBBkYnzrc7L1")
                .clientKey("ONSmdq5OXh2w6EZvjgQNRy8D645O33RDsHVmg08I")
                .server("https://parseapi.back4app.com").build());
    }
}
