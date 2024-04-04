package com.google.android.gms.internal;

// $FF: renamed from: com.google.android.gms.internal.cj
final class class_439 {
   // $FF: renamed from: a java.lang.Runnable
   private final Runnable field_1186;
   // $FF: renamed from: b boolean
   private volatile boolean field_1187 = false;

   public class_439(class_440 var1) {
      this.field_1186 = new class_417(this, var1);
   }

   // $FF: renamed from: a (com.google.android.gms.internal.cj) boolean
   // $FF: synthetic method
   static boolean method_1475(class_439 var0) {
      return var0.field_1187;
   }

   // $FF: renamed from: a () void
   public void method_1476() {
      this.field_1187 = true;
      class_468.field_1283.removeCallbacks(this.field_1186);
   }

   // $FF: renamed from: b () void
   public void method_1477() {
      class_468.field_1283.postDelayed(this.field_1186, 250L);
   }
}
