package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.a.class_372;
import com.google.android.gms.a.class_376;
import com.google.android.gms.a.class_378;
import com.google.android.gms.a.class_43;

// $FF: renamed from: com.google.android.gms.internal.cn
public final class class_379 extends class_378 {
   // $FF: renamed from: a com.google.android.gms.internal.cn
   private static final class_379 field_1016 = new class_379();

   private class_379() {
      super("com.google.android.gms.ads.AdOverlayCreatorImpl");
   }

   // $FF: renamed from: a (android.app.Activity) com.google.android.gms.internal.cp
   public static class_49 method_1300(Activity var0) {
      try {
         if (method_1301(var0)) {
            class_467.method_1603("Using AdOverlay from the client jar.");
            return new class_420(var0);
         } else {
            class_49 var2 = field_1016.method_1302(var0);
            return var2;
         }
      } catch (class_421 var1) {
         class_467.method_1610(var1.getMessage());
         return null;
      }
   }

   // $FF: renamed from: b (android.app.Activity) boolean
   private static boolean method_1301(Activity var0) {
      Intent var1 = var0.getIntent();
      if (!var1.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
         throw new class_421("Ad overlay requires the useClientJar flag in intent extras.");
      } else {
         return var1.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
      }
   }

   // $FF: renamed from: c (android.app.Activity) com.google.android.gms.internal.cp
   private class_49 method_1302(Activity var1) {
      try {
         class_43 var2 = class_376.method_1293(var1);
         class_49 var5 = class_419.method_1436(((class_50)this.a(var1)).method_149(var2));
         return var5;
      } catch (RemoteException var3) {
         class_467.method_1607("Could not create remote AdOverlay.", var3);
         return null;
      } catch (class_372 var4) {
         class_467.method_1607("Could not create remote AdOverlay.", var4);
         return null;
      }
   }

   // $FF: renamed from: a (android.os.IBinder) java.lang.Object
   // $FF: synthetic method
   protected Object method_1299(IBinder var1) {
      return this.method_1303(var1);
   }

   // $FF: renamed from: b (android.os.IBinder) com.google.android.gms.internal.cs
   protected class_50 method_1303(IBinder var1) {
      return class_423.method_1451(var1);
   }
}
