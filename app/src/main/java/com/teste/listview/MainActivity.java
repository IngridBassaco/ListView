package com.teste.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listLocais;
    private  String[] itens = {
            "Cancum","italia", "Alemanha","Irlanda","Holanda",
            "Budapeste","Praga","Brasil","Russia","Slovenia","Marrocos",
            "Israel","Rio de Janeiro","Santa catarina","Curitiba"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listLocais =findViewById(R.id.listLocais);

        //criar um adaptador para a lista
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
            getApplicationContext(),
            android.R.layout.simple_expandable_list_item_1,
            android.R.id.text1,
            itens
        );

        //adicionar o adaptador na lista

        listLocais.setAdapter(adaptador);

        //adicionar clique na lista
        listLocais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String valorSelecionado =listLocais.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),valorSelecionado,Toast.LENGTH_LONG).show();
            }
                } );
    }
}
