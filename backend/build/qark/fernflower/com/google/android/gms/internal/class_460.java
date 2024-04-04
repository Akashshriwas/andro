package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.class_25;
import com.google.android.gms.common.class_26;
import com.google.android.gms.common.class_27;
import java.util.ArrayList;

// $FF: renamed from: com.google.android.gms.internal.fx
public abstract class class_460 implements class_27, class_41 {
   // $FF: renamed from: d java.lang.String[]
   public static final String[] field_1256 = new String[]{"service_esmobile", "service_googleme"};
   // $FF: renamed from: a android.os.Handler
   final Handler field_1257;
   // $FF: renamed from: b boolean
   boolean field_1258 = false;
   // $FF: renamed from: c boolean
   boolean field_1259 = false;
   // $FF: renamed from: e android.content.Context
   private final Context field_1260;
   // $FF: renamed from: f android.os.IInterface
   private IInterface field_1261;
   // $FF: renamed from: g java.util.ArrayList
   private final ArrayList field_1262 = new ArrayList();
   // $FF: renamed from: h com.google.android.gms.internal.ge
   private class_318 field_1263;
   // $FF: renamed from: i java.lang.String[]
   private final String[] field_1264;
   // $FF: renamed from: j com.google.android.gms.internal.gh
   private final class_321 field_1265;
   // $FF: renamed from: k java.lang.Object
   private final Object field_1266 = new Object();

   protected class_460(Context var1, class_26 var2, class_25 var3, String... var4) {
      this.field_1260 = (Context)class_343.method_1189(var1);
      this.field_1265 = new class_321(var1, this, (Handler)null);
      this.field_1257 = new class_493(this, var1.getMainLooper());
      this.method_1559(var4);
      this.field_1264 = var4;
      this.method_1556((class_26)class_343.method_1189(var2));
      this.method_1557((class_25)class_343.method_1189(var3));
   }

   // $FF: renamed from: a (com.google.android.gms.internal.fx, android.os.IInterface) android.os.IInterface
   // $FF: synthetic method
   static IInterface method_1546(class_460 var0, IInterface var1) {
      var0.field_1261 = var1;
      return var1;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.fx, com.google.android.gms.internal.ge) com.google.android.gms.internal.ge
   // $FF: synthetic method
   static class_318 method_1547(class_460 var0, class_318 var1) {
      var0.field_1263 = var1;
      return var1;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.fx) com.google.android.gms.internal.gh
   // $FF: synthetic method
   static class_321 method_1548(class_460 var0) {
      return var0.field_1265;
   }

   // $FF: renamed from: b (com.google.android.gms.internal.fx) java.lang.Object
   // $FF: synthetic method
   static Object method_1549(class_460 var0) {
      return var0.field_1266;
   }

   // $FF: renamed from: c (com.google.android.gms.internal.fx) java.util.ArrayList
   // $FF: synthetic method
   static ArrayList method_1550(class_460 var0) {
      return var0.field_1262;
   }

   // $FF: renamed from: d (com.google.android.gms.internal.fx) android.os.IInterface
   // $FF: synthetic method
   static IInterface method_1551(class_460 var0) {
      return var0.field_1261;
   }

   // $FF: renamed from: e (com.google.android.gms.internal.fx) com.google.android.gms.internal.ge
   // $FF: synthetic method
   static class_318 method_1552(class_460 var0) {
      return var0.field_1263;
   }

   // $FF: renamed from: f (com.google.android.gms.internal.fx) android.content.Context
   // $FF: synthetic method
   static Context method_1553(class_460 var0) {
      return var0.field_1260;
   }

   // $FF: renamed from: a () java.lang.String
   protected abstract String method_1554();

   // $FF: renamed from: a (int, android.os.IBinder, android.os.Bundle) void
   protected void method_1555(int var1, IBinder var2, Bundle var3) {
      this.field_1257.sendMessage(this.field_1257.obtainMessage(1, new class_317(this, var1, var2, var3)));
   }

   // $FF: renamed from: a (com.google.android.gms.common.c) void
   public void method_1556(class_26 var1) {
      this.field_1265.method_1064(var1);
   }

   // $FF: renamed from: a (com.google.android.gms.common.d) void
   public void method_1557(class_25 var1) {
      this.field_1265.method_1065(var1);
   }

   // $FF: renamed from: a (com.google.android.gms.internal.gr, com.google.android.gms.internal.gc) void
   protected abstract void method_1558(class_38 var1, class_303 var2);

   // $FF: renamed from: a (java.lang.String[]) void
   protected void method_1559(String... var1) {
   }

   // $FF: renamed from: b (android.os.IBinder) android.os.IInterface
   protected abstract IInterface method_1560(IBinder var1);

   // $FF: renamed from: b () java.lang.String
   protected abstract String method_1561();

   // $FF: renamed from: c (android.os.IBinder) void
   protected final void method_1562(IBinder var1) {
      try {
         this.method_1558(class_305.method_1022(var1), new class_303(this));
      } catch (RemoteException var2) {
         Log.w("GmsClient", "service died");
      }
   }

   // $FF: renamed from: d () void
   public void method_1563() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () boolean
   public boolean method_123() {
      return this.field_1261 != null;
   }

   // $FF: renamed from: f () boolean
   public boolean method_1564() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: g () void
   public void method_1565() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: h () android.content.Context
   public final Context method_1566() {
      return this.field_1260;
   }

   // $FF: renamed from: i () void
   protected final void method_1567() {
      if (!this.method_123()) {
         throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
      }
   }

   // $FF: renamed from: j () android.os.Bundle
   public Bundle method_124() {
      return null;
   }

   // $FF: renamed from: k () android.os.IInterface
   protected final IInterface method_1568() {
      this.method_1567();
      return this.field_1261;
   }

   // $FF: renamed from: l () boolean
   public boolean method_125() {
      return this.field_1258;
   }
}
