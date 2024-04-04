package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

// $FF: renamed from: com.google.android.gms.internal.ck
class class_417 implements Runnable {
   // $FF: renamed from: a com.google.android.gms.internal.ci
   // $FF: synthetic field
   final class_440 field_1109;
   // $FF: renamed from: b com.google.android.gms.internal.cj
   // $FF: synthetic field
   final class_439 field_1110;
   // $FF: renamed from: c java.lang.ref.WeakReference
   private final WeakReference field_1111;

   class_417(class_439 var1, class_440 var2) {
      this.field_1110 = var1;
      this.field_1109 = var2;
      this.field_1111 = new WeakReference(this.field_1109);
   }

   public void run() {
      class_440 var1 = (class_440)this.field_1111.get();
      if (!class_439.method_1475(this.field_1110) && var1 != null) {
         var1.method_1490();
         this.field_1110.method_1477();
      }

   }
}
