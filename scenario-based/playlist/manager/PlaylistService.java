package playlist.manager;

import java.util.*;

public class PlaylistService {

    private LinkedList<Song> playlist = new LinkedList<>();
    private Stack<Song> history = new Stack<>();
    private Set<String> songNames = new HashSet<>();

    public void addSong(Song song) {
        if (songNames.contains(song.getTitle())) {
            throw new SongAlreadyExistsException("Duplicate song not allowed");
        }

        playlist.add(song);
        songNames.add(song.getTitle());
    }

    public void playSong() {
        Song song = playlist.poll();
        if (song != null) {
            history.push(song);
            System.out.println("Playing: " + song.getTitle());
        }
    }
}
