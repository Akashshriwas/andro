package com.slidemenu.lib;

import android.os.Parcel;
import android.os.Parcelable.Creator;

// $FF: renamed from: com.slidemenu.lib.q
class class_641 implements Creator {
   // $FF: renamed from: a (android.os.Parcel) com.slidemenu.lib.SlidingMenu$SavedState
   public SlidingMenu$SavedState method_2068(Parcel var1) {
      return new SlidingMenu$SavedState(var1, (SlidingMenu$SavedState)null);
   }

   // $FF: renamed from: a (int) com.slidemenu.lib.SlidingMenu$SavedState[]
   public SlidingMenu$SavedState[] method_2069(int var1) {
      return new SlidingMenu$SavedState[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_2068(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_2069(var1);
   }
}
