package com.cap.demo;

public class SalesClass {
	
	private int[] datas={1,90,45,-34,12};
	
	public void display(){
		System.out.println("Sales Class Display Method");
		for(int i=0;i<datas.length;i++)
		{
			System.out.println(""+datas[i]);
		}
	}

}
