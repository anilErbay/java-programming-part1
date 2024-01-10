package _1_objectsOnAList.Practice;

import _1_objectsOnAList.Practice.Playlist;

public class PlaylistMain {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong("Don't you worry child");
        playlist.addSong("Chasing Cars");
        playlist.addSong("Saturn");

        playlist.printSongs();
    }
}
