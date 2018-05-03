package com.leslielemoine.mycv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class ExperienceActivity extends Activity implements View.OnClickListener {

    ArrayList<Experiences> experience = new ArrayList<Experiences>();
    ImageButton retour;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.experience_show);

        retour = (ImageButton) findViewById(R.id.buttonRetour);
        retour.setOnClickListener(this);

        experience.add(new Experiences("2014-2016", "Agent Infographiste et Cartographiste  -  ", "Direction des Espaces Verts et de l'Environnement", "Paris 13ème"));

        ListView listView = (ListView) findViewById(R.id.listExperiences);
        ExperienceAdapter adapter = new ExperienceAdapter(this, experience);
        listView.setAdapter(adapter);

    }

    @Override
    public void onClick(View v) {
        if (v.equals(retour)) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);

        }
    }
}
