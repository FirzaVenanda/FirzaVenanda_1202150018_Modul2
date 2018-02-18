package com.example.firza.firzavenanda_1202150018_modul2;

import android.app.Activity;
import android.widget.TextView;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.util.Log;
        import android.widget.ImageView;
        import android.widget.TextView;

public class MenuDetail extends Activity {

    TextView tv_Footwear, tv_price;
    ImageView iv_photo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailmenu_activity);
        Intent intent = getIntent();
        String footwear = intent.getStringExtra("footwear");
        Integer price = intent.getIntExtra("price",0);
        Integer photo = intent.getIntExtra("photo",0);

        Log.d("getIntExtra", ""+price+photo);

        tv_Footwear = (TextView)findViewById(R.id.tv_detailFootwear);
        tv_price = (TextView)findViewById(R.id.tv_detailPrice);
        iv_photo = (ImageView)findViewById(R.id.iv_detailPhoto);

        tv_Footwear.setText(footwear);
        tv_price.setText("Rp. "+price);
        iv_photo.setImageResource(photo);
    }
}
