package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class CreateContentsRequest implements SafeParcelable {
   public static final Creator CREATOR = new class_525();
   // $FF: renamed from: a int
   final int field_2157;

   public CreateContentsRequest() {
      this(1);
   }

   CreateContentsRequest(int var1) {
      this.field_2157 = var1;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_525.method_1783(this, var1, var2);
   }
}
