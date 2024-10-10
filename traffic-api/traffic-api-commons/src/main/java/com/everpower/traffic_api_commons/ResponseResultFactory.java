package com.everpower.traffic_api_commons;

import com.everpower.traffic_api_resultcode.*;


/**
 * 构建一个通用的成功返回结果
 * @return
 */
public class ResponseResultFactory<T> {

    public static ResponseResult buildResponseResult() {
        return new ResponseResult(SystemCode.TRAFFIC_SYSTEM_SUCCESS);
     }

     public static ResponseResult buildResponseResult(String code) {
        return new ResponseResult(code);
     }

     public static ResponseResult buildResponseResult(String resultCode, String resultMsg) {
        return new ResponseResult(resultCode, resultMsg);
     }

     public static ResponseResult buildResponseResult(String resultCode, String resultMsg, Object obj) {
        return new ResponseResult(resultCode, resultMsg, obj);
     }
}

