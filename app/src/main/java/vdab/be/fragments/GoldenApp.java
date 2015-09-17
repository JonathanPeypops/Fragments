package vdab.be.fragments;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;

public class GoldenApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "Rqbhl2jnnHNbXsuP31O35dPXatyzajujUfaQef1e", "WzjMbHpoY8n1sWpDD7Tt0cHtiRgqTiZw6nmZewxZ");
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }
}
