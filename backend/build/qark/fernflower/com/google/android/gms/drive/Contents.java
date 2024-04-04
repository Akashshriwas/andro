package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Contents implements SafeParcelable {
   public static final Creator CREATOR = new class_331();
   // $FF: renamed from: a int
   final int field_1577;
   // $FF: renamed from: b android.os.ParcelFileDescriptor
   final ParcelFileDescriptor field_1578;
   // $FF: renamed from: c int
   final int field_1579;
   // $FF: renamed from: d int
   final int field_1580;
   // $FF: renamed from: e com.google.android.gms.drive.DriveId
   final DriveId field_1581;
   // $FF: renamed from: f boolean
   private boolean field_1582 = false;
   // $FF: renamed from: g boolean
   private boolean field_1583 = false;
   // $FF: renamed from: h boolean
   private boolean field_1584 = false;

   Contents(int var1, ParcelFileDescriptor var2, int var3, int var4, DriveId var5) {
      this.field_1577 = var1;
      this.field_1578 = var2;
      this.field_1579 = var3;
      this.field_1580 = var4;
      this.field_1581 = var5;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_331.method_1131(this, var1, var2);
   }
}
