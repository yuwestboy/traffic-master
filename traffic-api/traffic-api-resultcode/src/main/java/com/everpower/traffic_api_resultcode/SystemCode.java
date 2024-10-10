
package com.everpower.traffic_api_resultcode;

/**
 * 系统用户管理模块的错误码
 * 区间： 10000 - 15555
 */
public interface SystemCode {

    /**
     * 错误类型、提示类型、故障类型。
     * 
     * 
     */
    // 系统通用的成功状态码
    String  TRAFFIC_SYSTEM_SUCCESS = "000000";
    String  TRAFFIC_SYSTEM_ERROR = "000001";


    // 用户管理 10000 - 10999
    // 10000 - 10499 错误提示
    int SYSTEM_USER_ERROR_ADD_FAIL = 10000;
    // 10500 - 10999 成功提示
    int SYSTEM_USER_INFO_ADD_SUCCESS = 10500;

    // 角色管理 11000 - 11999
    // 11000 - 11499 错误提示
    int SYSTEM_ROLE_ERROR_ADD_FAIL = 11000;
    // 11500 - 11999 成功提示
    int SYSTEM_ROLE_INFO_ADD_SUCCESS = 11500;

    // 权限管理 12000 - 12999
    // 12000 - 12499 错误提示
    int SYSTEM_AUTH_ERROR_ADD_FAIL = 12000;
    // 12500 - 12999 成功提示
    int SYSTEM_AUTH_INFO_ADD_SUCCESS = 12500;

     /***
      *  提示类型
      */


      /**
       * 故障类型
       * 
       */
}
