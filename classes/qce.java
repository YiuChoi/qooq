import com.tencent.mobileqq.app.PhoneContactManagerImp;
import com.tencent.mobileqq.data.PhoneContact;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.Comparator;

public class qce
  implements Comparator
{
  public qce(PhoneContactManagerImp paramPhoneContactManagerImp)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public int a(PhoneContact paramPhoneContact1, PhoneContact paramPhoneContact2)
  {
    Object localObject2 = paramPhoneContact1.pinyinFirst;
    String str = paramPhoneContact2.pinyinFirst;
    Object localObject1 = localObject2;
    if (((String)localObject2).endsWith("#")) {
      localObject1 = "Za";
    }
    localObject2 = str;
    if (str.endsWith("#")) {
      localObject2 = "Za";
    }
    int j = ((String)localObject1).compareTo((String)localObject2);
    int i = j;
    if (j == 0) {
      i = paramPhoneContact1.pinyinAll.compareTo(paramPhoneContact2.pinyinAll);
    }
    j = i;
    if (i == 0) {
      j = paramPhoneContact1.contactID - paramPhoneContact2.contactID;
    }
    return j;
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\qce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */