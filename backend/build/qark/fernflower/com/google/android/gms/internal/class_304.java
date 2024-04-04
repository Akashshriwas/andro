package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

// $FF: renamed from: com.google.android.gms.internal.gu
class class_304 implements class_38 {
   // $FF: renamed from: a android.os.IBinder
   private IBinder field_848;

   class_304(IBinder var1) {
      this.field_848 = var1;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.go, int) void
   public void method_102(class_39 var1, int var2) {
      Parcel var3 = Parcel.obtain();
      Parcel var4 = Parcel.obtain();

      label116: {
         Throwable var10000;
         label120: {
            boolean var10001;
            try {
               var3.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            } catch (Throwable var16) {
               var10000 = var16;
               var10001 = false;
               break label120;
            }

            IBinder var17;
            if (var1 != null) {
               try {
                  var17 = var1.asBinder();
               } catch (Throwable var15) {
                  var10000 = var15;
                  var10001 = false;
                  break label120;
               }
            } else {
               var17 = null;
            }

            label108:
            try {
               var3.writeStrongBinder(var17);
               var3.writeInt(var2);
               this.field_848.transact(4, var3, var4, 0);
               var4.readException();
               break label116;
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               break label108;
            }
         }

         Throwable var18 = var10000;
         var4.recycle();
         var3.recycle();
         throw var18;
      }

      var4.recycle();
      var3.recycle();
   }

   // $FF: renamed from: a (com.google.android.gms.internal.go, int, java.lang.String) void
   public void method_103(class_39 var1, int var2, String var3) {
      Parcel var4 = Parcel.obtain();
      Parcel var5 = Parcel.obtain();

      label116: {
         Throwable var10000;
         label120: {
            boolean var10001;
            try {
               var4.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            } catch (Throwable var17) {
               var10000 = var17;
               var10001 = false;
               break label120;
            }

            IBinder var18;
            if (var1 != null) {
               try {
                  var18 = var1.asBinder();
               } catch (Throwable var16) {
                  var10000 = var16;
                  var10001 = false;
                  break label120;
               }
            } else {
               var18 = null;
            }

            label108:
            try {
               var4.writeStrongBinder(var18);
               var4.writeInt(var2);
               var4.writeString(var3);
               this.field_848.transact(3, var4, var5, 0);
               var5.readException();
               break label116;
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break label108;
            }
         }

         Throwable var19 = var10000;
         var5.recycle();
         var4.recycle();
         throw var19;
      }

      var5.recycle();
      var4.recycle();
   }

   // $FF: renamed from: a (com.google.android.gms.internal.go, int, java.lang.String, android.os.Bundle) void
   public void method_104(class_39 var1, int var2, String var3, Bundle var4) {
      Parcel var5 = Parcel.obtain();
      Parcel var6 = Parcel.obtain();

      label325: {
         Throwable var10000;
         label329: {
            boolean var10001;
            try {
               var5.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            } catch (Throwable var48) {
               var10000 = var48;
               var10001 = false;
               break label329;
            }

            IBinder var49;
            if (var1 != null) {
               try {
                  var49 = var1.asBinder();
               } catch (Throwable var47) {
                  var10000 = var47;
                  var10001 = false;
                  break label329;
               }
            } else {
               var49 = null;
            }

            try {
               var5.writeStrongBinder(var49);
               var5.writeInt(var2);
               var5.writeString(var3);
            } catch (Throwable var46) {
               var10000 = var46;
               var10001 = false;
               break label329;
            }

            if (var4 != null) {
               try {
                  var5.writeInt(1);
                  var4.writeToParcel(var5, 0);
               } catch (Throwable var45) {
                  var10000 = var45;
                  var10001 = false;
                  break label329;
               }
            } else {
               try {
                  var5.writeInt(0);
               } catch (Throwable var44) {
                  var10000 = var44;
                  var10001 = false;
                  break label329;
               }
            }

            label308:
            try {
               this.field_848.transact(2, var5, var6, 0);
               var6.readException();
               break label325;
            } catch (Throwable var43) {
               var10000 = var43;
               var10001 = false;
               break label308;
            }
         }

         Throwable var50 = var10000;
         var6.recycle();
         var5.recycle();
         throw var50;
      }

      var6.recycle();
      var5.recycle();
   }

   // $FF: renamed from: a (com.google.android.gms.internal.go, int, java.lang.String, android.os.IBinder, android.os.Bundle) void
   public void method_105(class_39 var1, int var2, String var3, IBinder var4, Bundle var5) {
      Parcel var6 = Parcel.obtain();
      Parcel var7 = Parcel.obtain();

      label325: {
         Throwable var10000;
         label329: {
            boolean var10001;
            try {
               var6.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            } catch (Throwable var49) {
               var10000 = var49;
               var10001 = false;
               break label329;
            }

            IBinder var50;
            if (var1 != null) {
               try {
                  var50 = var1.asBinder();
               } catch (Throwable var48) {
                  var10000 = var48;
                  var10001 = false;
                  break label329;
               }
            } else {
               var50 = null;
            }

            try {
               var6.writeStrongBinder(var50);
               var6.writeInt(var2);
               var6.writeString(var3);
               var6.writeStrongBinder(var4);
            } catch (Throwable var47) {
               var10000 = var47;
               var10001 = false;
               break label329;
            }

            if (var5 != null) {
               try {
                  var6.writeInt(1);
                  var5.writeToParcel(var6, 0);
               } catch (Throwable var46) {
                  var10000 = var46;
                  var10001 = false;
                  break label329;
               }
            } else {
               try {
                  var6.writeInt(0);
               } catch (Throwable var45) {
                  var10000 = var45;
                  var10001 = false;
                  break label329;
               }
            }

            label308:
            try {
               this.field_848.transact(19, var6, var7, 0);
               var7.readException();
               break label325;
            } catch (Throwable var44) {
               var10000 = var44;
               var10001 = false;
               break label308;
            }
         }

         Throwable var51 = var10000;
         var7.recycle();
         var6.recycle();
         throw var51;
      }

      var7.recycle();
      var6.recycle();
   }

   // $FF: renamed from: a (com.google.android.gms.internal.go, int, java.lang.String, java.lang.String, java.lang.String[]) void
   public void method_106(class_39 var1, int var2, String var3, String var4, String[] var5) {
      Parcel var6 = Parcel.obtain();
      Parcel var7 = Parcel.obtain();

      label116: {
         Throwable var10000;
         label120: {
            boolean var10001;
            try {
               var6.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            } catch (Throwable var19) {
               var10000 = var19;
               var10001 = false;
               break label120;
            }

            IBinder var20;
            if (var1 != null) {
               try {
                  var20 = var1.asBinder();
               } catch (Throwable var18) {
                  var10000 = var18;
                  var10001 = false;
                  break label120;
               }
            } else {
               var20 = null;
            }

            label108:
            try {
               var6.writeStrongBinder(var20);
               var6.writeInt(var2);
               var6.writeString(var3);
               var6.writeString(var4);
               var6.writeStringArray(var5);
               this.field_848.transact(10, var6, var7, 0);
               var7.readException();
               break label116;
            } catch (Throwable var17) {
               var10000 = var17;
               var10001 = false;
               break label108;
            }
         }

         Throwable var21 = var10000;
         var7.recycle();
         var6.recycle();
         throw var21;
      }

      var7.recycle();
      var6.recycle();
   }

   // $FF: renamed from: a (com.google.android.gms.internal.go, int, java.lang.String, java.lang.String, java.lang.String[], java.lang.String, android.os.Bundle) void
   public void method_107(class_39 var1, int var2, String var3, String var4, String[] var5, String var6, Bundle var7) {
      Parcel var8 = Parcel.obtain();
      Parcel var9 = Parcel.obtain();

      label325: {
         Throwable var10000;
         label329: {
            boolean var10001;
            try {
               var8.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            } catch (Throwable var51) {
               var10000 = var51;
               var10001 = false;
               break label329;
            }

            IBinder var52;
            if (var1 != null) {
               try {
                  var52 = var1.asBinder();
               } catch (Throwable var50) {
                  var10000 = var50;
                  var10001 = false;
                  break label329;
               }
            } else {
               var52 = null;
            }

            try {
               var8.writeStrongBinder(var52);
               var8.writeInt(var2);
               var8.writeString(var3);
               var8.writeString(var4);
               var8.writeStringArray(var5);
               var8.writeString(var6);
            } catch (Throwable var49) {
               var10000 = var49;
               var10001 = false;
               break label329;
            }

            if (var7 != null) {
               try {
                  var8.writeInt(1);
                  var7.writeToParcel(var8, 0);
               } catch (Throwable var48) {
                  var10000 = var48;
                  var10001 = false;
                  break label329;
               }
            } else {
               try {
                  var8.writeInt(0);
               } catch (Throwable var47) {
                  var10000 = var47;
                  var10001 = false;
                  break label329;
               }
            }

            label308:
            try {
               this.field_848.transact(1, var8, var9, 0);
               var9.readException();
               break label325;
            } catch (Throwable var46) {
               var10000 = var46;
               var10001 = false;
               break label308;
            }
         }

         Throwable var53 = var10000;
         var9.recycle();
         var8.recycle();
         throw var53;
      }

      var9.recycle();
      var8.recycle();
   }

   // $FF: renamed from: a (com.google.android.gms.internal.go, int, java.lang.String, java.lang.String, java.lang.String[], java.lang.String, android.os.IBinder, java.lang.String, android.os.Bundle) void
   public void method_108(class_39 var1, int var2, String var3, String var4, String[] var5, String var6, IBinder var7, String var8, Bundle var9) {
      Parcel var10 = Parcel.obtain();
      Parcel var11 = Parcel.obtain();

      label325: {
         Throwable var10000;
         label329: {
            boolean var10001;
            try {
               var10.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            } catch (Throwable var53) {
               var10000 = var53;
               var10001 = false;
               break label329;
            }

            IBinder var54;
            if (var1 != null) {
               try {
                  var54 = var1.asBinder();
               } catch (Throwable var52) {
                  var10000 = var52;
                  var10001 = false;
                  break label329;
               }
            } else {
               var54 = null;
            }

            try {
               var10.writeStrongBinder(var54);
               var10.writeInt(var2);
               var10.writeString(var3);
               var10.writeString(var4);
               var10.writeStringArray(var5);
               var10.writeString(var6);
               var10.writeStrongBinder(var7);
               var10.writeString(var8);
            } catch (Throwable var51) {
               var10000 = var51;
               var10001 = false;
               break label329;
            }

            if (var9 != null) {
               try {
                  var10.writeInt(1);
                  var9.writeToParcel(var10, 0);
               } catch (Throwable var50) {
                  var10000 = var50;
                  var10001 = false;
                  break label329;
               }
            } else {
               try {
                  var10.writeInt(0);
               } catch (Throwable var49) {
                  var10000 = var49;
                  var10001 = false;
                  break label329;
               }
            }

            label308:
            try {
               this.field_848.transact(9, var10, var11, 0);
               var11.readException();
               break label325;
            } catch (Throwable var48) {
               var10000 = var48;
               var10001 = false;
               break label308;
            }
         }

         Throwable var55 = var10000;
         var11.recycle();
         var10.recycle();
         throw var55;
      }

      var11.recycle();
      var10.recycle();
   }

   // $FF: renamed from: a (com.google.android.gms.internal.go, int, java.lang.String, java.lang.String[], java.lang.String, android.os.Bundle) void
   public void method_109(class_39 var1, int var2, String var3, String[] var4, String var5, Bundle var6) {
      Parcel var7 = Parcel.obtain();
      Parcel var8 = Parcel.obtain();

      label325: {
         Throwable var10000;
         label329: {
            boolean var10001;
            try {
               var7.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            } catch (Throwable var50) {
               var10000 = var50;
               var10001 = false;
               break label329;
            }

            IBinder var51;
            if (var1 != null) {
               try {
                  var51 = var1.asBinder();
               } catch (Throwable var49) {
                  var10000 = var49;
                  var10001 = false;
                  break label329;
               }
            } else {
               var51 = null;
            }

            try {
               var7.writeStrongBinder(var51);
               var7.writeInt(var2);
               var7.writeString(var3);
               var7.writeStringArray(var4);
               var7.writeString(var5);
            } catch (Throwable var48) {
               var10000 = var48;
               var10001 = false;
               break label329;
            }

            if (var6 != null) {
               try {
                  var7.writeInt(1);
                  var6.writeToParcel(var7, 0);
               } catch (Throwable var47) {
                  var10000 = var47;
                  var10001 = false;
                  break label329;
               }
            } else {
               try {
                  var7.writeInt(0);
               } catch (Throwable var46) {
                  var10000 = var46;
                  var10001 = false;
                  break label329;
               }
            }

            label308:
            try {
               this.field_848.transact(20, var7, var8, 0);
               var8.readException();
               break label325;
            } catch (Throwable var45) {
               var10000 = var45;
               var10001 = false;
               break label308;
            }
         }

         Throwable var52 = var10000;
         var8.recycle();
         var7.recycle();
         throw var52;
      }

      var8.recycle();
      var7.recycle();
   }

   public IBinder asBinder() {
      return this.field_848;
   }

   // $FF: renamed from: b (com.google.android.gms.internal.go, int, java.lang.String, android.os.Bundle) void
   public void method_110(class_39 var1, int var2, String var3, Bundle var4) {
      Parcel var5 = Parcel.obtain();
      Parcel var6 = Parcel.obtain();

      label325: {
         Throwable var10000;
         label329: {
            boolean var10001;
            try {
               var5.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            } catch (Throwable var48) {
               var10000 = var48;
               var10001 = false;
               break label329;
            }

            IBinder var49;
            if (var1 != null) {
               try {
                  var49 = var1.asBinder();
               } catch (Throwable var47) {
                  var10000 = var47;
                  var10001 = false;
                  break label329;
               }
            } else {
               var49 = null;
            }

            try {
               var5.writeStrongBinder(var49);
               var5.writeInt(var2);
               var5.writeString(var3);
            } catch (Throwable var46) {
               var10000 = var46;
               var10001 = false;
               break label329;
            }

            if (var4 != null) {
               try {
                  var5.writeInt(1);
                  var4.writeToParcel(var5, 0);
               } catch (Throwable var45) {
                  var10000 = var45;
                  var10001 = false;
                  break label329;
               }
            } else {
               try {
                  var5.writeInt(0);
               } catch (Throwable var44) {
                  var10000 = var44;
                  var10001 = false;
                  break label329;
               }
            }

            label308:
            try {
               this.field_848.transact(5, var5, var6, 0);
               var6.readException();
               break label325;
            } catch (Throwable var43) {
               var10000 = var43;
               var10001 = false;
               break label308;
            }
         }

         Throwable var50 = var10000;
         var6.recycle();
         var5.recycle();
         throw var50;
      }

      var6.recycle();
      var5.recycle();
   }

   // $FF: renamed from: c (com.google.android.gms.internal.go, int, java.lang.String, android.os.Bundle) void
   public void method_111(class_39 var1, int var2, String var3, Bundle var4) {
      Parcel var5 = Parcel.obtain();
      Parcel var6 = Parcel.obtain();

      label325: {
         Throwable var10000;
         label329: {
            boolean var10001;
            try {
               var5.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            } catch (Throwable var48) {
               var10000 = var48;
               var10001 = false;
               break label329;
            }

            IBinder var49;
            if (var1 != null) {
               try {
                  var49 = var1.asBinder();
               } catch (Throwable var47) {
                  var10000 = var47;
                  var10001 = false;
                  break label329;
               }
            } else {
               var49 = null;
            }

            try {
               var5.writeStrongBinder(var49);
               var5.writeInt(var2);
               var5.writeString(var3);
            } catch (Throwable var46) {
               var10000 = var46;
               var10001 = false;
               break label329;
            }

            if (var4 != null) {
               try {
                  var5.writeInt(1);
                  var4.writeToParcel(var5, 0);
               } catch (Throwable var45) {
                  var10000 = var45;
                  var10001 = false;
                  break label329;
               }
            } else {
               try {
                  var5.writeInt(0);
               } catch (Throwable var44) {
                  var10000 = var44;
                  var10001 = false;
                  break label329;
               }
            }

            label308:
            try {
               this.field_848.transact(6, var5, var6, 0);
               var6.readException();
               break label325;
            } catch (Throwable var43) {
               var10000 = var43;
               var10001 = false;
               break label308;
            }
         }

         Throwable var50 = var10000;
         var6.recycle();
         var5.recycle();
         throw var50;
      }

      var6.recycle();
      var5.recycle();
   }

   // $FF: renamed from: d (com.google.android.gms.internal.go, int, java.lang.String, android.os.Bundle) void
   public void method_112(class_39 var1, int var2, String var3, Bundle var4) {
      Parcel var5 = Parcel.obtain();
      Parcel var6 = Parcel.obtain();

      label325: {
         Throwable var10000;
         label329: {
            boolean var10001;
            try {
               var5.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            } catch (Throwable var48) {
               var10000 = var48;
               var10001 = false;
               break label329;
            }

            IBinder var49;
            if (var1 != null) {
               try {
                  var49 = var1.asBinder();
               } catch (Throwable var47) {
                  var10000 = var47;
                  var10001 = false;
                  break label329;
               }
            } else {
               var49 = null;
            }

            try {
               var5.writeStrongBinder(var49);
               var5.writeInt(var2);
               var5.writeString(var3);
            } catch (Throwable var46) {
               var10000 = var46;
               var10001 = false;
               break label329;
            }

            if (var4 != null) {
               try {
                  var5.writeInt(1);
                  var4.writeToParcel(var5, 0);
               } catch (Throwable var45) {
                  var10000 = var45;
                  var10001 = false;
                  break label329;
               }
            } else {
               try {
                  var5.writeInt(0);
               } catch (Throwable var44) {
                  var10000 = var44;
                  var10001 = false;
                  break label329;
               }
            }

            label308:
            try {
               this.field_848.transact(7, var5, var6, 0);
               var6.readException();
               break label325;
            } catch (Throwable var43) {
               var10000 = var43;
               var10001 = false;
               break label308;
            }
         }

         Throwable var50 = var10000;
         var6.recycle();
         var5.recycle();
         throw var50;
      }

      var6.recycle();
      var5.recycle();
   }

   // $FF: renamed from: e (com.google.android.gms.internal.go, int, java.lang.String, android.os.Bundle) void
   public void method_113(class_39 var1, int var2, String var3, Bundle var4) {
      Parcel var5 = Parcel.obtain();
      Parcel var6 = Parcel.obtain();

      label325: {
         Throwable var10000;
         label329: {
            boolean var10001;
            try {
               var5.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            } catch (Throwable var48) {
               var10000 = var48;
               var10001 = false;
               break label329;
            }

            IBinder var49;
            if (var1 != null) {
               try {
                  var49 = var1.asBinder();
               } catch (Throwable var47) {
                  var10000 = var47;
                  var10001 = false;
                  break label329;
               }
            } else {
               var49 = null;
            }

            try {
               var5.writeStrongBinder(var49);
               var5.writeInt(var2);
               var5.writeString(var3);
            } catch (Throwable var46) {
               var10000 = var46;
               var10001 = false;
               break label329;
            }

            if (var4 != null) {
               try {
                  var5.writeInt(1);
                  var4.writeToParcel(var5, 0);
               } catch (Throwable var45) {
                  var10000 = var45;
                  var10001 = false;
                  break label329;
               }
            } else {
               try {
                  var5.writeInt(0);
               } catch (Throwable var44) {
                  var10000 = var44;
                  var10001 = false;
                  break label329;
               }
            }

            label308:
            try {
               this.field_848.transact(8, var5, var6, 0);
               var6.readException();
               break label325;
            } catch (Throwable var43) {
               var10000 = var43;
               var10001 = false;
               break label308;
            }
         }

         Throwable var50 = var10000;
         var6.recycle();
         var5.recycle();
         throw var50;
      }

      var6.recycle();
      var5.recycle();
   }

   // $FF: renamed from: f (com.google.android.gms.internal.go, int, java.lang.String, android.os.Bundle) void
   public void method_114(class_39 var1, int var2, String var3, Bundle var4) {
      Parcel var5 = Parcel.obtain();
      Parcel var6 = Parcel.obtain();

      label325: {
         Throwable var10000;
         label329: {
            boolean var10001;
            try {
               var5.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            } catch (Throwable var48) {
               var10000 = var48;
               var10001 = false;
               break label329;
            }

            IBinder var49;
            if (var1 != null) {
               try {
                  var49 = var1.asBinder();
               } catch (Throwable var47) {
                  var10000 = var47;
                  var10001 = false;
                  break label329;
               }
            } else {
               var49 = null;
            }

            try {
               var5.writeStrongBinder(var49);
               var5.writeInt(var2);
               var5.writeString(var3);
            } catch (Throwable var46) {
               var10000 = var46;
               var10001 = false;
               break label329;
            }

            if (var4 != null) {
               try {
                  var5.writeInt(1);
                  var4.writeToParcel(var5, 0);
               } catch (Throwable var45) {
                  var10000 = var45;
                  var10001 = false;
                  break label329;
               }
            } else {
               try {
                  var5.writeInt(0);
               } catch (Throwable var44) {
                  var10000 = var44;
                  var10001 = false;
                  break label329;
               }
            }

            label308:
            try {
               this.field_848.transact(11, var5, var6, 0);
               var6.readException();
               break label325;
            } catch (Throwable var43) {
               var10000 = var43;
               var10001 = false;
               break label308;
            }
         }

         Throwable var50 = var10000;
         var6.recycle();
         var5.recycle();
         throw var50;
      }

      var6.recycle();
      var5.recycle();
   }

   // $FF: renamed from: g (com.google.android.gms.internal.go, int, java.lang.String, android.os.Bundle) void
   public void method_115(class_39 var1, int var2, String var3, Bundle var4) {
      Parcel var5 = Parcel.obtain();
      Parcel var6 = Parcel.obtain();

      label325: {
         Throwable var10000;
         label329: {
            boolean var10001;
            try {
               var5.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            } catch (Throwable var48) {
               var10000 = var48;
               var10001 = false;
               break label329;
            }

            IBinder var49;
            if (var1 != null) {
               try {
                  var49 = var1.asBinder();
               } catch (Throwable var47) {
                  var10000 = var47;
                  var10001 = false;
                  break label329;
               }
            } else {
               var49 = null;
            }

            try {
               var5.writeStrongBinder(var49);
               var5.writeInt(var2);
               var5.writeString(var3);
            } catch (Throwable var46) {
               var10000 = var46;
               var10001 = false;
               break label329;
            }

            if (var4 != null) {
               try {
                  var5.writeInt(1);
                  var4.writeToParcel(var5, 0);
               } catch (Throwable var45) {
                  var10000 = var45;
                  var10001 = false;
                  break label329;
               }
            } else {
               try {
                  var5.writeInt(0);
               } catch (Throwable var44) {
                  var10000 = var44;
                  var10001 = false;
                  break label329;
               }
            }

            label308:
            try {
               this.field_848.transact(12, var5, var6, 0);
               var6.readException();
               break label325;
            } catch (Throwable var43) {
               var10000 = var43;
               var10001 = false;
               break label308;
            }
         }

         Throwable var50 = var10000;
         var6.recycle();
         var5.recycle();
         throw var50;
      }

      var6.recycle();
      var5.recycle();
   }

   // $FF: renamed from: h (com.google.android.gms.internal.go, int, java.lang.String, android.os.Bundle) void
   public void method_116(class_39 var1, int var2, String var3, Bundle var4) {
      Parcel var5 = Parcel.obtain();
      Parcel var6 = Parcel.obtain();

      label325: {
         Throwable var10000;
         label329: {
            boolean var10001;
            try {
               var5.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            } catch (Throwable var48) {
               var10000 = var48;
               var10001 = false;
               break label329;
            }

            IBinder var49;
            if (var1 != null) {
               try {
                  var49 = var1.asBinder();
               } catch (Throwable var47) {
                  var10000 = var47;
                  var10001 = false;
                  break label329;
               }
            } else {
               var49 = null;
            }

            try {
               var5.writeStrongBinder(var49);
               var5.writeInt(var2);
               var5.writeString(var3);
            } catch (Throwable var46) {
               var10000 = var46;
               var10001 = false;
               break label329;
            }

            if (var4 != null) {
               try {
                  var5.writeInt(1);
                  var4.writeToParcel(var5, 0);
               } catch (Throwable var45) {
                  var10000 = var45;
                  var10001 = false;
                  break label329;
               }
            } else {
               try {
                  var5.writeInt(0);
               } catch (Throwable var44) {
                  var10000 = var44;
                  var10001 = false;
                  break label329;
               }
            }

            label308:
            try {
               this.field_848.transact(13, var5, var6, 0);
               var6.readException();
               break label325;
            } catch (Throwable var43) {
               var10000 = var43;
               var10001 = false;
               break label308;
            }
         }

         Throwable var50 = var10000;
         var6.recycle();
         var5.recycle();
         throw var50;
      }

      var6.recycle();
      var5.recycle();
   }

   // $FF: renamed from: i (com.google.android.gms.internal.go, int, java.lang.String, android.os.Bundle) void
   public void method_117(class_39 var1, int var2, String var3, Bundle var4) {
      Parcel var5 = Parcel.obtain();
      Parcel var6 = Parcel.obtain();

      label325: {
         Throwable var10000;
         label329: {
            boolean var10001;
            try {
               var5.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            } catch (Throwable var48) {
               var10000 = var48;
               var10001 = false;
               break label329;
            }

            IBinder var49;
            if (var1 != null) {
               try {
                  var49 = var1.asBinder();
               } catch (Throwable var47) {
                  var10000 = var47;
                  var10001 = false;
                  break label329;
               }
            } else {
               var49 = null;
            }

            try {
               var5.writeStrongBinder(var49);
               var5.writeInt(var2);
               var5.writeString(var3);
            } catch (Throwable var46) {
               var10000 = var46;
               var10001 = false;
               break label329;
            }

            if (var4 != null) {
               try {
                  var5.writeInt(1);
                  var4.writeToParcel(var5, 0);
               } catch (Throwable var45) {
                  var10000 = var45;
                  var10001 = false;
                  break label329;
               }
            } else {
               try {
                  var5.writeInt(0);
               } catch (Throwable var44) {
                  var10000 = var44;
                  var10001 = false;
                  break label329;
               }
            }

            label308:
            try {
               this.field_848.transact(14, var5, var6, 0);
               var6.readException();
               break label325;
            } catch (Throwable var43) {
               var10000 = var43;
               var10001 = false;
               break label308;
            }
         }

         Throwable var50 = var10000;
         var6.recycle();
         var5.recycle();
         throw var50;
      }

      var6.recycle();
      var5.recycle();
   }

   // $FF: renamed from: j (com.google.android.gms.internal.go, int, java.lang.String, android.os.Bundle) void
   public void method_118(class_39 var1, int var2, String var3, Bundle var4) {
      Parcel var5 = Parcel.obtain();
      Parcel var6 = Parcel.obtain();

      label325: {
         Throwable var10000;
         label329: {
            boolean var10001;
            try {
               var5.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            } catch (Throwable var48) {
               var10000 = var48;
               var10001 = false;
               break label329;
            }

            IBinder var49;
            if (var1 != null) {
               try {
                  var49 = var1.asBinder();
               } catch (Throwable var47) {
                  var10000 = var47;
                  var10001 = false;
                  break label329;
               }
            } else {
               var49 = null;
            }

            try {
               var5.writeStrongBinder(var49);
               var5.writeInt(var2);
               var5.writeString(var3);
            } catch (Throwable var46) {
               var10000 = var46;
               var10001 = false;
               break label329;
            }

            if (var4 != null) {
               try {
                  var5.writeInt(1);
                  var4.writeToParcel(var5, 0);
               } catch (Throwable var45) {
                  var10000 = var45;
                  var10001 = false;
                  break label329;
               }
            } else {
               try {
                  var5.writeInt(0);
               } catch (Throwable var44) {
                  var10000 = var44;
                  var10001 = false;
                  break label329;
               }
            }

            label308:
            try {
               this.field_848.transact(15, var5, var6, 0);
               var6.readException();
               break label325;
            } catch (Throwable var43) {
               var10000 = var43;
               var10001 = false;
               break label308;
            }
         }

         Throwable var50 = var10000;
         var6.recycle();
         var5.recycle();
         throw var50;
      }

      var6.recycle();
      var5.recycle();
   }

   // $FF: renamed from: k (com.google.android.gms.internal.go, int, java.lang.String, android.os.Bundle) void
   public void method_119(class_39 var1, int var2, String var3, Bundle var4) {
      Parcel var5 = Parcel.obtain();
      Parcel var6 = Parcel.obtain();

      label325: {
         Throwable var10000;
         label329: {
            boolean var10001;
            try {
               var5.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            } catch (Throwable var48) {
               var10000 = var48;
               var10001 = false;
               break label329;
            }

            IBinder var49;
            if (var1 != null) {
               try {
                  var49 = var1.asBinder();
               } catch (Throwable var47) {
                  var10000 = var47;
                  var10001 = false;
                  break label329;
               }
            } else {
               var49 = null;
            }

            try {
               var5.writeStrongBinder(var49);
               var5.writeInt(var2);
               var5.writeString(var3);
            } catch (Throwable var46) {
               var10000 = var46;
               var10001 = false;
               break label329;
            }

            if (var4 != null) {
               try {
                  var5.writeInt(1);
                  var4.writeToParcel(var5, 0);
               } catch (Throwable var45) {
                  var10000 = var45;
                  var10001 = false;
                  break label329;
               }
            } else {
               try {
                  var5.writeInt(0);
               } catch (Throwable var44) {
                  var10000 = var44;
                  var10001 = false;
                  break label329;
               }
            }

            label308:
            try {
               this.field_848.transact(16, var5, var6, 0);
               var6.readException();
               break label325;
            } catch (Throwable var43) {
               var10000 = var43;
               var10001 = false;
               break label308;
            }
         }

         Throwable var50 = var10000;
         var6.recycle();
         var5.recycle();
         throw var50;
      }

      var6.recycle();
      var5.recycle();
   }

   // $FF: renamed from: l (com.google.android.gms.internal.go, int, java.lang.String, android.os.Bundle) void
   public void method_120(class_39 var1, int var2, String var3, Bundle var4) {
      Parcel var5 = Parcel.obtain();
      Parcel var6 = Parcel.obtain();

      label325: {
         Throwable var10000;
         label329: {
            boolean var10001;
            try {
               var5.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            } catch (Throwable var48) {
               var10000 = var48;
               var10001 = false;
               break label329;
            }

            IBinder var49;
            if (var1 != null) {
               try {
                  var49 = var1.asBinder();
               } catch (Throwable var47) {
                  var10000 = var47;
                  var10001 = false;
                  break label329;
               }
            } else {
               var49 = null;
            }

            try {
               var5.writeStrongBinder(var49);
               var5.writeInt(var2);
               var5.writeString(var3);
            } catch (Throwable var46) {
               var10000 = var46;
               var10001 = false;
               break label329;
            }

            if (var4 != null) {
               try {
                  var5.writeInt(1);
                  var4.writeToParcel(var5, 0);
               } catch (Throwable var45) {
                  var10000 = var45;
                  var10001 = false;
                  break label329;
               }
            } else {
               try {
                  var5.writeInt(0);
               } catch (Throwable var44) {
                  var10000 = var44;
                  var10001 = false;
                  break label329;
               }
            }

            label308:
            try {
               this.field_848.transact(17, var5, var6, 0);
               var6.readException();
               break label325;
            } catch (Throwable var43) {
               var10000 = var43;
               var10001 = false;
               break label308;
            }
         }

         Throwable var50 = var10000;
         var6.recycle();
         var5.recycle();
         throw var50;
      }

      var6.recycle();
      var5.recycle();
   }

   // $FF: renamed from: m (com.google.android.gms.internal.go, int, java.lang.String, android.os.Bundle) void
   public void method_121(class_39 var1, int var2, String var3, Bundle var4) {
      Parcel var5 = Parcel.obtain();
      Parcel var6 = Parcel.obtain();

      label325: {
         Throwable var10000;
         label329: {
            boolean var10001;
            try {
               var5.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            } catch (Throwable var48) {
               var10000 = var48;
               var10001 = false;
               break label329;
            }

            IBinder var49;
            if (var1 != null) {
               try {
                  var49 = var1.asBinder();
               } catch (Throwable var47) {
                  var10000 = var47;
                  var10001 = false;
                  break label329;
               }
            } else {
               var49 = null;
            }

            try {
               var5.writeStrongBinder(var49);
               var5.writeInt(var2);
               var5.writeString(var3);
            } catch (Throwable var46) {
               var10000 = var46;
               var10001 = false;
               break label329;
            }

            if (var4 != null) {
               try {
                  var5.writeInt(1);
                  var4.writeToParcel(var5, 0);
               } catch (Throwable var45) {
                  var10000 = var45;
                  var10001 = false;
                  break label329;
               }
            } else {
               try {
                  var5.writeInt(0);
               } catch (Throwable var44) {
                  var10000 = var44;
                  var10001 = false;
                  break label329;
               }
            }

            label308:
            try {
               this.field_848.transact(18, var5, var6, 0);
               var6.readException();
               break label325;
            } catch (Throwable var43) {
               var10000 = var43;
               var10001 = false;
               break label308;
            }
         }

         Throwable var50 = var10000;
         var6.recycle();
         var5.recycle();
         throw var50;
      }

      var6.recycle();
      var5.recycle();
   }
}
