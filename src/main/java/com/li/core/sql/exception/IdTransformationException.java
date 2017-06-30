package com.li.core.sql.exception;

/**
 * 内部异常类：表示数据库中自增ID达到了Long类型，而实体类中ID为Integer类型时发生的类型转换异常
 * 解决方案：实体类中将int提升为long
 * @author liuli
 * @time 2016年2月26日下午5:05:41
 * 
 */
public class IdTransformationException extends Exception {

	public IdTransformationException(String message) {
		// TODO Auto-generated constructor stub
		 super(message);
	}

	private static final long serialVersionUID = 1L;

}
