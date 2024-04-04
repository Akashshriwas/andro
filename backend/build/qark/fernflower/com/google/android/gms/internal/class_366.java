package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// $FF: renamed from: com.google.android.gms.internal.fz
public final class class_366 extends class_365 implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.ij
   public static final class_377 field_983 = new class_377();
   // $FF: renamed from: c com.google.android.gms.internal.fz
   private static final class_366 field_984 = new class_366(0, new class_314[0], new float[0]);
   // $FF: renamed from: b int
   final int field_985;
   // $FF: renamed from: d com.google.android.gms.internal.gb[]
   private final class_314[] field_986;
   // $FF: renamed from: e float[]
   private final float[] field_987;

   class_366(int var1, class_314[] var2, float[] var3) {
      boolean var4;
      if (var2.length == var3.length) {
         var4 = true;
      } else {
         var4 = false;
      }

      class_343.method_1197(var4, "mismatched places to probabilities arrays");
      this.field_985 = var1;
      this.field_986 = var2;
      this.field_987 = var3;
   }

   // $FF: renamed from: a () com.google.android.gms.internal.gb[]
   public class_314[] method_1270() {
      return this.field_986;
   }

   // $FF: renamed from: b () float[]
   float[] method_1271() {
      return this.field_987;
   }

   public int describeContents() {
      class_377 var1 = field_983;
      return 0;
   }

   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof class_366)) {
            return false;
         }

         class_366 var2 = (class_366)var1;
         if (!this.field_986.equals(var2.field_986) || !this.field_987.equals(var2.field_987)) {
            return false;
         }
      }

      return true;
   }

   public int hashCode() {
      return class_310.method_1033(this.field_986, this.field_987);
   }

   public String toString() {
      StringBuilder var2 = new StringBuilder("PlaceEstimate{");

      for(int var1 = 0; var1 < this.field_986.length; ++var1) {
         var2.append(String.format("(%f, %s)", this.field_987[var1], this.field_986[var1].toString()));
         if (var1 != this.field_986.length - 1) {
            var2.append(",");
         }
      }

      var2.append("}");
      return var2.toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_377 var3 = field_983;
      class_377.method_1295(this, var1, var2);
   }
}
