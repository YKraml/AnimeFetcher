/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anime.APIObjects;

import anime.Main;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yannick
 */
public class APICaller {

    public static String getData(String urlString) {

        //Von den eigenen Dateien
        String path = "APIDaten\\" + urlString.replace("https://api.jikan.moe/v3/anime/", "").replace("/", "_")  + ".txt";
        File file = new File(path);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String data = br.readLine();
            return data;
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(APICaller.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Datei wurde nicht in der Lokalen Datenbank gefunden: " + path);
        } catch (IOException ex) {
            Logger.getLogger(APICaller.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        
        //Von der Online API
        HttpURLConnection connection;
        BufferedReader br;
        String line;
        StringBuilder content = new StringBuilder();

        try {
            URL url = new URL(urlString);
            connection = (HttpURLConnection) url.openConnection();

            connection.setReadTimeout(5000);
            connection.setConnectTimeout(5000);
            connection.setRequestMethod("GET");

            int status = connection.getResponseCode();
            //System.out.println(status);

            //Wenn es keinen Fehler gab
            if (status < 300) {
                br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((line = br.readLine()) != null) {

                    content.append(line);
                }
                br.close();
            }

            //Wenn es einen Fehler gab
            if (status > 299) {
                br = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((line = br.readLine()) != null) {

                    content.append(line);
                }
                br.close();
            }

            connection.disconnect();

        } catch (MalformedURLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);

            return getData(urlString);

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (content.toString().isEmpty()) {
            System.err.println("Keine Daten gefunden");
        }

        String data = content.toString();

        //Datei anlegen        
        file = new File(path);
        try {
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(APICaller.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Konnte keine neue Datei anlegen: " + urlString);
        }

        return data;

    }

}
