package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

// $FF: renamed from: com.google.android.gms.internal.cr
class class_418 implements class_49 {
   // $FF: renamed from: a android.os.IBinder
   private IBinder field_1112;

   class_418(IBinder var1) {
      this.field_1112 = var1;
   }

   // $FF: renamed from: a (android.os.Bundle) void
   public void method_141(Bundle var1) {
      Parcel var2 = Parcel.obtain();
      Parcel var3 = Parcel.obtain();

      label166: {
         Throwable var10000;
         label170: {
            boolean var10001;
            try {
               var2.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break label170;
            }

            if (var1 != null) {
               try {
                  var2.writeInt(1);
                  var1.writeToParcel(var2, 0);
               } catch (Throwable var22) {
                  var10000 = var22;
                  var10001 = false;
                  break label170;
               }
            } else {
               try {
                  var2.writeInt(0);
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label170;
               }
            }

            label156:
            try {
               this.field_1112.transact(1, var2, var3, 0);
               var3.readException();
               break label166;
            } catch (Throwable var20) {
               var10000 = var20;
               var10001 = false;
               break label156;
            }
         }

         Throwable var24 = var10000;
         var3.recycle();
         var2.recycle();
         throw var24;
      }

      var3.recycle();
      var2.recycle();
   }

   public IBinder asBinder() {
      return this.field_1112;
   }

   // $FF: renamed from: b (android.os.Bundle) void
   public void method_142(Bundle var1) {
      Parcel var2 = Parcel.obtain();
      Parcel var3 = Parcel.obtain();

      label186: {
         Throwable var10000;
         label190: {
            boolean var10001;
            try {
               var2.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break label190;
            }

            if (var1 != null) {
               try {
                  var2.writeInt(1);
                  var1.writeToParcel(var2, 0);
               } catch (Throwable var22) {
                  var10000 = var22;
                  var10001 = false;
                  break label190;
               }
            } else {
               try {
                  var2.writeInt(0);
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label190;
               }
            }

            label176:
            try {
               this.field_1112.transact(6, var2, var3, 0);
               var3.readException();
               if (var3.readInt() != 0) {
                  var1.readFromParcel(var3);
               }
               break label186;
            } catch (Throwable var20) {
               var10000 = var20;
               var10001 = false;
               break label176;
            }
         }

         Throwable var24 = var10000;
         var3.recycle();
         var2.recycle();
         throw var24;
      }

      var3.recycle();
      var2.recycle();
   }

   // $FF: renamed from: d () void
   public void method_143() {
      Parcel var1 = Parcel.obtain();
      Parcel var2 = Parcel.obtain();

      try {
         var1.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
         this.field_1112.transact(2, var1, var2, 0);
         var2.readException();
      } finally {
         var2.recycle();
         var1.recycle();
      }

   }

   // $FF: renamed from: e () void
   public void method_144() {
      Parcel var1 = Parcel.obtain();
      Parcel var2 = Parcel.obtain();

      try {
         var1.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
         this.field_1112.transact(3, var1, var2, 0);
         var2.readException();
      } finally {
         var2.recycle();
         var1.recycle();
      }

   }

   // $FF: renamed from: f () void
   public void method_145() {
      Parcel var1 = Parcel.obtain();
      Parcel var2 = Parcel.obtain();

      try {
         var1.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
         this.field_1112.transact(4, var1, var2, 0);
         var2.readException();
      } finally {
         var2.recycle();
         var1.recycle();
      }

   }

   // $FF: renamed from: g () void
   public void method_146() {
      Parcel var1 = Parcel.obtain();
      Parcel var2 = Parcel.obtain();

      try {
         var1.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
         this.field_1112.transact(5, var1, var2, 0);
         var2.readException();
      } finally {
         var2.recycle();
         var1.recycle();
      }

   }

   // $FF: renamed from: h () void
   public void method_147() {
      Parcel var1 = Parcel.obtain();
      Parcel var2 = Parcel.obtain();

      try {
         var1.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
         this.field_1112.transact(7, var1, var2, 0);
         var2.readException();
      } finally {
         var2.recycle();
         var1.recycle();
      }

   }

   // $FF: renamed from: i () void
   public void method_148() {
      Parcel var1 = Parcel.obtain();
      Parcel var2 = Parcel.obtain();

      try {
         var1.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
         this.field_1112.transact(8, var1, var2, 0);
         var2.readException();
      } finally {
         var2.recycle();
         var1.recycle();
      }

   }
}
