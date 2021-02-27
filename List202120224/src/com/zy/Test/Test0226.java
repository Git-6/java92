package com.zy.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Test0226 {

	public static void main(String[] args) {
		System.out.println("练习1：");
		//1.创建一个List集合，并存放10个随机数，然后排序该集合 后输出
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(((int)(Math.random()*100)));
		}
		Collections.sort(list);
		System.out.println(list);
		System.out.println("练习2:");
		//2.创建一个字符串数组:{"one","two","three"}然后将该数组转换为一个List集合
		String[] c={"one","two","three"};
		List<String> nlist=new ArrayList<>();
		for (String c1 : c) {
			if (!nlist.contains(c)) {
				nlist.add(c1);
			}
		}
		System.out.println(nlist);
		System.out.println("练习3：");
		/*3.生成一个Emp类（属性:工号、姓名、薪水） 定义一个泛型Set集合，
		将创建的五个员工对象添加到集合中,
		通过泛型迭代器遍历集合中的元素找出集合中员工薪水高于5000的员工显示信息*/ 
		Emp w1=new Emp(001, "张三", 4000.0);
		Emp w2=new Emp(002, "李四", 5000.0);
		Emp w3=new Emp(003, "王五", 6000.0);
		Emp w4=new Emp(004, "赵一", 7000.0);
		Emp w5=new Emp(005, "钱二", 8000.0);
		List<Emp> list3=new ArrayList<>();
		list3.add(w1);
		list3.add(w2);
		list3.add(w3);
		list3.add(w4);
		list3.add(w5);
		Iterator<Emp> e=list3.iterator();
		for (Iterator<Emp> iter=list3.iterator(); iter.hasNext();) {
			Emp men=iter.next();
			if (men.getMoney()>5000.0) {
				System.out.println(men);
			}
		}
	}
}
    class Emp{
	int id;
	String name;
	double money;
	
	public Emp(int id, String name, double money) {
		super();
		this.id = id;
		this.name = name;
		this.money = money;
	}
	public Emp() {
		
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", money=" + money + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	
}