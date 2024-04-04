package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.class_375;
import com.google.android.gms.a.class_43;

// $FF: renamed from: com.google.android.gms.internal.br
class class_564 implements class_63 {
   // $FF: renamed from: a android.os.IBinder
   private IBinder field_1910;

   class_564(IBinder var1) {
      this.field_1910 = var1;
   }

   // $FF: renamed from: a () com.google.android.gms.a.a
   public class_43 method_171() {
      Parcel var1 = Parcel.obtain();
      Parcel var2 = Parcel.obtain();

      class_43 var3;
      try {
         var1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
         this.field_1910.transact(2, var1, var2, 0);
         var2.readException();
         var3 = class_375.method_1292(var2.readStrongBinder());
      } finally {
         var2.recycle();
         var1.recycle();
      }

      return var3;
   }

   // $FF: renamed from: a (com.google.android.gms.a.a, com.google.android.gms.internal.v, java.lang.String, com.google.android.gms.internal.bs) void
   public void method_172(class_43 var1, class_597 var2, String var3, class_64 var4) {
      Object var5 = null;
      Parcel var6 = Parcel.obtain();
      Parcel var7 = Parcel.obtain();

      label527: {
         Throwable var10000;
         label531: {
            boolean var10001;
            try {
               var6.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            } catch (Throwable var79) {
               var10000 = var79;
               var10001 = false;
               break label531;
            }

            IBinder var80;
            if (var1 != null) {
               try {
                  var80 = var1.asBinder();
               } catch (Throwable var78) {
                  var10000 = var78;
                  var10001 = false;
                  break label531;
               }
            } else {
               var80 = null;
            }

            try {
               var6.writeStrongBinder(var80);
            } catch (Throwable var77) {
               var10000 = var77;
               var10001 = false;
               break label531;
            }

            if (var2 != null) {
               try {
                  var6.writeInt(1);
                  var2.writeToParcel(var6, 0);
               } catch (Throwable var76) {
                  var10000 = var76;
                  var10001 = false;
                  break label531;
               }
            } else {
               try {
                  var6.writeInt(0);
               } catch (Throwable var75) {
                  var10000 = var75;
                  var10001 = false;
                  break label531;
               }
            }

            try {
               var6.writeString(var3);
            } catch (Throwable var74) {
               var10000 = var74;
               var10001 = false;
               break label531;
            }

            var80 = (IBinder)var5;
            if (var4 != null) {
               try {
                  var80 = var4.asBinder();
               } catch (Throwable var73) {
                  var10000 = var73;
                  var10001 = false;
                  break label531;
               }
            }

            label503:
            try {
               var6.writeStrongBinder(var80);
               this.field_1910.transact(3, var6, var7, 0);
               var7.readException();
               break label527;
            } catch (Throwable var72) {
               var10000 = var72;
               var10001 = false;
               break label503;
            }
         }

         Throwable var81 = var10000;
         var7.recycle();
         var6.recycle();
         throw var81;
      }

      var7.recycle();
      var6.recycle();
   }

   // $FF: renamed from: a (com.google.android.gms.a.a, com.google.android.gms.internal.v, java.lang.String, java.lang.String, com.google.android.gms.internal.bs) void
   public void method_173(class_43 var1, class_597 var2, String var3, String var4, class_64 var5) {
      Object var6 = null;
      Parcel var7 = Parcel.obtain();
      Parcel var8 = Parcel.obtain();

      label527: {
         Throwable var10000;
         label531: {
            boolean var10001;
            try {
               var7.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            } catch (Throwable var80) {
               var10000 = var80;
               var10001 = false;
               break label531;
            }

            IBinder var81;
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
               var7.writeString(var4);
            } catch (Throwable var75) {
               var10000 = var75;
               var10001 = false;
               break label531;
            }

            var81 = (IBinder)var6;
            if (var5 != null) {
               try {
                  var81 = var5.asBinder();
               } catch (Throwable var74) {
                  var10000 = var74;
                  var10001 = false;
                  break label531;
               }
            }

            label503:
            try {
               var7.writeStrongBinder(var81);
               this.field_1910.transact(7, var7, var8, 0);
               var8.readException();
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
   }

   // $FF: renamed from: a (com.google.android.gms.a.a, com.google.android.gms.internal.x, com.google.android.gms.internal.v, java.lang.String, com.google.android.gms.internal.bs) void
   public void method_174(class_43 var1, class_607 var2, class_597 var3, String var4, class_64 var5) {
      Object var6 = null;
      Parcel var7 = Parcel.obtain();
      Parcel var8 = Parcel.obtain();

      label756: {
         Throwable var10000;
         label760: {
            boolean var10001;
            try {
               var7.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            } catch (Throwable var118) {
               var10000 = var118;
               var10001 = false;
               break label760;
            }

            IBinder var119;
            if (var1 != null) {
               try {
                  var119 = var1.asBinder();
               } catch (Throwable var117) {
                  var10000 = var117;
                  var10001 = false;
                  break label760;
               }
            } else {
               var119 = null;
            }

            try {
               var7.writeStrongBinder(var119);
            } catch (Throwable var116) {
               var10000 = var116;
               var10001 = false;
               break label760;
            }

            if (var2 != null) {
               try {
                  var7.writeInt(1);
                  var2.writeToParcel(var7, 0);
               } catch (Throwable var115) {
                  var10000 = var115;
                  var10001 = false;
                  break label760;
               }
            } else {
               try {
                  var7.writeInt(0);
               } catch (Throwable var114) {
                  var10000 = var114;
                  var10001 = false;
                  break label760;
               }
            }

            if (var3 != null) {
               try {
                  var7.writeInt(1);
                  var3.writeToParcel(var7, 0);
               } catch (Throwable var113) {
                  var10000 = var113;
                  var10001 = false;
                  break label760;
               }
            } else {
               try {
                  var7.writeInt(0);
               } catch (Throwable var112) {
                  var10000 = var112;
                  var10001 = false;
                  break label760;
               }
            }

            try {
               var7.writeString(var4);
            } catch (Throwable var111) {
               var10000 = var111;
               var10001 = false;
               break label760;
            }

            var119 = (IBinder)var6;
            if (var5 != null) {
               try {
                  var119 = var5.asBinder();
               } catch (Throwable var110) {
                  var10000 = var110;
                  var10001 = false;
                  break label760;
               }
            }

            label727:
            try {
               var7.writeStrongBinder(var119);
               this.field_1910.transact(1, var7, var8, 0);
               var8.readException();
               break label756;
            } catch (Throwable var109) {
               var10000 = var109;
               var10001 = false;
               break label727;
            }
         }

         Throwable var120 = var10000;
         var8.recycle();
         var7.recycle();
         throw var120;
      }

      var8.recycle();
      var7.recycle();
   }

   // $FF: renamed from: a (com.google.android.gms.a.a, com.google.android.gms.internal.x, com.google.android.gms.internal.v, java.lang.String, java.lang.String, com.google.android.gms.internal.bs) void
   public void method_175(class_43 var1, class_607 var2, class_597 var3, String var4, String var5, class_64 var6) {
      Object var7 = null;
      Parcel var8 = Parcel.obtain();
      Parcel var9 = Parcel.obtain();

      label756: {
         Throwable var10000;
         label760: {
            boolean var10001;
            try {
               var8.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            } catch (Throwable var119) {
               var10000 = var119;
               var10001 = false;
               break label760;
            }

            IBinder var120;
            if (var1 != null) {
               try {
                  var120 = var1.asBinder();
               } catch (Throwable var118) {
                  var10000 = var118;
                  var10001 = false;
                  break label760;
               }
            } else {
               var120 = null;
            }

            try {
               var8.writeStrongBinder(var120);
            } catch (Throwable var117) {
               var10000 = var117;
               var10001 = false;
               break label760;
            }

            if (var2 != null) {
               try {
                  var8.writeInt(1);
                  var2.writeToParcel(var8, 0);
               } catch (Throwable var116) {
                  var10000 = var116;
                  var10001 = false;
                  break label760;
               }
            } else {
               try {
                  var8.writeInt(0);
               } catch (Throwable var115) {
                  var10000 = var115;
                  var10001 = false;
                  break label760;
               }
            }

            if (var3 != null) {
               try {
                  var8.writeInt(1);
                  var3.writeToParcel(var8, 0);
               } catch (Throwable var114) {
                  var10000 = var114;
                  var10001 = false;
                  break label760;
               }
            } else {
               try {
                  var8.writeInt(0);
               } catch (Throwable var113) {
                  var10000 = var113;
                  var10001 = false;
                  break label760;
               }
            }

            try {
               var8.writeString(var4);
               var8.writeString(var5);
            } catch (Throwable var112) {
               var10000 = var112;
               var10001 = false;
               break label760;
            }

            var120 = (IBinder)var7;
            if (var6 != null) {
               try {
                  var120 = var6.asBinder();
               } catch (Throwable var111) {
                  var10000 = var111;
                  var10001 = false;
                  break label760;
               }
            }

            label727:
            try {
               var8.writeStrongBinder(var120);
               this.field_1910.transact(6, var8, var9, 0);
               var9.readException();
               break label756;
            } catch (Throwable var110) {
               var10000 = var110;
               var10001 = false;
               break label727;
            }
         }

         Throwable var121 = var10000;
         var9.recycle();
         var8.recycle();
         throw var121;
      }

      var9.recycle();
      var8.recycle();
   }

   public IBinder asBinder() {
      return this.field_1910;
   }

   // $FF: renamed from: b () void
   public void method_176() {
      Parcel var1 = Parcel.obtain();
      Parcel var2 = Parcel.obtain();

      try {
         var1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
         this.field_1910.transact(4, var1, var2, 0);
         var2.readException();
      } finally {
         var2.recycle();
         var1.recycle();
      }

   }

   // $FF: renamed from: c () void
   public void method_177() {
      Parcel var1 = Parcel.obtain();
      Parcel var2 = Parcel.obtain();

      try {
         var1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
         this.field_1910.transact(5, var1, var2, 0);
         var2.readException();
      } finally {
         var2.recycle();
         var1.recycle();
      }

   }
}
