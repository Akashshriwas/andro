package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.drive.metadata.class_213;
import com.google.android.gms.internal.class_336;
import com.google.android.gms.internal.class_337;
import java.util.HashMap;
import java.util.Map;

// $FF: renamed from: com.google.android.gms.drive.metadata.internal.c
public final class class_223 {
   // $FF: renamed from: a java.util.Map
   private static Map field_686 = new HashMap();

   static {
      method_826(class_337.field_941);
      method_826(class_337.field_942);
      method_826(class_337.field_943);
      method_826(class_337.field_944);
      method_826(class_337.field_945);
      method_826(class_337.field_946);
      method_826(class_337.field_947);
      method_826(class_337.field_948);
      method_826(class_336.field_939);
      method_826(class_336.field_937);
      method_826(class_336.field_938);
      method_826(class_336.field_940);
   }

   // $FF: renamed from: a (java.lang.String) com.google.android.gms.drive.metadata.b
   public static class_213 method_825(String var0) {
      return (class_213)field_686.get(var0);
   }

   // $FF: renamed from: a (com.google.android.gms.drive.metadata.b) void
   private static void method_826(class_213 var0) {
      if (field_686.containsKey(var0.method_823())) {
         throw new IllegalArgumentException("Duplicate field name registered: " + var0.method_823());
      } else {
         field_686.put(var0.method_823(), var0);
      }
   }
}
