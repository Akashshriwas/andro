package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

// $FF: renamed from: com.google.android.gms.common.internal.safeparcel.c
public class class_333 {
   // $FF: renamed from: a (android.os.Parcel) int
   public static int method_1135(Parcel var0) {
      return method_1156(var0, 20293);
   }

   // $FF: renamed from: a (android.os.Parcel, int) void
   public static void method_1136(Parcel var0, int var1) {
      method_1159(var0, var1);
   }

   // $FF: renamed from: a (android.os.Parcel, int, byte) void
   public static void method_1137(Parcel var0, int var1, byte var2) {
      method_1157(var0, var1, 4);
      var0.writeInt(var2);
   }

   // $FF: renamed from: a (android.os.Parcel, int, double) void
   public static void method_1138(Parcel var0, int var1, double var2) {
      method_1157(var0, var1, 8);
      var0.writeDouble(var2);
   }

   // $FF: renamed from: a (android.os.Parcel, int, float) void
   public static void method_1139(Parcel var0, int var1, float var2) {
      method_1157(var0, var1, 4);
      var0.writeFloat(var2);
   }

   // $FF: renamed from: a (android.os.Parcel, int, int) void
   public static void method_1140(Parcel var0, int var1, int var2) {
      method_1157(var0, var1, 4);
      var0.writeInt(var2);
   }

   // $FF: renamed from: a (android.os.Parcel, int, long) void
   public static void method_1141(Parcel var0, int var1, long var2) {
      method_1157(var0, var1, 8);
      var0.writeLong(var2);
   }

   // $FF: renamed from: a (android.os.Parcel, int, android.os.Bundle, boolean) void
   public static void method_1142(Parcel var0, int var1, Bundle var2, boolean var3) {
      if (var2 == null) {
         if (var3) {
            method_1157(var0, var1, 0);
         }

      } else {
         var1 = method_1156(var0, var1);
         var0.writeBundle(var2);
         method_1159(var0, var1);
      }
   }

   // $FF: renamed from: a (android.os.Parcel, int, android.os.IBinder, boolean) void
   public static void method_1143(Parcel var0, int var1, IBinder var2, boolean var3) {
      if (var2 == null) {
         if (var3) {
            method_1157(var0, var1, 0);
         }

      } else {
         var1 = method_1156(var0, var1);
         var0.writeStrongBinder(var2);
         method_1159(var0, var1);
      }
   }

   // $FF: renamed from: a (android.os.Parcel, int, android.os.Parcel, boolean) void
   public static void method_1144(Parcel var0, int var1, Parcel var2, boolean var3) {
      if (var2 == null) {
         if (var3) {
            method_1157(var0, var1, 0);
         }

      } else {
         var1 = method_1156(var0, var1);
         var0.appendFrom(var2, 0, var2.dataSize());
         method_1159(var0, var1);
      }
   }

   // $FF: renamed from: a (android.os.Parcel, int, android.os.Parcelable, int, boolean) void
   public static void method_1145(Parcel var0, int var1, Parcelable var2, int var3, boolean var4) {
      if (var2 == null) {
         if (var4) {
            method_1157(var0, var1, 0);
         }

      } else {
         var1 = method_1156(var0, var1);
         var2.writeToParcel(var0, var3);
         method_1159(var0, var1);
      }
   }

   // $FF: renamed from: a (android.os.Parcel, int, java.lang.Boolean, boolean) void
   public static void method_1146(Parcel var0, int var1, Boolean var2, boolean var3) {
      byte var4 = 0;
      if (var2 == null) {
         if (var3) {
            method_1157(var0, var1, 0);
         }

      } else {
         method_1157(var0, var1, 4);
         byte var5 = var4;
         if (var2) {
            var5 = 1;
         }

         var0.writeInt(var5);
      }
   }

   // $FF: renamed from: a (android.os.Parcel, int, java.lang.String, boolean) void
   public static void method_1147(Parcel var0, int var1, String var2, boolean var3) {
      if (var2 == null) {
         if (var3) {
            method_1157(var0, var1, 0);
         }

      } else {
         var1 = method_1156(var0, var1);
         var0.writeString(var2);
         method_1159(var0, var1);
      }
   }

   // $FF: renamed from: a (android.os.Parcel, int, java.util.List, boolean) void
   public static void method_1148(Parcel var0, int var1, List var2, boolean var3) {
      if (var2 == null) {
         if (var3) {
            method_1157(var0, var1, 0);
         }

      } else {
         var1 = method_1156(var0, var1);
         var0.writeStringList(var2);
         method_1159(var0, var1);
      }
   }

   // $FF: renamed from: a (android.os.Parcel, int, short) void
   public static void method_1149(Parcel var0, int var1, short var2) {
      method_1157(var0, var1, 4);
      var0.writeInt(var2);
   }

   // $FF: renamed from: a (android.os.Parcel, int, boolean) void
   public static void method_1150(Parcel var0, int var1, boolean var2) {
      method_1157(var0, var1, 4);
      byte var3;
      if (var2) {
         var3 = 1;
      } else {
         var3 = 0;
      }

      var0.writeInt(var3);
   }

   // $FF: renamed from: a (android.os.Parcel, int, byte[], boolean) void
   public static void method_1151(Parcel var0, int var1, byte[] var2, boolean var3) {
      if (var2 == null) {
         if (var3) {
            method_1157(var0, var1, 0);
         }

      } else {
         var1 = method_1156(var0, var1);
         var0.writeByteArray(var2);
         method_1159(var0, var1);
      }
   }

   // $FF: renamed from: a (android.os.Parcel, int, float[], boolean) void
   public static void method_1152(Parcel var0, int var1, float[] var2, boolean var3) {
      if (var2 == null) {
         if (var3) {
            method_1157(var0, var1, 0);
         }

      } else {
         var1 = method_1156(var0, var1);
         var0.writeFloatArray(var2);
         method_1159(var0, var1);
      }
   }

   // $FF: renamed from: a (android.os.Parcel, int, android.os.Parcelable[], int, boolean) void
   public static void method_1153(Parcel var0, int var1, Parcelable[] var2, int var3, boolean var4) {
      if (var2 == null) {
         if (var4) {
            method_1157(var0, var1, 0);
         }

      } else {
         int var5 = method_1156(var0, var1);
         int var6 = var2.length;
         var0.writeInt(var6);

         for(var1 = 0; var1 < var6; ++var1) {
            Parcelable var7 = var2[var1];
            if (var7 == null) {
               var0.writeInt(0);
            } else {
               method_1155(var0, var7, var3);
            }
         }

         method_1159(var0, var5);
      }
   }

   // $FF: renamed from: a (android.os.Parcel, int, java.lang.String[], boolean) void
   public static void method_1154(Parcel var0, int var1, String[] var2, boolean var3) {
      if (var2 == null) {
         if (var3) {
            method_1157(var0, var1, 0);
         }

      } else {
         var1 = method_1156(var0, var1);
         var0.writeStringArray(var2);
         method_1159(var0, var1);
      }
   }

   // $FF: renamed from: a (android.os.Parcel, android.os.Parcelable, int) void
   private static void method_1155(Parcel var0, Parcelable var1, int var2) {
      int var3 = var0.dataPosition();
      var0.writeInt(1);
      int var4 = var0.dataPosition();
      var1.writeToParcel(var0, var2);
      var2 = var0.dataPosition();
      var0.setDataPosition(var3);
      var0.writeInt(var2 - var4);
      var0.setDataPosition(var2);
   }

   // $FF: renamed from: b (android.os.Parcel, int) int
   private static int method_1156(Parcel var0, int var1) {
      var0.writeInt(-65536 | var1);
      var0.writeInt(0);
      return var0.dataPosition();
   }

   // $FF: renamed from: b (android.os.Parcel, int, int) void
   private static void method_1157(Parcel var0, int var1, int var2) {
      if (var2 >= 65535) {
         var0.writeInt(-65536 | var1);
         var0.writeInt(var2);
      } else {
         var0.writeInt(var2 << 16 | var1);
      }
   }

   // $FF: renamed from: b (android.os.Parcel, int, java.util.List, boolean) void
   public static void method_1158(Parcel var0, int var1, List var2, boolean var3) {
      if (var2 == null) {
         if (var3) {
            method_1157(var0, var1, 0);
         }

      } else {
         int var4 = method_1156(var0, var1);
         int var5 = var2.size();
         var0.writeInt(var5);

         for(var1 = 0; var1 < var5; ++var1) {
            Parcelable var6 = (Parcelable)var2.get(var1);
            if (var6 == null) {
               var0.writeInt(0);
            } else {
               method_1155(var0, var6, 0);
            }
         }

         method_1159(var0, var4);
      }
   }

   // $FF: renamed from: c (android.os.Parcel, int) void
   private static void method_1159(Parcel var0, int var1) {
      int var2 = var0.dataPosition();
      var0.setDataPosition(var1 - 4);
      var0.writeInt(var2 - var1);
      var0.setDataPosition(var2);
   }

   // $FF: renamed from: c (android.os.Parcel, int, java.util.List, boolean) void
   public static void method_1160(Parcel var0, int var1, List var2, boolean var3) {
      if (var2 == null) {
         if (var3) {
            method_1157(var0, var1, 0);
         }

      } else {
         var1 = method_1156(var0, var1);
         var0.writeList(var2);
         method_1159(var0, var1);
      }
   }
}
