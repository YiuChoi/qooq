package com.tencent.filter.ttpic;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.Param.TextureResParam;

public class QingLiangFilter
  extends BaseFilter
{
  private BaseFilter nextFilter;
  
  public QingLiangFilter()
  {
    super(GLSLRender.FILTER_SHADER_NONE);
  }
  
  public void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    this.nextFilter = new GPUImageLookupFilter();
    this.nextFilter.addParam(new Param.TextureResParam("inputImageTexture2", "sh/qingliang_lf.png", 33986));
    setNextFilter(this.nextFilter, null);
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\filter\ttpic\QingLiangFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */