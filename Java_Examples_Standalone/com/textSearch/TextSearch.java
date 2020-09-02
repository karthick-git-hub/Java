package com.textSearch;

import javax.xml.soap.Text;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TextSearch {
    int count = 0;
    ArrayList<ArrayList<String>> al = new ArrayList<ArrayList<String>>();
    public static void main(String a[]){
        List<String> newList = new ArrayList<String>();

        newList.add("Walmart"); newList.add("Walnut");
        newList.add("Wall"); newList.add("Walle");
        newList.add("mummy"); newList.add("Well");

        String tobeSearched = "w";
        TextSearch text = new TextSearch();
        text.recursiveCall(newList, tobeSearched);
        System.out.println(text.al.get(0));
    }

    private void recursiveCall(List<String> newList, String tobeSearched) {
        ArrayList<String> list = new ArrayList<String>();
        if(count == tobeSearched.length()){

        }else{
            String letter = String.valueOf(tobeSearched.charAt(count));
            for(String str: newList){
                if(letter.equals(String.valueOf(str.charAt(count)))){
                    list.add(str);
                }
            }
            count ++;
            recursiveCall(list, tobeSearched);
            al.add(list);
        }
    }
}
