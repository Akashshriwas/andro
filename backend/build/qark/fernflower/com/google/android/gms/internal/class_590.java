package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.class_43;

// $FF: renamed from: com.google.android.gms.internal.j
class class_590 implements class_68 {
   // $FF: renamed from: a android.os.IBinder
   private IBinder field_1966;

   class_590(IBinder var1) {
      this.field_1966 = var1;
   }

   // $FF: renamed from: a (com.google.android.gms.a.a, com.google.android.gms.internal.x, java.lang.String, com.google.android.gms.internal.bl, int) android.os.IBinder
   public IBinder method_185(class_43 var1, class_607 var2, String var3, class_62 var4, int var5) {
      Object var6 = null;
      Parcel var7 = Parcel.obtain();
      Parcel var8 = Parcel.obtain();

      IBinder var81;
      label527: {
         Throwable var10000;
         label531: {
            boolean var10001;
            try {
               var7.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            } catch (Throwable var80) {
               var10000 = var80;
               var10001 = false;
               break label531;
            }

            if (var1 != null) {
               try {
                  var81 = var1.asBinder();
               } catch (Throwable var79) {
                  var10000 = var79;
                  var10001 = false;
                  break label531;
               }
            } else {
               var81 = null;
            }

            try {
               var7.writeStrongBinder(var81);
            } catch (Throwable var78) {
               var10000 = var78;
               var10001 = false;
               break label531;
            }

            if (var2 != null) {
               try {
                  var7.writeInt(1);
                  var2.writeToParcel(var7, 0);
               } catch (Throwable var77) {
                  var10000 = var77;
                  var10001 = false;
                  break label531;
               }
            } else {
               try {
                  var7.writeInt(0);
               } catch (Throwable var76) {
                  var10000 = var76;
                  var10001 = false;
                  break label531;
               }
            }

            try {
               var7.writeString(var3);
            } catch (Throwable var75) {
               var10000 = var75;
               var10001 = false;
               break label531;
            }

            var81 = (IBinder)var6;
            if (var4 != null) {
               try {
                  var81 = var4.asBinder();
               } catch (Throwable var74) {
                  var10000 = var74;
                  var10001 = false;
                  break label531;
               }
            }

            label503:
            try {
               var7.writeStrongBinder(var81);
               var7.writeInt(var5);
               this.field_1966.transact(1, var7, var8, 0);
               var8.readException();
               var81 = var8.readStrongBinder();
               break label527;
            } catch (Throwable var73) {
               var10000 = var73;
               var10001 = false;
               break label503;
            }
         }

         Throwable var82 = var10000;
         var8.recycle();
         var7.recycle();
         throw var82;
      }

      var8.recycle();
      var7.recycle();
      return var81;
   }

   public IBinder asBinder() {
      return this.field_1966;
   }
}
