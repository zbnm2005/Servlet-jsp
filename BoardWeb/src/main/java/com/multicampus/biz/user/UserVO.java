package com.multicampus.biz.user;

import lombok.Data;

// VO(Value Object) : 테이블의 ROW와 매핑되는 클래스
@Data
public class UserVO { //implements HttpSessionBindingListener {
	private String id;
	private String password;
	private String name;
	private String role;

//	public void valueBound(HttpSessionBindingEvent event) {
//		System.out.println("----> 세션에 UserVO 객체가 등록됨");
//	}
//	
//	public void valueUnbound(HttpSessionBindingEvent event) {
//		System.out.println("----> 세션에서 UserVO 객체가 삭제됨");
//	}
}
