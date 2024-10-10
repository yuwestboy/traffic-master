package com.everpower.traffic_api_commons;

// 每次请求都返回
public class ResponseResult {

    // 当前的响应代码
    String resultCode;
    // 当前响应的信息
    String resultMsg;
    // 具体的结果
    Object ressult;

    public ResponseResult(String resultCode) {
        this.resultCode = resultCode;
    }

    public ResponseResult(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    public ResponseResult(String resultCode, String resultMsg, Object ressult) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
        this.ressult = ressult;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return this.resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public Object getRessult() {
        return this.ressult;
    }

    public void setRessult(Object ressult) {
        this.ressult = ressult;
    }
    

}
 