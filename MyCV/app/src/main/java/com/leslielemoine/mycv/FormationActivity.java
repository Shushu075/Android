package com.leslielemoine.mycv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class FormationActivity extends Activity implements View.OnClickListener {

    ArrayList<Formations> formation = new ArrayList<Formations>();
    ImageButton retour;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formation_show);

        retour = (ImageButton) findViewById(R.id.buttonRetour);
        retour.setOnClickListener(this);

        formation.add(new Formations("2017-2018", "Préparation du titre Analyste en Génie Informatique et Réseau", "CFA INSTA Paris 5éme"));
        formation.add(new Formations("2016-2017", "Formation Web@cademie by Epitech", "Paris 3éme"));
        formation.add(new Formations("2012-2013", "Baccalauréat Economique et Social (spécialité Mathématiques)", "Lycée Municipal d'Adultes Paris 14éme"));

        ListView listView = (ListView) findViewById(R.id.listFormations);
        FormationAdapter adapter = new FormationAdapter(this, formation);
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
