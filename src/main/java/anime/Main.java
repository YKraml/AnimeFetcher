/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anime;

import anime.APIObjects.APICaller;
import anime.APIObjects.anime.Anime;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author yanni
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static void main(String[] args) {

        ObjectMapper om = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        for (int i = 105; i < 10000; i++) {
            String data = APICaller.getData("https://api.jikan.moe/v3/anime/" + i);
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Anime anime = om.readValue(data, Anime.class);
                System.out.println(anime.getTitle());
                System.out.println(anime.getScore());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
