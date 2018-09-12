package com.peterson.trab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Listar extends AppCompatActivity {

    private ListView lvLista;
    private List<String> Lista;
    private ArrayAdapter adapter;
    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);

        lvLista = (ListView) findViewById(R.id.lvLista);

        Lista = new ArrayList<>();
        adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,
                Lista);
        lvLista.setAdapter( adapter );

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }

        }};



    }


}
