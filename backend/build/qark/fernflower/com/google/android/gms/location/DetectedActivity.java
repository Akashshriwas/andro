package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DetectedActivity implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.location.b
   public static final class_287 field_1623 = new class_287();
   // $FF: renamed from: b int
   int field_1624;
   // $FF: renamed from: c int
   int field_1625;
   // $FF: renamed from: d int
   private final int field_1626;

   public DetectedActivity(int var1, int var2, int var3) {
      this.field_1626 = var1;
      this.field_1624 = var2;
      this.field_1625 = var3;
   }

   // $FF: renamed from: a (int) int
   private int method_1780(int var1) {
      int var2 = var1;
      if (var1 > 6) {
         var2 = 4;
      }

      return var2;
   }

   // $FF: renamed from: a () int
   public int method_1781() {
      return this.method_1780(this.field_1624);
   }

   // $FF: renamed from: b () int
   public int method_1782() {
      return this.field_1626;
   }

   public int describeContents() {
      return 0;
   }

   public String toString() {
      return "DetectedActivity [type=" + this.method_1781() + ", confidence=" + this.field_1625 + "]";
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_287.method_986(this, var1, var2);
   }
}
