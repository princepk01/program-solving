package com.org.java.eight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApiExample {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "HP Laptop", 25000f));
		list.add(new Product(2, "Dell Laptop", 30000f));
		list.add(new Product(3, "Lenevo Laptop", 28000f));
		list.add(new Product(4, "Sony Laptop", 28000f));
		list.add(new Product(5, "Apple Laptop", 90000f));
		list.add(new Product(6, "HP Laptop", 25000f));
		list.add(new Product(7, "Dell Laptop", 30000f));
		list.forEach(System.out::println);
		
		System.out.println("=========================");
		List<Product> l1 = list.stream().filter(p->p.getPrice() >28000f).collect(Collectors.toList());
		System.out.println(l1);
		System.out.println("=========================");
		l1.forEach(System.out::println);
		System.out.println("=========================");
		//List<Product> collect = list.stream().filter(p1->p1.getPrice() > 28000f).collect(Collectors.toList());
		List<Float> priceList = list.stream().filter(p1->p1.getPrice() > 28000f).map(m->m.getPrice()).collect(Collectors.toList());
		System.out.println(priceList);
		System.out.println("=========================");
		priceList.forEach(System.out::println);
		System.out.println("=========================");
		list.stream().filter(p2->p2.getPrice() == 28000f).forEach(System.out::println);
		System.out.println("=========================");
		list.parallelStream().forEach(System.out::println);
		System.out.println("=========================");
		Double doublePrice = list.stream().collect(Collectors.summingDouble(p3->p3.getPrice()));
		System.out.println("Double price : "+doublePrice);
		System.out.println("=========================");
		Product product = list.stream().max((o1,o2)-> o1.getPrice() > o2.getPrice() ? 1 : -1).get();
		System.out.println(product);
		System.out.println("=========================");
		Product product2 = list.stream().min((o3,o4) ->o3.getPrice()> o4.getPrice() ? 1 : -1).get();
		System.out.println(product2);
		System.out.println("=========================");
		Map<Integer, Float> map1 = list.stream().collect(Collectors.toMap(m8 -> m8.getId(), m9-> m9.getPrice()));
		System.out.println(map1);
		System.out.println("========price ascending order=================");
		list.sort((o11,o12) -> o11.getPrice() < o12.getPrice() ? -1 : o11.getPrice() > o12.getPrice() ? 1 : 0);
		System.out.println(list);
		System.out.println("=========price descending order===============");
		list.sort((o11,o12) -> o11.getPrice() < o12.getPrice() ? 1 : o11.getPrice() > o12.getPrice() ? -1 : 0);
		System.out.println(list);
		
		System.out.println("=======find duplicate price in product=================");
		
		Map<Float,Integer> map = new HashMap<Float,Integer>();
		
		list.forEach(l->
			map.put(l.getPrice(), map.get(l.getPrice()) == null ? 1 : map.get(l.getPrice())+1)
				);
		
		Collection<Integer> values = map.values();
		System.out.println("values ==> "+values);
		System.out.println("map value count : "+map);
		System.out.println("==================================================");
		int x =10;
		int y =20;
		
		x = x^y;
		y = x^y;
		x = x^y;
		
		System.out.println("x : "+x +" == "+"y : "+y);
		int a =10; int b=20;
		b = (a+b)-(a=b);
		System.out.println("a : "+a +" == "+"b : "+b);
		
		Runnable r = ()->{
			System.out.println("run method");
		};
		Thread t = new Thread(r);
		t.start();
	}

}
