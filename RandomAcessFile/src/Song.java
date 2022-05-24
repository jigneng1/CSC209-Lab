public class Song {
    private int id; //4 bytes
    private String title; //20 bytes
    private String genre; //10 bytes
    private Double duration; //6 bytes
    private String artist;//20 bytes

    public Song(int id, String title, String genre, Double duration, String artist) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.artist = artist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
