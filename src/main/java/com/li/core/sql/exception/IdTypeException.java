package com.li.core.sql.exception;

/**
 * 内部异常类：表示实体类的ID字段类型与数据库类型不匹配
 * 解决方案：更正主键类型
 * @author liuli
 * @time 2016年2月26日下午5:04:16
 * 
 */
public class IdTypeException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public IdTypeException(String message){
		 super(message);
	}

}
