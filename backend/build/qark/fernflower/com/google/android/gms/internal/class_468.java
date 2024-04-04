package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.FrameLayout.LayoutParams;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

// $FF: renamed from: com.google.android.gms.internal.es
public final class class_468 {
   // $FF: renamed from: a android.os.Handler
   public static final Handler field_1283 = new Handler(Looper.getMainLooper());

   // $FF: renamed from: a (android.content.Context, int) int
   public static int method_1611(Context var0, int var1) {
      return method_1612(var0.getResources().getDisplayMetrics(), var1);
   }

   // $FF: renamed from: a (android.util.DisplayMetrics, int) int
   public static int method_1612(DisplayMetrics var0, int var1) {
      return (int)TypedValue.applyDimension(1, (float)var1, var0);
   }

   // $FF: renamed from: a (android.content.Context) java.lang.String
   public static String method_1613(Context var0) {
      String var1 = Secure.getString(var0.getContentResolver(), "android_id");
      if (var1 == null || method_1617()) {
         var1 = "emulator";
      }

      return method_1614(var1);
   }

   // $FF: renamed from: a (java.lang.String) java.lang.String
   public static String method_1614(String var0) {
      int var1 = 0;

      while(var1 < 2) {
         try {
            MessageDigest var2 = MessageDigest.getInstance("MD5");
            var2.update(var0.getBytes());
            String var4 = String.format(Locale.US, "%032X", new BigInteger(1, var2.digest()));
            return var4;
         } catch (NoSuchAlgorithmException var3) {
            ++var1;
         }
      }

      return null;
   }

   // $FF: renamed from: a (android.view.ViewGroup, com.google.android.gms.internal.x, java.lang.String, int, int) void
   private static void method_1615(ViewGroup var0, class_607 var1, String var2, int var3, int var4) {
      if (var0.getChildCount() == 0) {
         Context var5 = var0.getContext();
         TextView var6 = new TextView(var5);
         var6.setGravity(17);
         var6.setText(var2);
         var6.setTextColor(var3);
         var6.setBackgroundColor(var4);
         FrameLayout var7 = new FrameLayout(var5);
         var7.setBackgroundColor(var3);
         var3 = method_1611(var5, 3);
         var7.addView(var6, new LayoutParams(var1.field_2026 - var3, var1.field_2023 - var3, 17));
         var0.addView(var7, var1.field_2026, var1.field_2023);
      }
   }

   // $FF: renamed from: a (android.view.ViewGroup, com.google.android.gms.internal.x, java.lang.String, java.lang.String) void
   public static void method_1616(ViewGroup var0, class_607 var1, String var2, String var3) {
      class_467.method_1610(var3);
      method_1615(var0, var1, var2, -65536, -16777216);
   }

   // $FF: renamed from: a () boolean
   public static boolean method_1617() {
      return Build.DEVICE.startsWith("generic");
   }

   // $FF: renamed from: b () boolean
   public static boolean method_1618() {
      return Looper.myLooper() == Looper.getMainLooper();
   }
}
