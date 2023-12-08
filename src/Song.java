public class Song {
    private String nameOfSong;
    private String authorOfSong;
    private double lengthOfSong;
    private int countOfListening;

    public Song(String nameOfSong, String authorOfSong, double lengthOfSong){
        this.nameOfSong = nameOfSong;
        this.authorOfSong = authorOfSong;
        this.lengthOfSong = lengthOfSong;
    }
    public String getNameOfSong(){
        return nameOfSong;
    }

    public String getAuthorOfSong() {
        return authorOfSong;
    }

    public double getLengthOfSong() {
        return lengthOfSong;
    }
}
