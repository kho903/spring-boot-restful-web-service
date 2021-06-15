package com.example.restfulwebservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// lombok
@Data
@AllArgsConstructor
@NoArgsConstructor // 디폴트 생성자
public class HelloWorldBean {
    private String message;

    /* - lombok을 쓰면 자동으로 getter setter 생성해줌
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String msg) {
        this.message = msg;
    }
    */
    /* AllArgsConstructor - 자동으로 생성
    public HelloWorldBean(String message) {
        this.message = message;
    }
    */
}
