package com.example.ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Ciclo_Actividad", "Esta es la etapa OnCreate()");
        TextView textito1 = findViewById(R.id.id1);
        textito1.setText("Esta es la etapa onCreate()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Ciclo_Actividad", "Esta es la etapa OnRestart()");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Ciclo_Actividad", "Esta es la etapa OnStart()");
        TextView textito1 = findViewById(R.id.id1);
        textito1.setText("Esta es la etapa onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Ciclo_Actividad", "Esta es la etapa OnResume()");
        TextView textito1 = findViewById(R.id.id1);
        textito1.setText("Esta es la etapa onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Ciclo_Actividad", "Esta es la etapa OnPause()");
        TextView textito1 = findViewById(R.id.id1);
        textito1.setText("Esta es la etapa onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Ciclo_Actividad", "Esta es la etapa OnStop()");
        TextView textito1 = findViewById(R.id.id1);
        textito1.setText("Esta es la etapa onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Ciclo_Actividad", "Esta es la etapa OnDestroy()");
    }
}