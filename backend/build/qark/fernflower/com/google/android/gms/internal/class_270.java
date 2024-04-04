package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

// $FF: renamed from: com.google.android.gms.internal.l
public abstract class class_270 extends Binder implements class_67 {
   public class_270() {
      this.attachInterface(this, "com.google.android.gms.ads.internal.client.IAppEventListener");
   }

   // $FF: renamed from: a (android.os.IBinder) com.google.android.gms.internal.k
   public static class_67 method_952(IBinder var0) {
      if (var0 == null) {
         return null;
      } else {
         IInterface var1 = var0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
         return (class_67)(var1 != null && var1 instanceof class_67 ? (class_67)var1 : new class_588(var0));
      }
   }

   public IBinder asBinder() {
      return this;
   }

   public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) {
      switch(var1) {
      case 1:
         var2.enforceInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
         this.a(var2.readString(), var2.readString());
         var3.writeNoException();
         return true;
      case 1598968902:
         var3.writeString("com.google.android.gms.ads.internal.client.IAppEventListener");
         return true;
      default:
         return super.onTransact(var1, var2, var3, var4);
      }
   }
}
