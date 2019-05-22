package com.github.jsjchai.codereview.excption;

import com.sun.org.apache.bcel.internal.classfile.Code;

/**
 * @author jsjchai.
 */
public class LoginByErrorCode {

    /**
     * 模拟用户登录
     *
     * @param name      用户名
     * @param passwd    密码
     * @param verifCode 验证码
     */
    public int checkLogin(String name, String passwd, String verifCode) {

        if (!checkVerifyCode(verifCode)) {
            return -3;
        }

        //用户不存在
        if (!checkUserExists(name)) {
            return -1;
        }

        if (!checkPasswd(passwd)) {
            return -2;
        }


        return 0;

    }

    /**
     *  调用完checkLogin，需要判断errorCode
     * @param name
     * @param passwd
     * @param verifCode
     * @return
     */
    public boolean login(String name, String passwd, String verifCode) {
        int code = checkLogin(name, passwd, verifCode);
        switch (code) {
            case -3:
                System.out.println("验证码错误");
                break;
            case -2:
                System.out.println("密码错误");
                break;
            case -1:
                System.out.println("用户不存在");
                break;

            default:
                System.out.println("未知errcode");

        }
        return false;
    }


    /**
     * 校验验证码
     *
     * @param verifCode
     * @return
     */
    private boolean checkVerifyCode(String verifCode) {

        return false;
    }

    /**
     * 检查密码
     *
     * @param passwd
     * @return
     */
    private boolean checkPasswd(String passwd) {

        return false;
    }

    /**
     * 检查用户是否存在
     *
     * @param name
     * @return
     */
    private boolean checkUserExists(String name) {
        return false;
    }

}
