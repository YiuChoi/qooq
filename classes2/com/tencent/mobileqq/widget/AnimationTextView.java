package com.tencent.mobileqq.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView.BufferType;
import com.tencent.mobileqq.activity.aio.item.TextItemBuilder;
import com.tencent.mobileqq.bubble.BubbleInfo;
import com.tencent.mobileqq.bubble.VipBubbleDrawable;
import com.tencent.mobileqq.data.ChatMessage;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.text.QQText;
import com.tencent.mobileqq.text.QQText.EmotcationSpan;
import com.tencent.mobileqq.text.QQText.SmallEmojiSpan;
import com.tencent.qphone.base.util.QLog;
import wkn;

public class AnimationTextView
  extends PatchedTextView
{
  private static final String jdField_a_of_type_JavaLangString = AnimationTextView.class.getSimpleName();
  public float a;
  private int jdField_a_of_type_Int;
  private MotionEvent jdField_a_of_type_AndroidViewMotionEvent;
  public AnimationTextView.OnDoubleClick a;
  public AnimationTextView.OnSingleClick a;
  public boolean a;
  private Drawable[] jdField_a_of_type_ArrayOfAndroidGraphicsDrawableDrawable;
  public float b;
  private MotionEvent jdField_b_of_type_AndroidViewMotionEvent;
  Runnable jdField_b_of_type_JavaLangRunnable = new wkn(this);
  public boolean b;
  private boolean c;
  private boolean d;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public AnimationTextView(Context paramContext)
  {
    super(paramContext);
    this.jdField_a_of_type_Boolean = true;
  }
  
  public AnimationTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.jdField_a_of_type_Boolean = true;
  }
  
  public AnimationTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.jdField_a_of_type_Boolean = true;
  }
  
  private void a()
  {
    int i = 0;
    float f1 = this.jdField_a_of_type_Float;
    float f3 = TextItemBuilder.l;
    float f2 = this.jdField_b_of_type_Float - TextItemBuilder.j;
    BubbleInfo localBubbleInfo = (BubbleInfo)getTag(2131296655);
    Object localObject = (ChatMessage)getTag(2131296656);
    if (localObject != null) {}
    for (boolean bool = ((ChatMessage)localObject).isSend();; bool = false)
    {
      if (bool) {}
      for (f1 = this.jdField_a_of_type_Float - TextItemBuilder.m;; f1 -= f3)
      {
        localObject = getText();
        if ((localObject instanceof QQText))
        {
          localObject = (QQText)localObject;
          localObject = (QQText.EmotcationSpan[])((QQText)localObject).getSpans(0, ((QQText)localObject).length(), QQText.EmotcationSpan.class);
          int k;
          for (int j = 0; i < localObject.length; j = k)
          {
            QQText.SmallEmojiSpan localSmallEmojiSpan = localObject[i];
            k = j;
            if ((localSmallEmojiSpan instanceof QQText.SmallEmojiSpan))
            {
              localSmallEmojiSpan = (QQText.SmallEmojiSpan)localSmallEmojiSpan;
              f3 = localSmallEmojiSpan.jdField_a_of_type_Float;
              float f4 = localSmallEmojiSpan.jdField_b_of_type_Float;
              float f5 = localSmallEmojiSpan.c;
              float f6 = localSmallEmojiSpan.d;
              k = j;
              if (f1 >= f3)
              {
                k = j;
                if (f1 <= f5)
                {
                  k = j;
                  if (f2 >= f4)
                  {
                    k = j;
                    if (f2 <= f6)
                    {
                      k = j;
                      if (j == 0) {
                        k = 1;
                      }
                    }
                  }
                }
              }
            }
            i += 1;
          }
          if (j != 0)
          {
            localObject = getBackground();
            if ((localObject == null) || (!(localObject instanceof VipBubbleDrawable))) {
              break label277;
            }
            ((VipBubbleDrawable)localObject).jdField_a_of_type_Boolean = true;
          }
        }
        label277:
        while ((localObject == null) || (localBubbleInfo == null)) {
          return;
        }
        localObject = getResources();
        if (bool) {}
        for (i = 2130843067;; i = 2130842999)
        {
          localBubbleInfo.a(this, ((Resources)localObject).getDrawable(i));
          return;
        }
      }
    }
  }
  
  private void a(Object paramObject)
  {
    Object localObject = getText();
    if ((localObject instanceof Spannable))
    {
      localObject = (Spannable)localObject;
      int j = ((Spannable)localObject).getSpanStart(paramObject);
      int k = ((Spannable)localObject).getSpanEnd(paramObject);
      SpanWatcher[] arrayOfSpanWatcher = (SpanWatcher[])((Spannable)localObject).getSpans(j, k, SpanWatcher.class);
      if ((arrayOfSpanWatcher != null) && (arrayOfSpanWatcher.length > 0))
      {
        int m = arrayOfSpanWatcher.length;
        int i = 0;
        for (;;)
        {
          if (i < m)
          {
            SpanWatcher localSpanWatcher = arrayOfSpanWatcher[i];
            try
            {
              localSpanWatcher.onSpanChanged((Spannable)localObject, paramObject, j, k, j, k);
              i += 1;
            }
            catch (Exception localException)
            {
              for (;;)
              {
                if (QLog.isColorLevel()) {
                  QLog.e(jdField_a_of_type_JavaLangString, 2, "Exception: " + localException.getMessage());
                }
              }
            }
          }
        }
      }
    }
  }
  
  public static boolean a(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, MotionEvent paramMotionEvent3)
  {
    if (paramMotionEvent3.getEventTime() - paramMotionEvent2.getEventTime() > 200L) {}
    int i;
    int j;
    do
    {
      return false;
      i = (int)paramMotionEvent2.getX() - (int)paramMotionEvent3.getX();
      j = (int)paramMotionEvent2.getY() - (int)paramMotionEvent3.getY();
    } while (i * i + j * j >= 10000);
    return true;
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    super.invalidateDrawable(paramDrawable);
    Object localObject1 = getText();
    if ((localObject1 instanceof Spannable))
    {
      localObject1 = (Spannable)localObject1;
      localObject1 = (QQText.EmotcationSpan[])((Spannable)localObject1).getSpans(0, ((Spannable)localObject1).length(), QQText.EmotcationSpan.class);
      if ((localObject1 != null) && (localObject1.length > 0))
      {
        this.c = true;
        int j = localObject1.length;
        int i = 0;
        while (i < j)
        {
          Object localObject2 = localObject1[i];
          if (((QQText.EmotcationSpan)localObject2).a() == paramDrawable) {
            a(localObject2);
          }
          i += 1;
        }
        this.c = false;
      }
    }
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    if (this.d)
    {
      int i = getCurrentTextColor();
      getPaint().setStyle(Paint.Style.STROKE);
      getPaint().setStrokeWidth(3.0F);
      setTextColor(this.jdField_a_of_type_Int);
      super.onDraw(paramCanvas);
      getPaint().setStyle(Paint.Style.FILL);
      setTextColor(i);
      super.onDraw(paramCanvas);
      if (QLog.isColorLevel()) {
        QLog.d(jdField_a_of_type_JavaLangString, 2, "onDraw has stroke");
      }
      return;
    }
    super.onDraw(paramCanvas);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqWidgetAnimationTextView$OnDoubleClick != null) {
      if ((this.jdField_b_of_type_AndroidViewMotionEvent != null) && (paramMotionEvent.getAction() == 0))
      {
        this.jdField_a_of_type_Float = paramMotionEvent.getX();
        this.jdField_b_of_type_Float = paramMotionEvent.getY();
        a();
        this.jdField_a_of_type_AndroidViewMotionEvent = MotionEvent.obtain(paramMotionEvent);
        if ((this.jdField_b_of_type_AndroidViewMotionEvent != null) && (this.jdField_a_of_type_AndroidViewMotionEvent != null) && (a(this.jdField_a_of_type_AndroidViewMotionEvent, this.jdField_b_of_type_AndroidViewMotionEvent, paramMotionEvent)))
        {
          this.jdField_a_of_type_Boolean = false;
          this.jdField_a_of_type_AndroidViewMotionEvent = null;
          this.jdField_b_of_type_AndroidViewMotionEvent = null;
          if (this.jdField_a_of_type_ComTencentMobileqqWidgetAnimationTextView$OnDoubleClick != null)
          {
            this.jdField_a_of_type_ComTencentMobileqqWidgetAnimationTextView$OnDoubleClick.a(this);
            this.jdField_b_of_type_Boolean = true;
            if (QLog.isColorLevel()) {
              QLog.d("AnimationTextView", 2, "DoubleClick invoked");
            }
            return true;
          }
        }
      }
      else
      {
        if ((this.jdField_b_of_type_AndroidViewMotionEvent != null) || (paramMotionEvent.getAction() != 0)) {
          break label194;
        }
        this.jdField_a_of_type_Boolean = true;
        this.jdField_a_of_type_Float = paramMotionEvent.getX();
        this.jdField_b_of_type_Float = paramMotionEvent.getY();
        a();
        if (QLog.isColorLevel()) {
          QLog.d("AnimationTextView", 2, "reserve to initial status");
        }
      }
    }
    for (;;)
    {
      return super.onTouchEvent(paramMotionEvent);
      label194:
      if (paramMotionEvent.getAction() == 1)
      {
        if (QLog.isColorLevel()) {
          QLog.d("AnimationTextView", 2, "action up");
        }
        if (getLayout() == null) {
          return super.onTouchEvent(paramMotionEvent);
        }
        this.jdField_b_of_type_AndroidViewMotionEvent = MotionEvent.obtain(paramMotionEvent);
        if (this.jdField_b_of_type_Boolean)
        {
          this.jdField_b_of_type_Boolean = false;
          this.jdField_b_of_type_AndroidViewMotionEvent = null;
        }
        postDelayed(this.jdField_b_of_type_JavaLangRunnable, 200L);
      }
    }
  }
  
  public void requestLayout()
  {
    if (!this.c) {
      super.requestLayout();
    }
  }
  
  public void setStrokeColor(boolean paramBoolean, int paramInt)
  {
    this.d = paramBoolean;
    this.jdField_a_of_type_Int = paramInt;
  }
  
  public void setText(CharSequence paramCharSequence, TextView.BufferType paramBufferType)
  {
    int i = 0;
    CharSequence localCharSequence = getText();
    super.setText(paramCharSequence, paramBufferType);
    if ((localCharSequence != paramCharSequence) && ((getText() instanceof Spannable)))
    {
      paramCharSequence = (Spannable)getText();
      paramCharSequence = (QQText.EmotcationSpan[])paramCharSequence.getSpans(0, paramCharSequence.length(), QQText.EmotcationSpan.class);
      paramBufferType = new Drawable[paramCharSequence.length];
      while (i < paramCharSequence.length)
      {
        paramBufferType[i] = paramCharSequence[i].a();
        if (paramBufferType[i] != null) {
          paramBufferType[i].setCallback(this);
        }
        i += 1;
      }
      this.jdField_a_of_type_ArrayOfAndroidGraphicsDrawableDrawable = paramBufferType;
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return true;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\mobileqq\widget\AnimationTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */