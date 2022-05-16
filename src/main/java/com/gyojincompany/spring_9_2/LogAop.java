package com.gyojincompany.spring_9_2;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
		
		String signatureStr = joinpoint.getSignature().toShortString();
		//공통기능이 적용될 메서드(joinpoint)의 이름 불러오기
		System.out.println(signatureStr + " 메서드가 시작되었습니다!");
		//joinpoint(메서드)의 이름 출력
		long st = System.currentTimeMillis();//현재시간가져오기
		
		try {
			Object obj = joinpoint.proceed();//joinpoint 메서드 실행
			return obj;
		} finally {
			long et = System.currentTimeMillis();//현재시간가져오기
			System.out.println(signatureStr + " 메서드가 종료되었습니다!");
			System.out.println(signatureStr + "경과시간 : " + (et-st));
		}
	}
	
	public void beforeAdvice() {
		System.out.println("beforeAdvice가 실행됨!");
	}
	
	public void afterReturningAdvice() {
		System.out.println("afterReturningAdvice가 실행됨!");
	}
	public void afterThrowingAdvice() {
		System.out.println("afterThrowingAdvice가 실행됨!");
	}
	
	public void afterAdvice() {
		System.out.println("afterAdvice가 실행됨!");
	}
}
