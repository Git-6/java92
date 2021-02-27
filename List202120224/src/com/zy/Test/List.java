package com.zy.Test;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		int[] list={1,2,3,4,5,6,7,8,9,1};
		ArrayList<Integer> arr=new ArrayList<>();
		for (int in : list) {
			if (!arr.contains(in)) {
				arr.add(in);
			}
		}
		int [] newList=new int[arr.size()];
		int index=0;
		for (int in : arr) {
			newList[index++]=in;
		}
		for (int i = 0; i < newList.length; i++) {
			System.out.println(newList[i]);
		}

	}

}
