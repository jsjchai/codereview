package com.github.jsjchai.codereview.param;

import com.google.common.base.Preconditions;

/**
 * @author jsjchai.
 */
public class ParamCheck {


    public static void checkNull(String param){
        Preconditions.checkNotNull(param);
    }

    public static void checkAge(int num) {
        Preconditions.checkArgument(num > 11, "param illegal age=%s", num);
    }

    public static void main(String[] args) {

        String str = "";
        checkNull(str);

        checkAge(-1);
    }
}
