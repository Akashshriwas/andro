package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnDownloadProgressResponse implements SafeParcelable {
   public static final Creator CREATOR = new class_535();
   // $FF: renamed from: a int
   final int field_1268;
   // $FF: renamed from: b long
   final long field_1269;
   // $FF: renamed from: c long
   final long field_1270;

   OnDownloadProgressResponse(int var1, long var2, long var4) {
      this.field_1268 = var1;
      this.field_1269 = var2;
      this.field_1270 = var4;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_535.method_1812(this, var1, var2);
   }
}
