package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.a.class_372;
import com.google.android.gms.a.class_376;
import com.google.android.gms.a.class_378;
import com.google.android.gms.a.class_43;
import com.google.android.gms.common.class_188;

// $FF: renamed from: com.google.android.gms.internal.jz
public final class class_380 extends class_378 {
   // $FF: renamed from: a com.google.android.gms.internal.jz
   private static final class_380 field_1017 = new class_380();

   private class_380() {
      super("com.google.android.gms.ads.AdManagerCreatorImpl");
   }

   // $FF: renamed from: a (android.content.Context, com.google.android.gms.internal.x, java.lang.String, com.google.android.gms.internal.bk) com.google.android.gms.internal.e
   public static class_81 method_1304(Context var0, class_607 var1, String var2, class_558 var3) {
      Object var4;
      if (class_188.method_793(var0) == 0) {
         class_81 var5 = field_1017.method_1305(var0, var1, var2, var3);
         var4 = var5;
         if (var5 != null) {
            return (class_81)var4;
         }
      }

      class_467.method_1603("Using AdManager from the client jar.");
      var4 = new class_389(var0, var1, var2, var3, new class_424(4132500, 4132500, true));
      return (class_81)var4;
   }

   // $FF: renamed from: b (android.content.Context, com.google.android.gms.internal.x, java.lang.String, com.google.android.gms.internal.bk) com.google.android.gms.internal.e
   private class_81 method_1305(Context var1, class_607 var2, String var3, class_558 var4) {
      try {
         class_43 var5 = class_376.method_1293(var1);
         class_81 var8 = class_388.method_1316(((class_68)this.a(var1)).method_185(var5, var2, var3, var4, 4132500));
         return var8;
      } catch (RemoteException var6) {
         class_467.method_1607("Could not create remote AdManager.", var6);
         return null;
      } catch (class_372 var7) {
         class_467.method_1607("Could not create remote AdManager.", var7);
         return null;
      }
   }

   // $FF: renamed from: a (android.os.IBinder) java.lang.Object
   // $FF: synthetic method
   protected Object method_1299(IBinder var1) {
      return this.method_1306(var1);
   }

   // $FF: renamed from: b (android.os.IBinder) com.google.android.gms.internal.h
   protected class_68 method_1306(IBinder var1) {
      return class_595.method_1918(var1);
   }
}
