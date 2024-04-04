package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

// $FF: renamed from: com.google.android.gms.internal.jx
class class_394 implements Runnable {
   // $FF: renamed from: a com.google.android.gms.internal.ju
   // $FF: synthetic field
   final class_389 field_1046;
   // $FF: renamed from: b com.google.android.gms.internal.jw
   // $FF: synthetic field
   final class_395 field_1047;
   // $FF: renamed from: c java.lang.ref.WeakReference
   private final WeakReference field_1048;

   class_394(class_395 var1, class_389 var2) {
      this.field_1047 = var1;
      this.field_1046 = var2;
      this.field_1048 = new WeakReference(this.field_1046);
   }

   public void run() {
      class_395.method_1351(this.field_1047, false);
      class_389 var1 = (class_389)this.field_1048.get();
      if (var1 != null) {
         var1.method_1329(class_395.method_1350(this.field_1047));
      }

   }
}
