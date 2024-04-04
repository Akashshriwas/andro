package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

// $FF: renamed from: com.google.android.gms.internal.c
public abstract class class_392 extends Binder implements class_82 {
   public class_392() {
      this.attachInterface(this, "com.google.android.gms.ads.internal.client.IAdListener");
   }

   // $FF: renamed from: a (android.os.IBinder) com.google.android.gms.internal.b
   public static class_82 method_1331(IBinder var0) {
      if (var0 == null) {
         return null;
      } else {
         IInterface var1 = var0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
         return (class_82)(var1 != null && var1 instanceof class_82 ? (class_82)var1 : new class_663(var0));
      }
   }

   public IBinder asBinder() {
      return this;
   }

   public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) {
      switch(var1) {
      case 1:
         var2.enforceInterface("com.google.android.gms.ads.internal.client.IAdListener");
         this.a();
         var3.writeNoException();
         return true;
      case 2:
         var2.enforceInterface("com.google.android.gms.ads.internal.client.IAdListener");
         this.a(var2.readInt());
         var3.writeNoException();
         return true;
      case 3:
         var2.enforceInterface("com.google.android.gms.ads.internal.client.IAdListener");
         this.b();
         var3.writeNoException();
         return true;
      case 4:
         var2.enforceInterface("com.google.android.gms.ads.internal.client.IAdListener");
         this.c();
         var3.writeNoException();
         return true;
      case 5:
         var2.enforceInterface("com.google.android.gms.ads.internal.client.IAdListener");
         this.d();
         var3.writeNoException();
         return true;
      case 1598968902:
         var3.writeString("com.google.android.gms.ads.internal.client.IAdListener");
         return true;
      default:
         return super.onTransact(var1, var2, var3, var4);
      }
   }
}
