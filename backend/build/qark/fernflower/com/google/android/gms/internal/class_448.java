package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

// $FF: renamed from: com.google.android.gms.internal.dr
class class_448 implements class_53 {
   // $FF: renamed from: a android.os.IBinder
   private IBinder field_1207;

   class_448(IBinder var1) {
      this.field_1207 = var1;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.bz) com.google.android.gms.internal.cb
   public class_434 method_153(class_433 var1) {
      Parcel var2 = Parcel.obtain();
      Parcel var3 = Parcel.obtain();

      class_434 var25;
      label196: {
         Throwable var10000;
         label200: {
            boolean var10001;
            try {
               var2.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break label200;
            }

            if (var1 != null) {
               try {
                  var2.writeInt(1);
                  var1.writeToParcel(var2, 0);
               } catch (Throwable var22) {
                  var10000 = var22;
                  var10001 = false;
                  break label200;
               }
            } else {
               try {
                  var2.writeInt(0);
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label200;
               }
            }

            try {
               this.field_1207.transact(1, var2, var3, 0);
               var3.readException();
               if (var3.readInt() != 0) {
                  var25 = class_434.field_1168.method_1495(var3);
                  break label196;
               }
            } catch (Throwable var20) {
               var10000 = var20;
               var10001 = false;
               break label200;
            }

            var25 = null;
            break label196;
         }

         Throwable var24 = var10000;
         var3.recycle();
         var2.recycle();
         throw var24;
      }

      var3.recycle();
      var2.recycle();
      return var25;
   }

   public IBinder asBinder() {
      return this.field_1207;
   }
}
