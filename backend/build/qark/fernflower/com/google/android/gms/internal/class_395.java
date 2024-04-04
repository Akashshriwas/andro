package com.google.android.gms.internal;

// $FF: renamed from: com.google.android.gms.internal.jw
public final class class_395 {
   // $FF: renamed from: a java.lang.Runnable
   private final Runnable field_1049;
   // $FF: renamed from: b com.google.android.gms.internal.v
   private class_597 field_1050;
   // $FF: renamed from: c boolean
   private boolean field_1051 = false;

   public class_395(class_389 var1) {
      this.field_1049 = new class_394(this, var1);
   }

   // $FF: renamed from: a (com.google.android.gms.internal.jw) com.google.android.gms.internal.v
   // $FF: synthetic method
   static class_597 method_1350(class_395 var0) {
      return var0.field_1050;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.jw, boolean) boolean
   // $FF: synthetic method
   static boolean method_1351(class_395 var0, boolean var1) {
      var0.field_1051 = var1;
      return var1;
   }

   // $FF: renamed from: a () void
   public void method_1352() {
      class_468.field_1283.removeCallbacks(this.field_1049);
   }

   // $FF: renamed from: a (com.google.android.gms.internal.v) void
   public void method_1353(class_597 var1) {
      this.method_1354(var1, 60000L);
   }

   // $FF: renamed from: a (com.google.android.gms.internal.v, long) void
   public void method_1354(class_597 var1, long var2) {
      if (this.field_1051) {
         class_467.method_1610("An ad refresh is already scheduled.");
      } else {
         class_467.method_1608("Scheduling ad refresh " + var2 + " milliseconds from now.");
         this.field_1050 = var1;
         this.field_1051 = true;
         class_468.field_1283.postDelayed(this.field_1049, var2);
      }
   }
}
