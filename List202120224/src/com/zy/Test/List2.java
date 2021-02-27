package com.zy.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class List2 {

	public static void main(String[] args) {
		System.out.println("请随机输入一串字符");
		Scanner in=new Scanner(System.in);
		String string=in.next();
		 char [] list = string.toCharArray(); 
		 ArrayList<Character> arr=new ArrayList<>();
			for (char inn : list) {
				if (!arr.contains(inn)) {
					arr.add(inn);
				}
			}
			char [] newList=new char[arr.size()];
			int index=0;
			for (char inn : arr) {
				newList[index++]=inn;
			}
			for (int i = 0; i < newList.length; i++) {
				System.out.println(newList[i]);
			}
	}
}
