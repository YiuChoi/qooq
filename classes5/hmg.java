import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.biz.pubaccount.AccountDetailActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class hmg
  implements View.OnClickListener
{
  public hmg(AccountDetailActivity paramAccountDetailActivity, Dialog paramDialog)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(View paramView)
  {
    if ((this.jdField_a_of_type_AndroidAppDialog != null) && (this.jdField_a_of_type_AndroidAppDialog.isShowing()) && (this.jdField_a_of_type_AndroidAppDialog.getWindow() != null)) {
      this.jdField_a_of_type_AndroidAppDialog.dismiss();
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\hmg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */