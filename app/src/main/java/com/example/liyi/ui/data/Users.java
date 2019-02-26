package com.example.liyi.ui.data;

import com.example.liyi.ui.R;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private String name;
    private int imageId;
    private String desc;
    private int cnt;


    //构造函数
    public Users(String name, int imageId, String desc,int cnt) {
        this.name = name;
        this.imageId = imageId;
        this.desc = desc;
        this.cnt=cnt;
    }

    // 返回一个Users的列表
    public static List<Users> getAllTeachers() {
        List<Users> users = new ArrayList<Users>();
        users.add(new Users("hust", R.drawable.aa, "hust",1));
        users.add(new Users("杨毅远", R.drawable.bb, "负责STM32开发",1));
        users.add(new Users("李义", R.drawable.cc, "负责android开发",1));
        return users;
    }

    // 以下都是访问内部属性的getter和setter

    //获取名字
    public String getName() {
        return name;
    }
    //修改名字
    public void setName(String name) {
        this.name = name;
    }
    //获取ID
    public int getImageId() {
        return imageId;
    }
    //修改图片ID
    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
    //获取详细信息
    public String getDesc() {
        return desc;
    }
    //获取进入次数
    public  int getCnt(){return cnt;}

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public  void setCnt(int cnt){ this.cnt=cnt; }

}
