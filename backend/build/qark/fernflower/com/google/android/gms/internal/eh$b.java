package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class eh$b implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.hk
   public static final class_347 field_179 = new class_347();
   // $FF: renamed from: b int
   final int field_180;
   // $FF: renamed from: c java.lang.String
   final String field_181;
   // $FF: renamed from: d com.google.android.gms.internal.ee$a
   final ee$a field_182;

   eh$b(int var1, String var2, ee$a var3) {
      this.field_180 = var1;
      this.field_181 = var2;
      this.field_182 = var3;
   }

   eh$b(String var1, ee$a var2) {
      this.field_180 = 1;
      this.field_181 = var1;
      this.field_182 = var2;
   }

   public int describeContents() {
      class_347 var1 = field_179;
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_347 var3 = field_179;
      class_347.method_1208(this, var1, var2);
   }
}
