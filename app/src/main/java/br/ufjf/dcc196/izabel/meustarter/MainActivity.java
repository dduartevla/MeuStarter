package br.ufjf.dcc196.izabel.meustarter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textViewMensagem = findViewById(R.id.textViewMensagem);
        textViewMensagem.setText("Olá Mundo!");
    }
}