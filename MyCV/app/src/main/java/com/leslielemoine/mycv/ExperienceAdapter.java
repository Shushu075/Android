package com.leslielemoine.mycv;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ExperienceAdapter extends BaseAdapter {

    public Activity context;
    public ArrayList<Experiences> experiences;

    public ExperienceAdapter(Activity context, ArrayList<Experiences> experiences) {
        this.context = context;
        this.experiences = experiences;
    }
    @Override
    public int getCount() {
        return this.experiences.size();
    }

    @Override
    public Object getItem(int position) {
        return this.experiences.get(position);
    }

    @Override
    public long getItemId(int position) {
        return this.experiences.get(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.experience_item, null);

        TextView textViewDate = (TextView) rowView.findViewById(R.id.textViewExperienceDate);
        textViewDate.setText(this.experiences.get(position).getDate());

        TextView textViewExperience = (TextView) rowView.findViewById(R.id.textViewExperience);
        textViewExperience.setText(this.experiences.get(position).getPoste());

        TextView textViewEntreprise = (TextView) rowView.findViewById(R.id.textViewEntreprise);
        textViewEntreprise.setText(this.experiences.get(position).getEntreprise());

        TextView textViewLieu = (TextView) rowView.findViewById(R.id.textViewExperienceLieu);
        textViewLieu.setText(this.experiences.get(position).getLieu());


        return rowView;

    }




}
