package com.example.member;

import com.example.arouter.ARouter;
import com.example.arouter.IRouter;

/**
 * @author wang wen kai
 * @date 2019-08-02 on 00:35
 * @description
 */
public class ActivityUtil implements IRouter {

    @Override
    public void putActivity() {
        ARouter.getInstance().putActivity("member", MemberActivity.class);
    }
}
