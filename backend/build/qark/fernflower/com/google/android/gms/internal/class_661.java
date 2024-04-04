package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.class_375;
import com.google.android.gms.a.class_43;

// $FF: renamed from: com.google.android.gms.internal.g
class class_661 implements class_81 {
   // $FF: renamed from: a android.os.IBinder
   private IBinder field_2229;

   class_661(IBinder var1) {
      this.field_2229 = var1;
   }

   // $FF: renamed from: a () com.google.android.gms.a.a
   public class_43 method_202() {
      Parcel var1 = Parcel.obtain();
      Parcel var2 = Parcel.obtain();

      class_43 var3;
      try {
         var1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
         this.field_2229.transact(1, var1, var2, 0);
         var2.readException();
         var3 = class_375.method_1292(var2.readStrongBinder());
      } finally {
         var2.recycle();
         var1.recycle();
      }

      return var3;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.b) void
   public void method_203(class_82 var1) {
      Parcel var2 = Parcel.obtain();
      Parcel var3 = Parcel.obtain();

      label116: {
         Throwable var10000;
         label120: {
            boolean var10001;
            try {
               var2.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break label120;
            }

            IBinder var16;
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
               this.field_2229.transact(7, var2, var3, 0);
               var3.readException();
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
   }

   // $FF: renamed from: a (com.google.android.gms.internal.k) void
   public void method_204(class_67 var1) {
      Parcel var2 = Parcel.obtain();
      Parcel var3 = Parcel.obtain();

      label116: {
         Throwable var10000;
         label120: {
            boolean var10001;
            try {
               var2.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break label120;
            }

            IBinder var16;
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
               this.field_2229.transact(8, var2, var3, 0);
               var3.readException();
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
   }

   // $FF: renamed from: a (com.google.android.gms.internal.x) void
   public void method_205(class_607 var1) {
      Parcel var2 = Parcel.obtain();
      Parcel var3 = Parcel.obtain();

      label166: {
         Throwable var10000;
         label170: {
            boolean var10001;
            try {
               var2.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
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
               this.field_2229.transact(13, var2, var3, 0);
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

   // $FF: renamed from: a (com.google.android.gms.internal.v) boolean
   public boolean method_206(class_597 var1) {
      boolean var3 = true;
      Parcel var4 = Parcel.obtain();
      Parcel var5 = Parcel.obtain();

      int var2;
      label186: {
         Throwable var10000;
         label190: {
            boolean var10001;
            try {
               var4.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            } catch (Throwable var25) {
               var10000 = var25;
               var10001 = false;
               break label190;
            }

            if (var1 != null) {
               try {
                  var4.writeInt(1);
                  var1.writeToParcel(var4, 0);
               } catch (Throwable var24) {
                  var10000 = var24;
                  var10001 = false;
                  break label190;
               }
            } else {
               try {
                  var4.writeInt(0);
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label190;
               }
            }

            label176:
            try {
               this.field_2229.transact(4, var4, var5, 0);
               var5.readException();
               var2 = var5.readInt();
               break label186;
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label176;
            }
         }

         Throwable var26 = var10000;
         var5.recycle();
         var4.recycle();
         throw var26;
      }

      if (var2 == 0) {
         var3 = false;
      }

      var5.recycle();
      var4.recycle();
      return var3;
   }

   public IBinder asBinder() {
      return this.field_2229;
   }

   // $FF: renamed from: b () void
   public void method_207() {
      Parcel var1 = Parcel.obtain();
      Parcel var2 = Parcel.obtain();

      try {
         var1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
         this.field_2229.transact(2, var1, var2, 0);
         var2.readException();
      } finally {
         var2.recycle();
         var1.recycle();
      }

   }

   // $FF: renamed from: c () boolean
   public boolean method_208() {
      boolean var2 = false;
      Parcel var3 = Parcel.obtain();
      Parcel var4 = Parcel.obtain();
      boolean var7 = false;

      int var1;
      try {
         var7 = true;
         var3.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
         this.field_2229.transact(3, var3, var4, 0);
         var4.readException();
         var1 = var4.readInt();
         var7 = false;
      } finally {
         if (var7) {
            var4.recycle();
            var3.recycle();
         }
      }

      if (var1 != 0) {
         var2 = true;
      }

      var4.recycle();
      var3.recycle();
      return var2;
   }

   // $FF: renamed from: d () void
   public void method_209() {
      Parcel var1 = Parcel.obtain();
      Parcel var2 = Parcel.obtain();

      try {
         var1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
         this.field_2229.transact(5, var1, var2, 0);
         var2.readException();
      } finally {
         var2.recycle();
         var1.recycle();
      }

   }

   // $FF: renamed from: e () void
   public void method_210() {
      Parcel var1 = Parcel.obtain();
      Parcel var2 = Parcel.obtain();

      try {
         var1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
         this.field_2229.transact(6, var1, var2, 0);
         var2.readException();
      } finally {
         var2.recycle();
         var1.recycle();
      }

   }

   // $FF: renamed from: f () void
   public void method_211() {
      Parcel var1 = Parcel.obtain();
      Parcel var2 = Parcel.obtain();

      try {
         var1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
         this.field_2229.transact(9, var1, var2, 0);
         var2.readException();
      } finally {
         var2.recycle();
         var1.recycle();
      }

   }

   // $FF: renamed from: g () void
   public void method_212() {
      Parcel var1 = Parcel.obtain();
      Parcel var2 = Parcel.obtain();

      try {
         var1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
         this.field_2229.transact(10, var1, var2, 0);
         var2.readException();
      } finally {
         var2.recycle();
         var1.recycle();
      }

   }

   // $FF: renamed from: h () void
   public void method_213() {
      Parcel var1 = Parcel.obtain();
      Parcel var2 = Parcel.obtain();

      try {
         var1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
         this.field_2229.transact(11, var1, var2, 0);
         var2.readException();
      } finally {
         var2.recycle();
         var1.recycle();
      }

   }

   // $FF: renamed from: i () com.google.android.gms.internal.x
   public class_607 method_214() {
      Parcel var2 = Parcel.obtain();
      Parcel var3 = Parcel.obtain();
      boolean var5 = false;

      class_607 var1;
      label36: {
         try {
            var5 = true;
            var2.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            this.field_2229.transact(12, var2, var3, 0);
            var3.readException();
            if (var3.readInt() != 0) {
               var1 = class_607.field_2019.method_1356(var3);
               var5 = false;
               break label36;
            }

            var5 = false;
         } finally {
            if (var5) {
               var3.recycle();
               var2.recycle();
            }
         }

         var1 = null;
      }

      var3.recycle();
      var2.recycle();
      return var1;
   }
}
