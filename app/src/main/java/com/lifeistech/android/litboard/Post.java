package com.lifeistech.android.litboard;

/**
 * Created by shanxiazhiye on 2018/05/12.
 */

public class Post {

    String message;
    String userName;

    //Firebaseのための空コンストラクタ
    public Post(){

    }
    //コンストラクタ
    public Post(String userName, String message){
        this.userName = userName;
        this.message = message;
    }
    public String getMessage(){return message;}
    public void setMessage(String message){this.message= message;}
    public String getUserName(){return userName;}
    public void setUserName(String userName){this.userName=userName;}
}
