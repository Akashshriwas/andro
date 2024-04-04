package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.class_213;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.class_40;

public class ComparisonFilter implements SafeParcelable, class_40 {
   // $FF: renamed from: a com.google.android.gms.drive.query.internal.a
   public static final class_650 field_770 = new class_650();
   // $FF: renamed from: b com.google.android.gms.drive.query.internal.Operator
   final Operator field_771;
   // $FF: renamed from: c com.google.android.gms.drive.metadata.internal.MetadataBundle
   final MetadataBundle field_772;
   // $FF: renamed from: d int
   final int field_773;
   // $FF: renamed from: e com.google.android.gms.drive.metadata.b
   final class_213 field_774;

   ComparisonFilter(int var1, Operator var2, MetadataBundle var3) {
      this.field_773 = var1;
      this.field_771 = var2;
      this.field_772 = var3;
      this.field_774 = class_643.method_2073(var3);
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_650.method_2119(this, var1, var2);
   }
}
