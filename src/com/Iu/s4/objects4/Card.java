package com.Iu.s4.objects4;

public class Card {
	
	
	//Card
	private String shape;
	private int number;
	private String color;
	
	//클래스 변수
	public static int size = 10;//공통적으로 사용하는 변수는 static을 사용한다.
		
	//instance 초기화 블럭
	{
	
	}
	
	//static 초기화 블럭
	static {
		Card.size=50;
	}
	//클래스 메서드
	// 클래스 메서드 내에서는 멤버변수나 멤버 메소드를 사용할 수없다.
	public static void staticMethod() {
		Card.size =10;
		System.out.println("스태틱 매서드");
		System.out.println();
	}
	//but 멤버 메소드 안에서는 클래스 매서드와 클래스 변수를 사용할 수 있다,
	public void info() {
		
		System.out.println("Shape : "+this.shape);
		System.out.println("Color : "+this.color);
		System.out.println("number : "+this.number);
		System.out.println("size : "+Card.size);//static이기때문
		Card.staticMethod();
		
	}
	
	
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	

}
