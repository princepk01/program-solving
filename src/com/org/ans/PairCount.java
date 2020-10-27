package com.org.ans;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;



class Result {

    public static int countPairs(List<Integer> numbers, int k) {
       Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < numbers.size(); i++) {
            map.put(numbers.get(i), numbers.get(i));
        }
        int counter = 0;
        
        for(int i = 0; i < numbers.size(); i++) {
            if(map.containsKey(numbers.get(i) + k)) {
                counter = counter + 1;
                map.remove(numbers.get(i) + k);
            }
        }
    return counter;

    }
}


public class PairCount {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> numbers = IntStream.range(0, numbersCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.countPairs(numbers, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}