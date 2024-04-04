package com.google.android.gms.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

// $FF: renamed from: com.google.android.gms.a.b
public abstract class class_375 extends Binder implements class_43 {
   public class_375() {
      this.attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
   }

   // $FF: renamed from: a (android.os.IBinder) com.google.android.gms.a.a
   public static class_43 method_1292(IBinder var0) {
      if (var0 == null) {
         return null;
      } else {
         IInterface var1 = var0.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
         return (class_43)(var1 != null && var1 instanceof class_43 ? (class_43)var1 : new class_383(var0));
      }
   }

   public IBinder asBinder() {
      return this;
   }

   public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) {
      switch(var1) {
      case 1598968902:
         var3.writeString("com.google.android.gms.dynamic.IObjectWrapper");
         return true;
      default:
         return super.onTransact(var1, var2, var3, var4);
      }
   }
}
