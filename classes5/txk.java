import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.activity.ProfileActivity.AllInOne;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.profile.DataTag;
import com.tencent.mobileqq.profile.ProfileCardInfo;
import com.tencent.mobileqq.profile.view.QzonePhotoView;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.qphone.base.util.QLog;
import java.util.List;

public class txk
  implements View.OnClickListener
{
  private static final long jdField_a_of_type_Long = 1000L;
  private long b;
  
  public txk(QzonePhotoView paramQzonePhotoView)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(View paramView)
  {
    long l = System.currentTimeMillis();
    if (Math.abs(l - this.b) < 1000L) {}
    Object localObject;
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            this.b = l;
          } while ((paramView == null) || (!(paramView.getTag() instanceof DataTag)));
          localObject = (DataTag)paramView.getTag();
        } while (localObject == null);
        i = ((DataTag)localObject).ah;
        paramView = QzonePhotoView.a(this.a).a.a;
        switch (i)
        {
        default: 
          return;
        }
        ReportController.b(this.a.a, "CliOper", "", "", "card_mall", "0X80066C4", 0, 0, "2", "", "", "");
        if (QLog.isColorLevel()) {
          QLog.i("ProfileCard.QzonePhotoView", 2, "View.OnClickListener click type is photo wall view");
        }
        if (QzonePhotoView.a(this.a))
        {
          this.a.a(paramView);
          return;
        }
      } while ((QzonePhotoView.a(this.a) == null) || (QzonePhotoView.a(this.a).size() == 0));
      localObject = ((DataTag)localObject).a;
      if (localObject == null)
      {
        this.a.a(paramView);
        return;
      }
    } while (!(localObject instanceof Integer));
    int i = ((Integer)localObject).intValue();
    if (QLog.isColorLevel()) {
      QLog.i("ProfileCard.QzonePhotoView", 2, "mPhotoList size = " + QzonePhotoView.a(this.a).size() + ", pos = " + i);
    }
    this.a.a(i);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\txk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */