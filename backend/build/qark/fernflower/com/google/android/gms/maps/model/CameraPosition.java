package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.class_310;
import com.google.android.gms.internal.class_343;
import com.google.android.gms.maps.a.class_294;

public final class CameraPosition implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.maps.model.b
   public static final class_227 field_1248 = new class_227();
   // $FF: renamed from: b com.google.android.gms.maps.model.LatLng
   public final LatLng field_1249;
   // $FF: renamed from: c float
   public final float field_1250;
   // $FF: renamed from: d float
   public final float field_1251;
   // $FF: renamed from: e float
   public final float field_1252;
   // $FF: renamed from: f int
   private final int field_1253;

   CameraPosition(int var1, LatLng var2, float var3, float var4, float var5) {
      class_343.method_1190(var2, "null camera target");
      boolean var6;
      if (0.0F <= var4 && var4 <= 90.0F) {
         var6 = true;
      } else {
         var6 = false;
      }

      class_343.method_1197(var6, "Tilt needs to be between 0 and 90 inclusive");
      this.field_1253 = var1;
      this.field_1249 = var2;
      this.field_1250 = var3;
      this.field_1251 = var4 + 0.0F;
      var3 = var5;
      if ((double)var5 <= 0.0D) {
         var3 = var5 % 360.0F + 360.0F;
      }

      this.field_1252 = var3 % 360.0F;
   }

   // $FF: renamed from: a () int
   int method_1542() {
      return this.field_1253;
   }

   public int describeContents() {
      return 0;
   }

   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof CameraPosition)) {
            return false;
         }

         CameraPosition var2 = (CameraPosition)var1;
         if (!this.field_1249.equals(var2.field_1249) || Float.floatToIntBits(this.field_1250) != Float.floatToIntBits(var2.field_1250) || Float.floatToIntBits(this.field_1251) != Float.floatToIntBits(var2.field_1251) || Float.floatToIntBits(this.field_1252) != Float.floatToIntBits(var2.field_1252)) {
            return false;
         }
      }

      return true;
   }

   public int hashCode() {
      return class_310.method_1033(this.field_1249, this.field_1250, this.field_1251, this.field_1252);
   }

   public String toString() {
      return class_310.method_1034(this).method_1032("target", this.field_1249).method_1032("zoom", this.field_1250).method_1032("tilt", this.field_1251).method_1032("bearing", this.field_1252).toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      if (class_294.method_1007()) {
         class_237.method_881(this, var1, var2);
      } else {
         class_227.method_845(this, var1, var2);
      }
   }
}
