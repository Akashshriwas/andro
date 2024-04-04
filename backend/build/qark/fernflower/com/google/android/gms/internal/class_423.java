package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.class_375;

// $FF: renamed from: com.google.android.gms.internal.cu
public abstract class class_423 extends Binder implements class_50 {
   // $FF: renamed from: a (android.os.IBinder) com.google.android.gms.internal.cs
   public static class_50 method_1451(IBinder var0) {
      if (var0 == null) {
         return null;
      } else {
         IInterface var1 = var0.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
         return (class_50)(var1 != null && var1 instanceof class_50 ? (class_50)var1 : new class_422(var0));
      }
   }

   public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) {
      switch(var1) {
      case 1:
         var2.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
         IBinder var5 = this.a(class_375.method_1292(var2.readStrongBinder()));
         var3.writeNoException();
         var3.writeStrongBinder(var5);
         return true;
      case 1598968902:
         var3.writeString("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
         return true;
      default:
         return super.onTransact(var1, var2, var3, var4);
      }
   }
}
