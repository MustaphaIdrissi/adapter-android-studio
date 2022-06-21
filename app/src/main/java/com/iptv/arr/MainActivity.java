package com.iptv.arr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView rt=(ListView)findViewById(R.id.ritem);
        ArrayList<Persone> pr=new ArrayList<>();
        pr.add(new Persone("ahmad",R.drawable.ic_launcher_foreground));
        pr.add(new Persone("mustapha",R.drawable.ad));
        pr.add(new Persone("said",R.drawable.qs));
        pr.add(new Persone("khalid",R.drawable.ic_launcher_foreground));
        pr.add(new Persone("kamal",R.drawable.cr));
        pr.add(new Persone("sihmed", R.drawable.az));


        adapterpe po=new adapterpe(this,R.layout.itemrt,pr);
rt.setAdapter(po);

    }
}