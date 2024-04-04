package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.class_213;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.class_40;

public class FieldOnlyFilter implements SafeParcelable, class_40 {
   public static final Creator CREATOR = new class_653();
   // $FF: renamed from: a com.google.android.gms.drive.metadata.internal.MetadataBundle
   final MetadataBundle field_172;
   // $FF: renamed from: b int
   final int field_173;
   // $FF: renamed from: c com.google.android.gms.drive.metadata.b
   private final class_213 field_174;

   FieldOnlyFilter(int var1, MetadataBundle var2) {
      this.field_173 = var1;
      this.field_172 = var2;
      this.field_174 = class_643.method_2073(var2);
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_653.method_2151(this, var1, var2);
   }
}
