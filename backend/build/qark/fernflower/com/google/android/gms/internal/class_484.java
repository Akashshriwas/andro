package com.google.android.gms.internal;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// $FF: renamed from: com.google.android.gms.internal.ei
public final class class_484 {
   // $FF: renamed from: a java.util.concurrent.ThreadFactory
   private static final ThreadFactory field_1373 = new class_482();
   // $FF: renamed from: b java.util.concurrent.ThreadPoolExecutor
   private static final ThreadPoolExecutor field_1374;

   static {
      field_1374 = new ThreadPoolExecutor(0, 10, 65L, TimeUnit.SECONDS, new SynchronousQueue(true), field_1373);
   }

   // $FF: renamed from: a (java.lang.Runnable) void
   public static void method_1677(Runnable var0) {
      try {
         field_1374.execute(new class_483(var0));
      } catch (RejectedExecutionException var1) {
         class_467.method_1607("Too many background threads already running. Aborting task.", var1);
      }
   }
}
