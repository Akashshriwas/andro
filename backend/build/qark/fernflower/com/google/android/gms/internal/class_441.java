package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.class_327;
import com.google.android.gms.common.internal.safeparcel.class_330;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.internal.cg
public class class_441 implements Creator {
   // $FF: renamed from: a (com.google.android.gms.internal.bm, android.os.Parcel, int) void
   static void method_1491(class_556 var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.field_1882);
      class_333.method_1145(var1, 2, var0.field_1883, var2, false);
      class_333.method_1143(var1, 3, var0.method_1844(), false);
      class_333.method_1143(var1, 4, var0.method_1845(), false);
      class_333.method_1143(var1, 5, var0.method_1846(), false);
      class_333.method_1143(var1, 6, var0.method_1847(), false);
      class_333.method_1147(var1, 7, var0.field_1888, false);
      class_333.method_1150(var1, 8, var0.field_1889);
      class_333.method_1147(var1, 9, var0.field_1890, false);
      class_333.method_1143(var1, 10, var0.method_1848(), false);
      class_333.method_1140(var1, 11, var0.field_1892);
      class_333.method_1140(var1, 12, var0.field_1893);
      class_333.method_1147(var1, 13, var0.field_1894, false);
      class_333.method_1145(var1, 14, var0.field_1895, var2, false);
      class_333.method_1136(var1, var3);
   }

   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.internal.bm
   public class_556 method_1492(Parcel var1) {
      int var5 = class_327.method_1099(var1);
      int var4 = 0;
      class_559 var17 = null;
      IBinder var16 = null;
      IBinder var15 = null;
      IBinder var14 = null;
      IBinder var13 = null;
      String var12 = null;
      boolean var7 = false;
      String var11 = null;
      IBinder var10 = null;
      int var3 = 0;
      int var2 = 0;
      String var9 = null;
      class_424 var8 = null;

      while(var1.dataPosition() < var5) {
         int var6 = class_327.method_1093(var1);
         switch(class_327.method_1092(var6)) {
         case 1:
            var4 = class_327.method_1107(var1, var6);
            break;
         case 2:
            var17 = (class_559)class_327.method_1095(var1, var6, class_559.field_1897);
            break;
         case 3:
            var16 = class_327.method_1114(var1, var6);
            break;
         case 4:
            var15 = class_327.method_1114(var1, var6);
            break;
         case 5:
            var14 = class_327.method_1114(var1, var6);
            break;
         case 6:
            var13 = class_327.method_1114(var1, var6);
            break;
         case 7:
            var12 = class_327.method_1113(var1, var6);
            break;
         case 8:
            var7 = class_327.method_1103(var1, var6);
            break;
         case 9:
            var11 = class_327.method_1113(var1, var6);
            break;
         case 10:
            var10 = class_327.method_1114(var1, var6);
            break;
         case 11:
            var3 = class_327.method_1107(var1, var6);
            break;
         case 12:
            var2 = class_327.method_1107(var1, var6);
            break;
         case 13:
            var9 = class_327.method_1113(var1, var6);
            break;
         case 14:
            var8 = (class_424)class_327.method_1095(var1, var6, class_424.field_1125);
            break;
         default:
            class_327.method_1100(var1, var6);
         }
      }

      if (var1.dataPosition() != var5) {
         throw new class_330("Overread allowed size end=" + var5, var1);
      } else {
         return new class_556(var4, var17, var16, var15, var14, var13, var12, var7, var11, var10, var3, var2, var9, var8);
      }
   }

   // $FF: renamed from: a (int) com.google.android.gms.internal.bm[]
   public class_556[] method_1493(int var1) {
      return new class_556[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1492(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1493(var1);
   }
}
