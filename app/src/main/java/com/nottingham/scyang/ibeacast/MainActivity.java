package com.nottingham.scyang.ibeacast;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebView;


public class MainActivity extends Activity {

    public WebView main_web;
    private static final int HELLO_ID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_web = (WebView) findViewById(R.id.mainwebView);
        main_web.getSettings().setJavaScriptEnabled(true);
        main_web.setWebChromeClient(new WebChromeClient());
        main_web.loadUrl("http://www.yiezi.com/beacons/iBPS/slider-master/demos-jquery/simple-fade-slideshow.source.html");

/*
        NotificationManager nm =
                (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        //
        //  Create your notification
        int icon = R.drawable.ic_launcher;
        CharSequence tickerText = "Hello";
        long when = System.currentTimeMillis();

        Notification notification =
                new Notification( icon, tickerText, when);

        Context context = getApplicationContext();
        CharSequence contentTitle = "My notification";
        CharSequence contentText = "Hello World!";
        Intent notificationIntent;
        notificationIntent = new Intent(this, MainActivity.class);
        PendingIntent contentIntent =
                PendingIntent.getActivity(this, 0, notificationIntent, 0);

        notification.setLatestEventInfo(
                context,
                contentTitle,
                contentText,
                contentIntent);
        notification.defaults = Notification.DEFAULT_ALL;

        //
        //  Send the notification
        nm.notify(HELLO_ID, notification);
*/



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
