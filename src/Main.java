

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, JavaLayerException {

        FileInputStream jingleBells = new FileInputStream("D:/IT.academy/playList/src/Bobby Helms - Jingle Bells Rock.mp3");
        Player playerJingleBells = new Player(jingleBells);

        FileInputStream rockinAround = new FileInputStream("D:/IT.academy/playList/src/Brenda Lee - Rockin’ Around The Christmas Tree.mp3");
        Player playerRockinAround = new Player(rockinAround);

        FileInputStream letItSnow = new FileInputStream("D:/IT.academy/playList/src/Dean Martin - Let It Snow, Let It Snow, Let It Snow (Remastered).mp3");
        Player playerLetItSnow = new Player(letItSnow);

        FileInputStream santaBaby = new FileInputStream("D:/IT.academy/playList/src/Eartha Kitt - Santa Baby (Edit).mp3");
        Player playerSantaBaby = new Player(santaBaby);

        FileInputStream lastChristmas = new FileInputStream("D:/IT.academy/playList/src/Wham! - Last Christmas (из фильма «Рождество на двоих»).mp3");
        Player playerLastChristmas = new Player(lastChristmas);


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
        while (true) {
            System.out.println("1.Add song to your playlist\n2.Delete song from your playlist\n3.Listen to popular songs" +
                    "\n4.Add one of the popular song to your playlist\n5.Listen to your playlist" +
                    "\n6.View your top 3 favourite song\n0.Exit\n");
            System.out.print("Put the action - ");
            action = scanner.nextInt();
            switch (action) {
                case 1:
                    System.out.print("Put the name of the song - ");
                    scanner.nextLine();
                    nameOfSong = scanner.nextLine();

                    System.out.print("Put the author of the song - ");
                    authorOfSong = scanner.nextLine();

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
                    if (usersSongs.size() != 0) {
                        System.out.println("\n---------------------------------------------------------------------------");
                        System.out.println("\nYour playlist:");
                        for (Song s : usersSongs) {
                            System.out.println((usersSongs.indexOf(s) + 1) + "." + s.getNameOfSong() + " ");
                        }
                        System.out.println("\n---------------------------------------------------------------------------");

                        System.out.print("Put the number of the song you'd like to delete - ");
                        int indexOfSongToDelete = scanner.nextInt() - 1;
                        usersSongs.remove(indexOfSongToDelete);
                        System.out.println("Song has been successfully deleted!");

                        System.out.println("\n---------------------------------------------------------------------------");
                        System.out.println("\nYour updated playlist:");
                        for (Song s : usersSongs) {
                            System.out.println((usersSongs.indexOf(s) + 1) + "." + s.getNameOfSong() + " ");
                        }
                        System.out.println("\n---------------------------------------------------------------------------");
                        break;
                    } else {
                        System.out.println("\n-----------------------------------------------------------------------");
                        System.out.println("\nYour playlist is empty!");
                        System.out.println("\n-----------------------------------------------------------------------");
                        break;
                    }
                case 3:
                    System.out.println("\n---------------------------------------------------------------------------");
                    System.out.println("Popular songs now:");
                    for (Song s : popularSongs) {
                        System.out.println((popularSongs.indexOf(s) + 1) + "." + s.getNameOfSong());
                    }
                    System.out.print("Put the number of song you'd like to listen to - ");
                    int numberOfSong = scanner.nextInt();
                    if (numberOfSong <= popularSongs.size()) {
                        switch (numberOfSong) {
                            case 1:
                                playerLastChristmas.play();
                                break;
                            case 2:
                                playerLetItSnow.play();
                                break;
                            case 3:
                                playerRockinAround.play();
                                break;
                            case 4:
                                playerJingleBells.play();
                            case 5:
                                playerSantaBaby.play();
                        }
                    } else {
                        System.out.println("Wrong number!");
                    }
                    System.out.println("\n---------------------------------------------------------------------------");
                    break;

                case 4: // Added checking of the song to add
                    System.out.println("\n---------------------------------------------------------------------------");
                    System.out.println("Popular song now:");
                    for (Song s : popularSongs) {
                        System.out.println((popularSongs.indexOf(s) + 1) + "." + s.getNameOfSong());
                    }
                    System.out.println("\n---------------------------------------------------------------------------");
                    System.out.print("Put the number of the song you'd like to add - ");
                    int addPopularSong = scanner.nextInt() - 1;

                    if (addPopularSong <= popularSongs.size()) {
                        usersSongs.add(popularSongs.get(addPopularSong));

                        System.out.println("The song - " + popularSongs.get(addPopularSong).getNameOfSong() + " has added!");

                        System.out.println("\n---------------------------------------------------------------------------");
                        System.out.println("\nYour updated playlist:");
                        for (Song s : usersSongs) {
                            System.out.println((usersSongs.indexOf(s) + 1) + "." + s.getNameOfSong() + " ");
                        }
                        System.out.println("\n---------------------------------------------------------------------------");
                        break;
                    } else {
                        System.out.println("\nThere is no the song with this number(");
                        System.out.println("\n-----------------------------------------------------------------------");
                        break;
                    }
                case 5:
                    System.out.println("\n---------------------------------------------------------------------------");
                    if (usersSongs.size() != 0) {
                        System.out.println("\nYour playlist:");
                        for (Song s : usersSongs) {
                            System.out.println((usersSongs.indexOf(s) + 1) + "." + s.getNameOfSong() + " ");
                        }
                        System.out.println("\n---------------------------------------------------------------------------");
                        System.out.print("Put the number of the song you'd like to listen - ");
                        int songToListen = scanner.nextInt() - 1;
                        System.out.print("Now is playing - " + usersSongs.get(songToListen).getNameOfSong() +
                                " by - " + usersSongs.get(songToListen).getAuthorOfSong());

                        usersSongs.get(songToListen).increaseCountOfListening(); //Controlling count of listenings

                        boolean desireToContinue = true;
                        while (desireToContinue) {
                            System.out.println("\nWould you like to continue to listening to your songs?\n1.Yes\n2.No");
                            System.out.print("Put your answer - ");
                            int answer = scanner.nextInt();
                            switch (answer) {
                                case 1:
                                    System.out.print("Put the number of song you'd like to listen to - ");
                                    numberOfSong = scanner.nextInt() - 1;
                                    System.out.print("Now is playing - " + popularSongs.get(numberOfSong).getNameOfSong());
                                    break;
                                case 2:
                                    desireToContinue = false;
                                    break;
                                default:
                                    System.out.println("Wrong answer!");
                            }
                        }
                    } else {
                        System.out.println("\nYour playlist is empty!");
                        System.out.println("\n--------------------------------------------------------------------------");
                        break;
                    }
                case 6:

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