package com.example.bppatientapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
/*APIO NORAH
        mbarara university of science and technology
        bachelors in information technology,
        2017/BIT/168.
*/
public class MainActivity extends AppCompatActivity View.onCLickListener{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = (button)findViewById(R.id.login);


        login.setOnContextClickListener(this);
         new Button.onClickListener(){
            Public void onClick(view v){
                TextView loginText = (TextView)findViewById(R.id.loginText);
                loginText.setText("THANK YOU GOD");
        }


        }
                    Button username = findViewById(R.id.username);

                    username.setOnContextClickListener(this);

protected void onCreate(Bundle savedinstanceState){
                super.onCreate(savedinstanceState);
                setContentView(r.layout.activity_main);
                Toast.makeText(
                        this, "onCreate",Toast.LENGTH_SHORT).show();

        }


protected void onCreate(Bundle savedinstanceState){
        super.onCreate(savedinstanceState);
        setContentView(r.layout.activity_main);
        Toast.makeText(this, "onCreate",Toast.LENGTH_SHORT).show();

        }

protected void onStart(Bundle savedinstanceState){
        super.(savedinstanceState);
        Toast.makeText(this, "onStart",Toast.LENGTH_SHORT).show();

        }


protected void onResume(Bundle savedinstanceState){
        super.onCreate(savedinstanceState);
        Toast.makeText(this, "onResume",Toast.LENGTH_SHORT).show();

        }

protected void onPause (Bundle savedinstanceState){
        super.onCreate(savedinstanceState);
        Toast.makeText(this, "onPause",Toast.LENGTH_SHORT).show();

        }

protected void onStop(){
        super.onCreate();
        Toast.makeText(this, "onStop",Toast.LENGTH_SHORT).show();

        }
protected void onDestroy(){
        super.onCreate();
        Toast.makeText(this,"onDestroy",Toast.LENGTH_SHORT).show();


    }
protected void onResume(){
        super.onCreate();
        Toast.makeText(this,"on",Toast.LENGTH_SHORT).show();
            }

protected void onRestart(Bundle savedinstanceState){
        super.onCreate(savedinstanceState);
        Toast.makeText(this, "onRestart",Toast.LENGTH_SHORT).show();



}
