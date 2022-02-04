package com.example.demo.output;

import java.io.Serializable;

import lombok.Data;

/**
 * ユーザー情報 リクエストデータ
 */
@Data
public class UserRequest implements Serializable {

	 private String username;
	 
	 
	 
	 
	 private String pwd;
	 
	 
	
	private long id;
    /**
     * 
     * 
     * 
     * 名前
     */
    private String name;
   

    /**
     * 住所
     */
    private String address;

    /**
     * 電話番号
     */
    private String phone;
}