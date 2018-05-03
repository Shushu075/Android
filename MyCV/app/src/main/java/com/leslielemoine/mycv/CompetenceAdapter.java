package com.leslielemoine.mycv;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CompetenceAdapter extends BaseAdapter {

    public Activity context;
    public ArrayList<Competences> competences;

    public CompetenceAdapter(Activity context, ArrayList<Competences> competences) {
        this.context = context;
        this.competences = competences;
    }
    @Override
    public int getCount() {
        return this.competences.size();
    }

    @Override
    public Object getItem(int position) {
        return this.competences.get(position);
    }

    @Override
    public long getItemId(int position) {
        return this.competences.get(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.competence_item, null);

        TextView textViewCompetence = (TextView) rowView.findViewById(R.id.textViewCompetence);
        textViewCompetence.setText(this.competences.get(position).getLangageComp());

        ImageView imageViewLogo = (ImageView) rowView.findViewById(R.id.imageViewCompetence);
        String nom = this.competences.get(position).getPictureComp();
        imageViewLogo.setImageResource(context.getResources().getIdentifier(nom, "drawable", context.getPackageName()));

        return rowView;

    }




}
