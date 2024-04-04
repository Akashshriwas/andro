package com.google.android.gms.internal;

import android.os.Looper;
import android.util.Log;

// $FF: renamed from: com.google.android.gms.internal.fv
public final class class_495 {
   // $FF: renamed from: a (java.lang.Object) void
   public static void method_1705(Object var0) {
      if (var0 == null) {
         throw new IllegalArgumentException("null reference");
      }
   }

   // $FF: renamed from: a (java.lang.String) void
   public static void method_1706(String var0) {
      if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
         Log.e("Asserts", "checkMainThread: current thread " + Thread.currentThread() + " IS NOT the main thread " + Looper.getMainLooper().getThread() + "!");
         throw new IllegalStateException(var0);
      }
   }

   // $FF: renamed from: a (boolean) void
   public static void method_1707(boolean var0) {
      if (!var0) {
         throw new IllegalStateException();
      }
   }

   // $FF: renamed from: b (java.lang.String) void
   public static void method_1708(String var0) {
      if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
         Log.e("Asserts", "checkNotMainThread: current thread " + Thread.currentThread() + " IS the main thread " + Looper.getMainLooper().getThread() + "!");
         throw new IllegalStateException(var0);
      }
   }
}
