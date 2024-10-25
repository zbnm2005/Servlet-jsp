package com.multicampus.web.common;

import jakarta.servlet.ServletContextAttributeEvent;
import jakarta.servlet.ServletContextAttributeListener;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

//@WebListener
public class BoardWebServletContextListener implements ServletContextListener, ServletContextAttributeListener {

    public BoardWebServletContextListener() {
    	System.out.println("===> BoardWebServletContextListener 생성");
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("---> 서블릿 컨테이너가 생성됨");
    }

    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("---> 서블릿 컨테이너가 종료됨");
    }
	
    public void attributeAdded(ServletContextAttributeEvent scae) {
    	System.out.println("---> 서블릿 컨테이너에 정보가 등록됨");
    }
    
    public void attributeRemoved(ServletContextAttributeEvent scae) {
    	System.out.println("---> 서블릿 컨테이너에 등록된 정보가 삭제됨");
    }
    
    public void attributeReplaced(ServletContextAttributeEvent scae) {
    	System.out.println("---> 서블릿 컨테이너에 등록된 정보가 변경됨");
    }
}
