package com.pa165.mlib.dao;

import com.pa165.mlib.entity.Artist;
import java.util.List;

/**
 *
 * @author xbek
 */
public interface ArtistDao {

    /**
     * Persists the given artist to persistence context
     * @param artist
     */
    void addArtist(Artist artist);

    /**
     * Read all artists
     * @return
     */
    List<Artist> getAll();

    /**
     * Read single artist via artist ID
     * @param id
     * @return
     */
    Artist getArtist(Long id);

    /**
     * Read artist/-s via artist name
     * @param name
     * @return
     */
    List<Artist> getArtist(String name);

    /**
     * Remove the given artist from persistence context
     * @param artist
     */
    void removeArtist(Artist artist);

    /**
     * Update the given artist
     * @param artist
     * @return
     */
    Artist updateArtist(Artist artist);
    
}
