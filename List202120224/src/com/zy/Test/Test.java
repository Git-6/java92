package com.zy.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		System.out.println("练习一：");
		List<String> c1=new ArrayList<String>();
		c1.add("one");
		c1.add("two");
		c1.add("three");
		List<String> c2=new ArrayList<>();
		c2.add("four");
		c2.add("five");
		c2.add("six");
		c1.addAll(c2);
		List<String> c3=new ArrayList<>();
		c3.add("one");
		c3.add("five");
		System.out.println("c1是否包含集合c3的所有元素？"+c1.containsAll(c3));
		for (int i = 0; i < c1.size(); i++) {
			if (c1.get(i).equals("two")) {
				c1.remove(i);
			}
		}
		System.out.println(c1);
		System.out.println("练习二：");
		/*2.创建一个集合，存放元素"1","$","2","$","3","$","4" 使用迭代器遍历集合，并在过程中删除所有的"$"，
		最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。*/
		List<String> j=new ArrayList<>();
		j.add("1");
		j.add("$");
		j.add("2");
		j.add("$");
		j.add("3");
		j.add("$");
		j.add("4");
		Iterator<String> iterator = j.iterator();
		while (iterator.hasNext()) {
			if ("$".equals(iterator.next())) {
				iterator.remove();
			}
			
			
		}
		iterator=j.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			}
	}

}
