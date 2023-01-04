package com.Iu.s4.objects4;

public class God {

	private String name;
	private static God staticgod;//초기값은 null
	private God() {}//디폴트 생성자

	public static God getInstance() {//static은 생성자 없이 생성 가능

		
		if(God.staticgod==null)
			God.staticgod = new God();// !=일때 에러. : 생성자가 생성되지 않기때문
		return God.staticgod;

	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
