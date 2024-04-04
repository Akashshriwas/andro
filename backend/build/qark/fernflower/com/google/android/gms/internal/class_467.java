package com.google.android.gms.internal;

import android.util.Log;

// $FF: renamed from: com.google.android.gms.internal.et
public final class class_467 {
   // $FF: renamed from: a (java.lang.String) void
   public static void method_1603(String var0) {
      if (method_1605(3)) {
         Log.d("Ads", var0);
      }

   }

   // $FF: renamed from: a (java.lang.String, java.lang.Throwable) void
   public static void method_1604(String var0, Throwable var1) {
      if (method_1605(3)) {
         Log.d("Ads", var0, var1);
      }

   }

   // $FF: renamed from: a (int) boolean
   public static boolean method_1605(int var0) {
      return (var0 >= 5 || Log.isLoggable("Ads", var0)) && var0 != 2;
   }

   // $FF: renamed from: b (java.lang.String) void
   public static void method_1606(String var0) {
      if (method_1605(6)) {
         Log.e("Ads", var0);
      }

   }

   // $FF: renamed from: b (java.lang.String, java.lang.Throwable) void
   public static void method_1607(String var0, Throwable var1) {
      if (method_1605(5)) {
         Log.w("Ads", var0, var1);
      }

   }

   // $FF: renamed from: c (java.lang.String) void
   public static void method_1608(String var0) {
      if (method_1605(4)) {
         Log.i("Ads", var0);
      }

   }

   // $FF: renamed from: d (java.lang.String) void
   public static void method_1609(String var0) {
      if (method_1605(2)) {
         Log.v("Ads", var0);
      }

   }

   // $FF: renamed from: e (java.lang.String) void
   public static void method_1610(String var0) {
      if (method_1605(5)) {
         Log.w("Ads", var0);
      }

   }
}
