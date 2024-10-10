package com.everpower.traffic_system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everpower.traffic_api_commons.SystemUtils;
import com.everpower.traffic_system.info.UserInfo;
import com.everpower.traffic_system.repository.UserRepository;
import com.everpower.traffic_system.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    final int ZERO = 0;
    @Autowired
    UserRepository userRepository;
    public boolean addUser(UserInfo userInfo) {
        UserInfo user = userRepository.save(userInfo);
        
        if(!SystemUtils.isNull(user) && user.getUid() != ZERO) {
            return true;
        }
        
        return false;
    }
}