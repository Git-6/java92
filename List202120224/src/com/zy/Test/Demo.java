package com.zy.Test;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		int[] intArray={1,2,3,2,4,5,6,5};
		System.out.println(Arrays.toString(intArray));
		for (int i = 0; i < intArray.length; i++) {
			int temp=intArray[i];
			for (int j = i+1; j < intArray.length; j++) {
				if (intArray[j]==temp) {
					intArray[j]=-1;
				}
			}
		}
		System.out.println(Arrays.toString(intArray));

	}

}
