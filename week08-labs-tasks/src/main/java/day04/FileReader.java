package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {
    private int findSmallestTeamDifference(String file) {
        try {
            List<String> weatherList = Files.readAllLines(Paths.get("src/resources/weather.dat"));
            int minDifference = 1000;
            int minDay = 0;
            for (int i = 1; i < weatherList.size(); i++) {
                if (i != 18) {
                    String name = weatherList.get(i).substring(7, 22).trim();
                    int max = Integer.parseInt(weatherList.get(i).substring(43, 45).trim());
                    int min = Integer.parseInt(weatherList.get(i).substring(50, 52).trim());
                    int tmp = max - min;
                    if (minDifference > tmp) {
                        minDifference = tmp;
                        minDay = min;
                    }
                }
            }
            return minDay;
        } catch (IOException ioe) {
            throw new IllegalStateException("Rossz filenév", ioe);
        }
    }
}
