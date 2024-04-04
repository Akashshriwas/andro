package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class OpenFileIntentSenderRequest implements SafeParcelable {
   public static final Creator CREATOR = new class_547();
   // $FF: renamed from: a int
   final int field_129;
   // $FF: renamed from: b java.lang.String
   final String field_130;
   // $FF: renamed from: c java.lang.String[]
   final String[] field_131;
   // $FF: renamed from: d com.google.android.gms.drive.DriveId
   final DriveId field_132;

   OpenFileIntentSenderRequest(int var1, String var2, String[] var3, DriveId var4) {
      this.field_129 = var1;
      this.field_130 = var2;
      this.field_131 = var3;
      this.field_132 = var4;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_547.method_1835(this, var1, var2);
   }
}
