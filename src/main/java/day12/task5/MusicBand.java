package day12.task5;

import java.util.List;

public class MusicBand {
    private String nameMusicBand;
    private int yearOfFoundation;
    private List<MusicArtist> members;

    public MusicBand(String nameMusicBand, int yearOfFoundation, List<MusicArtist> members) {
        this.nameMusicBand = nameMusicBand;
        this.yearOfFoundation = yearOfFoundation;
        this.members = members;
    }

    public String getNameMusicBand() {
        return nameMusicBand;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void printMembers() {
        for(MusicArtist musicArtist: members) {
            System.out.println(musicArtist);
        }
    }

    public static void transferMembers(MusicBand musicBandOut, MusicBand musicBandIn) {
        for (MusicArtist musicArtist : musicBandOut.getMembers()) {
            musicBandIn.getMembers().add(musicArtist);
        }
        musicBandOut.getMembers().clear();
    }
}
