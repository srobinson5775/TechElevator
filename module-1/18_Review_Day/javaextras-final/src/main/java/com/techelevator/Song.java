package com.techelevator;

import java.time.LocalDate;
import java.util.Objects;

public class Song {
    private String songName;
    private String Artist;
    private String genre;
    private LocalDate releaseDate;

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Song(String songName, String artist, String genre, LocalDate releaseDate) {
        this.songName = songName;
        Artist = artist;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return songName.equals(song.songName) && Artist.equals(song.Artist) && genre.equals(song.genre) && releaseDate.equals(song.releaseDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(songName, Artist, genre, releaseDate);
    }

    @Override
    public String toString() {
        return "Song{" +
                "songName='" + songName + '\'' +
                ", Artist='" + Artist + '\'' +
                '}';
    }
}
