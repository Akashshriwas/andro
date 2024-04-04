package com.google.android.gms.ads.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.common.class_175;
import com.google.android.gms.common.class_177;
import com.google.android.gms.common.class_188;
import java.io.IOException;

// $FF: renamed from: com.google.android.gms.ads.b.a
public final class class_156 {
   // $FF: renamed from: a (android.content.Context) com.google.android.gms.ads.b.b
   public static class_161 method_660(Context param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (android.content.Context) com.google.android.gms.common.i
   private static class_177 method_661(Context var0) {
      try {
         var0.getPackageManager().getPackageInfo("com.android.vending", 0);
      } catch (NameNotFoundException var4) {
         throw new class_175(9);
      }

      try {
         class_188.method_801(var0);
      } catch (class_175 var3) {
         throw new IOException(var3);
      }

      class_177 var1 = new class_177();
      Intent var2 = new Intent("com.google.android.gms.ads.identifier.service.START");
      var2.setPackage("com.google.android.gms");
      if (var0.bindService(var2, var1, 1)) {
         return var1;
      } else {
         throw new IOException("Connection failure");
      }
   }
}
