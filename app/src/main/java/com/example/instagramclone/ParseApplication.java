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
                .applicationId("5rqOrhFnw1bpQStmYZHRG7CKk6mtC5c6DUx35dA8")
                .clientKey("2rf7OpUUO1eosj1M3ANbWZjuS2ZmTWiruduDoANa")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

