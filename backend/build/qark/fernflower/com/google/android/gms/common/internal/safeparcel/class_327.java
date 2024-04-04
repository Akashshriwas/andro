package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: com.google.android.gms.common.internal.safeparcel.a
public class class_327 {
   // $FF: renamed from: A (android.os.Parcel, int) android.os.Parcel[]
   public static Parcel[] method_1091(Parcel var0, int var1) {
      int var2 = method_1094(var0, var1);
      int var3 = var0.dataPosition();
      if (var2 == 0) {
         return null;
      } else {
         int var4 = var0.readInt();
         Parcel[] var7 = new Parcel[var4];

         for(var1 = 0; var1 < var4; ++var1) {
            int var5 = var0.readInt();
            if (var5 != 0) {
               int var6 = var0.dataPosition();
               Parcel var8 = Parcel.obtain();
               var8.appendFrom(var0, var6, var5);
               var7[var1] = var8;
               var0.setDataPosition(var5 + var6);
            } else {
               var7[var1] = null;
            }
         }

         var0.setDataPosition(var3 + var2);
         return var7;
      }
   }

   // $FF: renamed from: a (int) int
   public static int method_1092(int var0) {
      return '\uffff' & var0;
   }

   // $FF: renamed from: a (android.os.Parcel) int
   public static int method_1093(Parcel var0) {
      return var0.readInt();
   }

   // $FF: renamed from: a (android.os.Parcel, int) int
   public static int method_1094(Parcel var0, int var1) {
      return (var1 & -65536) != -65536 ? var1 >> 16 & '\uffff' : var0.readInt();
   }

   // $FF: renamed from: a (android.os.Parcel, int, android.os.Parcelable.Creator) android.os.Parcelable
   public static Parcelable method_1095(Parcel var0, int var1, Creator var2) {
      var1 = method_1094(var0, var1);
      int var3 = var0.dataPosition();
      if (var1 == 0) {
         return null;
      } else {
         Parcelable var4 = (Parcelable)var2.createFromParcel(var0);
         var0.setDataPosition(var1 + var3);
         return var4;
      }
   }

   // $FF: renamed from: a (android.os.Parcel, int, int) void
   private static void method_1096(Parcel var0, int var1, int var2) {
      var1 = method_1094(var0, var1);
      if (var1 != var2) {
         throw new class_330("Expected size " + var2 + " got " + var1 + " (0x" + Integer.toHexString(var1) + ")", var0);
      }
   }

   // $FF: renamed from: a (android.os.Parcel, int, int, int) void
   private static void method_1097(Parcel var0, int var1, int var2, int var3) {
      if (var2 != var3) {
         throw new class_330("Expected size " + var3 + " got " + var2 + " (0x" + Integer.toHexString(var2) + ")", var0);
      }
   }

   // $FF: renamed from: a (android.os.Parcel, int, java.util.List, java.lang.ClassLoader) void
   public static void method_1098(Parcel var0, int var1, List var2, ClassLoader var3) {
      var1 = method_1094(var0, var1);
      int var4 = var0.dataPosition();
      if (var1 != 0) {
         var0.readList(var2, var3);
         var0.setDataPosition(var1 + var4);
      }
   }

   // $FF: renamed from: b (android.os.Parcel) int
   public static int method_1099(Parcel var0) {
      int var2 = method_1093(var0);
      int var3 = method_1094(var0, var2);
      int var1 = var0.dataPosition();
      if (method_1092(var2) != 20293) {
         throw new class_330("Expected object header. Got 0x" + Integer.toHexString(var2), var0);
      } else {
         var2 = var1 + var3;
         if (var2 >= var1 && var2 <= var0.dataSize()) {
            return var2;
         } else {
            throw new class_330("Size read is invalid start=" + var1 + " end=" + var2, var0);
         }
      }
   }

   // $FF: renamed from: b (android.os.Parcel, int) void
   public static void method_1100(Parcel var0, int var1) {
      var0.setDataPosition(method_1094(var0, var1) + var0.dataPosition());
   }

   // $FF: renamed from: b (android.os.Parcel, int, android.os.Parcelable.Creator) java.lang.Object[]
   public static Object[] method_1101(Parcel var0, int var1, Creator var2) {
      var1 = method_1094(var0, var1);
      int var3 = var0.dataPosition();
      if (var1 == 0) {
         return null;
      } else {
         Object[] var4 = var0.createTypedArray(var2);
         var0.setDataPosition(var1 + var3);
         return var4;
      }
   }

   // $FF: renamed from: c (android.os.Parcel, int, android.os.Parcelable.Creator) java.util.ArrayList
   public static ArrayList method_1102(Parcel var0, int var1, Creator var2) {
      var1 = method_1094(var0, var1);
      int var3 = var0.dataPosition();
      if (var1 == 0) {
         return null;
      } else {
         ArrayList var4 = var0.createTypedArrayList(var2);
         var0.setDataPosition(var1 + var3);
         return var4;
      }
   }

   // $FF: renamed from: c (android.os.Parcel, int) boolean
   public static boolean method_1103(Parcel var0, int var1) {
      method_1096(var0, var1, 4);
      return var0.readInt() != 0;
   }

   // $FF: renamed from: d (android.os.Parcel, int) java.lang.Boolean
   public static Boolean method_1104(Parcel var0, int var1) {
      int var2 = method_1094(var0, var1);
      if (var2 == 0) {
         return null;
      } else {
         method_1097(var0, var1, var2, 4);
         boolean var3;
         if (var0.readInt() != 0) {
            var3 = true;
         } else {
            var3 = false;
         }

         return var3;
      }
   }

   // $FF: renamed from: e (android.os.Parcel, int) byte
   public static byte method_1105(Parcel var0, int var1) {
      method_1096(var0, var1, 4);
      return (byte)var0.readInt();
   }

   // $FF: renamed from: f (android.os.Parcel, int) short
   public static short method_1106(Parcel var0, int var1) {
      method_1096(var0, var1, 4);
      return (short)var0.readInt();
   }

   // $FF: renamed from: g (android.os.Parcel, int) int
   public static int method_1107(Parcel var0, int var1) {
      method_1096(var0, var1, 4);
      return var0.readInt();
   }

   // $FF: renamed from: h (android.os.Parcel, int) long
   public static long method_1108(Parcel var0, int var1) {
      method_1096(var0, var1, 8);
      return var0.readLong();
   }

   // $FF: renamed from: i (android.os.Parcel, int) java.math.BigInteger
   public static BigInteger method_1109(Parcel var0, int var1) {
      var1 = method_1094(var0, var1);
      int var2 = var0.dataPosition();
      if (var1 == 0) {
         return null;
      } else {
         byte[] var3 = var0.createByteArray();
         var0.setDataPosition(var1 + var2);
         return new BigInteger(var3);
      }
   }

   // $FF: renamed from: j (android.os.Parcel, int) float
   public static float method_1110(Parcel var0, int var1) {
      method_1096(var0, var1, 4);
      return var0.readFloat();
   }

   // $FF: renamed from: k (android.os.Parcel, int) double
   public static double method_1111(Parcel var0, int var1) {
      method_1096(var0, var1, 8);
      return var0.readDouble();
   }

   // $FF: renamed from: l (android.os.Parcel, int) java.math.BigDecimal
   public static BigDecimal method_1112(Parcel var0, int var1) {
      var1 = method_1094(var0, var1);
      int var2 = var0.dataPosition();
      if (var1 == 0) {
         return null;
      } else {
         byte[] var4 = var0.createByteArray();
         int var3 = var0.readInt();
         var0.setDataPosition(var1 + var2);
         return new BigDecimal(new BigInteger(var4), var3);
      }
   }

   // $FF: renamed from: m (android.os.Parcel, int) java.lang.String
   public static String method_1113(Parcel var0, int var1) {
      var1 = method_1094(var0, var1);
      int var2 = var0.dataPosition();
      if (var1 == 0) {
         return null;
      } else {
         String var3 = var0.readString();
         var0.setDataPosition(var1 + var2);
         return var3;
      }
   }

   // $FF: renamed from: n (android.os.Parcel, int) android.os.IBinder
   public static IBinder method_1114(Parcel var0, int var1) {
      var1 = method_1094(var0, var1);
      int var2 = var0.dataPosition();
      if (var1 == 0) {
         return null;
      } else {
         IBinder var3 = var0.readStrongBinder();
         var0.setDataPosition(var1 + var2);
         return var3;
      }
   }

   // $FF: renamed from: o (android.os.Parcel, int) android.os.Bundle
   public static Bundle method_1115(Parcel var0, int var1) {
      var1 = method_1094(var0, var1);
      int var2 = var0.dataPosition();
      if (var1 == 0) {
         return null;
      } else {
         Bundle var3 = var0.readBundle();
         var0.setDataPosition(var1 + var2);
         return var3;
      }
   }

   // $FF: renamed from: p (android.os.Parcel, int) byte[]
   public static byte[] method_1116(Parcel var0, int var1) {
      var1 = method_1094(var0, var1);
      int var2 = var0.dataPosition();
      if (var1 == 0) {
         return null;
      } else {
         byte[] var3 = var0.createByteArray();
         var0.setDataPosition(var1 + var2);
         return var3;
      }
   }

   // $FF: renamed from: q (android.os.Parcel, int) boolean[]
   public static boolean[] method_1117(Parcel var0, int var1) {
      var1 = method_1094(var0, var1);
      int var2 = var0.dataPosition();
      if (var1 == 0) {
         return null;
      } else {
         boolean[] var3 = var0.createBooleanArray();
         var0.setDataPosition(var1 + var2);
         return var3;
      }
   }

   // $FF: renamed from: r (android.os.Parcel, int) int[]
   public static int[] method_1118(Parcel var0, int var1) {
      var1 = method_1094(var0, var1);
      int var2 = var0.dataPosition();
      if (var1 == 0) {
         return null;
      } else {
         int[] var3 = var0.createIntArray();
         var0.setDataPosition(var1 + var2);
         return var3;
      }
   }

   // $FF: renamed from: s (android.os.Parcel, int) long[]
   public static long[] method_1119(Parcel var0, int var1) {
      var1 = method_1094(var0, var1);
      int var2 = var0.dataPosition();
      if (var1 == 0) {
         return null;
      } else {
         long[] var3 = var0.createLongArray();
         var0.setDataPosition(var1 + var2);
         return var3;
      }
   }

   // $FF: renamed from: t (android.os.Parcel, int) java.math.BigInteger[]
   public static BigInteger[] method_1120(Parcel var0, int var1) {
      int var2 = method_1094(var0, var1);
      int var3 = var0.dataPosition();
      if (var2 == 0) {
         return null;
      } else {
         int var4 = var0.readInt();
         BigInteger[] var5 = new BigInteger[var4];

         for(var1 = 0; var1 < var4; ++var1) {
            var5[var1] = new BigInteger(var0.createByteArray());
         }

         var0.setDataPosition(var3 + var2);
         return var5;
      }
   }

   // $FF: renamed from: u (android.os.Parcel, int) float[]
   public static float[] method_1121(Parcel var0, int var1) {
      var1 = method_1094(var0, var1);
      int var2 = var0.dataPosition();
      if (var1 == 0) {
         return null;
      } else {
         float[] var3 = var0.createFloatArray();
         var0.setDataPosition(var1 + var2);
         return var3;
      }
   }

   // $FF: renamed from: v (android.os.Parcel, int) double[]
   public static double[] method_1122(Parcel var0, int var1) {
      var1 = method_1094(var0, var1);
      int var2 = var0.dataPosition();
      if (var1 == 0) {
         return null;
      } else {
         double[] var3 = var0.createDoubleArray();
         var0.setDataPosition(var1 + var2);
         return var3;
      }
   }

   // $FF: renamed from: w (android.os.Parcel, int) java.math.BigDecimal[]
   public static BigDecimal[] method_1123(Parcel var0, int var1) {
      int var2 = method_1094(var0, var1);
      int var3 = var0.dataPosition();
      if (var2 == 0) {
         return null;
      } else {
         int var4 = var0.readInt();
         BigDecimal[] var6 = new BigDecimal[var4];

         for(var1 = 0; var1 < var4; ++var1) {
            byte[] var7 = var0.createByteArray();
            int var5 = var0.readInt();
            var6[var1] = new BigDecimal(new BigInteger(var7), var5);
         }

         var0.setDataPosition(var3 + var2);
         return var6;
      }
   }

   // $FF: renamed from: x (android.os.Parcel, int) java.lang.String[]
   public static String[] method_1124(Parcel var0, int var1) {
      var1 = method_1094(var0, var1);
      int var2 = var0.dataPosition();
      if (var1 == 0) {
         return null;
      } else {
         String[] var3 = var0.createStringArray();
         var0.setDataPosition(var1 + var2);
         return var3;
      }
   }

   // $FF: renamed from: y (android.os.Parcel, int) java.util.ArrayList
   public static ArrayList method_1125(Parcel var0, int var1) {
      var1 = method_1094(var0, var1);
      int var2 = var0.dataPosition();
      if (var1 == 0) {
         return null;
      } else {
         ArrayList var3 = var0.createStringArrayList();
         var0.setDataPosition(var1 + var2);
         return var3;
      }
   }

   // $FF: renamed from: z (android.os.Parcel, int) android.os.Parcel
   public static Parcel method_1126(Parcel var0, int var1) {
      var1 = method_1094(var0, var1);
      int var2 = var0.dataPosition();
      if (var1 == 0) {
         return null;
      } else {
         Parcel var3 = Parcel.obtain();
         var3.appendFrom(var0, var2, var1);
         var0.setDataPosition(var1 + var2);
         return var3;
      }
   }
}
