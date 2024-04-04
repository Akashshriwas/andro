package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class eb$a implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.hh
   public static final class_349 field_1602 = new class_349();
   // $FF: renamed from: b int
   final int field_1603;
   // $FF: renamed from: c java.lang.String
   final String field_1604;
   // $FF: renamed from: d int
   final int field_1605;

   eb$a(int var1, String var2, int var3) {
      this.field_1603 = var1;
      this.field_1604 = var2;
      this.field_1605 = var3;
   }

   eb$a(String var1, int var2) {
      this.field_1603 = 1;
      this.field_1604 = var1;
      this.field_1605 = var2;
   }

   public int describeContents() {
      class_349 var1 = field_1602;
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_349 var3 = field_1602;
      class_349.method_1215(this, var1, var2);
   }
}
