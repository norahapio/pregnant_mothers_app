package com.example.blood_pressure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText USERNAME;
    private EditText password;
    private Button login;
    private  Button sign;
    public String BC_PERMISSION = "COM.MINE.permission.BC";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //NAME:APIO NORAH
        //REG NO:2017/BIT/168
        //MBARARA UNIVERSITY OF SCIENCE AND TECHNOLOGY

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        USERNAME=(EditText)findViewById(R.id.username);

        password=(EditText)findViewById(R.id.password);

        login=findViewById(R.id.button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intet= new Intent(MainActivity.this,MOTHERS.class);
                startActivity(intet);
            }
        });
    }

    public boolean onCreatOptionsMenu(Menu menu){
        //inflate the activity_main;this adds items in to the action bar if its present.
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return true;
    }


    protected void OnStart(){
        super.onStart();
        Toast.makeText(MainActivity.this,"app started",Toast.LENGTH_SHORT).show();

    }
    protected void OnPause(){
        super.onPause();
        Toast.makeText(MainActivity.this,"app started",Toast.LENGTH_SHORT).show();

    }


    public void createAccountMethod(View view) {
        startActivity(new Intent(getApplicationContext(),SIGN.class));
    }
}



