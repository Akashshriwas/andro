package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

// $FF: renamed from: android.support.v4.app.d
final class class_619 implements Creator {
   // $FF: renamed from: a (android.os.Parcel) android.support.v4.app.BackStackState
   public BackStackState method_2020(Parcel var1) {
      return new BackStackState(var1);
   }

   // $FF: renamed from: a (int) android.support.v4.app.BackStackState[]
   public BackStackState[] method_2021(int var1) {
      return new BackStackState[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_2020(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_2021(var1);
   }
}
