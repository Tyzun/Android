package com.example.tiago.horizontalreciclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

public class GridActivity extends AppCompatActivity {

    GridView androidGridView;

    String[] gridViewString = { "Avenida do Aliados", "Majestic Cofe Shop", "Porto Wine Cellars", "Clerigos Tower", "Lello Bock Store",
            "Mouzinho de Alburquerque", "Crystal Palace", "Porto Riverside", "Train Station S.Bento", "Sé Porto", "Serralves"
    } ;


    int[] gridViewImageId = {
            R.drawable.porto_aliados, R.drawable.porto_cafe_majestic, R.drawable.porto_caves, R.drawable.porto_clerigos,
            R.drawable.porto_lello, R.drawable.porto_mouzinho_alburquerque, R.drawable.porto_palacio_cristal,
            R.drawable.porto_palacio_bolsa, R.drawable.porto_ribeira, R.drawable.porto_s_bento, R.drawable.porto_se,
            R.drawable.porto_serralves
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_activity);

        GridAdapter adapterViewAndroid = new GridAdapter(GridActivity.this, gridViewString, gridViewImageId);
        androidGridView=(GridView)findViewById(R.id.gridView);
        androidGridView.setAdapter(adapterViewAndroid);
    }
}