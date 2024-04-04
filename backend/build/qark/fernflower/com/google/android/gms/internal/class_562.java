package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

// $FF: renamed from: com.google.android.gms.internal.bo
class class_562 implements class_62 {
   // $FF: renamed from: a android.os.IBinder
   private IBinder field_1908;

   class_562(IBinder var1) {
      this.field_1908 = var1;
   }

   // $FF: renamed from: a (java.lang.String) com.google.android.gms.internal.bp
   public class_63 method_170(String var1) {
      Parcel var2 = Parcel.obtain();
      Parcel var3 = Parcel.obtain();

      class_63 var6;
      try {
         var2.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
         var2.writeString(var1);
         this.field_1908.transact(1, var2, var3, 0);
         var3.readException();
         var6 = class_560.method_1852(var3.readStrongBinder());
      } finally {
         var3.recycle();
         var2.recycle();
      }

      return var6;
   }

   public IBinder asBinder() {
      return this.field_1908;
   }
}
