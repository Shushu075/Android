package com.leslielemoine.mycv;

import android.content.Intent;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button competences;
    Button formations;
    Button experiences;
    Button loisirs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        competences = (Button) findViewById(R.id.buttonCompetences);
        competences.setOnClickListener(this);

        formations = (Button) findViewById(R.id.buttonFormations);
        formations.setOnClickListener(this);

        experiences = (Button) findViewById(R.id.buttonExperiences);
        experiences.setOnClickListener(this);

        loisirs = (Button) findViewById(R.id.buttonLoisirs);
        loisirs.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        if (v.equals(competences)) {
            Intent intent = new Intent(getApplicationContext(), CompetenceActivity.class);
            startActivity(intent);

        } else if (v.equals(formations)) {
            Intent intent = new Intent(getApplicationContext(), FormationActivity.class);
            startActivity(intent);
        } else if (v.equals(experiences)) {
            Intent intent = new Intent(getApplicationContext(), ExperienceActivity.class);
            startActivity(intent);
        } else if(v.equals(loisirs)) {
            Intent intent = new Intent(getApplicationContext(), LoisirActivity.class);
            startActivity(intent);
        }
    }
}





