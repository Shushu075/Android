package com.leslielemoine.mycv;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LoisirAdapter extends BaseAdapter {

    public Activity context;
    public ArrayList<Loisirs> loisirs;

    public LoisirAdapter(Activity context, ArrayList<Loisirs> loisirs) {
        this.context = context;
        this.loisirs = loisirs;
    }
    @Override
    public int getCount() {
        return this.loisirs.size();
    }

    @Override
    public Object getItem(int position) {
        return this.loisirs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return this.loisirs.get(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.loisir_item, null);

        TextView textViewLoisir = (TextView) rowView.findViewById(R.id.textViewLoisir);
        textViewLoisir.setText(this.loisirs.get(position).getLoisir());

        ImageView imageViewLoisir = (ImageView) rowView.findViewById(R.id.imageViewLoisir);
        String nom = this.loisirs.get(position).getPictureLoisir();
        imageViewLoisir.setImageResource(context.getResources().getIdentifier(nom, "drawable", context.getPackageName()));

        return rowView;

    }




}
