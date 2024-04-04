package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

// $FF: renamed from: com.google.android.gms.internal.gq
class class_301 implements class_39 {
   // $FF: renamed from: a android.os.IBinder
   private IBinder field_846;

   class_301(IBinder var1) {
      this.field_846 = var1;
   }

   // $FF: renamed from: a (int, android.os.IBinder, android.os.Bundle) void
   public void method_122(int var1, IBinder var2, Bundle var3) {
      Parcel var4 = Parcel.obtain();
      Parcel var5 = Parcel.obtain();

      label166: {
         Throwable var10000;
         label170: {
            boolean var10001;
            try {
               var4.writeInterfaceToken("com.google.android.gms.common.internal.IGmsCallbacks");
               var4.writeInt(var1);
               var4.writeStrongBinder(var2);
            } catch (Throwable var25) {
               var10000 = var25;
               var10001 = false;
               break label170;
            }

            if (var3 != null) {
               try {
                  var4.writeInt(1);
                  var3.writeToParcel(var4, 0);
               } catch (Throwable var24) {
                  var10000 = var24;
                  var10001 = false;
                  break label170;
               }
            } else {
               try {
                  var4.writeInt(0);
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label170;
               }
            }

            label156:
            try {
               this.field_846.transact(1, var4, var5, 0);
               var5.readException();
               break label166;
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label156;
            }
         }

         Throwable var26 = var10000;
         var5.recycle();
         var4.recycle();
         throw var26;
      }

      var5.recycle();
      var4.recycle();
   }

   public IBinder asBinder() {
      return this.field_846;
   }
}
