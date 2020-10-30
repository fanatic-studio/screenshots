package app.eco.screenshots.entry;

import android.content.Context;

import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;

import app.eco.framework.extend.annotation.ModuleEntry;
import app.eco.screenshots.ecoScreenshotsModule;

@ModuleEntry
public class screenshotsEntry {

    /**
     * APP启动会运行此函数方法
     * @param content Application
     */
    public void init(Context content) {

        try {
            WXSDKEngine.registerModule("ecoScreenshots", ecoScreenshotsModule.class);
        } catch (WXException e) {
            e.printStackTrace();
        }
    }

}
