package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.class_25;
import com.google.android.gms.common.class_26;

// $FF: renamed from: com.google.android.gms.internal.dk
public class class_461 extends class_460 {
   // $FF: renamed from: e int
   private final int field_1267;

   public class_461(Context var1, class_26 var2, class_25 var3, int var4) {
      super(var1, var2, var3);
      this.field_1267 = var4;
   }

   // $FF: renamed from: a (android.os.IBinder) com.google.android.gms.internal.dp
   protected class_53 method_1569(IBinder var1) {
      return class_446.method_1500(var1);
   }

   // $FF: renamed from: a () java.lang.String
   protected String method_1554() {
      return "com.google.android.gms.ads.service.START";
   }

   // $FF: renamed from: a (com.google.android.gms.internal.gr, com.google.android.gms.internal.gc) void
   protected void method_1558(class_38 var1, class_303 var2) {
      Bundle var3 = new Bundle();
      var1.method_115(var2, this.field_1267, this.h().getPackageName(), var3);
   }

   // $FF: renamed from: b (android.os.IBinder) android.os.IInterface
   // $FF: synthetic method
   protected IInterface method_1560(IBinder var1) {
      return this.method_1569(var1);
   }

   // $FF: renamed from: b () java.lang.String
   protected String method_1561() {
      return "com.google.android.gms.ads.internal.request.IAdRequestService";
   }

   // $FF: renamed from: c () com.google.android.gms.internal.dp
   public class_53 method_1570() {
      return (class_53)super.method_1568();
   }
}
