package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;

// $FF: renamed from: com.google.android.gms.internal.gc
public final class class_303 extends class_302 {
   // $FF: renamed from: a com.google.android.gms.internal.fx
   private class_460 field_847;

   public class_303(class_460 var1) {
      this.field_847 = var1;
   }

   // $FF: renamed from: a (int, android.os.IBinder, android.os.Bundle) void
   public void method_122(int var1, IBinder var2, Bundle var3) {
      class_343.method_1190("onPostInitComplete can be called only once per call to getServiceFromBroker", this.field_847);
      this.field_847.method_1555(var1, var2, var3);
      this.field_847 = null;
   }
}
