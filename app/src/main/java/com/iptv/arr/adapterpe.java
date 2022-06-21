package com.iptv.arr;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class adapterpe extends ArrayAdapter<Persone> {

    private  Context mcontext;
    private  int resourced;

    public adapterpe(@NonNull Context context, int resource, @NonNull ArrayList<Persone> objects) {
        super(context, resource, objects);
        mcontext=context;
        resourced=resource;
    }


    @Override
    public int getCount() {
        return super.getCount();
    }

    @Nullable
    @Override
    public Persone getItem(int position) {
        return super.getItem(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {



        LayoutInflater Inflater=LayoutInflater.from(mcontext);
        convertView=Inflater.inflate(resourced,parent,false);
        TextView tg=convertView.findViewById(R.id.txt1);
        ImageView im=convertView.findViewById(R.id.img1);
        tg.setText(getItem(position).getName());
        im.setImageResource(getItem(position).getImg());
        return convertView;

    }
}
