package com.ha;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 	@Before (이전) : 어드바이스 타겟 메소드가 호출되기 전에 어드바이스 기능을 수행
	@After (이후) : 타겟 메소드의 결과에 관계없이(즉 성공, 예외 관계없이) 타겟 메소드가 완료 되면 어드바이스 기능을 수행
	@AfterReturning (정상적 반환 이후)타겟 메소드가 성공적으로 결과값을 반환 후에 어드바이스 기능을 수행
	@AfterThrowing (예외 발생 이후) : 타겟 메소드가 수행 중 예외를 던지게 되면 어드바이스 기능을 수행
	@Around (메소드 실행 전후) : 어드바이스가 타겟 메소드를 감싸서 타겟 메소드 호출전과 후에 어드바이스 기능을 수행
 * 
 * */
@Aspect
@Component
public class MyAspect {
	private Logger log = LoggerFactory.getLogger(MyAspect.class);
	
//	@AfterThrowing
	@Around("execution(* com.ha.TestController.*(..))")
	public Object printLog(ProceedingJoinPoint jp) throws Throwable {
		log.info("type name: "+jp.getSignature().getDeclaringTypeName() + ", name: "+jp.getSignature().getName());
		Object obj = jp.proceed();
		log.info("type name: "+jp.getSignature().getDeclaringTypeName() + ", name: "+jp.getSignature().getName());
		return obj;
	}
}
