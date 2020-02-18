package com.example.semana4tarea;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.tb_main2);
        setSupportActionBar(toolbar);
        TabLayout tabLayout = findViewById(R.id.pruebatablayout);
        tabLayout.addTab(tabLayout.newTab().setText("Tu Caledanrio"));
        tabLayout.addTab(tabLayout.newTab().setText("Dias Festivos"));
        tabLayout.addTab(tabLayout.newTab().setText("Proximamente"));

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Esperando respuesta del servidor", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


}
