package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// $FF: renamed from: com.google.android.gms.internal.el
final class class_482 implements ThreadFactory {
   // $FF: renamed from: a java.util.concurrent.atomic.AtomicInteger
   private final AtomicInteger field_1371 = new AtomicInteger(1);

   public Thread newThread(Runnable var1) {
      return new Thread(var1, "AdWorker #" + this.field_1371.getAndIncrement());
   }
}
