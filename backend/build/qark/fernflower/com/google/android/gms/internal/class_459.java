package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.class_188;

// $FF: renamed from: com.google.android.gms.internal.dd
public final class class_459 {
   // $FF: renamed from: a (android.content.Context, com.google.android.gms.internal.bz, com.google.android.gms.internal.de) com.google.android.gms.internal.ef
   public static class_426 method_1543(Context var0, class_433 var1, class_54 var2) {
      return var1.field_1167.field_1130 ? method_1544(var0, var1, var2) : method_1545(var0, var1, var2);
   }

   // $FF: renamed from: b (android.content.Context, com.google.android.gms.internal.bz, com.google.android.gms.internal.de) com.google.android.gms.internal.ef
   private static class_426 method_1544(Context var0, class_433 var1, class_54 var2) {
      class_467.method_1603("Fetching ad response from local ad request service.");
      class_430 var3 = new class_430(var0, var1, var2);
      var3.e();
      return var3;
   }

   // $FF: renamed from: c (android.content.Context, com.google.android.gms.internal.bz, com.google.android.gms.internal.de) com.google.android.gms.internal.ef
   private static class_426 method_1545(Context var0, class_433 var1, class_54 var2) {
      class_467.method_1603("Fetching ad response from remote ad request service.");
      if (class_188.method_793(var0) != 0) {
         class_467.method_1610("Failed to connect to remote ad request service.");
         return null;
      } else {
         return new class_429(var0, var1, var2);
      }
   }
}
