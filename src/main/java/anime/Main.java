/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anime;

import anime.APIObjects.search.AnimeSearch;

import java.util.Optional;

/**
 * @author yanni
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        AnimeFetcher animeFetcher = new AnimeFetcher();

        Optional<AnimeSearch> animeSearch = animeFetcher.getAnimeSearchByName("Naruto");

        System.out.println("jo");

    }

}
