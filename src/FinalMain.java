

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FinalMain {
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

        ArrayList<Song> popSongs = new ArrayList<>();
        ArrayList<Song> rockSongs = new ArrayList<>();
        ArrayList<Song> hiphopSongs = new ArrayList<>();
        ArrayList<Song> theWeeknd = new ArrayList<>();
        ArrayList<Song> lanaDelRey = new ArrayList<>();
        ArrayList<Song> samSmith = new ArrayList<>();

        popularSongs.add(new Song("Last Christmas", "Wham!", 4.22));
        popularSongs.add(new Song("Let it snow!", "Dean Martin", 1.57));
        popularSongs.add(new Song("Rockin Around The Christmas Tree", "Brenda Lee", 2.06));
        popularSongs.add(new Song("Jingle Bell Rock", "Bobby Helms", 2.10));
        popularSongs.add(new Song("Santa Baby", "Eartha Kitt", 3.26));

        popSongs.add(new Song("Paint the town red", "Goja Cat", 3.24));
        popSongs.add(new Song("Rreedy", "Tate McRae", 2.11));
        popSongs.add(new Song("Water", "Tyla", 3.20));
        popSongs.add(new Song("My love mine all mine", "Mitski", 2.17));
        popSongs.add(new Song("Stangers", "Kenya Grace", 2.52));
        popSongs.add(new Song("Standing next to you", "Jong kook ", 3.26));
        popSongs.add(new Song("Manaco", "bad banny", 4.27));
        popSongs.add(new Song("Cuel Summer", "Taylor Swift", 2.58));
        popSongs.add(new Song("Houdini", " Dua Lipa", 3.05));
        popSongs.add(new Song("Calm down", "Rema,Selen Gomez", 3.59));

        rockSongs.add(new Song("Bodies", "Drowning Pool", 3.36));
        rockSongs.add(new Song("Shots", "Imagine Dragons", 3.52));
        rockSongs.add(new Song("Lampshades on fier", "Modest Mouse", 3.07));
        rockSongs.add(new Song("Absolution calling", "incubus", 4.37));
        rockSongs.add(new Song("Speaking in tomgues", "Young Guns", 4.41));
        rockSongs.add(new Song("Greek tragedy", "The wombats", 3.29));
        rockSongs.add(new Song("I knew you were trouble", " We Came As Pomans", 3.38));
        rockSongs.add(new Song("Under the pressure", "The War On Drugs", 8.52));
        rockSongs.add(new Song("Shut up and dance", "Walk The Moon", 3.19));
        rockSongs.add(new Song("Phoenix", "Veil Of Maya", 3.19));

        hiphopSongs.add(new Song("You know how we do it", "Ice Cude", 3.52));
        hiphopSongs.add(new Song("California love", "2Pac, Roger, Dr.Dre", 4.44));
        hiphopSongs.add(new Song("Surround sound", "JID, 21 Savage, Baby Tate", 3.49));
        hiphopSongs.add(new Song("Loop hole", "Tee Grizzley, 21 Svage", 2.03));
        hiphopSongs.add(new Song("You brock my heart", "Drake", 3.50));
        hiphopSongs.add(new Song("P.I.M.P", "50Cent", 4.16));
        hiphopSongs.add(new Song("Twinz", "Big Pun, Fat Joe",3.48));
        hiphopSongs.add(new Song("Orange soda", "Baby Keem", 2.09));
        hiphopSongs.add(new Song("Baby keem", " Baby Keem", 2.07));
        hiphopSongs.add(new Song("First person shooter", "Darake,J.Cole", 4.07));

        theWeeknd.add(new Song("Starboy", "The Weeknd", 4.33));
        theWeeknd.add(new Song("I feel it coming", "The Weeknd", 4.50));
        theWeeknd.add(new Song("Die for you", "The Weeknd", 4.40));
        theWeeknd.add(new Song("Earned it", "The Weeknd", 4.36));
        theWeeknd.add(new Song("Often", "The Weeknd", 4.08));
        theWeeknd.add(new Song("Heartless", "The Weeknd", 4.10));
        theWeeknd.add(new Song("Coming down", "The Weeknd", 5.01));
        theWeeknd.add(new Song("The zone", "The Weeknd", 5.16));
        theWeeknd.add(new Song("The party & The After party", "The Weeknd", 7.44));
        theWeeknd.add(new Song("Wicked games", "The Weeknd", 4.41));

        lanaDelRey.add(new Song("Summertime sadeness", "Lana Del Rey", 4.25));
        lanaDelRey.add(new Song("Young and beautiful", "Lana Del Rey", 3.59));
        lanaDelRey.add(new Song("Born to die", "Lana Del Rey", 4.47));
        lanaDelRey.add(new Song("Video games", "Lana Del Rey", 4.46));
        lanaDelRey.add(new Song("Peppers","Lana Del Rey", 4.07));
        lanaDelRey.add(new Song("Say yes to heaven", "Lana Del Rey", 3.15));
        lanaDelRey.add(new Song("west coast", "Lana Del Rey", 4.16));
        lanaDelRey.add(new Song("Brooklyn baby", "Lana Del Rey", 5.51));
        lanaDelRey.add(new Song("Diet mountain dew", "Lana Del Rey", 3.39));
        lanaDelRey.add(new Song("Ultraviolence", "Lana Del Rey", 4.12));

        samSmith.add(new Song("I am not the only one", "Sam Smith", 4.00));
        samSmith.add(new Song("Unholy","Sam Smith", 2.34));
        samSmith.add(new Song("La la la", "Sam Smith", 3.41));
        samSmith.add(new Song("Diamonds", "Sam Smith", 3.34));
        samSmith.add(new Song("Lay Me Down", "Sam Smith", 2.53));
        samSmith.add(new Song("Fire on fier", "Sam Smith", 4.07));
        samSmith.add(new Song("Money on my mind", "Sam Smith", 3.13));
        samSmith.add(new Song("Desire", "Sam Smith", 3.00));
        samSmith.add(new Song("Love Me More", "Sam Sith", 3.38));
        samSmith.add(new Song("How Do You Sleep?"," Sam Smith", 4.40));

        int action;
        while (true) {
            System.out.println("1.Add song to your playlist\n2.Delete song from your playlist\n3.Listen to popular songs" +
                    "\n4.Add one of the popular song to your playlist\n5.Listen to your playlist" +
                    "\n6.Recommendation \n7.Shuffle my playlist\n0.Exit\n");
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
                    int num = 0;
                    while (num != 3) {
                        System.out.println("1 - Genre Recommendation\n2 - Recommendation for the executor");
                        num = scanner.nextInt();
                        switch (num) {
                            case 1:
                                int num2 = 0;
                                boolean desireToContinue;
                                while (num2 != 3) {
                                    System.out.println("1 - Pop\n2 - Rock\n3 - Hip-Hop");

                                    num2 = scanner.nextInt();
                                    switch (num2) {
                                        case 1:
                                            System.out.println("Recommended Pop - Songs");
                                            for (Song s : popSongs) {
                                                System.out.println((popSongs.indexOf(s) + 1) + "." + s.getNameOfSong());
                                            }
                                            System.out.print("Put the number of song you'd like to listen to - ");
                                            int numberOfSong1 = scanner.nextInt() - 1;
                                            System.out.print("Now is playing - " + popSongs.get(numberOfSong1).getNameOfSong() +
                                                    " by - " + popSongs.get(numberOfSong1).getAuthorOfSong() + " Duration: " +
                                                    popSongs.get(numberOfSong1).getLengthOfSong());
                                            int desireToContinue1 = 0;
                                            while (desireToContinue1 != 2) {
                                                System.out.println("\nWould to add this song to your playlist?\n1.Yes\n2.No");
                                                System.out.print("Put your answer - ");
                                                desireToContinue1 = scanner.nextInt();
                                                switch (desireToContinue1) {
                                                    case 1:
                                                        System.out.println("\n---------------------------------------------------------------------------");
                                                        System.out.print("Put the number of the song you'd like to add - ");
                                                        int addPopSong = scanner.nextInt() - 1;
                                                        usersSongs.add(popSongs.get(addPopSong));

                                                        System.out.println("The song - " + popularSongs.get(addPopSong).getNameOfSong() + " has added!");

                                                        System.out.println("\n---------------------------------------------------------------------------");
                                                        System.out.println("\nYour updated playlist:");
                                                        for (Song s : usersSongs) {
                                                            System.out.println((usersSongs.indexOf(s) + 1) + "." + s.getNameOfSong() + " ");
                                                        }
                                                        desireToContinue1 = 2;
                                                        break;
                                                    case 2:
                                                        desireToContinue = false;
                                                        break;
                                                    default:
                                                        System.out.println("Error, try again");
                                                }
                                            }
                                            System.out.println("\n---------------------------------------------------------------------------");
                                            break;
                                        case 2:
                                            System.out.println("Recommended Rock - Songs");
                                            for (Song s : rockSongs) {
                                                System.out.println((rockSongs.indexOf(s) + 1) + "." + s.getNameOfSong());
                                            }
                                            System.out.print("Put the number of song you'd like to listen to - ");
                                            int numberOfSong2 = scanner.nextInt() - 1;
                                            System.out.print("Now is playing - " + rockSongs.get(numberOfSong2).getNameOfSong() +
                                                    " by - " + rockSongs.get(numberOfSong2).getAuthorOfSong() + " Duration: " +
                                                    rockSongs.get(numberOfSong2).getLengthOfSong());
                                            int desireToContinue2 = 0;
                                            while (desireToContinue2 != 2) {
                                                System.out.println("\nWould to add this song to your playlist?\n1.Yes\n2.No");
                                                System.out.print("Put your answer - ");
                                                desireToContinue2 = scanner.nextInt();
                                                switch (desireToContinue2) {
                                                    case 1:
                                                        System.out.println("\n---------------------------------------------------------------------------");
                                                        System.out.print("Put the number of the song you'd like to add - ");
                                                        int addRockSong = scanner.nextInt() - 1;
                                                        usersSongs.add(rockSongs.get(addRockSong));

                                                        System.out.println("The song - " + rockSongs.get(addRockSong).getNameOfSong() + " has added!");

                                                        System.out.println("\n---------------------------------------------------------------------------");
                                                        System.out.println("\nYour updated playlist:");
                                                        for (Song s : usersSongs) {
                                                            System.out.println((usersSongs.indexOf(s) + 1) + "." + s.getNameOfSong() + " ");
                                                        }
                                                        desireToContinue2 = 2;
                                                        break;
                                                    case 2:
                                                        desireToContinue = false;
                                                        break;
                                                    default:
                                                        System.out.println("Error, try again");
                                                }
                                            }
                                            System.out.println("\n---------------------------------------------------------------------------");
                                            break;
                                        case 3:
                                            System.out.println("Recommended Hip-Hop - Songs");
                                            for (Song s : hiphopSongs) {
                                                System.out.println((hiphopSongs.indexOf(s) + 1) + "." + s.getNameOfSong());
                                            }
                                            System.out.print("Put the number of song you'd like to listen to - ");
                                            int numberOfSong3 = scanner.nextInt() - 1;
                                            System.out.print("Now is playing - " + hiphopSongs.get(numberOfSong3).getNameOfSong() +
                                                    " by - " + hiphopSongs.get(numberOfSong3).getAuthorOfSong() + " Duration: " +
                                                    hiphopSongs.get(numberOfSong3).getLengthOfSong());
                                            int desireToContinue3 = 0;
                                            while (desireToContinue3 != 2) {
                                                System.out.println("\nWould to add this song to your playlist?\n1.Yes\n2.No");
                                                System.out.print("Put your answer - ");
                                                desireToContinue3 = scanner.nextInt();
                                                switch (desireToContinue3) {
                                                    case 1:
                                                        System.out.println("\n---------------------------------------------------------------------------");
                                                        System.out.print("Put the number of the song you'd like to add - ");
                                                        int addHiphopSong = scanner.nextInt() - 1;
                                                        usersSongs.add(hiphopSongs.get(addHiphopSong));

                                                        System.out.println("The song - " + hiphopSongs.get(addHiphopSong).getNameOfSong() + " has added!");

                                                        System.out.println("\n---------------------------------------------------------------------------");
                                                        System.out.println("\nYour updated playlist:");
                                                        for (Song s : usersSongs) {
                                                            System.out.println((usersSongs.indexOf(s) + 1) + "." + s.getNameOfSong() + " ");
                                                        }
                                                        desireToContinue3 = 2;
                                                        break;
                                                    case 2:
                                                        desireToContinue = false;
                                                        break;
                                                    default:
                                                        System.out.println("Error, try again");
                                                }
                                            }
                                            System.out.println("\n---------------------------------------------------------------------------");
                                            break;
                                    }
                                    break;
                                }
                                break;
                            case 2:
                                int num3 = 0;
                                while (num3 != 3) {
                                    System.out.println("1 - The weekend\n2 - Lana Del Rey\n3 - Sam Smith");
                                    num3 = scanner.nextInt();
                                    switch (num3) {
                                        case 1:
                                            System.out.println("Recommended Songs The Weeknd");
                                            for (Song s : theWeeknd) {
                                                System.out.println((theWeeknd.indexOf(s) + 1) + "." + s.getNameOfSong());
                                            }
                                            System.out.print("Put the number of song you'd like to listen to - ");
                                            int numberOfSong1 = scanner.nextInt() - 1;
                                            System.out.print("Now is playing - " + theWeeknd.get(numberOfSong1).getNameOfSong() +
                                                    " by - " + theWeeknd.get(numberOfSong1).getAuthorOfSong() + " Duration: " +
                                                    theWeeknd.get(numberOfSong1).getLengthOfSong());
                                            int desireToContinue1 = 0;
                                            while (desireToContinue1 != 2) {
                                                System.out.println("\nWould to add this song to your playlist?\n1.Yes\n2.No");
                                                System.out.print("Put your answer - ");
                                                desireToContinue1 = scanner.nextInt();
                                                switch (desireToContinue1) {
                                                    case 1:
                                                        System.out.println("\n---------------------------------------------------------------------------");
                                                        System.out.print("Put the number of the song you'd like to add - ");
                                                        int addTheWeekndSong = scanner.nextInt() - 1;
                                                        usersSongs.add(theWeeknd.get(addTheWeekndSong));

                                                        System.out.println("The song - " + theWeeknd.get(addTheWeekndSong).getNameOfSong() + " has added!");

                                                        System.out.println("\n---------------------------------------------------------------------------");
                                                        System.out.println("\nYour updated playlist:");
                                                        for (Song s : usersSongs) {
                                                            System.out.println((usersSongs.indexOf(s) + 1) + "." + s.getNameOfSong() + " ");
                                                        }
                                                        desireToContinue1 = 2;
                                                        break;
                                                    case 2:
                                                        desireToContinue = false;
                                                        break;
                                                    default:
                                                        System.out.println("Error, try again");
                                                }
                                            }
                                            System.out.println("\n---------------------------------------------------------------------------");
                                            break;
                                        case 2:
                                            System.out.println("Recommended songs Lana Del Rey");
                                            for (Song s : lanaDelRey) {
                                                System.out.println((lanaDelRey.indexOf(s) + 1) + "." + s.getNameOfSong());
                                            }
                                            System.out.print("Put the number of song you'd like to listen to - ");
                                            int numberOfSong2 = scanner.nextInt() - 1;
                                            System.out.print("Now is playing - " + lanaDelRey.get(numberOfSong2).getNameOfSong() +
                                                    " by - " + lanaDelRey.get(numberOfSong2).getAuthorOfSong() + " Duration: " +
                                                    lanaDelRey.get(numberOfSong2).getLengthOfSong());
                                            int desireToContinue2 = 0;
                                            while (desireToContinue2 != 2) {
                                                System.out.println("\nWould to add this song to your playlist?\n1.Yes\n2.No");
                                                System.out.print("Put your answer - ");
                                                desireToContinue2 = scanner.nextInt();
                                                switch (desireToContinue2) {
                                                    case 1:
                                                        System.out.println("\n---------------------------------------------------------------------------");
                                                        System.out.print("Put the number of the song you'd like to add - ");
                                                        int addLanaDekReySong = scanner.nextInt() - 1;
                                                        usersSongs.add(lanaDelRey.get(addLanaDekReySong));

                                                        System.out.println("The song - " + lanaDelRey.get(addLanaDekReySong).getNameOfSong() + " has added!");

                                                        System.out.println("\n---------------------------------------------------------------------------");
                                                        System.out.println("\nYour updated playlist:");
                                                        for (Song s : usersSongs) {
                                                            System.out.println((usersSongs.indexOf(s) + 1) + "." + s.getNameOfSong() + " ");
                                                        }
                                                        desireToContinue2 = 2;
                                                        break;
                                                    case 2:
                                                        desireToContinue = false;
                                                        break;
                                                    default:
                                                        System.out.println("Error, try again");
                                                }
                                            }
                                            System.out.println("\n---------------------------------------------------------------------------");
                                            break;
                                        case 3:
                                            System.out.println("Recommended songs Sam Smith");
                                            for (Song s : samSmith) {
                                                System.out.println((samSmith.indexOf(s) + 1) + "." + s.getNameOfSong());
                                            }
                                            System.out.print("Put the number of song you'd like to listen to - ");
                                            int numberOfSong3 = scanner.nextInt() - 1;
                                            System.out.print("Now is playing - " + samSmith.get(numberOfSong3).getNameOfSong() +
                                                    " by - " + samSmith.get(numberOfSong3).getAuthorOfSong() + " Duration: " +
                                                    samSmith.get(numberOfSong3).getLengthOfSong());
                                            int desireToContinue3 = 0;
                                            while (desireToContinue3 != 2) {
                                                System.out.println("\nWould to add this song to your playlist?\n1.Yes\n2.No");
                                                System.out.print("Put your answer - ");
                                                desireToContinue3 = scanner.nextInt();
                                                switch (desireToContinue3) {
                                                    case 1:
                                                        System.out.println("\n---------------------------------------------------------------------------");
                                                        System.out.print("Put the number of the song you'd like to add - ");
                                                        int addSamSmithSong = scanner.nextInt() - 1;
                                                        usersSongs.add(samSmith.get(addSamSmithSong));

                                                        System.out.println("The song - " + samSmith.get(addSamSmithSong).getNameOfSong() + " has added!");

                                                        System.out.println("\n---------------------------------------------------------------------------");
                                                        System.out.println("\nYour updated playlist:");
                                                        for (Song s : usersSongs) {
                                                            System.out.println((usersSongs.indexOf(s) + 1) + "." + s.getNameOfSong() + " ");
                                                        }
                                                        desireToContinue3 = 2;
                                                        break;
                                                    case 2:
                                                        desireToContinue = false;
                                                        break;
                                                    default:
                                                        System.out.println("Error, try again");
                                                }
                                            }
                                            System.out.println("\n---------------------------------------------------------------------------");
                                            break;
                                    }
                                    break;
                                }
                                break;
                        }
                        break;
                    }
                    break;
                case 7:
                    if (usersSongs.isEmpty()){
                        System.out.println("-------------------------------\nYour playlist is empty!\n-------------------------------");
                    }else {
                        Collections.shuffle(usersSongs);
                        System.out.println("Your playlist successfully shuffled!\n");
                    }
                case 0:
                    System.out.println("\nYou have successfully exited!");
                    return;
                default:
                    System.out.println("\nIncorrect choice, try again!\n");
            }

        }

    }
}
