package org.codeforcoffee.sortie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> mFamousPetsList = new ArrayList();
    private ArrayAdapter<String> mArrayAdapter;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // providing content
        mFamousPetsList.add("Lil' Bub");
        mFamousPetsList.add("Grumpy Cat");
        mFamousPetsList.add("keyboard cat");
        mFamousPetsList.add("wishbone");
        mFamousPetsList.add("shadow");
        mFamousPetsList.add("wonder dog");
        mFamousPetsList.add("catdog");
        mFamousPetsList.add("meowth");
        mFamousPetsList.add("nyancat");
        mFamousPetsList.add("bubba");
        mFamousPetsList.add("charmander");
        mFamousPetsList.add("bulbasaur");
        mFamousPetsList.add("squirtle");


        mArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mFamousPetsList);
        mListView = (ListView) findViewById(R.id.list_view);
        mListView.setAdapter(mArrayAdapter);
        Collections.sort(mFamousPetsList, Collections.reverseOrder());

    }
}
