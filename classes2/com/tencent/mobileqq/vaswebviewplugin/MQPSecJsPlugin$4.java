package com.tencent.mobileqq.vaswebviewplugin;

import android.app.Activity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.webview.swift.WebUiBaseInterface;
import com.tencent.mobileqq.webview.swift.WebViewPlugin.PluginRuntime;
import com.tencent.mobileqq.webviewplugin.WebUiUtils.WebTitleBarInterface;
import com.tencent.mobileqq.widget.QQToast;

class MQPSecJsPlugin$4
  implements Runnable
{
  MQPSecJsPlugin$4(MQPSecJsPlugin paramMQPSecJsPlugin)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    WebUiBaseInterface localWebUiBaseInterface = this.this$0.mRuntime.a(this.this$0.mRuntime.a());
    if ((localWebUiBaseInterface != null) && ((localWebUiBaseInterface instanceof WebUiUtils.WebTitleBarInterface))) {
      QQToast.a(this.this$0.activity, this.this$0.activity.getString(2131367256), 0).b(((WebUiUtils.WebTitleBarInterface)localWebUiBaseInterface).getTitleBarHeight());
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\mobileqq\vaswebviewplugin\MQPSecJsPlugin$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */