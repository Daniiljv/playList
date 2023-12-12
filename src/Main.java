import java.util.ArrayList;
import java.util.Collections;
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

        int action;
        System.out.println("\nWELCOME TO YOUR PLAYLIST\n");
        while (true) {
            System.out.println("\n1.Add song to your playlist\n2.Delete song from your playlist\n3.Listen to popular songs" +
                    "\n4.Add one of the popular song to your playlist\n5.My playlist" +
                    "\n6.View your top 3 favourite song" + "\n7.Shuffle your playlist" + "\n0.Exit");
            System.out.print("Put the action - ");
            action = scanner.nextInt();
            switch (action) {
                case 1:
                    System.out.print("Put the name of the song - ");
                    scanner.nextLine();
                    nameOfSong = scanner.nextLine();

                    System.out.print("Put the author of the song - ");
                    authorOfSong = scanner.nextLine();

                    System.out.print("Put the duration of song - ");
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
                    if (usersSongs.size() != 0) {
                        System.out.println("\n---------------------------------------------------------------------------");
                        System.out.println("\nYour playlist:");
                        for (Song s : usersSongs) {
                            System.out.println((usersSongs.indexOf(s) + 1) + "." + s.getNameOfSong() + " ");
                        }
                        System.out.println("\n---------------------------------------------------------------------------");

                        System.out.print("Put the number of the song you'd like to delete - ");
                        int indexOfSongToDelete = scanner.nextInt() - 1;

                        if (indexOfSongToDelete < usersSongs.size()) {
                            usersSongs.remove(indexOfSongToDelete);
                            System.out.println("Song has been successfully deleted!");

                            System.out.println("\n---------------------------------------------------------------------------");
                            System.out.println("\nYour updated playlist:");
                            for (Song s : usersSongs) {
                                System.out.println((usersSongs.indexOf(s) + 1) + "." + s.getNameOfSong() + " ");
                            }
                            System.out.println("\n---------------------------------------------------------------------------");
                        } else {
                            System.out.println("Invalid input, try again!");
                        }
                        break;
                    } else {
                        System.out.println("\n-----------------------------------------------------------------------");
                        System.out.println("Your playlist is empty!");
                        System.out.println("-----------------------------------------------------------------------\n");
                        break;
                    }
                case 3:
                    System.out.println("\n---------------------------------------------------------------------------");
                    System.out.println("Popular songs now:");
                    for (Song s : popularSongs) {
                        System.out.println((popularSongs.indexOf(s) + 1) + "." + s.getNameOfSong());
                    }
                    System.out.print("Put the number of song you'd like to listen to - ");
                    int numberOfSong = scanner.nextInt() - 1;
                    if (numberOfSong < popularSongs.size()){
                        System.out.print("\nNow is playing - " + popularSongs.get(numberOfSong).getNameOfSong() +
                                " by - " + popularSongs.get(numberOfSong).getAuthorOfSong());}
                    else {
                        System.out.println("Invalid input, try again!");
                    break;}

                        boolean desireToContinue = true;
                        while (desireToContinue) {
                            System.out.println("\nWould you like to continue to listening to popular songs?\n1.Yes\n2.No");
                            System.out.print("Put your answer - ");
                            int answer = scanner.nextInt();
                            switch (answer) {
                                case 1:
                                    for (Song s : popularSongs) {
                                        System.out.println((popularSongs.indexOf(s) + 1) + "." + s.getNameOfSong());
                                    }
                                    System.out.print("Put the number of song you'd like to listen to - ");
                                    numberOfSong = scanner.nextInt();
                                    if (numberOfSong < popularSongs.size()){
                                    System.out.print("Now is playing - " + popularSongs.get(numberOfSong).getNameOfSong());}
                                    else {
                                        System.out.println("Invalid input, try again");
                                    }

                                    break;
                                case 2:
                                    desireToContinue = false;
                                    break;
                            }
                        }

                    System.out.println("\n---------------------------------------------------------------------------");
                    break;
                case 4:
                    System.out.println("\n---------------------------------------------------------------------------");
                    System.out.println("Popular song now:");
                    for (Song s : popularSongs) {
                        System.out.println((popularSongs.indexOf(s) + 1) + "." + s.getNameOfSong());
                    }
                    System.out.println("\n---------------------------------------------------------------------------");
                    System.out.print("Put the number of the song you'd like to add - ");
                    int addPopularSong = scanner.nextInt() - 1;

                    if (addPopularSong < popularSongs.size()){

                    usersSongs.add(popularSongs.get(addPopularSong));

                    System.out.println("The song - " + popularSongs.get(addPopularSong).getNameOfSong() + " has added!");

                    System.out.println("\n---------------------------------------------------------------------------");
                    System.out.println("\nYour updated playlist:");
                    for (Song s : usersSongs) {
                        System.out.println((usersSongs.indexOf(s) + 1) + "." + s.getNameOfSong() + " ");
                    }
                    System.out.println("\n---------------------------------------------------------------------------");}
                    else {
                        System.out.println("Invalid input");
                    }
                    break;
                case 5:
                    System.out.println("\n---------------------------------------------------------------------------");
                    if(usersSongs.size() != 0) {
                        System.out.println("\nYour playlist:");
                        for (Song s : usersSongs) {
                            System.out.println((usersSongs.indexOf(s) + 1) + "." + s.getNameOfSong() + " ");
                        }
                        System.out.println("\n---------------------------------------------------------------------------");
                        System.out.print("Put the number of the song you'd like to listen - ");
                        int songToListen = scanner.nextInt() - 1;
                        if (songToListen < usersSongs.size()) {
                            System.out.print("Now is playing - " + usersSongs.get(songToListen).getNameOfSong() +
                                    " by - " + usersSongs.get(songToListen).getAuthorOfSong());


                            usersSongs.get(songToListen).increaseCountOfListening(); //Controlling count of listenings

                            desireToContinue = true;
                            while (desireToContinue) {
                                System.out.println("\n\nWould you like to continue to listening to your songs?\n1.Yes\n2.No");
                                System.out.print("Put your answer - ");
                                int answer = scanner.nextInt();
                                switch (answer) {
                                    case 1:
                                        for (Song s : usersSongs) {
                                            System.out.println((usersSongs.indexOf(s) + 1) + "." + s.getNameOfSong());
                                        }
                                        System.out.print("\nPut the number of song you'd like to listen to - ");
                                        numberOfSong = scanner.nextInt() - 1;
                                        System.out.print("Now is playing - " + popularSongs.get(numberOfSong).getNameOfSong());
                                        break;
                                    case 2:
                                        desireToContinue = false;
                                        break;
                                }
                            }
                        }
                        else {
                            System.out.println("Invalid input, try again!");
                        }
                    }
                    else {
                        System.out.println("Your playlist is empty!\n---------------------------------------------------------------------------");
                    }
                    break;
                case 6:
                    break;
                case 7:
                    if (usersSongs.isEmpty()){
                        System.out.println("-------------------------------\nYour playlist is empty!\n-------------------------------");
                    }else {
                    Collections.shuffle(usersSongs);
                        System.out.println("Your playlist successfully shuffled!\n");
                    }
                    break;
                case 0:
                    System.out.println("\nYou have successfully exited!");
                    return;
                default:
                    System.out.println("\nIncorrect choice, try again!\n");
            }

        }

    }
}