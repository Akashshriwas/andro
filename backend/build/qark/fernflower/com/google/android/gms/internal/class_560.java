package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.class_375;
import com.google.android.gms.a.class_43;

// $FF: renamed from: com.google.android.gms.internal.bq
public abstract class class_560 extends Binder implements class_63 {
   public class_560() {
      this.attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
   }

   // $FF: renamed from: a (android.os.IBinder) com.google.android.gms.internal.bp
   public static class_63 method_1852(IBinder var0) {
      if (var0 == null) {
         return null;
      } else {
         IInterface var1 = var0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
         return (class_63)(var1 != null && var1 instanceof class_63 ? (class_63)var1 : new class_564(var0));
      }
   }

   public IBinder asBinder() {
      return this;
   }

   public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) {
      class_43 var6 = null;
      class_597 var5 = null;
      class_43 var7;
      class_607 var9;
      class_597 var10;
      switch(var1) {
      case 1:
         var2.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
         var7 = class_375.method_1292(var2.readStrongBinder());
         if (var2.readInt() != 0) {
            var9 = class_607.field_2019.method_1356(var2);
         } else {
            var9 = null;
         }

         if (var2.readInt() != 0) {
            var10 = class_597.field_1979.method_1359(var2);
         } else {
            var10 = null;
         }

         this.a(var7, var9, var10, var2.readString(), class_533.method_1809(var2.readStrongBinder()));
         var3.writeNoException();
         return true;
      case 2:
         var2.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
         var6 = this.a();
         var3.writeNoException();
         IBinder var8 = var5;
         if (var6 != null) {
            var8 = var6.asBinder();
         }

         var3.writeStrongBinder(var8);
         return true;
      case 3:
         var2.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
         var7 = class_375.method_1292(var2.readStrongBinder());
         var5 = var6;
         if (var2.readInt() != 0) {
            var5 = class_597.field_1979.method_1359(var2);
         }

         this.a(var7, var5, var2.readString(), class_533.method_1809(var2.readStrongBinder()));
         var3.writeNoException();
         return true;
      case 4:
         var2.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
         this.b();
         var3.writeNoException();
         return true;
      case 5:
         var2.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
         this.c();
         var3.writeNoException();
         return true;
      case 6:
         var2.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
         var7 = class_375.method_1292(var2.readStrongBinder());
         if (var2.readInt() != 0) {
            var9 = class_607.field_2019.method_1356(var2);
         } else {
            var9 = null;
         }

         if (var2.readInt() != 0) {
            var10 = class_597.field_1979.method_1359(var2);
         } else {
            var10 = null;
         }

         this.a(var7, var9, var10, var2.readString(), var2.readString(), class_533.method_1809(var2.readStrongBinder()));
         var3.writeNoException();
         return true;
      case 7:
         var2.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
         var6 = class_375.method_1292(var2.readStrongBinder());
         if (var2.readInt() != 0) {
            var5 = class_597.field_1979.method_1359(var2);
         } else {
            var5 = null;
         }

         this.a(var6, var5, var2.readString(), var2.readString(), class_533.method_1809(var2.readStrongBinder()));
         var3.writeNoException();
         return true;
      case 1598968902:
         var3.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
         return true;
      default:
         return super.onTransact(var1, var2, var3, var4);
      }
   }
}
