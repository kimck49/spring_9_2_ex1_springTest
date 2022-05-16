package com.gyojincompany.spring_9_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		Student student1 = ctx.getBean("stu1", Student.class);
		
		Worker worker1 = ctx.getBean("worker1", Worker.class);
		
		student1.printStudentInfo();//핵심기능 메서드 호출
		worker1.printWorkerInfo();//핵심기능 메서드 호출
		
		ctx.close();
	}

}
