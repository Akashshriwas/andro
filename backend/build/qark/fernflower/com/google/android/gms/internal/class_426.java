package com.google.android.gms.internal;

// $FF: renamed from: com.google.android.gms.internal.ef
public abstract class class_426 {
   // $FF: renamed from: a java.lang.Runnable
   private final Runnable field_1132 = new class_481(this);
   // $FF: renamed from: b java.lang.Thread
   private volatile Thread field_1133;

   // $FF: renamed from: a (com.google.android.gms.internal.ef, java.lang.Thread) java.lang.Thread
   // $FF: synthetic method
   static Thread method_1452(class_426 var0, Thread var1) {
      var0.field_1133 = var1;
      return var1;
   }

   // $FF: renamed from: a () void
   public abstract void method_1453();

   // $FF: renamed from: b () void
   public abstract void method_1454();

   // $FF: renamed from: e () void
   public final void method_1455() {
      class_484.method_1677(this.field_1132);
   }

   // $FF: renamed from: f () void
   public final void method_1456() {
      this.method_1454();
      if (this.field_1133 != null) {
         this.field_1133.interrupt();
      }

   }
}
