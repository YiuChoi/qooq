package com.tencent.avatarinfo;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class MultiHeadUrl$RspHeadInfo
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 32, 42, 48, 58 }, new String[] { "usrType", "faceType", "timestamp", "faceFlag", "url", "sysid", "headVerify" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), "" }, RspHeadInfo.class);
  public final PBUInt32Field faceFlag = PBField.initUInt32(0);
  public final PBUInt32Field faceType = PBField.initUInt32(0);
  public final PBStringField headVerify = PBField.initString("");
  public final PBUInt32Field sysid = PBField.initUInt32(0);
  public final PBUInt32Field timestamp = PBField.initUInt32(0);
  public final PBStringField url = PBField.initString("");
  public final PBUInt32Field usrType = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\avatarinfo\MultiHeadUrl$RspHeadInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */