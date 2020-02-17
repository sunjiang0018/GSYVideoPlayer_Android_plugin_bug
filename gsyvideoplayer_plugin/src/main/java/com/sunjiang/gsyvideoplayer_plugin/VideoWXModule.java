package com.sunjiang.gsyvideoplayer_plugin;


import android.app.Activity;
import android.content.Intent;

import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;

public class VideoWXModule extends WXSDKEngine.DestroyableModule {

    @JSMethod(uiThread = true)
    public void open(JSCallback jsCallback) {
        Activity activity = (Activity) mWXSDKInstance.getContext();
        Intent intent = new Intent(activity, MainActivity.class);
        activity.startActivity(intent);
        jsCallback.invoke("");
    }

    @Override
    public void destroy() {

    }
}
