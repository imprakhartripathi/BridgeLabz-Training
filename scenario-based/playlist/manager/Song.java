package playlist.manager;

import java.util.Objects;

public class Song {

    private String title;
    private String artist;

    public Song(String title, String artist) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Song title cannot be empty");
        }
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    // Important for Set + Stack behavior
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;
        Song song = (Song) o;
        return title.equalsIgnoreCase(song.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title.toLowerCase());
    }

    @Override
    public String toString() {
        return title + " by " + artist;
    }
}
