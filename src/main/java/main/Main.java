/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import caller.anime.AnimeCaller;
import exceptions.CouldNotGetObjectException;
import jikan.anime.animeById.AnimeById;

/**
 * @author yanni
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CouldNotGetObjectException {


        AnimeById animeById = AnimeCaller.getInstance().getAnimeById("1");

        System.out.println(animeById.getData().getTitleEnglish());

        //https://api.jikan.moe/v4/anime/{id}/full

    }

}
