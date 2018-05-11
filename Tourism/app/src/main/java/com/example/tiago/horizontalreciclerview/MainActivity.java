package com.example.tiago.horizontalreciclerview;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    private static final String TAG = "MainActivity";

    //Vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<Integer> mImageUrls = new ArrayList<>();

    private ArrayList<String> mNamesTwo = new ArrayList<>();
    private ArrayList<Integer> mImageUrlsTwo = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getImages();
        getImagesTwo();

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.Open, R.string.Close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    //Adds main_menu to AppBar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }


    //Gets images to fill horizontalRecyclerView Icons
    private void getImages(){
        mImageUrls.add(R.drawable.eu_portugal);
        mNames.add("Portugal");

        mImageUrls.add(R.drawable.eu_austria);
        mNames.add("Austria");

        mImageUrls.add(R.drawable.eu_czech_republic);
        mNames.add("Czech Republic");

        mImageUrls.add(R.drawable.eu_hungary);
        mNames.add("Hungary");

        mImageUrls.add(R.drawable.eu_denmark);
        mNames.add("Denmark");

        mImageUrls.add(R.drawable.eu_finland);
        mNames.add("Finland");

        mImageUrls.add(R.drawable.eu_france);
        mNames.add("France");

        mImageUrls.add(R.drawable.eu_iceland);
        mNames.add("Iceland");

        mImageUrls.add(R.drawable.eu_poland);
        mNames.add("Poland");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerView");

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mNames, mImageUrls, this);
        recyclerView.setAdapter(adapter);
    }

    private void getImagesTwo(){
        mImageUrlsTwo.add(R.drawable.as_cambodia);
        mNamesTwo.add("Cambodia");

        mImageUrlsTwo.add(R.drawable.as_india);
        mNamesTwo.add("India");

        mImageUrlsTwo.add(R.drawable.as_indonesia);
        mNamesTwo.add("Indonesia");

        mImageUrlsTwo.add(R.drawable.as_malaysia);
        mNamesTwo.add("Malaysia");

        mImageUrlsTwo.add(R.drawable.as_myanmar);
        mNamesTwo.add("Myanmar");

        mImageUrlsTwo.add(R.drawable.as_nepal);
        mNamesTwo.add("Nepal");

        mImageUrlsTwo.add(R.drawable.as_philippines);
        mNamesTwo.add("Philippines");

        mImageUrlsTwo.add(R.drawable.as_singapore);
        mNamesTwo.add("Singapore");

        mImageUrlsTwo.add(R.drawable.as_thailand);
        mNamesTwo.add("Thailand");

        initRecyclerViewTwo();
    }

    private void initRecyclerViewTwo(){
        Log.d(TAG, "initRecyclerView: init recyclerView");

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerViewTwo = findViewById(R.id.recyclerViewTwo);
        recyclerViewTwo.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mNamesTwo, mImageUrlsTwo, this);
        recyclerViewTwo.setAdapter(adapter);
    }
}
