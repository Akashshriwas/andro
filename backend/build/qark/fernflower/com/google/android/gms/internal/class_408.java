package com.google.android.gms.internal;

import java.io.IOException;

// $FF: renamed from: com.google.android.gms.internal.jg
public abstract class class_408 {
   // $FF: renamed from: f int
   protected int field_1091 = -1;

   // $FF: renamed from: a (com.google.android.gms.internal.jg, byte[], int, int) void
   public static final void method_1414(class_408 var0, byte[] var1, int var2, int var3) {
      try {
         class_400 var5 = class_400.method_1362(var1, var2, var3);
         var0.method_1417(var5);
         var5.method_1381();
      } catch (IOException var4) {
         throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", var4);
      }
   }

   // $FF: renamed from: a (com.google.android.gms.internal.jg) byte[]
   public static final byte[] method_1415(class_408 var0) {
      byte[] var1 = new byte[var0.method_1416()];
      method_1414(var0, var1, 0, var1.length);
      return var1;
   }

   // $FF: renamed from: a () int
   public int method_1416() {
      this.field_1091 = 0;
      return 0;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.je) void
   public abstract void method_1417(class_400 var1);

   public String toString() {
      return class_407.method_1400(this);
   }
}
