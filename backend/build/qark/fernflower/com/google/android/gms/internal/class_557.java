package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

// $FF: renamed from: com.google.android.gms.internal.bn
public abstract class class_557 extends Binder implements class_62 {
   public class_557() {
      this.attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
   }

   // $FF: renamed from: a (android.os.IBinder) com.google.android.gms.internal.bl
   public static class_62 method_1849(IBinder var0) {
      if (var0 == null) {
         return null;
      } else {
         IInterface var1 = var0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
         return (class_62)(var1 != null && var1 instanceof class_62 ? (class_62)var1 : new class_562(var0));
      }
   }

   public IBinder asBinder() {
      return this;
   }

   public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) {
      switch(var1) {
      case 1:
         var2.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
         class_63 var5 = this.a(var2.readString());
         var3.writeNoException();
         IBinder var6;
         if (var5 != null) {
            var6 = var5.asBinder();
         } else {
            var6 = null;
         }

         var3.writeStrongBinder(var6);
         return true;
      case 1598968902:
         var3.writeString("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
         return true;
      default:
         return super.onTransact(var1, var2, var3, var4);
      }
   }
}
