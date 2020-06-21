package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //해당 클래스를 스프링 설정 클래스로 지정
public class AppContext {

	@Bean
	public Greeter greeter() {
		Greeter g = new Greeter(); //스프링이 관리하는 Bean 객체로 등록됨
		g.setFormat("%s, 안녕하세요!"); //초기화
		return g;
	}
	
}
