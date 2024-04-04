package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

// $FF: renamed from: com.google.android.gms.internal.fn
public class class_488 implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.ib
   public static final class_367 field_1377 = new class_367();
   // $FF: renamed from: b int
   private final int field_1378;
   // $FF: renamed from: c java.lang.String
   private final String field_1379;
   // $FF: renamed from: d long
   private final long field_1380;
   // $FF: renamed from: e short
   private final short field_1381;
   // $FF: renamed from: f double
   private final double field_1382;
   // $FF: renamed from: g double
   private final double field_1383;
   // $FF: renamed from: h float
   private final float field_1384;
   // $FF: renamed from: i int
   private final int field_1385;
   // $FF: renamed from: j int
   private final int field_1386;
   // $FF: renamed from: k int
   private final int field_1387;

   public class_488(int var1, String var2, int var3, short var4, double var5, double var7, float var9, long var10, int var12, int var13) {
      method_1682(var2);
      method_1681(var9);
      method_1680(var5, var7);
      var3 = method_1679(var3);
      this.field_1378 = var1;
      this.field_1381 = var4;
      this.field_1379 = var2;
      this.field_1382 = var5;
      this.field_1383 = var7;
      this.field_1384 = var9;
      this.field_1380 = var10;
      this.field_1385 = var3;
      this.field_1386 = var12;
      this.field_1387 = var13;
   }

   // $FF: renamed from: a (int) int
   private static int method_1679(int var0) {
      int var1 = var0 & 7;
      if (var1 == 0) {
         throw new IllegalArgumentException("No supported transition specified: " + var0);
      } else {
         return var1;
      }
   }

   // $FF: renamed from: a (double, double) void
   private static void method_1680(double var0, double var2) {
      if (var0 <= 90.0D && var0 >= -90.0D) {
         if (var2 > 180.0D || var2 < -180.0D) {
            throw new IllegalArgumentException("invalid longitude: " + var2);
         }
      } else {
         throw new IllegalArgumentException("invalid latitude: " + var0);
      }
   }

   // $FF: renamed from: a (float) void
   private static void method_1681(float var0) {
      if (var0 <= 0.0F) {
         throw new IllegalArgumentException("invalid radius: " + var0);
      }
   }

   // $FF: renamed from: a (java.lang.String) void
   private static void method_1682(String var0) {
      if (var0 == null || var0.length() > 100) {
         throw new IllegalArgumentException("requestId is null or too long: " + var0);
      }
   }

   // $FF: renamed from: b (int) java.lang.String
   private static String method_1683(int var0) {
      switch(var0) {
      case 1:
         return "CIRCLE";
      default:
         return null;
      }
   }

   // $FF: renamed from: a () int
   public int method_1684() {
      return this.field_1378;
   }

   // $FF: renamed from: b () short
   public short method_1685() {
      return this.field_1381;
   }

   // $FF: renamed from: c () double
   public double method_1686() {
      return this.field_1382;
   }

   // $FF: renamed from: d () double
   public double method_1687() {
      return this.field_1383;
   }

   public int describeContents() {
      class_367 var1 = field_1377;
      return 0;
   }

   // $FF: renamed from: e () float
   public float method_1688() {
      return this.field_1384;
   }

   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 == null) {
            return false;
         }

         if (!(var1 instanceof class_488)) {
            return false;
         }

         class_488 var2 = (class_488)var1;
         if (this.field_1384 != var2.field_1384) {
            return false;
         }

         if (this.field_1382 != var2.field_1382) {
            return false;
         }

         if (this.field_1383 != var2.field_1383) {
            return false;
         }

         if (this.field_1381 != var2.field_1381) {
            return false;
         }
      }

      return true;
   }

   // $FF: renamed from: f () java.lang.String
   public String method_1689() {
      return this.field_1379;
   }

   // $FF: renamed from: g () long
   public long method_1690() {
      return this.field_1380;
   }

   // $FF: renamed from: h () int
   public int method_1691() {
      return this.field_1385;
   }

   public int hashCode() {
      long var2 = Double.doubleToLongBits(this.field_1382);
      int var1 = (int)(var2 ^ var2 >>> 32);
      var2 = Double.doubleToLongBits(this.field_1383);
      return ((((var1 + 31) * 31 + (int)(var2 ^ var2 >>> 32)) * 31 + Float.floatToIntBits(this.field_1384)) * 31 + this.field_1381) * 31 + this.field_1385;
   }

   // $FF: renamed from: i () int
   public int method_1692() {
      return this.field_1386;
   }

   // $FF: renamed from: j () int
   public int method_1693() {
      return this.field_1387;
   }

   public String toString() {
      return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", method_1683(this.field_1381), this.field_1379, this.field_1385, this.field_1382, this.field_1383, this.field_1384, this.field_1386 / 1000, this.field_1387, this.field_1380);
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_367 var3 = field_1377;
      class_367.method_1272(this, var1, var2);
   }
}
