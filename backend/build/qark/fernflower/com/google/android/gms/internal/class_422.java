package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.class_43;

// $FF: renamed from: com.google.android.gms.internal.cv
class class_422 implements class_50 {
   // $FF: renamed from: a android.os.IBinder
   private IBinder field_1124;

   class_422(IBinder var1) {
      this.field_1124 = var1;
   }

   // $FF: renamed from: a (com.google.android.gms.a.a) android.os.IBinder
   public IBinder method_149(class_43 var1) {
      Parcel var2 = Parcel.obtain();
      Parcel var3 = Parcel.obtain();

      IBinder var16;
      label116: {
         Throwable var10000;
         label120: {
            boolean var10001;
            try {
               var2.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break label120;
            }

            if (var1 != null) {
               try {
                  var16 = var1.asBinder();
               } catch (Throwable var14) {
                  var10000 = var14;
                  var10001 = false;
                  break label120;
               }
            } else {
               var16 = null;
            }

            label108:
            try {
               var2.writeStrongBinder(var16);
               this.field_1124.transact(1, var2, var3, 0);
               var3.readException();
               var16 = var3.readStrongBinder();
               break label116;
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label108;
            }
         }

         Throwable var17 = var10000;
         var3.recycle();
         var2.recycle();
         throw var17;
      }

      var3.recycle();
      var2.recycle();
      return var16;
   }

   public IBinder asBinder() {
      return this.field_1124;
   }
}
