package com.r.lesson2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.r.lesson2.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
	
	UserInfo findByUserName(String userName);

	UserInfo findByUserNameOrEmail(String username, String email);
}
