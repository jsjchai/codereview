package com.github.jsjchai.codereview.log;

import com.github.jsjchai.codereview.model.Emp;
import lombok.extern.slf4j.Slf4j;

/**
 * @author jsjchai.
 */
@Slf4j
public class LogBackDemo {

    public static void say(String message) {
        log.info("say message:" + message);
    }

    public static void reviewSay(String message) {
        log.info("say message:{}", message);
    }

    /**
     *  重写了Emp的ToString方法
     * @param emp 员工对象
     */
    public static void printObject(Emp emp){
        log.info("print obj:" + emp);

        log.info("print obj:{}", emp);
    }

    public static void main(String[] args) {
        say("hello");
        reviewSay("hello");

        Emp emp = new Emp();
        emp.setId(10000L);
        emp.setName("name");

        printObject(emp);
    }
}
