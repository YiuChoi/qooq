package com.tencent.mobileqq.data;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import org.json.JSONException;
import org.json.JSONObject;
import rcl;

public class ShareHotChatGrayTips
  extends ChatMessage
{
  private static final String HOT_NAME_CODE = "hotnamecode";
  private static final String JUMP_URL = "jump_url";
  private static final String MSG_CONTENT = "msg_content";
  private static final String MSG_CONTENT_HIGHLIGHT = "msg_content_highlight";
  public static final String SHARE_GRAY_TIP_CONTENT = "你的热聊房间会被推荐给附近的人和好友，感兴趣的会加入进来哦。你也可以邀请好友加入。分享热聊房间";
  private static final String TROOP_NAME = "troop_name";
  private static final String TROOP_UIN = "troop_uin";
  public String mHotnamecode;
  public String mJumpUrl;
  public String mMsgContent;
  public String mMsgContentHighlight;
  public String mTroopName;
  public String mTroopUin;
  
  public ShareHotChatGrayTips()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public static String makeShareGrayTip(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("msg_content", paramString1);
      localJSONObject.put("msg_content_highlight", paramString2);
      localJSONObject.put("troop_uin", paramString3);
      localJSONObject.put("troop_name", paramString4);
      localJSONObject.put("jump_url", paramString5);
      localJSONObject.put("hotnamecode", paramString6);
      paramString1 = localJSONObject.toString();
      return paramString1;
    }
    catch (JSONException paramString1)
    {
      paramString1.printStackTrace();
    }
    return null;
  }
  
  protected void doParse()
  {
    String str = this.msg;
    for (;;)
    {
      try
      {
        JSONObject localJSONObject = new JSONObject(str);
        if (localJSONObject.has("msg_content"))
        {
          this.mMsgContent = localJSONObject.getString("msg_content");
          if (localJSONObject.has("msg_content_highlight"))
          {
            this.mMsgContentHighlight = localJSONObject.getString("msg_content_highlight");
            if (!localJSONObject.has("troop_uin")) {
              break label176;
            }
            this.mTroopUin = localJSONObject.getString("troop_uin");
            if (!localJSONObject.has("troop_name")) {
              break label184;
            }
            this.mTroopName = localJSONObject.getString("troop_name");
            if (!localJSONObject.has("jump_url")) {
              break label192;
            }
            this.mJumpUrl = localJSONObject.getString("jump_url");
            if (!localJSONObject.has("hotnamecode")) {
              break;
            }
            this.mHotnamecode = localJSONObject.getString("hotnamecode");
          }
        }
        else
        {
          this.mMsgContent = null;
          continue;
        }
        this.mMsgContentHighlight = null;
      }
      catch (JSONException localJSONException)
      {
        localJSONException.printStackTrace();
        this.mMsgContent = str;
        this.mMsgContentHighlight = null;
        this.mTroopUin = null;
        this.mTroopName = null;
        this.mJumpUrl = null;
        return;
      }
      continue;
      label176:
      this.mTroopUin = null;
      continue;
      label184:
      this.mTroopName = null;
      continue;
      label192:
      this.mJumpUrl = null;
    }
    this.mHotnamecode = null;
  }
  
  public SpannableString getHighlightMsgText(QQAppInterface paramQQAppInterface, Context paramContext)
  {
    if ((!TextUtils.isEmpty(this.mMsgContent)) && (!TextUtils.isEmpty(this.mMsgContentHighlight))) {}
    for (int i = this.mMsgContent.indexOf(this.mMsgContentHighlight);; i = -1)
    {
      int j = 0;
      if (i >= 0) {
        j = this.mMsgContentHighlight.length() + i;
      }
      SpannableString localSpannableString = new SpannableString(this.mMsgContent);
      if ((i >= 0) && (j > i)) {
        localSpannableString.setSpan(new rcl(paramQQAppInterface, paramContext, this, this.mHotnamecode), i, j, 33);
      }
      return localSpannableString;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\mobileqq\data\ShareHotChatGrayTips.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */