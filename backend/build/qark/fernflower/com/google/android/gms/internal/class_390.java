package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

// $FF: renamed from: com.google.android.gms.internal.js
class class_390 implements class_47 {
   // $FF: renamed from: a android.os.IBinder
   private IBinder field_1031;

   class_390(IBinder var1) {
      this.field_1031 = var1;
   }

   // $FF: renamed from: a () java.lang.String
   public String method_136() {
      Parcel var1 = Parcel.obtain();
      Parcel var2 = Parcel.obtain();

      String var3;
      try {
         var1.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
         this.field_1031.transact(1, var1, var2, 0);
         var2.readException();
         var3 = var2.readString();
      } finally {
         var2.recycle();
         var1.recycle();
      }

      return var3;
   }

   // $FF: renamed from: a (java.lang.String) java.lang.String
   public String method_137(String var1) {
      Parcel var2 = Parcel.obtain();
      Parcel var3 = Parcel.obtain();

      try {
         var2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
         var2.writeString(var1);
         this.field_1031.transact(3, var2, var3, 0);
         var3.readException();
         var1 = var3.readString();
      } finally {
         var3.recycle();
         var2.recycle();
      }

      return var1;
   }

   // $FF: renamed from: a (java.lang.String, boolean) void
   public void method_138(String var1, boolean var2) {
      byte var3 = 0;
      Parcel var4 = Parcel.obtain();
      Parcel var5 = Parcel.obtain();

      label80: {
         Throwable var10000;
         label85: {
            boolean var10001;
            try {
               var4.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
               var4.writeString(var1);
            } catch (Throwable var11) {
               var10000 = var11;
               var10001 = false;
               break label85;
            }

            if (var2) {
               var3 = 1;
            }

            label75:
            try {
               var4.writeInt(var3);
               this.field_1031.transact(4, var4, var5, 0);
               var5.readException();
               break label80;
            } catch (Throwable var10) {
               var10000 = var10;
               var10001 = false;
               break label75;
            }
         }

         Throwable var12 = var10000;
         var5.recycle();
         var4.recycle();
         throw var12;
      }

      var5.recycle();
      var4.recycle();
   }

   // $FF: renamed from: a (boolean) boolean
   public boolean method_139(boolean var1) {
      boolean var3 = true;
      Parcel var4 = Parcel.obtain();
      Parcel var5 = Parcel.obtain();

      int var13;
      label92: {
         Throwable var10000;
         label96: {
            boolean var10001;
            try {
               var4.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               break label96;
            }

            byte var2;
            if (var1) {
               var2 = 1;
            } else {
               var2 = 0;
            }

            label87:
            try {
               var4.writeInt(var2);
               this.field_1031.transact(2, var4, var5, 0);
               var5.readException();
               var13 = var5.readInt();
               break label92;
            } catch (Throwable var11) {
               var10000 = var11;
               var10001 = false;
               break label87;
            }
         }

         Throwable var6 = var10000;
         var5.recycle();
         var4.recycle();
         throw var6;
      }

      if (var13 != 0) {
         var1 = var3;
      } else {
         var1 = false;
      }

      var5.recycle();
      var4.recycle();
      return var1;
   }

   public IBinder asBinder() {
      return this.field_1031;
   }
}
