package com.zy.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo0226 {

	public static void main(String[] args) {
		Map<String, Object> p1=new HashMap<>();
		p1.put("id", 1);
		p1.put("name(姓名)", "张三");
		p1.put("age（年龄）", 22);
		p1.put("address（住址）", "北京海淀");
		Map<String, Object> p2=new HashMap<>();
		p2.put("id", 2);
		p2.put("name(姓名)", "李四");
		p2.put("age（年龄）", 22);
		p2.put("address（住址）", "上海虹桥");
		Map<String, Object> p3=new HashMap<>();
		p3.put("id", 3);
		p3.put("name(姓名)", "王五");
		p3.put("age（年龄）", 24);
		p3.put("address（住址）", "深圳南山");
	    List<Map<String, Object>> list=new ArrayList<Map<String,Object>>();
	    list.add(p1);
	    list.add(p2);
	    list.add(p3);
	    for (Map<String, Object> map : list) {
			System.out.println(map);
		}

	}

}
