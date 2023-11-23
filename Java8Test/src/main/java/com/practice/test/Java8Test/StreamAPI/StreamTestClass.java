package com.practice.test.Java8Test.StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamTestClass 
{

	
	public static void main(String[] args) 
	{
	
//		DemoFunctionalClass demo=new StreamTestClass()::print;
//		demo.print(7);
		streamTest();
		
	}
	
	void print(int a)
	{
		System.out.println("here "+a);
	}
	
	static void optionalTest() 
	{
		Optional<String> name = getName();
		boolean present = name.isPresent();
		name.ifPresent(System.out::println);
		String orElseGet = name.orElseGet(()->"Akshay");
		
		System.err.println(orElseGet);
	}
	
	static Optional<String> getName()
	{
		return Optional.ofNullable(null);
	}
	
	
	static boolean isprime(int v)
	{
		if(v==1)return false;
		for(int i=2;i<v;i++)
			if(v%i==0)return false;
		
		return true;
	}
	
	
	
	static void streamTest() 
	{
			List<Integer> li=Arrays.asList(1,2,3,5,6,7,8);
		
			
		
			String[] names= {"akshay","ajinkyaK","rahul","alok","kajal","s","pp"};
			
	
			   
			  
//			 System.out.println(collect);
			
		  
//			int N=3;
//			
//			List<String> collect = Arrays.stream(names).sorted((x,y)->y.length()-x.length()).skip(N-1).limit(1).collect(Collectors.toList());
//			System.out.println(collect);
////			
//			Optional<String> max = Arrays.stream(names).max((x,y)->x.length()-y.length());
//			System.out.println(max.get());
//			
		/*
		 * Optional<Integer> reduce = Stream.iterate(1,
		 * n->n+1).limit(100).filter(StreamTestClass::isprime).reduce((x,y)->x+y);
		 * System.out.println(reduce);
		 */
		
			
		/*
		 * Stream<Integer> s=Stream.iterate(0, n->n+2).limit(1000).skip(1);
		 * 
		 * System.out.println(s.toString()); List<Integer> collect =
		 * s.filter(n->n%2==0).collect(Collectors.toList());
		 * System.out.println(collect);
		 * 
		 * int p[]= {1,5,6,8,8}; IntStream val= Arrays.stream(p); double orElse =
		 * val.map(x->x*2).average().orElse(0.0); System.out.println(orElse);
		 * 
		 * Float a[]={1f,34f,4f,5f}; Stream<Float> stream = Arrays.stream(a, 0,
		 * a.length);
		 * 
		 * 
		 * int arr[][]= {{1,4,5},{3,4,5}}; IntStream flatMapToInt =
		 * Arrays.stream(arr).flatMapToInt(x->Arrays.stream(x));
		 * flatMapToInt.forEach(System.out::println);
		 * 
		 * Map<Integer,Long> collect2=null; collect2 =
		 * Arrays.stream(arr).flatMapToInt(Arrays::stream).boxed()
		 * .collect(Collectors.groupingBy( x -> x, LinkedHashMap::new,
		 * Collectors.counting()// Value: List<Integer> ));
		 * 
		 * System.out.println(collect2);
		 */
			
		
		/*
		 * Optional<Integer> reduce = li.stream().reduce((x,y)->x-y);
		 * reduce.ifPresent(System.out::print);
		 */
		/*
		 * List<Integer> collect =
		 * li.stream().filter((x)->x%2==0).distinct().sorted((a,b)->b-a).collect(
		 * Collectors.toList()); System.out.println(collect);
		 * 
		 * List<Integer> myList=new ArrayList<Integer>(); Consumer<Integer> con=(x)->{
		 * myList.add(0-x); }; li.stream().forEach(con);
		 * 
		 * List<Integer> collect2 =
		 * li.stream().map((x)->0-x).distinct().sorted((a,b)->b-a).limit(5).skip(3).
		 * collect(Collectors.toList());
		 * 
		 * System.out.println(myList); System.out.println(collect2);
		 * 
		 * String s="abababc";
		 * 
		 * Map<String,Integer> map=new HashMap<String, Integer>();
		 * Arrays.stream(s.split("")). forEach((x)-> { Integer value=map.getOrDefault(x,
		 * 0); map.put(x, value+1); }); System.out.println(map);
		 * 
		 * 
		 */
	}
	
	static void supplier() 
	{
		Supplier<Integer> sup=()->16;
		
		System.out.println(sup.get());
	}
	
	
	static void consumer() 
	{
		
		Integer y=new Integer(5);
		Consumer<Integer> con=
				(x)->
		{
			for(int i=1;i<=10;i++) 
			{
//				System.out.println(x+" * "+i+" = "+x*i);
			}
			x+=1;
		};
		
		con.accept(y);
		
//		System.out.println(y);
		
		BiConsumer<Integer, Integer> bic=(a,b)->
		{
			System.out.println("sum is "+(a+b));
		};
		
		bic.accept(4, 3);
		
	}
	
	
	
	static void FunctionTest() 
	{
	
		Function< Integer, Integer> fun1=(x)->{
			
				x=x+1;
				
			return x;
		};
		
		Function<Integer, Integer> fun2=(x)->x=x*2;
		
		Integer apply = fun1.andThen(fun2).apply(4);
		
		Integer apply2 = fun1.compose(fun2).apply(4);
		
		System.out.println(apply +" : "+apply2);
		
		BiFunction<Integer, Integer, Integer> biF=(x,y)->x+y;
		
		Integer apply3 = biF.apply(4, 5);
		System.out.println(apply3);
		
	}
	
	
	
	
	
	static void predicateTest() 
	{
		Predicate<Integer> checkIfEvevn=(x)->(x%2==0)&&(x%10==0);
//		Predicate<Integer> isDivBy10=(x)->x%10==0;
		
		boolean test = checkIfEvevn.test(4);
		
		System.out.println(test);
		
		BiPredicate<Integer, Integer>  bi=(x,y)->
		{
			x=y+x;
			y=-101;
			
			return x>y;
		};
		
		
		System.out.println(bi.test(-5, -500));
	}



	
}

 class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
 }
