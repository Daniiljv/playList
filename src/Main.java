import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nameOfSong;
        String authorOfSong;
        double lengthOfSong;

        ArrayList<Song> popularSongs = new ArrayList<>();
        ArrayList<Song> usersSongs = new ArrayList<>();

        Song song1 = new Song("Last Christmas", "Wham!", 4.22);
        Song song2 = new Song("Let it snow!", "Dean Martin", 1.57);
        Song song3 = new Song("Rockin Around The Christmas Tree", "Brenda Lee", 2.06);
        Song song4 = new Song("Jingle Bell Rock", "Bobby Helms", 2.10);
        Song song5 = new Song("Santa Baby", "Eartha Kitt", 3.26);

        popularSongs.add(song1);
        popularSongs.add(song2);
        popularSongs.add(song3);
        popularSongs.add(song4);
        popularSongs.add(song5);

        int action = 1;
        while (action != 0) {
            System.out.println("1.Add song to your playlist\n2.Delete song from your playlist\n3.Listen to popular songs" +
                    "\n4.Add one of the popular song to your playlist\n5.View your top 3 favourite song" +
                    "\n6.Listen to your playlist\n7.View your top 3 favourite song");
            System.out.print("Put the action - ");
            action = scanner.nextInt();
            switch (action) {
                case 1:
                    System.out.print("Put the name of the song - ");
                    nameOfSong = scanner.next();

                    System.out.print("Put the author of the song - ");
                    authorOfSong = scanner.next();

                    System.out.print("Put the length of song - ");
                    lengthOfSong = scanner.nextDouble();

                    Song songToAdd = new Song(nameOfSong, authorOfSong, lengthOfSong);
                    usersSongs.add(songToAdd);
                    System.out.print("The song has successfully added!");

                    System.out.println("\n---------------------------------------------------------------------------");
                    System.out.println("\nYour updated playlist:");
                    for (Song s : usersSongs) {
                        System.out.println((usersSongs.indexOf(s) + 1) + "." + s.getNameOfSong() + " ");
                    }
                    System.out.println("\n---------------------------------------------------------------------------");
                    break;

                case 2:
                    System.out.print("Put the number of the song you'd like to delete - ");
                    int indexOfSongToDelete = scanner.nextInt();
                    usersSongs.remove(indexOfSongToDelete);
                    System.out.println("Song has been successfully deleted!");

                    System.out.println("\n---------------------------------------------------------------------------");
                    System.out.println("\nYour updated playlist:");
                    for (Song s : usersSongs) {
                        System.out.println((usersSongs.indexOf(s) + 1) + "." + s.getNameOfSong() + " ");
                    }
                    System.out.println("\n---------------------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("\n---------------------------------------------------------------------------");
                    System.out.println("Popular song now:");
                    for (Song s : popularSongs) {
                        System.out.println((popularSongs.indexOf(s) + 1) + "." + s.getNameOfSong());
                    }
                    System.out.print("Put the number of song you'd like to listen to - ");
                    int numberOfSong = scanner.nextInt();
                    System.out.print("Now is playing - " + popularSongs.get(numberOfSong).getNameOfSong());
                    boolean desireToContinue = true;
                    while (desireToContinue) {
                        System.out.println("\nWould you like to continue to listening to popular songs?\n1.Yes\n2.No");
                        System.out.print("Put your answer - ");
                        int answer = scanner.nextInt();
                        switch (answer) {
                            case 1:
                                System.out.print("Put the number of song you'd like to listen to - ");
                                numberOfSong = scanner.nextInt();
                                System.out.print("Now is playing - " + popularSongs.get(numberOfSong).getNameOfSong());
                                break;
                            case 2:
                                desireToContinue = false;
                                break;
                        }
                    }
                    System.out.println("\n---------------------------------------------------------------------------");
                    break;
            }

        }

    }
}