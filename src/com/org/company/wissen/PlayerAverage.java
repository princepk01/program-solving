package com.org.company.wissen;

import java.util.*;

public class PlayerAverage {
    public static class PlayerStatisticsCollectorImpl implements 
    PlayerStatisticsCollector {
        Map<String,Integer> map = new HashMap<String,Integer>();
        Map<String,Integer> mapCount = new HashMap<String,Integer>();
       
        @Override
        public void putNewInnings(String player, int runs){
            if(map.containsKey(player)){
                map.put(player,map.get(player) + runs);
                mapCount.put(player,mapCount.get(player) + 1);
             } else{
                map.put(player, runs);
                mapCount.put(player, 1);
            }
        }

        @Override
        public double getAverageRuns(String player){
           int totalRuns = map.get(player);
           double average = (double)totalRuns/mapCount.get(player);
           return average;
        }

        @Override
        public int getInningsCount(String player){
            return mapCount.get(player);
        }
    }

    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

    public interface PlayerStatisticsCollector {
        // This is an input. Make note of this player inning.  Runs is a non negative integer.
        void putNewInnings(String player, int runs);

        // Get the runs average(mathematical average) for a player
        double getAverageRuns(String player);

        // Get the total number of innings for the player
        int getInningsCount(String player);
    }

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        int currentLine = 0;
        while (currentLine++ < numLines) {
            final PlayerStatisticsCollector stats = new PlayerStatisticsCollectorImpl();
            final Set<String> players = new TreeSet<>();

            String line = scanner.nextLine();
            String[] inputs = line.split(",");
            for (int i = 0; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String player = tokens[0];
                players.add(player);
                final int runs = Integer.parseInt(tokens[1]);

                stats.putNewInnings(player, runs);

            }

            for (String player : players) {
                System.out.println(
                        String.format("%s %.4f %d", player, stats.getAverageRuns(player), stats.getInningsCount(player)));
            }

        }
        scanner.close();

    }
}
