package kr.co.itcen.springcontainer.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.itcen.springcontainer.user.User;

public class ContainerTest {

	public static void main(String[] args) {
		testApplicationContext();
	}
	
	public static void testApplicationContext() {
		ApplicationContext appCtxt = new ClassPathXmlApplicationContext("config/user/applicationContext01.xml");
		
		// error: 같은 타입의 빈이 1개 이상 있는 경우
		//        타입으로 가져오면 예외 발생!
		//User user1 = appCtxt.getBean(User.class);
		
		// id로 가져오기(!name보단 id로 사용!)
		User user1 = (User) appCtxt.getBean("user1");
		System.out.println(user1);
		
		// name으로 가져오기
		User usr2 = (User) appCtxt.getBean("usr2");
		System.out.println(usr2);
		
		// singleton 확인
		User user2 = (User) appCtxt.getBean("user2");  // id로 가져옴 
		System.out.println(usr2 == user2);
		
		// User(Long, String) 으로 생성된 빈 가져오기
		User user3 = (User) appCtxt.getBean("user3"); 
		System.out.println(user3);
		
		// User() 으로 생성되고 프러퍼티 세팅을 한(setter) 빈 가져오기
		User user4 = (User) appCtxt.getBean("user4");
		System.out.println(user4);
		
		// DI 설정한 빈 가져오기(내부에 생성된 다른 빈 세팅 -> 값이 X)
		User user5 = (User) appCtxt.getBean("user5"); 
		System.out.println(user5);
		
		// DI 설정한 빈 가져오기2
		User user6 = (User) appCtxt.getBean("user6");
		System.out.println(user6);
		
		
		((ConfigurableApplicationContext)appCtxt).close();
	}
}
