package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class OpenContentsRequest implements SafeParcelable {
   public static final Creator CREATOR = new class_541();
   // $FF: renamed from: a int
   final int field_1878;
   // $FF: renamed from: b com.google.android.gms.drive.DriveId
   final DriveId field_1879;
   // $FF: renamed from: c int
   final int field_1880;

   OpenContentsRequest(int var1, DriveId var2, int var3) {
      this.field_1878 = var1;
      this.field_1879 = var2;
      this.field_1880 = var3;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_541.method_1826(this, var1, var2);
   }
}
