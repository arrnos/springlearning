package com.arrnos.springlearning;

import com.arrnos.springlearning.entity.User;
import com.arrnos.springlearning.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringlearningApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void insertTest() {
		User user = new User();
		user.setName("李四");
		user.setAge(12);
		user.setEmail("arrnosm.com");
		Integer i = userMapper.insert(user);
		Integer id = user.getId();
		System.err.println("影响行数==>" + i);
		System.err.println("id==>" + id);
	}

	@Test
	public void selectAllTest() {
		List<User> list = userMapper.selectList(null);
		for (User user:
				list) {
			System.err.println(user);
		}
	}


	@Test
	public void selectByIdTest() {
		User user = userMapper.selectById(1);
		System.err.println(user);
	}

	@Test
	public void deleteTest() {
		int i = userMapper.deleteById(6);
		System.err.println("影响行数==>" + i);
		selectAllTest();
	}

	@Test
	public void updateByIdTest() {
		User user = new User();
		user.setId(2);
		user.setName("王五");
		user.setAge(100);
		int i = userMapper.updateById(user);
		System.err.println("影响行数==>" + i);
		selectAllTest();
	}
}