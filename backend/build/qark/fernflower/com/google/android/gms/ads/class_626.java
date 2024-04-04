package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.internal.class_468;
import com.google.android.gms.internal.class_607;

// $FF: renamed from: com.google.android.gms.ads.e
public final class class_626 {
   // $FF: renamed from: a com.google.android.gms.ads.e
   public static final class_626 field_2118 = new class_626(320, 50, "320x50_mb");
   // $FF: renamed from: b com.google.android.gms.ads.e
   public static final class_626 field_2119 = new class_626(468, 60, "468x60_as");
   // $FF: renamed from: c com.google.android.gms.ads.e
   public static final class_626 field_2120 = new class_626(728, 90, "728x90_as");
   // $FF: renamed from: d com.google.android.gms.ads.e
   public static final class_626 field_2121 = new class_626(300, 250, "300x250_as");
   // $FF: renamed from: e com.google.android.gms.ads.e
   public static final class_626 field_2122 = new class_626(160, 600, "160x600_as");
   // $FF: renamed from: f com.google.android.gms.ads.e
   public static final class_626 field_2123 = new class_626(-1, -2, "smart_banner");
   // $FF: renamed from: g int
   private final int field_2124;
   // $FF: renamed from: h int
   private final int field_2125;
   // $FF: renamed from: i java.lang.String
   private final String field_2126;

   public class_626(int var1, int var2) {
      StringBuilder var4 = new StringBuilder();
      String var3;
      if (var1 == -1) {
         var3 = "FULL";
      } else {
         var3 = String.valueOf(var1);
      }

      var4 = var4.append(var3).append("x");
      if (var2 == -2) {
         var3 = "AUTO";
      } else {
         var3 = String.valueOf(var2);
      }

      this(var1, var2, var4.append(var3).append("_as").toString());
   }

   class_626(int var1, int var2, String var3) {
      if (var1 < 0 && var1 != -1) {
         throw new IllegalArgumentException("Invalid width for AdSize: " + var1);
      } else if (var2 < 0 && var2 != -2) {
         throw new IllegalArgumentException("Invalid height for AdSize: " + var2);
      } else {
         this.field_2124 = var1;
         this.field_2125 = var2;
         this.field_2126 = var3;
      }
   }

   // $FF: renamed from: a () int
   public int method_2042() {
      return this.field_2125;
   }

   // $FF: renamed from: a (android.content.Context) int
   public int method_2043(Context var1) {
      return this.field_2125 == -2 ? class_607.method_1943(var1.getResources().getDisplayMetrics()) : class_468.method_1611(var1, this.field_2125);
   }

   // $FF: renamed from: b () int
   public int method_2044() {
      return this.field_2124;
   }

   // $FF: renamed from: b (android.content.Context) int
   public int method_2045(Context var1) {
      return this.field_2124 == -1 ? class_607.method_1942(var1.getResources().getDisplayMetrics()) : class_468.method_1611(var1, this.field_2124);
   }

   public boolean equals(Object var1) {
      if (var1 != this) {
         if (!(var1 instanceof class_626)) {
            return false;
         }

         class_626 var2 = (class_626)var1;
         if (this.field_2124 != var2.field_2124 || this.field_2125 != var2.field_2125 || !this.field_2126.equals(var2.field_2126)) {
            return false;
         }
      }

      return true;
   }

   public int hashCode() {
      return this.field_2126.hashCode();
   }

   public String toString() {
      return this.field_2126;
   }
}
