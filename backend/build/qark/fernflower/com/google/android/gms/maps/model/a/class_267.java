package com.google.android.gms.maps.model.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.Tile;

// $FF: renamed from: com.google.android.gms.maps.model.a.b
public abstract class class_267 extends Binder implements class_4 {
   // $FF: renamed from: a (android.os.IBinder) com.google.android.gms.maps.model.a.a
   public static class_4 method_951(IBinder var0) {
      if (var0 == null) {
         return null;
      } else {
         IInterface var1 = var0.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
         return (class_4)(var1 != null && var1 instanceof class_4 ? (class_4)var1 : new class_266(var0));
      }
   }

   public IBinder asBinder() {
      return this;
   }

   public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) {
      switch(var1) {
      case 1:
         var2.enforceInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
         Tile var5 = this.a(var2.readInt(), var2.readInt(), var2.readInt());
         var3.writeNoException();
         if (var5 != null) {
            var3.writeInt(1);
            var5.writeToParcel(var3, 1);
            return true;
         }

         var3.writeInt(0);
         return true;
      case 1598968902:
         var3.writeString("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
         return true;
      default:
         return super.onTransact(var1, var2, var3, var4);
      }
   }
}
