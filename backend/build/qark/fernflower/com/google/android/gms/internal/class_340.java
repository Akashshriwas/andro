package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.SecureRandom;

// $FF: renamed from: com.google.android.gms.internal.he
public abstract class class_340 implements class_56 {
   // $FF: renamed from: a android.view.MotionEvent
   protected MotionEvent field_949;
   // $FF: renamed from: b android.util.DisplayMetrics
   protected DisplayMetrics field_950;
   // $FF: renamed from: c com.google.android.gms.internal.jk
   protected class_46 field_951;
   // $FF: renamed from: d com.google.android.gms.internal.jl
   private class_45 field_952;

   protected class_340(Context var1, class_46 var2, class_45 var3) {
      this.field_951 = var2;
      this.field_952 = var3;

      try {
         this.field_950 = var1.getResources().getDisplayMetrics();
      } catch (UnsupportedOperationException var4) {
         this.field_950 = new DisplayMetrics();
         this.field_950.density = 1.0F;
      }
   }

   // $FF: renamed from: a (android.content.Context, java.lang.String, boolean) java.lang.String
   private String method_1167(Context param1, String param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a () void
   private void method_1168() {
      this.field_952.method_130();
   }

   // $FF: renamed from: b () byte[]
   private byte[] method_1169() {
      return this.field_952.method_133();
   }

   // $FF: renamed from: a (android.content.Context) java.lang.String
   public String method_156(Context var1) {
      return this.method_1167(var1, (String)null, false);
   }

   // $FF: renamed from: a (android.content.Context, java.lang.String) java.lang.String
   public String method_157(Context var1, String var2) {
      return this.method_1167(var1, var2, true);
   }

   // $FF: renamed from: a (byte[], java.lang.String) java.lang.String
   String method_1170(byte[] var1, String var2) {
      byte[] var3 = var1;
      if (var1.length > 239) {
         this.method_1168();
         this.method_1171(20, 1L);
         var3 = this.method_1169();
      }

      if (var3.length < 239) {
         var1 = new byte[239 - var3.length];
         (new SecureRandom()).nextBytes(var1);
         var1 = ByteBuffer.allocate(240).put((byte)var3.length).put(var3).put(var1).array();
      } else {
         var1 = ByteBuffer.allocate(240).put((byte)var3.length).put(var3).array();
      }

      MessageDigest var4 = MessageDigest.getInstance("MD5");
      var4.update(var1);
      var3 = var4.digest();
      var1 = ByteBuffer.allocate(256).put(var3).put(var1).array();
      var3 = new byte[256];
      (new class_549()).method_1838(var1, var3);
      if (var2 != null && var2.length() > 0) {
         this.method_1173(var2, var3);
      }

      return this.field_951.method_134(var3, true);
   }

   // $FF: renamed from: a (int, int, int) void
   public void method_158(int var1, int var2, int var3) {
      if (this.field_949 != null) {
         this.field_949.recycle();
      }

      this.field_949 = MotionEvent.obtain(0L, (long)var3, 1, (float)var1 * this.field_950.density, (float)var2 * this.field_950.density, 0.0F, 0.0F, 0, 0.0F, 0.0F, 0, 0);
   }

   // $FF: renamed from: a (int, long) void
   protected void method_1171(int var1, long var2) {
      this.field_952.method_131(var1, var2);
   }

   // $FF: renamed from: a (int, java.lang.String) void
   protected void method_1172(int var1, String var2) {
      this.field_952.method_132(var1, var2);
   }

   // $FF: renamed from: a (android.view.MotionEvent) void
   public void method_159(MotionEvent var1) {
      if (var1.getAction() == 1) {
         if (this.field_949 != null) {
            this.field_949.recycle();
         }

         this.field_949 = MotionEvent.obtain(var1);
      }

   }

   // $FF: renamed from: a (java.lang.String, byte[]) void
   void method_1173(String var1, byte[] var2) {
      String var3 = var1;
      if (var1.length() > 32) {
         var3 = var1.substring(0, 32);
      }

      (new class_401(var3.getBytes("UTF-8"))).method_1390(var2);
   }

   // $FF: renamed from: b (android.content.Context) void
   protected abstract void method_1174(Context var1);

   // $FF: renamed from: c (android.content.Context) void
   protected abstract void method_1175(Context var1);
}
