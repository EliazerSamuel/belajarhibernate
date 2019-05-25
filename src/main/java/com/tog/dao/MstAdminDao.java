package com.tog.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tog.entity.MstAdmin;


public interface MstAdminDao extends JpaRepository<MstAdmin, Integer> {
	
	@Query(value="SELECT p FROM MstUser p WHERE p.usernameadmin = :usernameadmin "
			+ "and p.passwordadmin = :passwordadmin")
	public List<MstAdmin> findByUsernameAndPasswordAdmin(
			@Param("usernameadmin") String usernameadmin,
			@Param("passwordadmin") String passwordadmin);

}
