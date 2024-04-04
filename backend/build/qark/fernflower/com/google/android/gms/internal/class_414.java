package com.google.android.gms.internal;

import java.io.IOException;

// $FF: renamed from: com.google.android.gms.internal.jo
class class_414 implements class_45 {
   // $FF: renamed from: a com.google.android.gms.internal.je
   private class_400 field_1100;
   // $FF: renamed from: b byte[]
   private byte[] field_1101;
   // $FF: renamed from: c int
   private final int field_1102;

   public class_414(int var1) {
      this.field_1102 = var1;
      this.method_130();
   }

   // $FF: renamed from: a () void
   public void method_130() {
      this.field_1101 = new byte[this.field_1102];
      this.field_1100 = class_400.method_1361(this.field_1101);
   }

   // $FF: renamed from: a (int, long) void
   public void method_131(int var1, long var2) {
      this.field_1100.method_1377(var1, var2);
   }

   // $FF: renamed from: a (int, java.lang.String) void
   public void method_132(int var1, String var2) {
      this.field_1100.method_1378(var1, var2);
   }

   // $FF: renamed from: b () byte[]
   public byte[] method_133() {
      int var1 = this.field_1100.method_1373();
      if (var1 < 0) {
         throw new IOException();
      } else if (var1 == 0) {
         return this.field_1101;
      } else {
         byte[] var2 = new byte[this.field_1101.length - var1];
         System.arraycopy(this.field_1101, 0, var2, 0, var2.length);
         return var2;
      }
   }
}
