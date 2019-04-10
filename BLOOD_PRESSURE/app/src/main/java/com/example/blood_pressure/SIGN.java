package com.example.blood_pressure;

import android.content.BroadcastReceiver;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;

public class SIGN extends AppCompatActivity {
    private static final String TAG = "SIGN";
    //variables
    private String msg;
    private BroadcastReceiver my_reciever = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
        int msg= Log.d(TAG, "onCreate:started.");

    }
    public boolean onCreateOptionMenue(Menu menu){
        //inflate the avtvity_main;this adds items to the action bar if it exists.
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return true;
    }







    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ImagesActivity: onResume()");

    }


}