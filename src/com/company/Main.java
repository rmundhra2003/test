package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        ArrayList<Song> songs = new ArrayList<Song>();
        for (int i = 0; i< 10;i++){
            Song s = new Song();

            System.out.print("Enter the artist: ");
            String artist = keyboard.nextLine();//modify program to prompt user for an artist
            s.setArtist(artist);

            System.out.print("Enter the title: ");
            String title = keyboard.nextLine(); //modify program to prompt user for a title
            s.setTitle(title);
            songs.add(s);
        }

        //print all the songs in the array list
        for(Song s: songs){
            System.out.println(s.display());
        }

        //look for blue and print if found
        System.out.print("Enter the title to find: ");
        String titleToFind = keyboard.nextLine();
        for (Song s:songs){
            if (s.getTitle().equals(titleToFind)){
                System.out.printf("I found %s \r\n",s.display());
            }
        }
    }
    public static class Song {
        String artist = "";
        String title = "";

        public Song() {

        }

        public String getArtist() {
            return artist;
        }

        public void setArtist(String artist) {
            this.artist = artist;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
        public String display() {
            return (this.getTitle() +" " +this.getArtist());
        }


    }
}