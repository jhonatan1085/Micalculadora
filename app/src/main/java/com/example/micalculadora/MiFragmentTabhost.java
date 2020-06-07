package com.example.micalculadora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTabHost;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MiFragmentTabhost extends AppCompatActivity {
    private FragmentTabHost tabHost;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_fragment_tabhost);
        tabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        tabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("Calculadora"),
                TabCalculadora.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("Alumnos"),
                TabFormulario.class, null);
    }
}