package DailyCoding;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 *cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair.
 *For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.

	Given this implementation of cons:
 * 
 */
public class Daily5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<String,Integer> fun = x->x.length();
		Function<Integer,Integer> fun1 = x->x*3;
		
		System.out.println(fun.apply("abcd"));
		System.out.println(fun.andThen(fun1).apply("def"));
	}
	
	public <T,R> Map<T,R> convertListToMap(List<T> list, Function<T,R> func)
	{
		Map<T,R> map = new HashMap<T, R>();
		for(T t:list)
		{
			map.put(t, func.apply(t));
		}
		return map;
	}
	

}
