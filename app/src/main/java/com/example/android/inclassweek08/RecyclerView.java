package com.example.android.inclassweek08;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Random;

public class RecyclerView extends AppCompatActivity {

    ArrayList<President> presidents;
    PresidentAdapter adapter;
    android.support.v7.widget.RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        setTitle("Prezi Collection");

        initialData();

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new PresidentAdapter(presidents, this);
        recyclerView.setAdapter(adapter);

        Button randomPrezButton = findViewById(R.id.random_prez);
        randomPrezButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random generator = new Random();
                int prez = generator.nextInt(presidents.size());
                President rando = presidents.get(prez);
                presidents.add(new President(rando.getName(), rando.getInfo(), rando.getPhotoResId()));
                adapter = new PresidentAdapter(presidents, RecyclerView.this);
                recyclerView.setAdapter(adapter);

            }
        });

    }

    private void initialData() {
        presidents = new ArrayList<>();
        presidents.add(new President("Bill Clinton", "1993-2001", R.drawable.clinton));
        presidents.add(new President("George W. Bush", "2001-2009", R.drawable.bush));
        presidents.add(new President("Barack Obama", "2009-2017", R.drawable.obama));
    }


}

