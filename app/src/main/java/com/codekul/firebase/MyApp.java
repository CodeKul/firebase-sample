package com.codekul.firebase;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by aniruddha on 23/3/17.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
