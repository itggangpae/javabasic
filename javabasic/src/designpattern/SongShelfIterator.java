package designpattern;

public class SongShelfIterator implements Iterator {
    private SongShelf songShelf;
    private int index;
    
    public SongShelfIterator(SongShelf songShelf) {
        this.songShelf = songShelf;
        this.index = 0;
    }
    
    public boolean hasNext() {
        if (index < songShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }
    
    public Object next() {
        Song book = songShelf.getSongAt(index);
        index++;
        return book;
    }


}
