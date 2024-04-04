package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

// $FF: renamed from: com.google.android.gms.internal.gp
public abstract class class_302 extends Binder implements class_39 {
   public class_302() {
      this.attachInterface(this, "com.google.android.gms.common.internal.IGmsCallbacks");
   }

   // $FF: renamed from: a (android.os.IBinder) com.google.android.gms.internal.go
   public static class_39 method_1021(IBinder var0) {
      if (var0 == null) {
         return null;
      } else {
         IInterface var1 = var0.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
         return (class_39)(var1 != null && var1 instanceof class_39 ? (class_39)var1 : new class_301(var0));
      }
   }

   public IBinder asBinder() {
      return this;
   }

   public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) {
      switch(var1) {
      case 1:
         var2.enforceInterface("com.google.android.gms.common.internal.IGmsCallbacks");
         var1 = var2.readInt();
         IBinder var5 = var2.readStrongBinder();
         Bundle var6;
         if (var2.readInt() != 0) {
            var6 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
         } else {
            var6 = null;
         }

         this.a(var1, var5, var6);
         var3.writeNoException();
         return true;
      case 1598968902:
         var3.writeString("com.google.android.gms.common.internal.IGmsCallbacks");
         return true;
      default:
         return super.onTransact(var1, var2, var3, var4);
      }
   }
}
