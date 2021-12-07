/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import anime.anime.Anime;
import anime.characters_staff.CharacterStaff;
import caller.AnimeCaller;

/**
 * @author yanni
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        AnimeCaller animeCaller = new AnimeCaller();

        Anime anime = animeCaller.getAnime("21");
        CharacterStaff characterStaff = animeCaller.getCharacterStaff("21");

        System.out.println(anime.image_url);
        System.out.println(characterStaff.characters.get(0).image_url);


    }

}
