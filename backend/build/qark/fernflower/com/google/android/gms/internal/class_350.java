package com.google.android.gms.internal;

// $FF: renamed from: com.google.android.gms.internal.ho
public final class class_350 {
   // $FF: renamed from: a (java.lang.StringBuilder, double[]) void
   public static void method_1218(StringBuilder var0, double[] var1) {
      int var3 = var1.length;

      for(int var2 = 0; var2 < var3; ++var2) {
         if (var2 != 0) {
            var0.append(",");
         }

         var0.append(Double.toString(var1[var2]));
      }

   }

   // $FF: renamed from: a (java.lang.StringBuilder, float[]) void
   public static void method_1219(StringBuilder var0, float[] var1) {
      int var3 = var1.length;

      for(int var2 = 0; var2 < var3; ++var2) {
         if (var2 != 0) {
            var0.append(",");
         }

         var0.append(Float.toString(var1[var2]));
      }

   }

   // $FF: renamed from: a (java.lang.StringBuilder, int[]) void
   public static void method_1220(StringBuilder var0, int[] var1) {
      int var3 = var1.length;

      for(int var2 = 0; var2 < var3; ++var2) {
         if (var2 != 0) {
            var0.append(",");
         }

         var0.append(Integer.toString(var1[var2]));
      }

   }

   // $FF: renamed from: a (java.lang.StringBuilder, long[]) void
   public static void method_1221(StringBuilder var0, long[] var1) {
      int var3 = var1.length;

      for(int var2 = 0; var2 < var3; ++var2) {
         if (var2 != 0) {
            var0.append(",");
         }

         var0.append(Long.toString(var1[var2]));
      }

   }

   // $FF: renamed from: a (java.lang.StringBuilder, java.lang.Object[]) void
   public static void method_1222(StringBuilder var0, Object[] var1) {
      int var3 = var1.length;

      for(int var2 = 0; var2 < var3; ++var2) {
         if (var2 != 0) {
            var0.append(",");
         }

         var0.append(var1[var2].toString());
      }

   }

   // $FF: renamed from: a (java.lang.StringBuilder, java.lang.String[]) void
   public static void method_1223(StringBuilder var0, String[] var1) {
      int var3 = var1.length;

      for(int var2 = 0; var2 < var3; ++var2) {
         if (var2 != 0) {
            var0.append(",");
         }

         var0.append("\"").append(var1[var2]).append("\"");
      }

   }

   // $FF: renamed from: a (java.lang.StringBuilder, boolean[]) void
   public static void method_1224(StringBuilder var0, boolean[] var1) {
      int var3 = var1.length;

      for(int var2 = 0; var2 < var3; ++var2) {
         if (var2 != 0) {
            var0.append(",");
         }

         var0.append(Boolean.toString(var1[var2]));
      }

   }
}
