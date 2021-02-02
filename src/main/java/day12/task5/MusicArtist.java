package day12.task5;

public class MusicArtist {
    private String nameArtist;
    private int ageArtist;

    public MusicArtist(String nameArtist, int ageArtist) {
        this.nameArtist = nameArtist;
        this.ageArtist = ageArtist;
    }

    public String getNameArtist() {
        return nameArtist;
    }

    public int getAgeArtist() {
        return ageArtist;
    }

    public String toString() {
        return nameArtist + " - " + ageArtist;
    }
}
