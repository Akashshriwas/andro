package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// $FF: renamed from: com.google.android.gms.internal.dz
public class class_453 implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.hf
   public static final class_346 field_1222 = new class_346();
   // $FF: renamed from: b int
   private final int field_1223;
   // $FF: renamed from: c com.google.android.gms.internal.eb
   private final class_478 field_1224;

   class_453(int var1, class_478 var2) {
      this.field_1223 = var1;
      this.field_1224 = var2;
   }

   private class_453(class_478 var1) {
      this.field_1223 = 1;
      this.field_1224 = var1;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.hi) com.google.android.gms.internal.dz
   public static class_453 method_1519(class_42 var0) {
      if (var0 instanceof class_478) {
         return new class_453((class_478)var0);
      } else {
         throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
      }
   }

   // $FF: renamed from: a () int
   int method_1520() {
      return this.field_1223;
   }

   // $FF: renamed from: b () com.google.android.gms.internal.eb
   class_478 method_1521() {
      return this.field_1224;
   }

   // $FF: renamed from: c () com.google.android.gms.internal.hi
   public class_42 method_1522() {
      if (this.field_1224 != null) {
         return this.field_1224;
      } else {
         throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
      }
   }

   public int describeContents() {
      class_346 var1 = field_1222;
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_346 var3 = field_1222;
      class_346.method_1205(this, var1, var2);
   }
}
