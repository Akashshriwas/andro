package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

// $FF: renamed from: com.google.android.gms.internal.bt
public abstract class class_533 extends Binder implements class_64 {
   public class_533() {
      this.attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
   }

   // $FF: renamed from: a (android.os.IBinder) com.google.android.gms.internal.bs
   public static class_64 method_1809(IBinder var0) {
      if (var0 == null) {
         return null;
      } else {
         IInterface var1 = var0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
         return (class_64)(var1 != null && var1 instanceof class_64 ? (class_64)var1 : new class_563(var0));
      }
   }

   public IBinder asBinder() {
      return this;
   }

   public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) {
      switch(var1) {
      case 1:
         var2.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
         this.a();
         var3.writeNoException();
         return true;
      case 2:
         var2.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
         this.b();
         var3.writeNoException();
         return true;
      case 3:
         var2.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
         this.a(var2.readInt());
         var3.writeNoException();
         return true;
      case 4:
         var2.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
         this.c();
         var3.writeNoException();
         return true;
      case 5:
         var2.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
         this.d();
         var3.writeNoException();
         return true;
      case 6:
         var2.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
         this.e();
         var3.writeNoException();
         return true;
      case 1598968902:
         var3.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
         return true;
      default:
         return super.onTransact(var1, var2, var3, var4);
      }
   }
}
