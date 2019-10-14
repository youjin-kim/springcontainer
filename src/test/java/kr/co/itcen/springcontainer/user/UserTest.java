package kr.co.itcen.springcontainer.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.user.UserConfig01;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {UserConfig01.class})
public class UserTest {

	@Autowired
	private User user;
	
	@Autowired
	private Friend friend;
	
	@Test
	public void testUserNull() {
		//assert(user != null);    //진실
		assertNotNull(user);
	}
	
	@Test
	public void testFriendNull() {
		assertNotNull(friend);
	}
	
	@Test
	public void testFriendDooly() {
		assertEquals(friend.getName(), "둘리");
	}
	
	/*
	@Test  //Test는 병렬로 됨, 순서대로 실행되지 않음
	public void testMethod() {
		int x = 8;
		assert(x-2 == 6);
	}*/
}
