package com.google.android.gms.internal;

// $FF: renamed from: com.google.android.gms.internal.jd
public class class_401 {
   // $FF: renamed from: a byte[]
   private final byte[] field_1065 = new byte[256];
   // $FF: renamed from: b int
   private int field_1066;
   // $FF: renamed from: c int
   private int field_1067;

   public class_401(byte[] var1) {
      int var3;
      for(var3 = 0; var3 < 256; ++var3) {
         this.field_1065[var3] = (byte)var3;
      }

      int var4 = 0;

      for(var3 = 0; var3 < 256; ++var3) {
         var4 = var4 + this.field_1065[var3] + var1[var3 % var1.length] & 255;
         byte var2 = this.field_1065[var3];
         this.field_1065[var3] = this.field_1065[var4];
         this.field_1065[var4] = var2;
      }

      this.field_1066 = 0;
      this.field_1067 = 0;
   }

   // $FF: renamed from: a (byte[]) void
   public void method_1390(byte[] var1) {
      int var5 = this.field_1066;
      int var4 = this.field_1067;

      for(int var3 = 0; var3 < var1.length; ++var3) {
         var5 = var5 + 1 & 255;
         var4 = var4 + this.field_1065[var5] & 255;
         byte var2 = this.field_1065[var5];
         this.field_1065[var5] = this.field_1065[var4];
         this.field_1065[var4] = var2;
         var1[var3] ^= this.field_1065[this.field_1065[var5] + this.field_1065[var4] & 255];
      }

      this.field_1066 = var5;
      this.field_1067 = var4;
   }
}
