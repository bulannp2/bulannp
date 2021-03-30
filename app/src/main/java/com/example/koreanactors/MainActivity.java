package com.example.koreanactors;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvActor;
    private ArrayList<Actor> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvActor = findViewById(R.id.rv_actor);
        rvActor.setHasFixedSize(true);

        list.addAll(ActorClub.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvActor.setLayoutManager(new LinearLayoutManager(this));
        ListActorAdapter listActorAdapter = new ListActorAdapter(list);
        rvActor.setAdapter(listActorAdapter);
    }
}