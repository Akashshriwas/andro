package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

// $FF: renamed from: android.support.v4.app.r
final class class_631 implements Creator {
   // $FF: renamed from: a (android.os.Parcel) android.support.v4.app.FragmentState
   public FragmentState method_2050(Parcel var1) {
      return new FragmentState(var1);
   }

   // $FF: renamed from: a (int) android.support.v4.app.FragmentState[]
   public FragmentState[] method_2051(int var1) {
      return new FragmentState[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_2050(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_2051(var1);
   }
}
