package org.iesfm.controlescheckbox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToggleButton tbActivcion = (ToggleButton) findViewById(R.id.tbActivacion);

        tbActivcion.setTextOff("Desactivado");
        tbActivcion.setTextOn("Activado");
        tbActivcion.setChecked(true);

        TextView tvPrueba = (TextView) findViewById(R.id.tvPrueba);
        tvPrueba.setVisibility(View.INVISIBLE);
    }

    public void cargar(View v) {
        ToggleButton tbActivacion = (ToggleButton) findViewById(R.id.tbActivacion);
        TextView tvPrueba = (TextView) findViewById(R.id.tvPrueba);

        if (tbActivacion.isChecked()) {
            tvPrueba.setText("Boton activado");
            tvPrueba.setVisibility(View.VISIBLE);
        } else {
            tvPrueba.setText("Boton desactivado");
            tvPrueba.setVisibility(View.GONE);


        }
    }
}