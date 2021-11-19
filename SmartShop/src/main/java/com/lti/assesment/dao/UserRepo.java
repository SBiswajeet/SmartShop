package com.lti.assesment.dao;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.lti.assesment.Model.UserData;
 
public interface UserRepo extends JpaRepository<UserData, Long> { 
	
	@Query("SELECT t FROM UserData t where t.category = ?1 AND t.name = ?2")
    public List<UserData> findbycategory(String category, String name);

	@Transactional
	@Modifying
	@Query("delete from UserData t where t.rating<2")
	public void deleteData();
	
	@Transactional
	@Modifying
	@Query("update UserData t SET t.totalPrice = t.quantity*t.unitPrice")
	public void updateData();
	
	
}
