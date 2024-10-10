package com.everpower.traffic_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.everpower.traffic_system.info.UserInfo;

public interface UserRepository extends JpaRepository<UserInfo, Long>{

}
  