package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;

public class OnContentsResponse implements SafeParcelable {
   public static final Creator CREATOR = new class_536();
   // $FF: renamed from: a int
   final int field_1677;
   // $FF: renamed from: b com.google.android.gms.drive.Contents
   final Contents field_1678;

   OnContentsResponse(int var1, Contents var2) {
      this.field_1677 = var1;
      this.field_1678 = var2;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_536.method_1815(this, var1, var2);
   }
}
