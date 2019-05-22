package com.github.jsjchai.codereview.excption;

/**
 * @author jsjchai.
 */
public class LoginByException {

    /**
     * 模拟用户登录
     *
     * @param name      用户名
     * @param passwd    密码
     * @param verifCode 验证码
     */
    public void checkLogin(String name, String passwd, String verifCode) {
        checkVerifyCode(verifCode);

        //用户不存在
        checkUserExists(name);

        checkPasswd(passwd);


    }

    /**
     * 调用完checkLogin，如果不满足条件，直接抛出异常，无需过多处理
     *
     * @param name
     * @param passwd
     * @param verifCode
     * @return
     */
    public boolean login(String name, String passwd, String verifCode) {
        try{
            checkLogin(name, passwd, verifCode);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            return false;
        }


        return false;
    }


    /**
     * 校验验证码
     *
     * @param verifCode
     * @return
     */
    private void checkVerifyCode(String verifCode) {

        throw new RuntimeException("验证码有误");
    }

    /**
     * 检查密码
     *
     * @param passwd
     * @return
     */
    private void checkPasswd(String passwd) {

        throw new RuntimeException("密码错误");
    }

    /**
     * 检查用户是否存在
     *
     * @param name
     * @return
     */
    private void checkUserExists(String name) {
        throw new RuntimeException("用户不存在");
    }

}
