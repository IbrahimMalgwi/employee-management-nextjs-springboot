package com.ganzymalgwi.usermanagementsystem.repository;

import com.ganzymalgwi.usermanagementsystem.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
