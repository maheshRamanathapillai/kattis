package com.kattis;

import java.util.Scanner;

public class TrainPassengers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String firstLineArray[] = firstLine.split(" ");
        int totalCapacity = Integer.parseInt(firstLineArray[0]);
        int numberOfStations = Integer.parseInt(firstLineArray[1]);
        boolean isValid = true;
        int totalPeopleInsideTrain = 0;
        for (int i = 0; i < numberOfStations; i++) {
            String stationStatistics[] = scanner.nextLine().split(" ");
            int totalPeopleLeftTheTrain = Integer.parseInt(stationStatistics[0]);
            int peopleEnteredTheTrainFromStation = Integer.parseInt(stationStatistics[1]);
            int peopleWaitingAtTheStation = Integer.parseInt(stationStatistics[2]);
            totalPeopleInsideTrain = totalPeopleInsideTrain + peopleEnteredTheTrainFromStation - totalPeopleLeftTheTrain;

            if (totalPeopleInsideTrain > totalCapacity || (totalPeopleInsideTrain < totalCapacity) && (peopleWaitingAtTheStation != 0)) {
                isValid = false;
            }

            if (numberOfStations - 1 == i) {
                if (peopleEnteredTheTrainFromStation != 0 || peopleWaitingAtTheStation != 0 || totalPeopleInsideTrain != 0) {
                    isValid = false;
                }

            }
        }
        if (isValid) {
            System.out.println("possible");

        } else
            System.out.println("impossible");
    }
}
