package com.zy.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01 {

	public static void main(String[] args) {
		//1.计算1997年6月1日出生的人 来到这个世界上多少天了

		DateFormat df2 = new SimpleDateFormat("D");//D:时间对象所处年份的第几天
		String str2 = df2.format(new Date());
		System.out.println(str2);
		int leap=0;
		int common=0;
		int k=0;
		int y=0;
		for (int i = 1997; i < 2021; i++) {
			
			if (i%4==0) {
				y++;
				
			}else{
				k++;
				
			}
		}
		leap=366*y;
		common=365*k;
		System.out.println(leap);
		System.out.println(common);
	}

}
