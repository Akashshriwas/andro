package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.b.class_202;
import android.view.View.BaseSavedState;

public class ViewPager$SavedState extends BaseSavedState {
   public static final Creator CREATOR = class_202.method_815(new class_83());
   // $FF: renamed from: a int
   int field_363;
   // $FF: renamed from: b android.os.Parcelable
   Parcelable field_364;
   // $FF: renamed from: c java.lang.ClassLoader
   ClassLoader field_365;

   ViewPager$SavedState(Parcel var1, ClassLoader var2) {
      super(var1);
      ClassLoader var3 = var2;
      if (var2 == null) {
         var3 = this.getClass().getClassLoader();
      }

      this.field_363 = var1.readInt();
      this.field_364 = var1.readParcelable(var3);
      this.field_365 = var3;
   }

   public ViewPager$SavedState(Parcelable var1) {
      super(var1);
   }

   public String toString() {
      return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.field_363 + "}";
   }

   public void writeToParcel(Parcel var1, int var2) {
      super.writeToParcel(var1, var2);
      var1.writeInt(this.field_363);
      var1.writeParcelable(this.field_364, var2);
   }
}
