package playlist;

import playlist.manager.*;

public class Driver {

    public static void main(String[] args) {

        PlaylistService service = new PlaylistService();

        try {
            service.addSong(new Song("Fix You", "Coldplay"));
            service.addSong(new Song("Believer", "Imagine Dragons"));
            service.addSong(new Song("Fix You", "Coldplay")); // duplicate

        } catch (SongAlreadyExistsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        service.playSong();
        service.playSong();
    }
}
