package adint.com.ashokapp;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by ASHOK on 4/6/2016.
 */
public class ToDo extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }

}
