package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;

// $FF: renamed from: com.google.android.gms.internal.je
public final class class_400 {
   // $FF: renamed from: a byte[]
   private final byte[] field_1062;
   // $FF: renamed from: b int
   private final int field_1063;
   // $FF: renamed from: c int
   private int field_1064;

   private class_400(byte[] var1, int var2, int var3) {
      this.field_1062 = var1;
      this.field_1064 = var2;
      this.field_1063 = var2 + var3;
   }

   // $FF: renamed from: a (byte[]) com.google.android.gms.internal.je
   public static class_400 method_1361(byte[] var0) {
      return method_1362(var0, 0, var0.length);
   }

   // $FF: renamed from: a (byte[], int, int) com.google.android.gms.internal.je
   public static class_400 method_1362(byte[] var0, int var1, int var2) {
      return new class_400(var0, var1, var2);
   }

   // $FF: renamed from: b (int) int
   public static int method_1363(int var0) {
      return var0 >= 0 ? method_1371(var0) : 10;
   }

   // $FF: renamed from: b (int, int) int
   public static int method_1364(int var0, int var1) {
      return method_1369(var0) + method_1363(var1);
   }

   // $FF: renamed from: b (int, java.lang.String) int
   public static int method_1365(int var0, String var1) {
      return method_1369(var0) + method_1366(var1);
   }

   // $FF: renamed from: b (java.lang.String) int
   public static int method_1366(String var0) {
      int var1;
      int var2;
      try {
         byte[] var4 = var0.getBytes("UTF-8");
         var1 = method_1371(var4.length);
         var2 = var4.length;
      } catch (UnsupportedEncodingException var3) {
         throw new RuntimeException("UTF-8 not supported.");
      }

      return var2 + var1;
   }

   // $FF: renamed from: c (int, long) int
   public static int method_1367(int var0, long var1) {
      return method_1369(var0) + method_1368(var1);
   }

   // $FF: renamed from: c (long) int
   public static int method_1368(long var0) {
      return method_1370(method_1372(var0));
   }

   // $FF: renamed from: d (int) int
   public static int method_1369(int var0) {
      return method_1371(class_406.method_1399(var0, 0));
   }

   // $FF: renamed from: e (long) int
   public static int method_1370(long var0) {
      if ((-128L & var0) == 0L) {
         return 1;
      } else if ((-16384L & var0) == 0L) {
         return 2;
      } else if ((-2097152L & var0) == 0L) {
         return 3;
      } else if ((-268435456L & var0) == 0L) {
         return 4;
      } else if ((-34359738368L & var0) == 0L) {
         return 5;
      } else if ((-4398046511104L & var0) == 0L) {
         return 6;
      } else if ((-562949953421312L & var0) == 0L) {
         return 7;
      } else if ((-72057594037927936L & var0) == 0L) {
         return 8;
      } else {
         return (Long.MIN_VALUE & var0) == 0L ? 9 : 10;
      }
   }

   // $FF: renamed from: f (int) int
   public static int method_1371(int var0) {
      if ((var0 & -128) == 0) {
         return 1;
      } else if ((var0 & -16384) == 0) {
         return 2;
      } else if ((-2097152 & var0) == 0) {
         return 3;
      } else {
         return (-268435456 & var0) == 0 ? 4 : 5;
      }
   }

   // $FF: renamed from: f (long) long
   public static long method_1372(long var0) {
      return var0 << 1 ^ var0 >> 63;
   }

   // $FF: renamed from: a () int
   public int method_1373() {
      return this.field_1063 - this.field_1064;
   }

   // $FF: renamed from: a (byte) void
   public void method_1374(byte var1) {
      if (this.field_1064 == this.field_1063) {
         throw new class_410(this.field_1064, this.field_1063);
      } else {
         byte[] var3 = this.field_1062;
         int var2 = this.field_1064++;
         var3[var2] = var1;
      }
   }

   // $FF: renamed from: a (int) void
   public void method_1375(int var1) {
      if (var1 >= 0) {
         this.method_1389(var1);
      } else {
         this.method_1388((long)var1);
      }
   }

   // $FF: renamed from: a (int, int) void
   public void method_1376(int var1, int var2) {
      this.method_1387(var1, 0);
      this.method_1375(var2);
   }

   // $FF: renamed from: a (int, long) void
   public void method_1377(int var1, long var2) {
      this.method_1387(var1, 0);
      this.method_1379(var2);
   }

   // $FF: renamed from: a (int, java.lang.String) void
   public void method_1378(int var1, String var2) {
      this.method_1387(var1, 2);
      this.method_1380(var2);
   }

   // $FF: renamed from: a (long) void
   public void method_1379(long var1) {
      this.method_1388(var1);
   }

   // $FF: renamed from: a (java.lang.String) void
   public void method_1380(String var1) {
      byte[] var2 = var1.getBytes("UTF-8");
      this.method_1389(var2.length);
      this.method_1384(var2);
   }

   // $FF: renamed from: b () void
   public void method_1381() {
      if (this.method_1373() != 0) {
         throw new IllegalStateException("Did not write as much data as expected.");
      }
   }

   // $FF: renamed from: b (int, long) void
   public void method_1382(int var1, long var2) {
      this.method_1387(var1, 0);
      this.method_1383(var2);
   }

   // $FF: renamed from: b (long) void
   public void method_1383(long var1) {
      this.method_1388(method_1372(var1));
   }

   // $FF: renamed from: b (byte[]) void
   public void method_1384(byte[] var1) {
      this.method_1385(var1, 0, var1.length);
   }

   // $FF: renamed from: b (byte[], int, int) void
   public void method_1385(byte[] var1, int var2, int var3) {
      if (this.field_1063 - this.field_1064 >= var3) {
         System.arraycopy(var1, var2, this.field_1062, this.field_1064, var3);
         this.field_1064 += var3;
      } else {
         throw new class_410(this.field_1064, this.field_1063);
      }
   }

   // $FF: renamed from: c (int) void
   public void method_1386(int var1) {
      this.method_1374((byte)var1);
   }

   // $FF: renamed from: c (int, int) void
   public void method_1387(int var1, int var2) {
      this.method_1389(class_406.method_1399(var1, var2));
   }

   // $FF: renamed from: d (long) void
   public void method_1388(long var1) {
      while((-128L & var1) != 0L) {
         this.method_1386((int)var1 & 127 | 128);
         var1 >>>= 7;
      }

      this.method_1386((int)var1);
   }

   // $FF: renamed from: e (int) void
   public void method_1389(int var1) {
      while((var1 & -128) != 0) {
         this.method_1386(var1 & 127 | 128);
         var1 >>>= 7;
      }

      this.method_1386(var1);
   }
}
