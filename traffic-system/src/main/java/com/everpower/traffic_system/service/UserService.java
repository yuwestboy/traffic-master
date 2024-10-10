package com.everpower.traffic_system.service;

import org.springframework.stereotype.Service;
import com.everpower.traffic_system.info.UserInfo;

@Service
public interface UserService {
    /**
     * 添加用户
     * @param userInfo
     * @return
     */
    public boolean addUser(UserInfo userInfo);
}