package com.pa165.mlib.dao;

import com.pa165.mlib.entity.Song;
import java.util.List;

/**
 *
 * @author xbek
 */
public interface SongDao {

    /**
     * Persist the given song to persistence context.
     * @param song to be persisted
     */
    void addSong(Song song);

    /**
     * Get all the songs.
     * @return all the songs
     */
    List<Song> getAll();

    /**
     * Get song with given unique identifier.
     * @param id unique identifier for song
     * @return song
     */
    Song getSong(long id);

    /**
     * Get all the songs with given title.
     * @param title what should be song called
     * @return songs with defined title
     */
    List<Song> getSongsWithTitle(String title);

    /**
     * Remove song from the persistence context and database after the commit.
     * @param song to be removed
     */
    void removeSong(Song song);

    /**
     * Update the given song in persistence context and database after the commit.
     * @param song to be updated
     * @return updated song
     */
    Song updateSong(Song song);
    
}
