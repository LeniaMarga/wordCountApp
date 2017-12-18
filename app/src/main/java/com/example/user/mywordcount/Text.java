package com.example.user.mywordcount;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by user on 18/12/2017.
 */

public class Text {


    ArrayList<String> words = new ArrayList<>();
    HashMap<String, Integer> map = new HashMap<String, Integer>(50, 10);

    public Text() {
        this.words = new ArrayList<>();
        this.map = new HashMap<>();
    }




    public HashMap<String, Integer> count() {
        Scanner sc = new Scanner(System.in);

        String userInput = sc.nextLine();

        userInput = userInput.toLowerCase();

        userInput = userInput.replaceAll("\\W", " ");     // strip out any non words.
        userInput = userInput.replaceAll("  ", " ");      // strip out any double spaces

        String[] words = userInput.split(" ");


        //// For each word in the list.
        for (String w : words) {
            // Get it's current count from the Map.
            Integer i = map.get(w);
            if (i == null) {
                // Null means never seen before so it's count becomes 1
                map.put(w, 1);
            } else {
                // Seen this word - add one to the count.
                map.put(w, i + 1);
            }
        }
        return map;

    }
}


//                Scanner sc = new Scanner(System.in);
//
//                String userInput = sc.nextLine();
//
//                userInput = userInput.toLowerCase();
//
////                userInput = userInput.replaceAll("\\W", " ");     // strip out any non words.
////                userInput = userInput.replaceAll("  ", " ");      // strip out any double spaces
////                //   created from stripping out non words
////                //   in the first place!
////                String[] tokens = userInput.split(" ");
////                System.out.println(userInput);
////
////                words.addAll(Arrays.asList(tokens));

//                for (String s : words) {
//
//                    if (!map.containsKey(s)) {  // first time we've seen this string
//                        map.put(s, 1);
//                    } else {
//                        int count = map.get(s);
//                        map.put(s, count + 1);
//                    }
//                }
//                return map;
//            }





//    public static void main(String[] args) {
//        Scanner sc = new Scanner( System.in );
//        System.out.println( "Please enter a line of text" );
//        String userInput = sc.nextLine();
//
//        userInput = userInput.toLowerCase();
//
//        userInput = userInput.replaceAll( "\\W", " " );     // strip out any non words.
//        userInput = userInput.replaceAll( "  ", " " );      // strip out any double spaces
//        //   created from stripping out non words
//        //   in the first place!
//        String[] tokens = userInput.split( " " );
//        System.out.println( userInput );
//
//        ArrayList< String > items = new ArrayList< String >();
//
//        items.addAll( Arrays.asList( tokens ) );
//
//        int count = 0;
//
//        for( int i = 0; i < items.size(); i++ )
//        {
//            System.out.printf( "%s: ", items.get( i ) );
//            for( int j = 0; j < items.size(); j++ )
//            {
//                if( items.get( i ).equals( items.get( j ) ) )
//                    count++;
//                if( items.get( i ).equals( items.get( j ) ) && count > 1 )
//                    items.remove( j );                      // after having counted at least
//            }                                               // one, remove duplicates from List
//            System.out.printf( "%d\n", count );
//            count = 0;
//        }
//    }
//}