package org.Spring.vo;

public class User {
	public void gainUserNumber(int i){
		System.out.println("user number: "+i);
		if (i<0)
		{
			throw new IllegalArgumentException("输入参数"+i+" 小于0"); 
		}
	}
}
