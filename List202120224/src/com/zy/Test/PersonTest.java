package com.zy.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.zy.model.Person;

public class PersonTest {

	public static void main(String[] args) {
		/*List接口中的成员方法:
			public boolean add(E e); //将指定的元素追加到此列表的末尾,这里的E指的是泛型,目前可以理解
			为Object类型。
			public E get(int index) //根据索引,索取其对应的元素
			public int size() //获取集合长度
			使用集合的步骤:
			1.创建集合对象
			2.创建元素对象
			3.将元素添加到集合
			4.遍历集合*/
		List list=new ArrayList();
		Person p1=new Person("郭德纲",45);
		Person p2=new Person("于谦",35);
		Person p3=new Person("郭德纲",45);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.get(1));
		list.remove(2);
		System.out.println(list);
		LinkedList<String> list01=new LinkedList<String>();
		list01.add("张三");
		list01.add("李四");
		list01.add("王二");
		System.out.println(list01);
		list01.remove();
		System.out.println(list01);
		list01.add(0, "郭德纲");
		System.out.println(list01);

	}

}
