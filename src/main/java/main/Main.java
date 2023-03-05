/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import caller.Jikan;
import caller.character.CharacterCaller;
import enums.*;
import model.jikan.anime.animeById.AnimeById;
import model.jikan.anime.animeByIdFull.AnimeFullById;
import model.jikan.anime.animeCharacters.AnimeCharacters;
import model.jikan.anime.animeEpisodeById.AnimeEpisodeById;
import model.jikan.anime.animeEpisodes.AnimeEpisodes;
import model.jikan.anime.animeExternal.AnimeExternal;
import model.jikan.anime.animeForum.AnimeForum;
import model.jikan.anime.animeMoreInfo.AnimeMoreInfo;
import model.jikan.anime.animeNews.AnimeNews;
import model.jikan.anime.animePictures.AnimePictures;
import model.jikan.anime.animeRecommendations.AnimeRecommendations;
import model.jikan.anime.animeRelations.AnimeRelations;
import model.jikan.anime.animeReviews.AnimeReviews;
import model.jikan.anime.animeSearch.AnimeSearch;
import model.jikan.anime.animeStaff.AnimeStaff;
import model.jikan.anime.animeStatistics.AnimeStatistics;
import model.jikan.anime.animeStreaming.AnimeStreaming;
import model.jikan.anime.animeThemes.AnimeThemes;
import model.jikan.anime.animeUserUpdates.AnimeUserUpdates;
import model.jikan.anime.animeVideos.AnimeVideos;
import model.jikan.anime.animeVideosEpisodes.AnimeVideosEpisodes;
import model.jikan.characters.characterFullById.CharacterFullById;
import org.junit.jupiter.api.Assertions;

import java.util.Date;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @author Yannick Kraml
 */
public class Main {

  public static void main(String[] args) {

    System.out.println("START");
    for (int i = 1; i < 1000; i++) {
      try {
        AnimeFullById animeFullById = Jikan.anime().fullById(i).consume().join();
        System.out.println(i + " " + animeFullById.getData().getTitle());
      }catch (Exception e){
        System.out.println(i + " Could not load.");
      }
    }
    System.out.println("ENDE");

  }

}
