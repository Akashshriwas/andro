package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;

public class EdgeEffectCompat
{
  private static final EdgeEffectImpl IMPL;
  private Object mEdgeEffect;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 14) {}
    for (IMPL = new EdgeEffectIcsImpl();; IMPL = new BaseEdgeEffectImpl()) {
      return;
    }
  }
  
  public EdgeEffectCompat(Context paramContext)
  {
    mEdgeEffect = IMPL.newEdgeEffect(paramContext);
  }
  
  public boolean draw(Canvas paramCanvas)
  {
    return IMPL.draw(mEdgeEffect, paramCanvas);
  }
  
  public void finish()
  {
    IMPL.finish(mEdgeEffect);
  }
  
  public boolean isFinished()
  {
    return IMPL.isFinished(mEdgeEffect);
  }
  
  public boolean onAbsorb(int paramInt)
  {
    return IMPL.onAbsorb(mEdgeEffect, paramInt);
  }
  
  public boolean onPull(float paramFloat)
  {
    return IMPL.onPull(mEdgeEffect, paramFloat);
  }
  
  public boolean onRelease()
  {
    return IMPL.onRelease(mEdgeEffect);
  }
  
  public void setSize(int paramInt1, int paramInt2)
  {
    IMPL.setSize(mEdgeEffect, paramInt1, paramInt2);
  }
  
  static class BaseEdgeEffectImpl
    implements EdgeEffectCompat.EdgeEffectImpl
  {
    public boolean draw(Object paramObject, Canvas paramCanvas)
    {
      return false;
    }
    
    public void finish(Object paramObject) {}
    
    public boolean isFinished(Object paramObject)
    {
      return true;
    }
    
    public Object newEdgeEffect(Context paramContext)
    {
      return null;
    }
    
    public boolean onAbsorb(Object paramObject, int paramInt)
    {
      return false;
    }
    
    public boolean onPull(Object paramObject, float paramFloat)
    {
      return false;
    }
    
    public boolean onRelease(Object paramObject)
    {
      return false;
    }
    
    public void setSize(Object paramObject, int paramInt1, int paramInt2) {}
  }
  
  static class EdgeEffectIcsImpl
    implements EdgeEffectCompat.EdgeEffectImpl
  {
    public boolean draw(Object paramObject, Canvas paramCanvas)
    {
      return EdgeEffectCompatIcs.draw(paramObject, paramCanvas);
    }
    
    public void finish(Object paramObject)
    {
      EdgeEffectCompatIcs.finish(paramObject);
    }
    
    public boolean isFinished(Object paramObject)
    {
      return EdgeEffectCompatIcs.isFinished(paramObject);
    }
    
    public Object newEdgeEffect(Context paramContext)
    {
      return EdgeEffectCompatIcs.newEdgeEffect(paramContext);
    }
    
    public boolean onAbsorb(Object paramObject, int paramInt)
    {
      return EdgeEffectCompatIcs.onAbsorb(paramObject, paramInt);
    }
    
    public boolean onPull(Object paramObject, float paramFloat)
    {
      return EdgeEffectCompatIcs.onPull(paramObject, paramFloat);
    }
    
    public boolean onRelease(Object paramObject)
    {
      return EdgeEffectCompatIcs.onRelease(paramObject);
    }
    
    public void setSize(Object paramObject, int paramInt1, int paramInt2)
    {
      EdgeEffectCompatIcs.setSize(paramObject, paramInt1, paramInt2);
    }
  }
  
  static abstract interface EdgeEffectImpl
  {
    public abstract boolean draw(Object paramObject, Canvas paramCanvas);
    
    public abstract void finish(Object paramObject);
    
    public abstract boolean isFinished(Object paramObject);
    
    public abstract Object newEdgeEffect(Context paramContext);
    
    public abstract boolean onAbsorb(Object paramObject, int paramInt);
    
    public abstract boolean onPull(Object paramObject, float paramFloat);
    
    public abstract boolean onRelease(Object paramObject);
    
    public abstract void setSize(Object paramObject, int paramInt1, int paramInt2);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.widget.EdgeEffectCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */