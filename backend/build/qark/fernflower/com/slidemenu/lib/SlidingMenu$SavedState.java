package com.slidemenu.lib;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public class SlidingMenu$SavedState extends BaseSavedState {
   public static final Creator CREATOR = new class_641();
   // $FF: renamed from: a int
   private final int field_2149;

   private SlidingMenu$SavedState(Parcel var1) {
      super(var1);
      this.field_2149 = var1.readInt();
   }

   // $FF: synthetic method
   SlidingMenu$SavedState(Parcel var1, SlidingMenu$SavedState var2) {
      this(var1);
   }

   public SlidingMenu$SavedState(Parcelable var1, int var2) {
      super(var1);
      this.field_2149 = var2;
   }

   // $FF: renamed from: a () int
   public int method_2067() {
      return this.field_2149;
   }

   public void writeToParcel(Parcel var1, int var2) {
      super.writeToParcel(var1, var2);
      var1.writeInt(this.field_2149);
   }
}
