package com.everpower.traffic_api_commons;

import org.springframework.stereotype.Component;

@Component
public class SystemUtils {

    /*
     *  判断是否是空对象
     * @param object
     * @return true 表示不是空
     */

    public boolean isNull(Object object) {
        return null == object;
    }
}
