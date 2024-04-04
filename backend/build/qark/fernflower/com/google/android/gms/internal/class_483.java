package com.google.android.gms.internal;

import android.os.Process;

// $FF: renamed from: com.google.android.gms.internal.ej
final class class_483 implements Runnable {
   // $FF: renamed from: a java.lang.Runnable
   // $FF: synthetic field
   final Runnable field_1372;

   class_483(Runnable var1) {
      this.field_1372 = var1;
   }

   public void run() {
      Process.setThreadPriority(10);
      this.field_1372.run();
   }
}
