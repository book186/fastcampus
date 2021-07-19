package test;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaArrayList {
	public int[] solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                int tmp = numbers[i + j];
                    arr.add(tmp);
                }
                
            }
	       
        int[] answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            answer[i] = arr.get(i);
        }

        Arrays.sort(answer);
	    return answer;
    }
}

