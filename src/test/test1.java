package test;

import org.Spring.vo.Person;
import org.Spring.vo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test1 {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		
		Person p=ctx.getBean("person",Person.class);
		System.out.println(p.speak());
		
		p.eat();
		
		//System.out.println(p.getClass());
		
		User u=ctx.getBean("user",User.class);
		u.gainUserNumber(0);
	}		
}
