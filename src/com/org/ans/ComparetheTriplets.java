package com.org.ans;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparetheTriplets{

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        int aliceSum = 0;
        int bobSum = 0;
        int zeroCount=0;
        for(int i=0;i<a.size();i++){
            int a1 = a.get(i);
            int b1 = b.get(i);
            if(a1 < b1){
                aliceSum++;
               
            }else if(a1 > b1){
                bobSum++;
            }else if(a1 == b1){
                zeroCount++;
            }
        }
        if(aliceSum > bobSum){
        
            result.add(aliceSum);
            result.add(bobSum);
            Collections.sort(result);
        }else {
           
            result.add(bobSum);
            result.add(aliceSum);
         
            
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
//       List<Integer> a = new ArrayList<Integer>();
//       a.add(5);
//       a.add(6);
//       a.add(7);
//       
//       List<Integer> b = new ArrayList<Integer>();
//       b.add(3);
//       b.add(6);
//       b.add(10);
    	
        List<Integer> a = new ArrayList<Integer>();
        a.add(20);
        a.add(20);
        a.add(30);
        
        List<Integer> b = new ArrayList<Integer>();
        b.add(20);
        b.add(20);
        b.add(50);
    	
//    	List<Integer> a = new ArrayList<Integer>();
//        a.add(17);
//        a.add(28);
//        a.add(30);
//        
//        List<Integer> b = new ArrayList<Integer>();
//        b.add(99);
//        b.add(16);
//        b.add(8);
       System.out.println( compareTriplets(a, b));
    }
}
