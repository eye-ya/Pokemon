package com.example.android.pokemon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Pokemon> pokemon = new ArrayList<Pokemon>();

        pokemon.add(new Pokemon("Pikachu","electric","",R.drawable.pikachu));
        pokemon.add(new Pokemon("Emolga","electric","flying",R.drawable.emolga));
        pokemon.add(new Pokemon("Butterfree","bug","flying",R.drawable.butterfree));
        pokemon.add(new Pokemon("Lilligant","grass","",R.drawable.lilligant));
        pokemon.add(new Pokemon("Teddiursa","normal","",R.drawable.teddiursa));
        pokemon.add(new Pokemon("Misdreavus","ghost","",R.drawable.misdreavus));
        pokemon.add(new Pokemon("Vulpix","fire","",R.drawable.vulpix));
        pokemon.add(new Pokemon("Togepi","fairy","",R.drawable.togepi));
        pokemon.add(new Pokemon("Milotic","water","",R.drawable.milotic));

       PokemonAdapter pokemonAdapter = new PokemonAdapter(this,pokemon);

        ListView listView = (ListView) findViewById(R.id.listview_pokemon);
        listView.setAdapter(pokemonAdapter);



    }
}
