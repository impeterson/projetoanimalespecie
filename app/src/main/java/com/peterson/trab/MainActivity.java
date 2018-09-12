package com.peterson.trab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private EditText etNome, etIdade;
    private Spinner spEspecie;
    private Button btnSalvar;
    private String selecione, selecioneEspecie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNome = (EditText) findViewById(R.id.etNome);
        etIdade = (EditText) findViewById(R.id.etIdade);

        spEspecie = (Spinner) findViewById(R.id.spEspecie);
    }
}
