package app.vd.screenshots.entry;

import android.content.Context;

import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;

import app.vd.framework.extend.annotation.ModuleEntry;
import app.vd.screenshots.vdScreenshotsModule;

@ModuleEntry
public class screenshotsEntry {

    /**
     * APP启动会运行此函数方法
     * @param content Application
     */
    public void init(Context content) {

        try {
            WXSDKEngine.registerModule("vdScreenshots", vdScreenshotsModule.class);
        } catch (WXException e) {
            e.printStackTrace();
        }
    }

}
