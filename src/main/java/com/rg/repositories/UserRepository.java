package com.rg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rg.domain.User;


public interface UserRepository extends JpaRepository<User,Integer>{

	User findByUsernameAndPassword( String userName, String password );


}
