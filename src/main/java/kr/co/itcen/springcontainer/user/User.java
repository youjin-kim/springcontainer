package kr.co.itcen.springcontainer.user;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class User {
	private Long no;
	private String name;
	
	private Friend friend;
	
	private List<String> friends;
	
	public User() {
		no = 1L;
		name = "김유진";
	}
	
	public User(Long no, String name) {
		this.no = no;
		this.name = name;
	}

	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Friend getFriend() {
		return friend;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + ", friend=" + friend + ", friends=" + friends + "]";
	}
	
}
