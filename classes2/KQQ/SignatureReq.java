package KQQ;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public final class SignatureReq
  extends JceStruct
{
  public long uin;
  
  public SignatureReq()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public SignatureReq(long paramLong)
  {
    this.uin = paramLong;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.uin = paramJceInputStream.read(this.uin, 0, true);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.uin, 0);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\KQQ\SignatureReq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */