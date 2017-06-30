package com.li.base.service;

import java.util.List;

import com.li.base.pojo.TestUserPo;

/**
 * 对crud的一些简单的演示
 * @author liuli
 * @time 2016年6月28日上午10:11:06
 * 
 *
 */
public interface TestService {

	/**
	 * 添加一些用于测试的记用户录到数据库
	 * @return
	 */
	int addList();
	
	/**
	 * 列出用于测试的用户列表
	 * @return
	 */
	List<TestUserPo> listUser();
	
}
