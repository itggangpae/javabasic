package designpattern;

import java.util.ArrayList;
import java.util.List;

public class SongShelf implements Aggregate {
    private List<Song> songs;
    private int last = 0;
    
    public SongShelf() {
        this.songs = new ArrayList<>();
    }
    public Song getSongAt(int index) {
        return songs.get(index);
    }
    public void appendSong(Song song) {
        this.songs.add(song);
        last++;
    }
    public int getLength() {
        return last;
    }
    
    public Iterator iterator() {
        return new SongShelfIterator(this);
    }
}
