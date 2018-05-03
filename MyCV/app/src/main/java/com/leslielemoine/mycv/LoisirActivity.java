package com.leslielemoine.mycv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class LoisirActivity extends Activity implements View.OnClickListener {

    ArrayList<Loisirs> loisir = new ArrayList<Loisirs>();
    ImageButton retour;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loisir_show);

        retour = (ImageButton) findViewById(R.id.buttonRetour);
        retour.setOnClickListener(this);

        loisir.add(new Loisirs("Séries TV", "series"));
        loisir.add(new Loisirs("Mangas Animés", "mangas"));
        loisir.add(new Loisirs("Jeux Vidéos", "jeux"));

        ListView listViewDev = (ListView) findViewById(R.id.listLoisirs);
        LoisirAdapter adapter = new LoisirAdapter(this, loisir);
        listViewDev.setAdapter(adapter);

    }

    @Override
    public void onClick(View v) {
        if (v.equals(retour)) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);

        }
    }
}
