package gembas.com.mobile;

import android.app.Application;

import com.jakewharton.threetenabp.AndroidThreeTen;

public class GembasApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initThreeTenTime();
    }

    private void initThreeTenTime() {
        AndroidThreeTen.init(this);
    }
}
