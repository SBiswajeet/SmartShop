package com.lti.assesment.Service;

import org.springframework.data.repository.CrudRepository;

import com.lti.assesment.Model.UserData;

public interface UserCRUD extends CrudRepository<UserData, Integer> {

}