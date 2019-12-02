package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("wOz6ZHYNXCiE7MXnlIjOfxsMGVeJYTmYxuXWEhy6")
                // if defined
                .clientKey("RA51FaO5QhPHUFwzXcT91pVzayEbcI4JUNvyKlsc")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
