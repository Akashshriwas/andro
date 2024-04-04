package com.google.android.gms.internal;

import java.util.concurrent.BlockingQueue;

// $FF: renamed from: com.google.android.gms.internal.im
public class class_386 {
   // $FF: renamed from: a int
   private static int field_1025 = 10000;
   // $FF: renamed from: b int
   private static int field_1026 = 1000;
   // $FF: renamed from: c java.util.concurrent.BlockingQueue
   private final BlockingQueue field_1027;

   // $FF: renamed from: a (java.lang.String, java.lang.String, java.lang.String) void
   public void method_1315(String var1, String var2, String var3) {
      this.field_1027.offer(new class_385(this, var1, var2, var3));
   }
}
