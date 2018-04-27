package com.example.android.pokemon;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.pokemon.Pokemon;
import com.example.android.pokemon.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class PokemonAdapter extends ArrayAdapter<Pokemon> {
    private static final String LOG_TAG = PokemonAdapter.class.getSimpleName();


    public PokemonAdapter (Activity context, ArrayList<Pokemon> pokemon){
        super(context,0,pokemon);

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Pokemon pokemon = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(pokemon.getName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView typeTextView = (TextView) listItemView.findViewById(R.id.type);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        typeTextView.setText(pokemon.getType());

        TextView type2TextView = (TextView) listItemView.findViewById(R.id.type2);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        type2TextView.setText(pokemon.getType2());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setImageResource(pokemon.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}