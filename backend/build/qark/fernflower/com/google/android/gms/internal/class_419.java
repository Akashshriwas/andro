package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

// $FF: renamed from: com.google.android.gms.internal.cq
public abstract class class_419 extends Binder implements class_49 {
   public class_419() {
      this.attachInterface(this, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
   }

   // $FF: renamed from: a (android.os.IBinder) com.google.android.gms.internal.cp
   public static class_49 method_1436(IBinder var0) {
      if (var0 == null) {
         return null;
      } else {
         IInterface var1 = var0.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
         return (class_49)(var1 != null && var1 instanceof class_49 ? (class_49)var1 : new class_418(var0));
      }
   }

   public IBinder asBinder() {
      return this;
   }

   public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) {
      Object var6 = null;
      Bundle var5 = null;
      switch(var1) {
      case 1:
         var2.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
         if (var2.readInt() != 0) {
            var5 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
         }

         this.a(var5);
         var3.writeNoException();
         return true;
      case 2:
         var2.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
         this.d();
         var3.writeNoException();
         return true;
      case 3:
         var2.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
         this.e();
         var3.writeNoException();
         return true;
      case 4:
         var2.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
         this.f();
         var3.writeNoException();
         return true;
      case 5:
         var2.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
         this.g();
         var3.writeNoException();
         return true;
      case 6:
         var2.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
         var5 = (Bundle)var6;
         if (var2.readInt() != 0) {
            var5 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
         }

         this.b(var5);
         var3.writeNoException();
         if (var5 != null) {
            var3.writeInt(1);
            var5.writeToParcel(var3, 1);
         } else {
            var3.writeInt(0);
         }

         return true;
      case 7:
         var2.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
         this.h();
         var3.writeNoException();
         return true;
      case 8:
         var2.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
         this.i();
         var3.writeNoException();
         return true;
      case 1598968902:
         var3.writeString("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
         return true;
      default:
         return super.onTransact(var1, var2, var3, var4);
      }
   }
}
