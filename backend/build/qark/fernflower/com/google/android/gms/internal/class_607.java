package com.google.android.gms.internal;

import android.content.Context;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.class_626;
import com.google.android.gms.ads.class_630;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// $FF: renamed from: com.google.android.gms.internal.x
public final class class_607 implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.kb
   public static final class_397 field_2019 = new class_397();
   // $FF: renamed from: b int
   public final int field_2020;
   // $FF: renamed from: c java.lang.String
   public final String field_2021;
   // $FF: renamed from: d int
   public final int field_2022;
   // $FF: renamed from: e int
   public final int field_2023;
   // $FF: renamed from: f boolean
   public final boolean field_2024;
   // $FF: renamed from: g int
   public final int field_2025;
   // $FF: renamed from: h int
   public final int field_2026;
   // $FF: renamed from: i com.google.android.gms.internal.x[]
   public final class_607[] field_2027;

   public class_607() {
      this(2, "interstitial_mb", 0, 0, true, 0, 0, (class_607[])null);
   }

   class_607(int var1, String var2, int var3, int var4, boolean var5, int var6, int var7, class_607[] var8) {
      this.field_2020 = var1;
      this.field_2021 = var2;
      this.field_2022 = var3;
      this.field_2023 = var4;
      this.field_2024 = var5;
      this.field_2025 = var6;
      this.field_2026 = var7;
      this.field_2027 = var8;
   }

   public class_607(Context var1, class_626 var2) {
      this(var1, new class_626[]{var2});
   }

   public class_607(Context var1, class_626[] var2) {
      byte var7 = 0;
      super();
      class_626 var8 = var2[0];
      this.field_2020 = 2;
      this.field_2024 = false;
      this.field_2025 = var8.method_2044();
      this.field_2022 = var8.method_2042();
      boolean var3;
      if (this.field_2025 == -1) {
         var3 = true;
      } else {
         var3 = false;
      }

      boolean var4;
      if (this.field_2022 == -2) {
         var4 = true;
      } else {
         var4 = false;
      }

      DisplayMetrics var9 = var1.getResources().getDisplayMetrics();
      int var5;
      if (var3) {
         this.field_2026 = method_1942(var9);
         var5 = (int)((float)this.field_2026 / var9.density);
      } else {
         var5 = this.field_2025;
         this.field_2026 = class_468.method_1612(var9, this.field_2025);
      }

      int var6;
      if (var4) {
         var6 = method_1944(var9);
      } else {
         var6 = this.field_2022;
      }

      this.field_2023 = class_468.method_1612(var9, var6);
      if (!var3 && !var4) {
         this.field_2021 = var8.toString();
      } else {
         this.field_2021 = var5 + "x" + var6 + "_as";
      }

      if (var2.length > 1) {
         this.field_2027 = new class_607[var2.length];

         for(int var10 = var7; var10 < var2.length; ++var10) {
            this.field_2027[var10] = new class_607(var1, var2[var10]);
         }
      } else {
         this.field_2027 = null;
      }

   }

   public class_607(class_607 var1, class_607[] var2) {
      this(2, var1.field_2021, var1.field_2022, var1.field_2023, var1.field_2024, var1.field_2025, var1.field_2026, var2);
   }

   // $FF: renamed from: a (android.util.DisplayMetrics) int
   public static int method_1942(DisplayMetrics var0) {
      return var0.widthPixels;
   }

   // $FF: renamed from: b (android.util.DisplayMetrics) int
   public static int method_1943(DisplayMetrics var0) {
      return (int)((float)method_1944(var0) * var0.density);
   }

   // $FF: renamed from: c (android.util.DisplayMetrics) int
   private static int method_1944(DisplayMetrics var0) {
      int var1 = (int)((float)var0.heightPixels / var0.density);
      if (var1 <= 400) {
         return 32;
      } else {
         return var1 <= 720 ? 50 : 90;
      }
   }

   // $FF: renamed from: a () com.google.android.gms.ads.e
   public class_626 method_1945() {
      return class_630.method_2049(this.field_2025, this.field_2022, this.field_2021);
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_397.method_1355(this, var1, var2);
   }
}
