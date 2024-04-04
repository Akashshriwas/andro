package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class FragmentManagerState implements Parcelable {
   public static final Creator CREATOR = new class_629();
   // $FF: renamed from: a android.support.v4.app.FragmentState[]
   FragmentState[] field_652;
   // $FF: renamed from: b int[]
   int[] field_653;
   // $FF: renamed from: c android.support.v4.app.BackStackState[]
   BackStackState[] field_654;

   public FragmentManagerState() {
   }

   public FragmentManagerState(Parcel var1) {
      this.field_652 = (FragmentState[])var1.createTypedArray(FragmentState.CREATOR);
      this.field_653 = var1.createIntArray();
      this.field_654 = (BackStackState[])var1.createTypedArray(BackStackState.CREATOR);
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeTypedArray(this.field_652, var2);
      var1.writeIntArray(this.field_653);
      var1.writeTypedArray(this.field_654, var2);
   }
}
