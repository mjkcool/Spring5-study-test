package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppContext.class);
		
		Greeter g = ctx.getBean("greeter", Greeter.class); //AppContext의 greeter()객체 가져오기
		
		String msg = g.greet("스프링");
		System.out.println(msg);
		System.out.println("I'm a groovy girl!");
		
		ctx.close();
	}
}
