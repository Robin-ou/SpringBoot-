package com.r.lesson2;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.r.lesson2.dao.UserInfoRepository;
import com.r.lesson2.entity.UserInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserInfoRepositoryTest {
	@Autowired
	private UserInfoRepository u;

	@Test
	public void test() throws Exception {
		// Date d = new Date();
		// DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG,
		// DateFormat.LONG);
		// String formattedDate = df.format(d);
		// u.save(new UserInfo("aa1", "aa@126.com", "aa",
		// "aa123456",formattedDate));
		// u.save(new UserInfo("bb2", "bb@126.com", "bb",
		// "bb123456",formattedDate));
		// u.save(new UserInfo("cc3", "cc@126.com", "cc",
		// "cc123456",formattedDate));
		List<UserInfo> list = u.findAll();
		System.out.println(list.get(0));
	}
}
