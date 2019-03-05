package com.example.blood_pressure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MOTHERS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mothers);
    }
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(MOTHERS.this,"App stoped",Toast.LENGTH_SHORT).show();
    }
}
