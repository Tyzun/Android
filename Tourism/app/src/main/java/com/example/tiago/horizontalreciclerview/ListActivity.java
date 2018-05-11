package com.example.tiago.horizontalreciclerview;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    private static final String TAG = "ListActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);
        Log.d(TAG, "onCreate: Started.");

        ListView ListView = (ListView) findViewById(R.id.list);

        ListItem one = new ListItem("Porto");
        ListItem two = new ListItem("Lisboa");
        ListItem three = new ListItem("Viana do Castelo");
        ListItem four = new ListItem("Vila Real");
        ListItem five = new ListItem("Bragança");
        ListItem six = new ListItem("Braga");
        ListItem seven = new ListItem("Aveiro");
        ListItem eight = new ListItem("Viseu");
        ListItem nine = new ListItem("Guarda");
        ListItem ten = new ListItem("Coimbra");
        ListItem eleven = new ListItem("Castelo Branco");
        ListItem twelve = new ListItem("Leiria");
        ListItem thirteen = new ListItem("Santarém");
        ListItem fourteen = new ListItem("Portalegre");
        ListItem fifteen = new ListItem("Évora");
        ListItem sixteen = new ListItem("Setúbal");
        ListItem seventeen = new ListItem("Beja");
        ListItem eighteen = new ListItem("Faro");

        ArrayList<ListItem> words = new ArrayList<>();

        words.add(one);
        words.add(two);
        words.add(three);
        words.add(four);
        words.add(five);
        words.add(six);
        words.add(seven);
        words.add(eight);
        words.add(nine);
        words.add(ten);
        words.add(eleven);
        words.add(twelve);
        words.add(thirteen);
        words.add(fourteen);
        words.add(fifteen);
        words.add(sixteen);
        words.add(seventeen);
        words.add(eighteen);


        ListViewAdapter adapter = new ListViewAdapter(this, R.layout.listview_item, words);
        ListView.setAdapter(adapter);

        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                        Intent myIntent = new Intent(view.getContext(),GridActivity.class);
                        startActivityForResult(myIntent, 0);
                }
            }
        });
    }
}
