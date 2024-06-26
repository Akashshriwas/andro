package android.support.v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.BaseSavedState;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabContentFactory;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;
import java.util.ArrayList;

public class FragmentTabHost
  extends TabHost
  implements TabHost.OnTabChangeListener
{
  private boolean mAttached;
  private int mContainerId;
  private Context mContext;
  private FragmentManager mFragmentManager;
  private TabInfo mLastTab;
  private TabHost.OnTabChangeListener mOnTabChangeListener;
  private FrameLayout mRealTabContent;
  private final ArrayList<TabInfo> mTabs = new ArrayList();
  
  public FragmentTabHost(Context paramContext)
  {
    super(paramContext, null);
    initFragmentTabHost(paramContext, null);
  }
  
  public FragmentTabHost(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    initFragmentTabHost(paramContext, paramAttributeSet);
  }
  
  private FragmentTransaction doTabChanged(String paramString, FragmentTransaction paramFragmentTransaction)
  {
    Object localObject = null;
    for (int i = 0; i < mTabs.size(); i++)
    {
      TabInfo localTabInfo = (TabInfo)mTabs.get(i);
      if (tag.equals(paramString)) {
        localObject = localTabInfo;
      }
    }
    if (localObject == null) {
      throw new IllegalStateException("No tab known for tag " + paramString);
    }
    paramString = paramFragmentTransaction;
    if (mLastTab != localObject)
    {
      paramString = paramFragmentTransaction;
      if (paramFragmentTransaction == null) {
        paramString = mFragmentManager.beginTransaction();
      }
      if ((mLastTab != null) && (mLastTab.fragment != null)) {
        paramString.detach(mLastTab.fragment);
      }
      if (localObject != null)
      {
        if (fragment != null) {
          break label194;
        }
        TabInfo.access$102((TabInfo)localObject, Fragment.instantiate(mContext, clss.getName(), args));
        paramString.add(mContainerId, fragment, tag);
      }
    }
    for (;;)
    {
      mLastTab = ((TabInfo)localObject);
      return paramString;
      label194:
      paramString.attach(fragment);
    }
  }
  
  private void ensureContent()
  {
    if (mRealTabContent == null)
    {
      mRealTabContent = ((FrameLayout)findViewById(mContainerId));
      if (mRealTabContent == null) {
        throw new IllegalStateException("No tab content FrameLayout found for id " + mContainerId);
      }
    }
  }
  
  private void initFragmentTabHost(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, new int[] { 16842995 }, 0, 0);
    mContainerId = paramAttributeSet.getResourceId(0, 0);
    paramAttributeSet.recycle();
    super.setOnTabChangedListener(this);
    if (findViewById(16908307) == null)
    {
      paramAttributeSet = new LinearLayout(paramContext);
      paramAttributeSet.setOrientation(1);
      addView(paramAttributeSet, new FrameLayout.LayoutParams(-1, -1));
      Object localObject = new TabWidget(paramContext);
      ((TabWidget)localObject).setId(16908307);
      ((TabWidget)localObject).setOrientation(0);
      paramAttributeSet.addView((View)localObject, new LinearLayout.LayoutParams(-1, -2, 0.0F));
      localObject = new FrameLayout(paramContext);
      ((FrameLayout)localObject).setId(16908305);
      paramAttributeSet.addView((View)localObject, new LinearLayout.LayoutParams(0, 0, 0.0F));
      paramContext = new FrameLayout(paramContext);
      mRealTabContent = paramContext;
      mRealTabContent.setId(mContainerId);
      paramAttributeSet.addView(paramContext, new LinearLayout.LayoutParams(-1, 0, 1.0F));
    }
  }
  
  public void addTab(TabHost.TabSpec paramTabSpec, Class<?> paramClass, Bundle paramBundle)
  {
    paramTabSpec.setContent(new DummyTabFactory(mContext));
    String str = paramTabSpec.getTag();
    paramClass = new TabInfo(str, paramClass, paramBundle);
    if (mAttached)
    {
      TabInfo.access$102(paramClass, mFragmentManager.findFragmentByTag(str));
      if ((fragment != null) && (!fragment.isDetached()))
      {
        paramBundle = mFragmentManager.beginTransaction();
        paramBundle.detach(fragment);
        paramBundle.commit();
      }
    }
    mTabs.add(paramClass);
    addTab(paramTabSpec);
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    String str = getCurrentTabTag();
    Object localObject1 = null;
    int i = 0;
    if (i < mTabs.size())
    {
      TabInfo localTabInfo = (TabInfo)mTabs.get(i);
      TabInfo.access$102(localTabInfo, mFragmentManager.findFragmentByTag(tag));
      Object localObject2 = localObject1;
      if (fragment != null)
      {
        localObject2 = localObject1;
        if (!fragment.isDetached())
        {
          if (!tag.equals(str)) {
            break label110;
          }
          mLastTab = localTabInfo;
          localObject2 = localObject1;
        }
      }
      for (;;)
      {
        i++;
        localObject1 = localObject2;
        break;
        label110:
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = mFragmentManager.beginTransaction();
        }
        ((FragmentTransaction)localObject2).detach(fragment);
      }
    }
    mAttached = true;
    localObject1 = doTabChanged(str, (FragmentTransaction)localObject1);
    if (localObject1 != null)
    {
      ((FragmentTransaction)localObject1).commit();
      mFragmentManager.executePendingTransactions();
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    mAttached = false;
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = (SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    setCurrentTabByTag(curTab);
  }
  
  protected Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    curTab = getCurrentTabTag();
    return localSavedState;
  }
  
  public void onTabChanged(String paramString)
  {
    if (mAttached)
    {
      FragmentTransaction localFragmentTransaction = doTabChanged(paramString, null);
      if (localFragmentTransaction != null) {
        localFragmentTransaction.commit();
      }
    }
    if (mOnTabChangeListener != null) {
      mOnTabChangeListener.onTabChanged(paramString);
    }
  }
  
  public void setOnTabChangedListener(TabHost.OnTabChangeListener paramOnTabChangeListener)
  {
    mOnTabChangeListener = paramOnTabChangeListener;
  }
  
  @Deprecated
  public void setup()
  {
    throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
  }
  
  public void setup(Context paramContext, FragmentManager paramFragmentManager)
  {
    super.setup();
    mContext = paramContext;
    mFragmentManager = paramFragmentManager;
    ensureContent();
  }
  
  public void setup(Context paramContext, FragmentManager paramFragmentManager, int paramInt)
  {
    super.setup();
    mContext = paramContext;
    mFragmentManager = paramFragmentManager;
    mContainerId = paramInt;
    ensureContent();
    mRealTabContent.setId(paramInt);
    if (getId() == -1) {
      setId(16908306);
    }
  }
  
  static class DummyTabFactory
    implements TabHost.TabContentFactory
  {
    private final Context mContext;
    
    public DummyTabFactory(Context paramContext)
    {
      mContext = paramContext;
    }
    
    public View createTabContent(String paramString)
    {
      paramString = new View(mContext);
      paramString.setMinimumWidth(0);
      paramString.setMinimumHeight(0);
      return paramString;
    }
  }
  
  static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
    {
      public FragmentTabHost.SavedState createFromParcel(Parcel paramAnonymousParcel)
      {
        return new FragmentTabHost.SavedState(paramAnonymousParcel, null);
      }
      
      public FragmentTabHost.SavedState[] newArray(int paramAnonymousInt)
      {
        return new FragmentTabHost.SavedState[paramAnonymousInt];
      }
    };
    String curTab;
    
    private SavedState(Parcel paramParcel)
    {
      super();
      curTab = paramParcel.readString();
    }
    
    SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public String toString()
    {
      return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + curTab + "}";
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeString(curTab);
    }
  }
  
  static final class TabInfo
  {
    private final Bundle args;
    private final Class<?> clss;
    private Fragment fragment;
    private final String tag;
    
    TabInfo(String paramString, Class<?> paramClass, Bundle paramBundle)
    {
      tag = paramString;
      clss = paramClass;
      args = paramBundle;
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.FragmentTabHost
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */