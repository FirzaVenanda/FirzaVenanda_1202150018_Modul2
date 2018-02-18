package com.example.firza.firzavenanda_1202150018_modul2;

import android.os.Handler;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.os.Handler;
        import android.widget.Toast;


public class Splashscreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen_activity);
        Toast.makeText(Splashscreen.this,"Firza Venanda_1202150018",Toast.LENGTH_LONG).show();
        // membuat toast dengan Nama - NIM
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 5000L); //5000 L = 5 detik
    }
}