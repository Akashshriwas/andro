package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;

public class CloseContentsRequest implements SafeParcelable {
   public static final Creator CREATOR = new class_579();
   // $FF: renamed from: a int
   final int field_137;
   // $FF: renamed from: b com.google.android.gms.drive.Contents
   final Contents field_138;
   // $FF: renamed from: c java.lang.Boolean
   final Boolean field_139;

   CloseContentsRequest(int var1, Contents var2, Boolean var3) {
      this.field_137 = var1;
      this.field_138 = var2;
      this.field_139 = var3;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_579.method_1886(this, var1, var2);
   }
}
