package com.example.android.pokemon;

public class Pokemon {
    private String pName;
    private String pType;
    private String pType2;
    private int pImageResourceId;


    public Pokemon (String name, String type,String type2,  int imageResourceId){
        pImageResourceId= imageResourceId;
        pName = name;
        pType = type;
        pType2 = type2;


    }

    public String getName (){
        return pName;
    }

    public String getType (){
        return pType;
    }

    public String getType2 (){
        return pType2;
    }

    public int getImageResourceId() {
        return pImageResourceId;
    }


}
