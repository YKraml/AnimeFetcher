/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import caller.Jikan;
import exceptions.CouldNotGetObjectException;
import jikan.anime.animeById.AnimeById;

/**
 * @author yanni
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        for (int i = 1; i < 100; i++) {



            try {
                AnimeById animeById = Jikan.getAnimeCaller().getAnimeById(i);
                System.out.println(animeById.getAdditionalProperties());
                if(animeById.getAdditionalProperties().containsValue("limited")){
                    System.out.println(i + " war null");
                    break;
                }

            } catch (CouldNotGetObjectException e) {
                throw new RuntimeException(e);
            }

        }


    }

}
