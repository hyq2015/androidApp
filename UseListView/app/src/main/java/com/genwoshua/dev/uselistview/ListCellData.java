package com.genwoshua.dev.uselistview;

/**
 * Created by Administrator on 2017/7/31.
 */

public class ListCellData {
    public ListCellData(String userName,String sex,int age){
        this.userName=userName;
        this.sex=sex;
        this.age=age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String userName="张三";
    private String sex="男";
    private int age=0;

    @Override
    public String toString() {
        return getUserName();
    }
}
