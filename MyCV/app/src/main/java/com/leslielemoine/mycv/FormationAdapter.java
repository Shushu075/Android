package com.leslielemoine.mycv;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FormationAdapter extends BaseAdapter {

    public Activity context;
    public ArrayList<Formations> formations;

    public FormationAdapter(Activity context, ArrayList<Formations> formations) {
        this.context = context;
        this.formations = formations;
    }
    @Override
    public int getCount() {
        return this.formations.size();
    }

    @Override
    public Object getItem(int position) {
        return this.formations.get(position);
    }

    @Override
    public long getItemId(int position) {
        return this.formations.get(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.formation_item, null);

        TextView textViewDate = (TextView) rowView.findViewById(R.id.textViewFormationDate);
        textViewDate.setText(this.formations.get(position).getDate());

        TextView textViewFormation = (TextView) rowView.findViewById(R.id.textViewFormation);
        textViewFormation.setText(this.formations.get(position).getEtude());

        TextView textViewLieu = (TextView) rowView.findViewById(R.id.textViewFormationLieu);
        textViewLieu.setText(this.formations.get(position).getLieu());

        return rowView;

    }

}
