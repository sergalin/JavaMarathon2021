package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        MusicArtist musicArtist1 = new MusicArtist("Artist1", 20);
        MusicArtist musicArtist2 = new MusicArtist("Artist2", 21);
        MusicArtist musicArtist3 = new MusicArtist("Artist3", 22);
        MusicArtist musicArtist4 = new MusicArtist("Artist4", 23);

        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(musicArtist1);
        members1.add(musicArtist2);
        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(musicArtist3);
        members2.add(musicArtist4);

        MusicBand musicBand1 = new MusicBand("Test", 2010, members1);
        MusicBand musicBand2 = new MusicBand("Test2", 2012, members2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand1, musicBand2);

        System.out.println();
        musicBand2.printMembers();

    }
}
