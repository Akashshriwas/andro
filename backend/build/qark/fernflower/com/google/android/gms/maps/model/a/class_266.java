package com.google.android.gms.maps.model.a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.Tile;

// $FF: renamed from: com.google.android.gms.maps.model.a.c
class class_266 implements class_4 {
   // $FF: renamed from: a android.os.IBinder
   private IBinder field_761;

   class_266(IBinder var1) {
      this.field_761 = var1;
   }

   // $FF: renamed from: a (int, int, int) com.google.android.gms.maps.model.Tile
   public Tile method_5(int var1, int var2, int var3) {
      Parcel var5 = Parcel.obtain();
      Parcel var6 = Parcel.obtain();
      boolean var8 = false;

      Tile var4;
      label36: {
         try {
            var8 = true;
            var5.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            var5.writeInt(var1);
            var5.writeInt(var2);
            var5.writeInt(var3);
            this.field_761.transact(1, var5, var6, 0);
            var6.readException();
            if (var6.readInt() != 0) {
               var4 = Tile.field_101.method_886(var6);
               var8 = false;
               break label36;
            }

            var8 = false;
         } finally {
            if (var8) {
               var6.recycle();
               var5.recycle();
            }
         }

         var4 = null;
      }

      var6.recycle();
      var5.recycle();
      return var4;
   }

   public IBinder asBinder() {
      return this.field_761;
   }
}
