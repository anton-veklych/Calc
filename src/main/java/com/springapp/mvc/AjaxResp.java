package com.springapp.mvc;

/*Клас мапинга JSON отправляется клиенту в ответ */
public class AjaxResp {

    private Float result;

    public void setResult(Float result) {
        this.result = result;
    }

    public Float getResult() {
        return result;
    }
}
