package com.tog.test;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tog.config.AppConfig;
import com.tog.entity.MstAdmin;
import com.tog.service.MstAdminSvc;

public class TestMstAdmin {
	
	public static void main(String[]args){
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		MstAdminSvc mstAdminSvc = context.getBean(MstAdminSvc.class);
		
		MstAdmin mstAdmin = new MstAdmin();
		mstAdmin.setPasswordAdmin("Eliazer");
		mstAdmin.setUsernameAdmin("Eliazer");
		mstAdmin.setCreatedDate(LocalDateTime.now());
		mstAdmin.setCreatedUser("ADMIN");
		mstAdmin.setDeleted(false);
		
		//mstAdminSvc.save(mstAdmin);
		List<MstAdmin> list = mstAdminSvc.findByUsernameAndPasswordAdmin("Eliazer", "Eliazer");
		
		if(!list.isEmpty() || list != null || list.size() > 0){
			for(MstAdmin admin : list){
				System.out.println("Username: " + admin.getUsernameAdmin() 
									+"Password: " + admin.getPasswordAdmin());
			}
		}
		else{
			System.out.println("No data");
		}
		
	}

}
