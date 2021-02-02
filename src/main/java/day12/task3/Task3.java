package day12.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("band1", 1989);
        MusicBand musicBand2 = new MusicBand("band2", 1990);
        MusicBand musicBand3 = new MusicBand("band3", 1991);
        MusicBand musicBand4 = new MusicBand("band4", 1992);
        MusicBand musicBand5 = new MusicBand("band5", 1993);
        MusicBand musicBand6 = new MusicBand("band6", 1994);
        MusicBand musicBand7 = new MusicBand("band7", 1995);
        MusicBand musicBand8 = new MusicBand("band8", 1996);
        MusicBand musicBand9 = new MusicBand("band9", 1997);
        MusicBand musicBand10 = new MusicBand("band10", 2000);
        MusicBand musicBand11 = new MusicBand("band11", 2001);
        MusicBand musicBand12 = new MusicBand("band12", 2003);
        MusicBand musicBand13 = new MusicBand("band13", 2010);
        MusicBand musicBand14 = new MusicBand("band14", 2020);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(musicBand1);
        musicBands.add(musicBand2);
        musicBands.add(musicBand3);
        musicBands.add(musicBand4);
        musicBands.add(musicBand5);
        musicBands.add(musicBand6);
        musicBands.add(musicBand7);
        musicBands.add(musicBand8);
        musicBands.add(musicBand9);
        musicBands.add(musicBand10);
        musicBands.add(musicBand11);
        musicBands.add(musicBand12);
        musicBands.add(musicBand13);
        musicBands.add(musicBand14);

        Collections.shuffle(musicBands);
        System.out.println(musicBands);
        groupsAfter2000(musicBands);

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bandsAfter2000 = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                bandsAfter2000.add(band);
            }
        }
        System.out.println(bandsAfter2000);
        return bandsAfter2000;
    }
}
