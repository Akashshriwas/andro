package com.google.android.gms.internal;

import android.os.Looper;
import android.text.TextUtils;

// $FF: renamed from: com.google.android.gms.internal.hc
public final class class_343 {
   // $FF: renamed from: a (java.lang.Object) java.lang.Object
   public static Object method_1189(Object var0) {
      if (var0 == null) {
         throw new NullPointerException("null reference");
      } else {
         return var0;
      }
   }

   // $FF: renamed from: a (java.lang.Object, java.lang.Object) java.lang.Object
   public static Object method_1190(Object var0, Object var1) {
      if (var0 == null) {
         throw new NullPointerException(String.valueOf(var1));
      } else {
         return var0;
      }
   }

   // $FF: renamed from: a (java.lang.String) java.lang.String
   public static String method_1191(String var0) {
      if (TextUtils.isEmpty(var0)) {
         throw new IllegalArgumentException("Given String is empty or null");
      } else {
         return var0;
      }
   }

   // $FF: renamed from: a (boolean) void
   public static void method_1192(boolean var0) {
      if (!var0) {
         throw new IllegalStateException();
      }
   }

   // $FF: renamed from: a (boolean, java.lang.Object) void
   public static void method_1193(boolean var0, Object var1) {
      if (!var0) {
         throw new IllegalStateException(String.valueOf(var1));
      }
   }

   // $FF: renamed from: a (boolean, java.lang.String, java.lang.Object[]) void
   public static void method_1194(boolean var0, String var1, Object... var2) {
      if (!var0) {
         throw new IllegalArgumentException(String.format(var1, var2));
      }
   }

   // $FF: renamed from: b (java.lang.String) void
   public static void method_1195(String var0) {
      if (Looper.myLooper() != Looper.getMainLooper()) {
         throw new IllegalStateException(var0);
      }
   }

   // $FF: renamed from: b (boolean) void
   public static void method_1196(boolean var0) {
      if (!var0) {
         throw new IllegalArgumentException();
      }
   }

   // $FF: renamed from: b (boolean, java.lang.Object) void
   public static void method_1197(boolean var0, Object var1) {
      if (!var0) {
         throw new IllegalArgumentException(String.valueOf(var1));
      }
   }

   // $FF: renamed from: c (java.lang.String) void
   public static void method_1198(String var0) {
      if (Looper.myLooper() == Looper.getMainLooper()) {
         throw new IllegalStateException(var0);
      }
   }
}
