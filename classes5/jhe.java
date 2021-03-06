import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;
import oicq.wlogin_sdk.request.Ticket;
import oicq.wlogin_sdk.request.WtTicketPromise;
import oicq.wlogin_sdk.tools.ErrMsg;

public final class jhe
  implements WtTicketPromise
{
  public jhe(String paramString, long paramLong)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void Done(Ticket paramTicket)
  {
    StringBuilder localStringBuilder;
    if (QLog.isColorLevel())
    {
      localStringBuilder = new StringBuilder().append("pt4_token response received for ").append(this.jdField_a_of_type_JavaLangString).append(", cost=").append(System.currentTimeMillis() - this.jdField_a_of_type_Long);
      if (paramTicket == null) {
        break label64;
      }
    }
    label64:
    for (paramTicket = "";; paramTicket = ". But result was null!")
    {
      QLog.d("KeyInfo", 2, paramTicket);
      return;
    }
  }
  
  public void Failed(ErrMsg paramErrMsg)
  {
    if (QLog.isColorLevel()) {
      QLog.w("KeyInfo", 2, "Get pt4_token failed for " + this.jdField_a_of_type_JavaLangString + " because " + paramErrMsg + ", cost=" + (System.currentTimeMillis() - this.jdField_a_of_type_Long));
    }
  }
  
  public void Timeout(ErrMsg paramErrMsg)
  {
    if (QLog.isColorLevel()) {
      QLog.w("KeyInfo", 2, "Get pt4_token timeout for " + this.jdField_a_of_type_JavaLangString + " because " + paramErrMsg + ", cost=" + (System.currentTimeMillis() - this.jdField_a_of_type_Long));
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\jhe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */