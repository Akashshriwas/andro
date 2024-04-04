package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

// $FF: renamed from: android.support.v4.app.f
final class class_621 implements Creator {
   // $FF: renamed from: a (android.os.Parcel) android.support.v4.app.Fragment$SavedState
   public Fragment$SavedState method_2022(Parcel var1) {
      return new Fragment$SavedState(var1, (ClassLoader)null);
   }

   // $FF: renamed from: a (int) android.support.v4.app.Fragment$SavedState[]
   public Fragment$SavedState[] method_2023(int var1) {
      return new Fragment$SavedState[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_2022(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_2023(var1);
   }
}
