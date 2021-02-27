package com.zy.Test;

import java.util.HashMap;
import java.util.Map;

import com.zy.model.Emp;

public class EmpTest {

	public static void main(String[] args) {
		Emp e1=new Emp(1001,"张三");
		Emp e2=new Emp(1001,"李四");
		Emp e3=new Emp(1001,"王二");
		Map<Integer, Emp> eMap=new HashMap<>();
		eMap.put(1001, e1);
		eMap.put(1002, e2);
		eMap.put(1003, e3);
		Emp ev=eMap.get(1001);
		System.out.println("编号:"+ev.getId()+",姓名:"+ev.getName());

	}

}
