package interfaceDemo;

import java.util.Arrays;
import java.util.List;

public class FlatMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> list = Arrays.asList(Arrays.asList(3,4),Arrays.asList(1,2), Arrays.asList(5,6) );
//		list.stream().map(x->x)
		list.stream().flatMap(x->x.stream()).forEach(System.out::println);
		
		
		
		List<String>words=Arrays.asList("Java","Code");
		words.stream().flatMap(word->Arrays.stream(word.split(""))).forEach(System.out::println);
		
		List<Integer>list2 = Arrays.asList(1,2,3,4,5,6,7,8);
		int sum =list2.stream().reduce(0,(a,b)->a+b);
		System.out.println(sum);
	}

}
