
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.te.default_static.Employee;

public class Test {
	public static void main(String[] args) {
		List<Employee> asList = Arrays.asList(new Employee("darshan", 10, 1000000), 
				new Employee("Vinayak", 20, 50000),
				new Employee("dars", 9, 450000),
		         new Employee("dars", 9, 450000),
		           new Employee("dars", 9, 450000));
		

		
	//	asList.stream().sorted(e1,e2) -> e1.getName().equals("dars");
		
	Stream<Employee> stream = asList.stream();
		boolean anyMatch = stream.anyMatch((e1)->e1.getName().equals("dars"));
		System.out.println(anyMatch);
				
          //asList.stream().anyMatch(e->e1.getName().equals("dars"))
//		Comparator<Employee> com = (o1, o2) -> {
//			return o1.getsal().compareTo(o2.getsal());
//		};
//
//		Collections.sort(asList, com);
//		System.out.println(asList.get(asList.size() - 1));
//
//		// ==========using stream=====with comprator
//		Optional<Employee> max = asList.stream().max(com);
//		System.out.println(max.get() + "==============");
//
//		// using stream along with function interface=======
//
//		Function<Employee, Double> f = (e) -> {
//			return e.getsal();
//		};
//
//		asList.stream().max(Comparator.comparing(f)).ifPresent(System.out::println);
//
//		Predicate<Employee> p = (e) -> {
//			return e.getsal() > 50000;
   //
//		};
//
//		List<Employee> collect = asList.stream().filter(p).collect(Collectors.toList());
	//	List<Employee> collect = asList.stream().filter(e->e.getsal()>50000).collect(Collectors.toList());
//
//		for (Iterator iterator = collect.iterator(); iterator.hasNext();) {
//			Employee employee = (Employee) iterator.next();
//			System.out.println(employee);
			

		}
	}

