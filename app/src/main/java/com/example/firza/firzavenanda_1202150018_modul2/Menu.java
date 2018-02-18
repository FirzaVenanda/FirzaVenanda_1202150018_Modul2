import android.app.Activity;
package com.example.firza.firzavenanda_1202150018_modul2;



        import android.app.Activity;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.menu.MenuAdapter;
import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;

import com.example.firza.firzavenanda_1202150018_modul2.R;

import java.util.LinkedList;

public class Menu extends Activity {

    private final LinkedList<String> IceList = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new MenuAdapter(this, IceList, priceses, photos);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){ //list menu makanan
            IceList.add("Vans Oldschool");
            IceList.add("Vans Authentic");
            IceList.add("Vans Era");
            IceList.add("Vans Era 420");
            IceList.add("Vans SK8 Hi");

            priceses.add(2500000); //list harga
            priceses.add(1200000);
            priceses.add(1500000);
            priceses.add(1500000);
            priceses.add(1700000);

            photos.add(R.drawable.S1); //list gambar yang akan ditampilkan
            photos.add(R.drawable.S2);
            photos.add(R.drawable.S3);
            photos.add(R.drawable.S4);
            photos.add(R.drawable.S6);
        }
    }
}
