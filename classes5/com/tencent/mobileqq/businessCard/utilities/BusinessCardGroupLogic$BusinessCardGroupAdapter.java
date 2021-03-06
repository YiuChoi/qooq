package com.tencent.mobileqq.businessCard.utilities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.mobileqq.businessCard.activity.BusinessCardListActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

class BusinessCardGroupLogic$BusinessCardGroupAdapter
  extends BaseAdapter
{
  LayoutInflater jdField_a_of_type_AndroidViewLayoutInflater;
  String[] jdField_a_of_type_ArrayOfJavaLangString;
  
  public BusinessCardGroupLogic$BusinessCardGroupAdapter(BusinessCardGroupLogic paramBusinessCardGroupLogic, Context paramContext)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_ArrayOfJavaLangString = new String[] { "按时间排序", "按姓名排序" };
    this.jdField_a_of_type_AndroidViewLayoutInflater = LayoutInflater.from(paramContext);
  }
  
  public int getCount()
  {
    return this.jdField_a_of_type_ArrayOfJavaLangString.length;
  }
  
  public Object getItem(int paramInt)
  {
    return this.jdField_a_of_type_ArrayOfJavaLangString[paramInt];
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView;
    if (paramView == null)
    {
      localView = this.jdField_a_of_type_AndroidViewLayoutInflater.inflate(2130904093, paramViewGroup, false);
      paramView = new BusinessCardGroupLogic.BusinessCardGroupAdapter.ViewHolder(this);
      paramView.jdField_a_of_type_AndroidWidgetTextView = ((TextView)localView.findViewById(2131297704));
      paramView.jdField_a_of_type_AndroidViewView = localView.findViewById(2131300852);
      localView.setTag(paramView);
      paramViewGroup = paramView;
    }
    for (;;)
    {
      paramViewGroup.jdField_a_of_type_AndroidWidgetTextView.setText(this.jdField_a_of_type_ArrayOfJavaLangString[paramInt]);
      if (this.jdField_a_of_type_ComTencentMobileqqBusinessCardUtilitiesBusinessCardGroupLogic.a.f != paramInt) {
        break;
      }
      paramViewGroup.jdField_a_of_type_AndroidViewView.setVisibility(0);
      return localView;
      paramViewGroup = (BusinessCardGroupLogic.BusinessCardGroupAdapter.ViewHolder)paramView.getTag();
      localView = paramView;
    }
    paramViewGroup.jdField_a_of_type_AndroidViewView.setVisibility(8);
    return localView;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\businessCard\utilities\BusinessCardGroupLogic$BusinessCardGroupAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */