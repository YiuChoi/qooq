package tencent.im.oidb.cmd0x686;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class Oidb_0x686$CharmEvent
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 32, 40, 48, 58, 64 }, new String[] { "uint32_pop_flag", "uint32_old_charm", "uint32_old_charm_level", "uint32_new_charm", "uint32_new_charm_level", "uint32_next_level_threshold", "str_tips_content", "uint32_cur_level_threshold" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0) }, CharmEvent.class);
  public final PBStringField str_tips_content = PBField.initString("");
  public final PBUInt32Field uint32_cur_level_threshold = PBField.initUInt32(0);
  public final PBUInt32Field uint32_new_charm = PBField.initUInt32(0);
  public final PBUInt32Field uint32_new_charm_level = PBField.initUInt32(0);
  public final PBUInt32Field uint32_next_level_threshold = PBField.initUInt32(0);
  public final PBUInt32Field uint32_old_charm = PBField.initUInt32(0);
  public final PBUInt32Field uint32_old_charm_level = PBField.initUInt32(0);
  public final PBUInt32Field uint32_pop_flag = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x686\Oidb_0x686$CharmEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */