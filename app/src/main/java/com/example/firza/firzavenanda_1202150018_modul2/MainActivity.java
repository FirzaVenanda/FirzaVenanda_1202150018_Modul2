package com.example.firza.firzavenanda_1202150018_modul2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickOrder(View view) {
        if (((RadioButton)findViewById(R.id.rbt_DineIn)).isChecked()){
            Intent intent = new Intent(this, DineIn.class);
            startActivity(intent); //radio button untuk Dine In
        }else if (((RadioButton)findViewById(R.id.rbt_TakeAway)).isChecked()){
            Intent intent = new Intent(this, TakeAway.class);
            startActivity(intent); //radio button untuk Take away
        }else{
            Toast.makeText(this,"Pilih salah satu terlebih dahulu",Toast.LENGTH_SHORT).show();
        }
    }
