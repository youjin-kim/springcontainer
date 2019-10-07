package kr.co.itcen.springcontainer.user;

import org.springframework.stereotype.Component;

@Component
public class User {
	private Long no;
	private String name;
	
	public User() {
		no = 1L;
		name = "김유진";
	}
	
	public User(Long no, String name) {
		this.no = no;
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + "]";
	}
	
}
