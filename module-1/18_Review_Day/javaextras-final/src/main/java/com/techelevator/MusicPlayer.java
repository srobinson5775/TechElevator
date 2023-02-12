package com.techelevator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MusicPlayer {

    public static void main(String[] args) {


        //Hip hop
        String genre1 = "Hip-Hop";
        Song hipHopSong1 = new Song("Wait For You", "Drake & Tems", genre1, LocalDate.parse("2022-01-31"));
        Song hipHopSong2 = new Song("Just Wanna Rock", "Lil Uzi Vert", genre1, LocalDate.parse("2022-02-28"));
        Song hipHopSong3 = new Song("Rich Spirit", "Kendrick Lamar", genre1, LocalDate.parse("2022-03-31"));

        List<Song> hipHopSongList = new ArrayList<>();
        hipHopSongList.add(hipHopSong1);
        hipHopSongList.add(hipHopSong2);
        hipHopSongList.add(hipHopSong3);

        //Alternative
        String genre2 = "Alternative";
        Song alternativeSong1 = new Song("Bad Habbit", "Steve Lacy", genre2, LocalDate.parse("2022-10-31"));
        Song alternativeSong2 = new Song("This Is Why", "Paramore", genre2, LocalDate.parse("2022-11-30"));
        Song alternativeSong3 = new Song("Burning", "Yeah Yeah Yeahs", genre2, LocalDate.parse("2022-12-31"));

        List<Song> alternativeSongList = new ArrayList<>();
        alternativeSongList.add(alternativeSong1);
        alternativeSongList.add(alternativeSong2);
        alternativeSongList.add(alternativeSong3);


        Map<String, List<Song>> musicCollection = new HashMap<>();
        musicCollection.put(genre1, hipHopSongList);
        musicCollection.put(genre2, alternativeSongList);


        //Playlist logic
        if(musicCollection.containsKey("Alternative")){  //prefer to use genre2 variable
            List<Song> songList = musicCollection.get("Alternative");
            for(Song song : songList){
                System.out.println(song.toString());

            }
        }


    }
}
