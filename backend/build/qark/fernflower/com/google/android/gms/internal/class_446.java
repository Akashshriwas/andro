package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

// $FF: renamed from: com.google.android.gms.internal.dq
public abstract class class_446 extends Binder implements class_53 {
   public class_446() {
      this.attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
   }

   // $FF: renamed from: a (android.os.IBinder) com.google.android.gms.internal.dp
   public static class_53 method_1500(IBinder var0) {
      if (var0 == null) {
         return null;
      } else {
         IInterface var1 = var0.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
         return (class_53)(var1 != null && var1 instanceof class_53 ? (class_53)var1 : new class_448(var0));
      }
   }

   public IBinder asBinder() {
      return this;
   }

   public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) {
      switch(var1) {
      case 1:
         var2.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
         class_433 var5;
         if (var2.readInt() != 0) {
            var5 = class_433.field_1156.method_1498(var2);
         } else {
            var5 = null;
         }

         class_434 var6 = this.a(var5);
         var3.writeNoException();
         if (var6 != null) {
            var3.writeInt(1);
            var6.writeToParcel(var3, 1);
         } else {
            var3.writeInt(0);
         }

         return true;
      case 1598968902:
         var3.writeString("com.google.android.gms.ads.internal.request.IAdRequestService");
         return true;
      default:
         return super.onTransact(var1, var2, var3, var4);
      }
   }
}
