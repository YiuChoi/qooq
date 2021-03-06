package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.ArrayList;

public final class ReqDelFace
  extends JceStruct
{
  static ReqHead cache_stHeader;
  static ArrayList cache_vFaceInfo;
  public ReqHead stHeader;
  public int uFaceTimeStamp;
  public ArrayList vFaceInfo;
  
  public ReqDelFace()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public ReqDelFace(ReqHead paramReqHead, int paramInt, ArrayList paramArrayList)
  {
    this.stHeader = paramReqHead;
    this.uFaceTimeStamp = paramInt;
    this.vFaceInfo = paramArrayList;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    if (cache_stHeader == null) {
      cache_stHeader = new ReqHead();
    }
    this.stHeader = ((ReqHead)paramJceInputStream.read(cache_stHeader, 0, true));
    this.uFaceTimeStamp = paramJceInputStream.read(this.uFaceTimeStamp, 1, true);
    if (cache_vFaceInfo == null)
    {
      cache_vFaceInfo = new ArrayList();
      FaceInfo localFaceInfo = new FaceInfo();
      cache_vFaceInfo.add(localFaceInfo);
    }
    this.vFaceInfo = ((ArrayList)paramJceInputStream.read(cache_vFaceInfo, 2, true));
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.stHeader, 0);
    paramJceOutputStream.write(this.uFaceTimeStamp, 1);
    paramJceOutputStream.write(this.vFaceInfo, 2);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\QQService\ReqDelFace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */