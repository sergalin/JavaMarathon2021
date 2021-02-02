package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("lkdlw");
        members1.add("kjwdkw");
        List<String> members2 = new ArrayList<>();
        members2.add("lfef");
        members2.add("fef");
        MusicBand musicBand1 = new MusicBand("Qwqwqw", 2020, members1);
        MusicBand musicBand2 = new MusicBand("EEwqwqw", 2019, members2);

        musicBand1.printMembers();
        musicBand2.printMembers();
        System.out.println(musicBand1);
        System.out.println(musicBand2);
        MusicBand.transferMembers(musicBand1, musicBand2);
        System.out.println(musicBand1);
        System.out.println(musicBand2);


    }
}