package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

// $FF: renamed from: com.google.android.gms.internal.d
class class_663 implements class_82 {
   // $FF: renamed from: a android.os.IBinder
   private IBinder field_2231;

   class_663(IBinder var1) {
      this.field_2231 = var1;
   }

   // $FF: renamed from: a () void
   public void method_215() {
      Parcel var1 = Parcel.obtain();
      Parcel var2 = Parcel.obtain();

      try {
         var1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdListener");
         this.field_2231.transact(1, var1, var2, 0);
         var2.readException();
      } finally {
         var2.recycle();
         var1.recycle();
      }

   }

   // $FF: renamed from: a (int) void
   public void method_216(int var1) {
      Parcel var2 = Parcel.obtain();
      Parcel var3 = Parcel.obtain();

      try {
         var2.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdListener");
         var2.writeInt(var1);
         this.field_2231.transact(2, var2, var3, 0);
         var3.readException();
      } finally {
         var3.recycle();
         var2.recycle();
      }

   }

   public IBinder asBinder() {
      return this.field_2231;
   }

   // $FF: renamed from: b () void
   public void method_217() {
      Parcel var1 = Parcel.obtain();
      Parcel var2 = Parcel.obtain();

      try {
         var1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdListener");
         this.field_2231.transact(3, var1, var2, 0);
         var2.readException();
      } finally {
         var2.recycle();
         var1.recycle();
      }

   }

   // $FF: renamed from: c () void
   public void method_218() {
      Parcel var1 = Parcel.obtain();
      Parcel var2 = Parcel.obtain();

      try {
         var1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdListener");
         this.field_2231.transact(4, var1, var2, 0);
         var2.readException();
      } finally {
         var2.recycle();
         var1.recycle();
      }

   }

   // $FF: renamed from: d () void
   public void method_219() {
      Parcel var1 = Parcel.obtain();
      Parcel var2 = Parcel.obtain();

      try {
         var1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdListener");
         this.field_2231.transact(5, var1, var2, 0);
         var2.readException();
      } finally {
         var2.recycle();
         var1.recycle();
      }

   }
}
