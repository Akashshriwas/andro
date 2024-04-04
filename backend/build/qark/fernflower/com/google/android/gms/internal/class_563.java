package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

// $FF: renamed from: com.google.android.gms.internal.bu
class class_563 implements class_64 {
   // $FF: renamed from: a android.os.IBinder
   private IBinder field_1909;

   class_563(IBinder var1) {
      this.field_1909 = var1;
   }

   // $FF: renamed from: a () void
   public void method_178() {
      Parcel var1 = Parcel.obtain();
      Parcel var2 = Parcel.obtain();

      try {
         var1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
         this.field_1909.transact(1, var1, var2, 0);
         var2.readException();
      } finally {
         var2.recycle();
         var1.recycle();
      }

   }

   // $FF: renamed from: a (int) void
   public void method_179(int var1) {
      Parcel var2 = Parcel.obtain();
      Parcel var3 = Parcel.obtain();

      try {
         var2.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
         var2.writeInt(var1);
         this.field_1909.transact(3, var2, var3, 0);
         var3.readException();
      } finally {
         var3.recycle();
         var2.recycle();
      }

   }

   public IBinder asBinder() {
      return this.field_1909;
   }

   // $FF: renamed from: b () void
   public void method_180() {
      Parcel var1 = Parcel.obtain();
      Parcel var2 = Parcel.obtain();

      try {
         var1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
         this.field_1909.transact(2, var1, var2, 0);
         var2.readException();
      } finally {
         var2.recycle();
         var1.recycle();
      }

   }

   // $FF: renamed from: c () void
   public void method_181() {
      Parcel var1 = Parcel.obtain();
      Parcel var2 = Parcel.obtain();

      try {
         var1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
         this.field_1909.transact(4, var1, var2, 0);
         var2.readException();
      } finally {
         var2.recycle();
         var1.recycle();
      }

   }

   // $FF: renamed from: d () void
   public void method_182() {
      Parcel var1 = Parcel.obtain();
      Parcel var2 = Parcel.obtain();

      try {
         var1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
         this.field_1909.transact(5, var1, var2, 0);
         var2.readException();
      } finally {
         var2.recycle();
         var1.recycle();
      }

   }

   // $FF: renamed from: e () void
   public void method_183() {
      Parcel var1 = Parcel.obtain();
      Parcel var2 = Parcel.obtain();

      try {
         var1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
         this.field_1909.transact(6, var1, var2, 0);
         var2.readException();
      } finally {
         var2.recycle();
         var1.recycle();
      }

   }
}
