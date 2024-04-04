package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.class_43;

// $FF: renamed from: com.google.android.gms.internal.f
public abstract class class_388 extends Binder implements class_81 {
   public class_388() {
      this.attachInterface(this, "com.google.android.gms.ads.internal.client.IAdManager");
   }

   // $FF: renamed from: a (android.os.IBinder) com.google.android.gms.internal.e
   public static class_81 method_1316(IBinder var0) {
      if (var0 == null) {
         return null;
      } else {
         IInterface var1 = var0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
         return (class_81)(var1 != null && var1 instanceof class_81 ? (class_81)var1 : new class_661(var0));
      }
   }

   public IBinder asBinder() {
      return this;
   }

   public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) {
      class_43 var8 = null;
      Object var9 = null;
      class_607 var7 = null;
      byte var5 = 0;
      boolean var6;
      byte var10;
      switch(var1) {
      case 1:
         var2.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
         var8 = this.a();
         var3.writeNoException();
         IBinder var12 = var7;
         if (var8 != null) {
            var12 = var8.asBinder();
         }

         var3.writeStrongBinder(var12);
         return true;
      case 2:
         var2.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
         this.b();
         var3.writeNoException();
         return true;
      case 3:
         var2.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
         var6 = this.c();
         var3.writeNoException();
         if (var6) {
            var10 = 1;
         } else {
            var10 = 0;
         }

         var3.writeInt(var10);
         return true;
      case 4:
         var2.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
         class_597 var13 = var8;
         if (var2.readInt() != 0) {
            var13 = class_597.field_1979.method_1359(var2);
         }

         var6 = this.a(var13);
         var3.writeNoException();
         var10 = var5;
         if (var6) {
            var10 = 1;
         }

         var3.writeInt(var10);
         return true;
      case 5:
         var2.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
         this.d();
         var3.writeNoException();
         return true;
      case 6:
         var2.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
         this.e();
         var3.writeNoException();
         return true;
      case 7:
         var2.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
         this.a(class_392.method_1331(var2.readStrongBinder()));
         var3.writeNoException();
         return true;
      case 8:
         var2.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
         this.a(class_270.method_952(var2.readStrongBinder()));
         var3.writeNoException();
         return true;
      case 9:
         var2.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
         this.f();
         var3.writeNoException();
         return true;
      case 10:
         var2.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
         this.g();
         var3.writeNoException();
         return true;
      case 11:
         var2.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
         this.h();
         var3.writeNoException();
         return true;
      case 12:
         var2.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
         class_607 var11 = this.i();
         var3.writeNoException();
         if (var11 != null) {
            var3.writeInt(1);
            var11.writeToParcel(var3, 1);
            return true;
         }

         var3.writeInt(0);
         return true;
      case 13:
         var2.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
         var7 = (class_607)var9;
         if (var2.readInt() != 0) {
            var7 = class_607.field_2019.method_1356(var2);
         }

         this.a(var7);
         var3.writeNoException();
         return true;
      case 1598968902:
         var3.writeString("com.google.android.gms.ads.internal.client.IAdManager");
         return true;
      default:
         return super.onTransact(var1, var2, var3, var4);
      }
   }
}
