package com.Iu.s4.objects2;

public class Car {
	String company;
	String name; 
	int price;
	String color;
	
	public Car() {
		this("black"); //생성자내에서 다른 생성자 호출
		
//		this.company = "Kia";
//		this.name="스포티지";
//		this.price=3500;
//		this.color="Black";
		
	}
	public Car(String color) {
		this(color,3500);
		
//		this.company = "Kia";
//		this.name="스포티지";
//		this.price=3500;
//		this.color=Color;
	}
	public Car(String color, int price) {
		this( "스포티지",color,price);
//		this.company = "Kia";
//		this.name="스포티지";
//		this.price=price;
//		this.color=Color;
	}
	public Car(String name,String color, int price) {
		this.company = "Kia";
		this.name=name;
		this.price=price;
		this.color=color;
	}
	
	public void info() {
		System.out.println("Name : "+this.name);
		System.out.println("Company : "+this.company);
		System.out.println("Price : "+this.price);
		System.out.println("Color : "+this.color);
		
	}
}
