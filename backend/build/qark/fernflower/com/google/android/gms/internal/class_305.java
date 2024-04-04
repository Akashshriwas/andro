package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

// $FF: renamed from: com.google.android.gms.internal.gt
public abstract class class_305 extends Binder implements class_38 {
   // $FF: renamed from: a (android.os.IBinder) com.google.android.gms.internal.gr
   public static class_38 method_1022(IBinder var0) {
      if (var0 == null) {
         return null;
      } else {
         IInterface var1 = var0.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
         return (class_38)(var1 != null && var1 instanceof class_38 ? (class_38)var1 : new class_304(var0));
      }
   }

   public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) {
      String var6 = null;
      String[] var7 = null;
      String var8 = null;
      String var9 = null;
      IBinder var10 = null;
      String var11 = null;
      Object var12 = null;
      Object var13 = null;
      Object var14 = null;
      Object var15 = null;
      Object var16 = null;
      Object var17 = null;
      Bundle var5 = null;
      Bundle var18;
      class_39 var19;
      class_39 var20;
      String var22;
      String[] var23;
      switch(var1) {
      case 1:
         var2.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
         var19 = class_302.method_1021(var2.readStrongBinder());
         var1 = var2.readInt();
         var6 = var2.readString();
         var22 = var2.readString();
         var23 = var2.createStringArray();
         var9 = var2.readString();
         if (var2.readInt() != 0) {
            var18 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
         } else {
            var18 = null;
         }

         this.a(var19, var1, var6, var22, var23, var9, var18);
         var3.writeNoException();
         return true;
      case 2:
         var2.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
         var20 = class_302.method_1021(var2.readStrongBinder());
         var1 = var2.readInt();
         var22 = var2.readString();
         if (var2.readInt() != 0) {
            var5 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
         }

         this.a(var20, var1, var22, var5);
         var3.writeNoException();
         return true;
      case 3:
         var2.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
         this.a(class_302.method_1021(var2.readStrongBinder()), var2.readInt(), var2.readString());
         var3.writeNoException();
         return true;
      case 4:
         var2.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
         this.a(class_302.method_1021(var2.readStrongBinder()), var2.readInt());
         var3.writeNoException();
         return true;
      case 5:
         var2.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
         class_39 var24 = class_302.method_1021(var2.readStrongBinder());
         var1 = var2.readInt();
         var8 = var2.readString();
         var5 = var6;
         if (var2.readInt() != 0) {
            var5 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
         }

         this.b(var24, var1, var8, var5);
         var3.writeNoException();
         return true;
      case 6:
         var2.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
         var20 = class_302.method_1021(var2.readStrongBinder());
         var1 = var2.readInt();
         var8 = var2.readString();
         var5 = var7;
         if (var2.readInt() != 0) {
            var5 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
         }

         this.c(var20, var1, var8, var5);
         var3.writeNoException();
         return true;
      case 7:
         var2.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
         var20 = class_302.method_1021(var2.readStrongBinder());
         var1 = var2.readInt();
         var22 = var2.readString();
         var5 = var8;
         if (var2.readInt() != 0) {
            var5 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
         }

         this.d(var20, var1, var22, var5);
         var3.writeNoException();
         return true;
      case 8:
         var2.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
         var20 = class_302.method_1021(var2.readStrongBinder());
         var1 = var2.readInt();
         var22 = var2.readString();
         var5 = var9;
         if (var2.readInt() != 0) {
            var5 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
         }

         this.e(var20, var1, var22, var5);
         var3.writeNoException();
         return true;
      case 9:
         var2.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
         var19 = class_302.method_1021(var2.readStrongBinder());
         var1 = var2.readInt();
         var6 = var2.readString();
         var22 = var2.readString();
         var23 = var2.createStringArray();
         var9 = var2.readString();
         var10 = var2.readStrongBinder();
         var11 = var2.readString();
         if (var2.readInt() != 0) {
            var18 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
         } else {
            var18 = null;
         }

         this.a(var19, var1, var6, var22, var23, var9, var10, var11, var18);
         var3.writeNoException();
         return true;
      case 10:
         var2.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
         this.a(class_302.method_1021(var2.readStrongBinder()), var2.readInt(), var2.readString(), var2.readString(), var2.createStringArray());
         var3.writeNoException();
         return true;
      case 11:
         var2.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
         var20 = class_302.method_1021(var2.readStrongBinder());
         var1 = var2.readInt();
         var22 = var2.readString();
         var5 = var10;
         if (var2.readInt() != 0) {
            var5 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
         }

         this.f(var20, var1, var22, var5);
         var3.writeNoException();
         return true;
      case 12:
         var2.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
         var20 = class_302.method_1021(var2.readStrongBinder());
         var1 = var2.readInt();
         var22 = var2.readString();
         var5 = var11;
         if (var2.readInt() != 0) {
            var5 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
         }

         this.g(var20, var1, var22, var5);
         var3.writeNoException();
         return true;
      case 13:
         var2.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
         var20 = class_302.method_1021(var2.readStrongBinder());
         var1 = var2.readInt();
         var22 = var2.readString();
         var5 = (Bundle)var12;
         if (var2.readInt() != 0) {
            var5 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
         }

         this.h(var20, var1, var22, var5);
         var3.writeNoException();
         return true;
      case 14:
         var2.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
         var20 = class_302.method_1021(var2.readStrongBinder());
         var1 = var2.readInt();
         var22 = var2.readString();
         var5 = (Bundle)var13;
         if (var2.readInt() != 0) {
            var5 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
         }

         this.i(var20, var1, var22, var5);
         var3.writeNoException();
         return true;
      case 15:
         var2.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
         var20 = class_302.method_1021(var2.readStrongBinder());
         var1 = var2.readInt();
         var22 = var2.readString();
         var5 = (Bundle)var14;
         if (var2.readInt() != 0) {
            var5 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
         }

         this.j(var20, var1, var22, var5);
         var3.writeNoException();
         return true;
      case 16:
         var2.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
         var20 = class_302.method_1021(var2.readStrongBinder());
         var1 = var2.readInt();
         var22 = var2.readString();
         var5 = (Bundle)var15;
         if (var2.readInt() != 0) {
            var5 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
         }

         this.k(var20, var1, var22, var5);
         var3.writeNoException();
         return true;
      case 17:
         var2.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
         var20 = class_302.method_1021(var2.readStrongBinder());
         var1 = var2.readInt();
         var22 = var2.readString();
         var5 = (Bundle)var16;
         if (var2.readInt() != 0) {
            var5 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
         }

         this.l(var20, var1, var22, var5);
         var3.writeNoException();
         return true;
      case 18:
         var2.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
         var20 = class_302.method_1021(var2.readStrongBinder());
         var1 = var2.readInt();
         var22 = var2.readString();
         var5 = (Bundle)var17;
         if (var2.readInt() != 0) {
            var5 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
         }

         this.m(var20, var1, var22, var5);
         var3.writeNoException();
         return true;
      case 19:
         var2.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
         var19 = class_302.method_1021(var2.readStrongBinder());
         var1 = var2.readInt();
         var6 = var2.readString();
         IBinder var21 = var2.readStrongBinder();
         if (var2.readInt() != 0) {
            var18 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
         } else {
            var18 = null;
         }

         this.a(var19, var1, var6, var21, var18);
         var3.writeNoException();
         return true;
      case 20:
         var2.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
         var19 = class_302.method_1021(var2.readStrongBinder());
         var1 = var2.readInt();
         var6 = var2.readString();
         var7 = var2.createStringArray();
         var8 = var2.readString();
         if (var2.readInt() != 0) {
            var18 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
         } else {
            var18 = null;
         }

         this.a(var19, var1, var6, var7, var8, var18);
         var3.writeNoException();
         return true;
      case 1598968902:
         var3.writeString("com.google.android.gms.common.internal.IGmsServiceBroker");
         return true;
      default:
         return super.onTransact(var1, var2, var3, var4);
      }
   }
}
