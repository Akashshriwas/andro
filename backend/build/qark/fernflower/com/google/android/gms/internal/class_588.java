package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

// $FF: renamed from: com.google.android.gms.internal.m
class class_588 implements class_67 {
   // $FF: renamed from: a android.os.IBinder
   private IBinder field_1965;

   class_588(IBinder var1) {
      this.field_1965 = var1;
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) void
   public void method_184(String var1, String var2) {
      Parcel var3 = Parcel.obtain();
      Parcel var4 = Parcel.obtain();

      try {
         var3.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAppEventListener");
         var3.writeString(var1);
         var3.writeString(var2);
         this.field_1965.transact(1, var3, var4, 0);
         var4.readException();
      } finally {
         var4.recycle();
         var3.recycle();
      }

   }

   public IBinder asBinder() {
      return this.field_1965;
   }
}
