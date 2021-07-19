package test;

import java.util.Arrays;
import java.util.List;

public class JavaStream {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("jeong", "pro", "jdk", "java");
		List<Integer> ages = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		long count = 0;
		
		/*
		for(String name : names) {
			if(name.contains("o")) {
				count++;
			}
		}
		
		for(int i = 0; i < names.size(); i++) {
			String name = names.get(i);
			if(name.contains("o")) {
				count++;
			}
		}
		System.out.println("count : " + count);
		 */
		
		count = 0;
		count = names.stream().filter(zd -> zd.contains("o")).count();
		System.out.println("count2 : " + count);
		System.out.println("=========================");
		
		names.parallelStream().map(x -> x.concat("s")).forEach(x -> System.out.println(x));
		System.out.println("=========================");
		
		ages.stream().filter(x -> x > 3).limit(3).forEach(x -> System.out.println(x));
		System.out.println("=========================");
	}
}
