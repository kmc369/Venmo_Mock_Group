package com.StockPulse.StockPulse.repos;

import com.StockPulse.StockPulse.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsernameAndPassword(String username, String password);
//inherits all methods from jpa repo interface for CRUD on user entities

}
