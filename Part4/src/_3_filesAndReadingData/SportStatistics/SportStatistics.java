package _3_filesAndReadingData.SportStatistics;

import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        int games = 0;
        int wins = 0;
        int losses = 0;
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(",");

                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeScore = Integer.parseInt(parts[2]);
                int awayScore = Integer.parseInt(parts[3]);

                if (team.equals(homeTeam)) {
                    if (homeScore > awayScore) {
                        wins++;
                    } else {
                        losses++;
                    }
                    games++;
                } else if (team.equals(awayTeam)) {
                    if (awayScore > homeScore) {
                        wins++;
                    } else {
                        losses++;
                    }
                    games++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getLocalizedMessage());
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

        scan.close();
    }
}
