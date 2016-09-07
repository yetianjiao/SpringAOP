package org.Spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class AuthAspect {
	public void auth(){
		System.out.println("~~~~~~~~~~模拟权限控制");
	}
	public void log()
	{
		System.out.println("~~~~~~~~~~模拟日志");
	}
	
	public void repairException(Throwable ex){
		System.out.println("repair Expextion:"+ex);
	}
	
	public void afterSpeak(String detail){
		System.out.println("当时的场景是："+detail);
	}
	
	public Object  arounding(ProceedingJoinPoint p) throws Throwable{
		//ProceedingJoinPoint来自aspectJ
		//开始之前执行
		System.out.println("Start");
		System.out.println("--------------------------------");
		//获得方法签名，本方法的签名是：public void arounding(ProceedingJoinPoint p)
		System.out.println("执行的方法的签名是"+p.getSignature());
		System.out.println("得到目标方法原对象"+p.getTarget());
		System.out.println("得到AOP代理类"+p.getThis());
		System.out.println("得到方法参数"+p.getArgs());
		System.out.println("--------------------------------");
		//负责回调原来方法的代码,如果没有这一行代码，则原方法无法执行
		Object o = p.proceed();
		//结束之后执行
		System.out.println("end");
		
		//返回原来方法的返回值
		//return o; 
		//对目标方法的返回值进行修改
		return "修改了的返回值："+o;
	}
}
