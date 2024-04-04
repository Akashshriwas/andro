package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.class_375;
import com.google.android.gms.a.class_43;

// $FF: renamed from: com.google.android.gms.internal.i
public abstract class class_595 extends Binder implements class_68 {
   // $FF: renamed from: a (android.os.IBinder) com.google.android.gms.internal.h
   public static class_68 method_1918(IBinder var0) {
      if (var0 == null) {
         return null;
      } else {
         IInterface var1 = var0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
         return (class_68)(var1 != null && var1 instanceof class_68 ? (class_68)var1 : new class_590(var0));
      }
   }

   public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) {
      switch(var1) {
      case 1:
         var2.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
         class_43 var6 = class_375.method_1292(var2.readStrongBinder());
         class_607 var5;
         if (var2.readInt() != 0) {
            var5 = class_607.field_2019.method_1356(var2);
         } else {
            var5 = null;
         }

         IBinder var7 = this.a(var6, var5, var2.readString(), class_557.method_1849(var2.readStrongBinder()), var2.readInt());
         var3.writeNoException();
         var3.writeStrongBinder(var7);
         return true;
      case 1598968902:
         var3.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
         return true;
      default:
         return super.onTransact(var1, var2, var3, var4);
      }
   }
}
