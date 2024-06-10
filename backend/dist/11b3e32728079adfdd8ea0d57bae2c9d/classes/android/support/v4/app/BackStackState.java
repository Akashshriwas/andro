package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

final class BackStackState
  implements Parcelable
{
  public static final Parcelable.Creator<BackStackState> CREATOR = new Parcelable.Creator()
  {
    public BackStackState createFromParcel(Parcel paramAnonymousParcel)
    {
      return new BackStackState(paramAnonymousParcel);
    }
    
    public BackStackState[] newArray(int paramAnonymousInt)
    {
      return new BackStackState[paramAnonymousInt];
    }
  };
  final int mBreadCrumbShortTitleRes;
  final CharSequence mBreadCrumbShortTitleText;
  final int mBreadCrumbTitleRes;
  final CharSequence mBreadCrumbTitleText;
  final int mIndex;
  final String mName;
  final int[] mOps;
  final int mTransition;
  final int mTransitionStyle;
  
  public BackStackState(Parcel paramParcel)
  {
    mOps = paramParcel.createIntArray();
    mTransition = paramParcel.readInt();
    mTransitionStyle = paramParcel.readInt();
    mName = paramParcel.readString();
    mIndex = paramParcel.readInt();
    mBreadCrumbTitleRes = paramParcel.readInt();
    mBreadCrumbTitleText = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    mBreadCrumbShortTitleRes = paramParcel.readInt();
    mBreadCrumbShortTitleText = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
  }
  
  public BackStackState(FragmentManagerImpl paramFragmentManagerImpl, BackStackRecord paramBackStackRecord)
  {
    int i = 0;
    paramFragmentManagerImpl = mHead;
    while (paramFragmentManagerImpl != null)
    {
      j = i;
      if (removed != null) {
        j = i + removed.size();
      }
      paramFragmentManagerImpl = next;
      i = j;
    }
    mOps = new int[mNumOp * 7 + i];
    if (!mAddToBackStack) {
      throw new IllegalStateException("Not on back stack");
    }
    paramFragmentManagerImpl = mHead;
    int j = 0;
    if (paramFragmentManagerImpl != null)
    {
      int[] arrayOfInt = mOps;
      int k = j + 1;
      arrayOfInt[j] = cmd;
      arrayOfInt = mOps;
      i = k + 1;
      if (fragment != null) {}
      int m;
      for (j = fragment.mIndex;; j = -1)
      {
        arrayOfInt[k] = j;
        arrayOfInt = mOps;
        j = i + 1;
        arrayOfInt[i] = enterAnim;
        arrayOfInt = mOps;
        i = j + 1;
        arrayOfInt[j] = exitAnim;
        arrayOfInt = mOps;
        j = i + 1;
        arrayOfInt[i] = popEnterAnim;
        arrayOfInt = mOps;
        m = j + 1;
        arrayOfInt[j] = popExitAnim;
        if (removed == null) {
          break label308;
        }
        k = removed.size();
        mOps[m] = k;
        i = 0;
        for (j = m + 1; i < k; j++)
        {
          mOps[j] = removed.get(i)).mIndex;
          i++;
        }
      }
      for (;;)
      {
        paramFragmentManagerImpl = next;
        break;
        label308:
        arrayOfInt = mOps;
        j = m + 1;
        arrayOfInt[m] = 0;
      }
    }
    mTransition = mTransition;
    mTransitionStyle = mTransitionStyle;
    mName = mName;
    mIndex = mIndex;
    mBreadCrumbTitleRes = mBreadCrumbTitleRes;
    mBreadCrumbTitleText = mBreadCrumbTitleText;
    mBreadCrumbShortTitleRes = mBreadCrumbShortTitleRes;
    mBreadCrumbShortTitleText = mBreadCrumbShortTitleText;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public BackStackRecord instantiate(FragmentManagerImpl paramFragmentManagerImpl)
  {
    BackStackRecord localBackStackRecord = new BackStackRecord(paramFragmentManagerImpl);
    int i = 0;
    while (i < mOps.length)
    {
      BackStackRecord.Op localOp = new BackStackRecord.Op();
      Object localObject = mOps;
      int j = i + 1;
      cmd = localObject[i];
      if (FragmentManagerImpl.DEBUG) {
        Log.v("FragmentManager", "BSE " + localBackStackRecord + " set base fragment #" + mOps[j]);
      }
      localObject = mOps;
      i = j + 1;
      j = localObject[j];
      if (j >= 0) {}
      for (fragment = ((Fragment)mActive.get(j));; fragment = null)
      {
        localObject = mOps;
        j = i + 1;
        enterAnim = localObject[i];
        localObject = mOps;
        int k = j + 1;
        exitAnim = localObject[j];
        localObject = mOps;
        i = k + 1;
        popEnterAnim = localObject[k];
        localObject = mOps;
        j = i + 1;
        popExitAnim = localObject[i];
        localObject = mOps;
        i = j + 1;
        int m = localObject[j];
        j = i;
        if (m <= 0) {
          break;
        }
        removed = new ArrayList(m);
        k = 0;
        for (;;)
        {
          j = i;
          if (k >= m) {
            break;
          }
          if (FragmentManagerImpl.DEBUG) {
            Log.v("FragmentManager", "BSE " + localBackStackRecord + " set remove fragment #" + mOps[i]);
          }
          localObject = (Fragment)mActive.get(mOps[i]);
          removed.add(localObject);
          k++;
          i++;
        }
      }
      i = j;
      localBackStackRecord.addOp(localOp);
    }
    mTransition = mTransition;
    mTransitionStyle = mTransitionStyle;
    mName = mName;
    mIndex = mIndex;
    mAddToBackStack = true;
    mBreadCrumbTitleRes = mBreadCrumbTitleRes;
    mBreadCrumbTitleText = mBreadCrumbTitleText;
    mBreadCrumbShortTitleRes = mBreadCrumbShortTitleRes;
    mBreadCrumbShortTitleText = mBreadCrumbShortTitleText;
    localBackStackRecord.bumpBackStackNesting(1);
    return localBackStackRecord;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeIntArray(mOps);
    paramParcel.writeInt(mTransition);
    paramParcel.writeInt(mTransitionStyle);
    paramParcel.writeString(mName);
    paramParcel.writeInt(mIndex);
    paramParcel.writeInt(mBreadCrumbTitleRes);
    TextUtils.writeToParcel(mBreadCrumbTitleText, paramParcel, 0);
    paramParcel.writeInt(mBreadCrumbShortTitleRes);
    TextUtils.writeToParcel(mBreadCrumbShortTitleText, paramParcel, 0);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.BackStackState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */