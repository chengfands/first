package com.cf.design.adapter.adapter;

/**
 * @author chengfan
 * @date 2019-12-20 10:09:40
 */
public class Test {

    public static void main(String[] args) {

        for(int i = 0 ; i < 10 ; i++){
            IUserInfo users = new UserInfoImpl();
            System.out.println("本公司人员姓名：" + users.getUserName());
        }
        System.out.println("----------------------");
        for(int i = 0 ; i < 10 ; i++){
            IUserInfo user = new AdapterUser();
            System.out.println("劳动公司人员姓名1：" + user.getUserName());
//            System.out.println("本公司人员部门1：" + user.getDepartment());
            IUserInfo user2 = new AdapterUser22(new OutUserImpl());
            System.out.println("劳动公司人员姓名2：" + user2.getUserName());
        }

    }
}
