package com.leslielemoine.mycv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class CompetenceActivity extends Activity implements View.OnClickListener {

    ArrayList<Competences> dev = new ArrayList<Competences>();
    ImageButton retour;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.competence_show);

        retour = (ImageButton) findViewById(R.id.buttonRetour);
        retour.setOnClickListener(this);

        dev.add(new Competences("PHP", "php"));
        dev.add(new Competences("Symfony", "symfony"));
        dev.add(new Competences("HTML5", "html"));
        dev.add(new Competences("CSS", "css"));
        dev.add(new Competences("JavaScript", "js"));
        dev.add(new Competences("Photoshop", "photoshop"));
        dev.add(new Competences("Illustrator", "illustrator"));
        dev.add(new Competences("InDesign", "indesign"));

        ListView listViewDev = (ListView) findViewById(R.id.listCompetences);
        CompetenceAdapter adapterDev = new CompetenceAdapter(this, dev);
        listViewDev.setAdapter(adapterDev);

    }

    @Override
    public void onClick(View v) {
        if (v.equals(retour)) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);

        }
    }
}
