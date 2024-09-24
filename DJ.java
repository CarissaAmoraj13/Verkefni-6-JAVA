import java.util.Scanner;

/******************************************************************************
 * Nafn : Ma. Kathy Carissa Jamora Todtod
 * T-póstur: mkc4@hi.is
 *
 * Lýsing :
 *  This program reads song lengths in minutes and seconds
 * from
 * standard input.
 * It counts the number of tracks, finds the shortest and longest track lengths,
 * and calculates the average length of songs.
 *****************************************************************************/

import java.util.Scanner;

public class DJ {

    public static void main(String[] args) {

        // Constants
        final int MAX_SECONDS = 59;
        final int MINUTES_LOWER_LIMIT = 0;

        // Initialize scanner for input
        Scanner scanner = new Scanner(System.in);

        // Variables to track statistics
        int trackCount = 0;
        int totalSeconds = 0;
        int shortestSong = Integer.MAX_VALUE;
        int longestSong = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter song length (minutes and seconds, or -1 to end): ");
            int minutes = scanner.nextInt();
            int seconds = scanner.nextInt();

            if (minutes == -1) {
                break;
            }

            if (minutes >= MINUTES_LOWER_LIMIT && seconds >= 0 && seconds <= MAX_SECONDS) {

                int songLengthInSeconds = minutes * 60 + seconds;

                trackCount++;
                totalSeconds += songLengthInSeconds;
                if (songLengthInSeconds < shortestSong) {
                    shortestSong = songLengthInSeconds;
                }
                if (songLengthInSeconds > longestSong) {
                    longestSong = songLengthInSeconds;
                }

                System.out.println("Song length: " + minutes + " minutes and " + seconds + " seconds.");
            } else {
                System.out.println("Invalid song length.");
            }
        }

        if (trackCount > 0) {

            int averageSongLength = totalSeconds / trackCount;

            int shortestMinutes = shortestSong / 60;
            int shortestSeconds = shortestSong % 60;

            int longestMinutes = longestSong / 60;
            int longestSeconds = longestSong % 60;

            int averageMinutes = averageSongLength / 60;
            int averageSeconds = averageSongLength % 60;

            // Output the final statistics
            System.out.println("Total valid tracks: " + trackCount);
            System.out.println("Shortest song: " + shortestMinutes + " minutes and " + shortestSeconds + " seconds.");
            System.out.println("Longest song: " + longestMinutes + " minutes and " + longestSeconds + " seconds.");
            System.out
                    .println("Average song length: " + averageMinutes + " minutes and " + averageSeconds + " seconds.");
        } else {
            // No valid tracks
            System.out.println("Ekkert lag fyrir DJ");
        }
    }
}
