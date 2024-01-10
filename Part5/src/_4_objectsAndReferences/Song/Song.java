package _4_objectsAndReferences.Song;

public class Song {
    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object compared) {
        // if the variables exist in the same place, then they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not instance of Song,
        // then the objects are not equal
        if (!(compared instanceof Song)) {
            return false;
        }

        // type cast
        Song mySong = (Song) compared;
        // if the values of object variables for the two objects are equal, them the
        // objects are equal
        if (this.artist.equals(mySong.artist) && this.name.equals(mySong.name) &&
                this.durationInSeconds == mySong.durationInSeconds) {
            return true;
        }

        // otherwise they are not equal
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ":" + this.name + " ( " + this.durationInSeconds + " s)";
    }
}

