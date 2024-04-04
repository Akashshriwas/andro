package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

// $FF: renamed from: android.support.v4.app.q
final class class_629 implements Creator {
   // $FF: renamed from: a (android.os.Parcel) android.support.v4.app.FragmentManagerState
   public FragmentManagerState method_2047(Parcel var1) {
      return new FragmentManagerState(var1);
   }

   // $FF: renamed from: a (int) android.support.v4.app.FragmentManagerState[]
   public FragmentManagerState[] method_2048(int var1) {
      return new FragmentManagerState[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_2047(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_2048(var1);
   }
}
