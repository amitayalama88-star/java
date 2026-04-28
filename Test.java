package interfaceDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {

    public static void main(String[] args) {
        // 1. Predicate: Works perfectly (returns true for even numbers)
        Predicate<Integer> p = (e) -> e % 2 == 0;
        System.out.println("Is 10 even? " + p.test(10));
        
        // 2. Function 1: Gets the length of the string
        Function<String, Integer> f = (e) -> e.length();
        System.out.println("Length: " + f.apply("asasdad"));
        
        // 3. FIX: Function 2 signature must match the return type
        // You were trying to return a String (toUpperCase) but defined it as Integer
        Function<String, String> f1 = (e1) -> e1.toUpperCase();
        System.out.println("Uppercase: " + f1.apply("it is ok"));
        
        
        Consumer<String>c=name-> System.out.println("welcome " + name);
        c.accept("Shiba");
        List<String> list = Arrays.asList("raja","maja", "buja");
        

        Consumer<String>c1=name1-> System.out.println("welcome " + name1);
        list.forEach(c1);
        
        list.forEach(k->System.out.println(k));
        
        
        Supplier <String> s12 =() -> "it is okat vangara";
        System.out.println(s12.get());
        
        
        
        
        
    }
}