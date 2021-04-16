package designpattern;

public class IteratorMain {
    public static void main(String[] args) {
        SongShelf songShelf = new SongShelf();
        songShelf.appendSong(new Song("달라달라", "ITZY"));
        songShelf.appendSong(new Song("빨간맛", "RedVelvet"));
        songShelf.appendSong(new Song("휘파람","BlackPink"));
        songShelf.appendSong(new Song("OOH-AHH하게", "Twice"));
        Iterator it = songShelf.iterator();
        while (it.hasNext()) {
            Song book = (Song)it.next();
            System.out.println(book.toString());
        }
    }
}
