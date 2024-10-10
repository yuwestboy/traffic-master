package com.everpower.traffic_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everpower.traffic_api_commons.SystemUtils;
import com.everpower.traffic_system.info.UserInfo;
import com.everpower.traffic_system.repository.UserRepository;

@Service
public interface UserService {
    /**
     * 添加用户
     * @param userInfo
     * @return
     */
    public boolean addUser(UserInfo userInfo);
}