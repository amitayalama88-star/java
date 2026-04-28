package interfaceDemo;

import java.util.Arrays;
import java.util.List;

public class FilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//used to select elements
		List<Integer> list = Arrays.asList(10,23,45,456,767,2342,34);
		list.stream().filter(n->n%2==0).forEach(System.out::println);
		
		List<String>names = Arrays.asList("asdasd","raja", "baja","dacid");
		names.stream().filter(name->name.startsWith("r")).forEach(System.out::println);
		
		//map method  () used to transform/convert each element
		
		List<String>st = Arrays.asList("asdasd","raja", "baja","dacid");
//		st.stream().map(String::toUpperCase).forEach(System.out::println);
		
	
		st.stream().map((s)->s.toUpperCase()).forEach(System.out::println);
		
		List<Integer> list1 = Arrays.asList(10,23,45,456,767,2342,34);
		al.stream().filter(n->n%2==0).map(n->n*2).forEach(System.out::println);
		
		
		
		//

	}

}
