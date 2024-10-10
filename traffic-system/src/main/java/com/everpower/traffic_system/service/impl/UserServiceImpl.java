package com.everpower.traffic_system.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.everpower.traffic_api_commons.SystemUtils;
import com.everpower.traffic_system.info.UserInfo;
import com.everpower.traffic_system.repository.UserRepository;
import com.everpower.traffic_system.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    private static final int ZERO = 0;

    private final UserRepository userRepository;
    private final SystemUtils systemUtils;

    public UserServiceImpl(UserRepository userRepository, SystemUtils systemUtils) {
        this.userRepository = userRepository;
        this.systemUtils = systemUtils;
    }

    @Override
    public boolean addUser(UserInfo userInfo) {
        try {
            UserInfo user = userRepository.save(userInfo);
            
            if (!systemUtils.isNull(user) && user.getUid() != ZERO) {
                logger.info("User added successfully with UID: {}", user.getUid());
                return true;
            } else {
                logger.warn("Failed to add user. User is null or UID is zero.");
            }
        } catch (Exception e) {
            logger.error("Error adding user: {}", e.getMessage(), e);
        }

        return false;
    }
}