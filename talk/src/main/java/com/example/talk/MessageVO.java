package com.example.talk;

public class MessageVO {
    private int type;
    private int userNum;
    private String message;

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setUserNum(int userNum) {
        this.userNum = userNum;
    }

    public int getUserNum() {
        return userNum;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
