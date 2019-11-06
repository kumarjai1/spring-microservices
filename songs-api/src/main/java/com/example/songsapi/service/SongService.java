package com.example.songsapi.service;

import com.example.songsapi.model.Song;

public interface SongService {

    Song createSong(Song song);
    Iterable<Song> listSongs();

    Song getSong(Long songId);

    Long deleteSong(Long songId);

}
