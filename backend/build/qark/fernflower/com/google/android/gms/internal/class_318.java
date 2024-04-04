package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

// $FF: renamed from: com.google.android.gms.internal.ge
final class class_318 implements ServiceConnection {
   // $FF: renamed from: a com.google.android.gms.internal.fx
   // $FF: synthetic field
   final class_460 field_899;

   class_318(class_460 var1) {
      this.field_899 = var1;
   }

   public void onServiceConnected(ComponentName var1, IBinder var2) {
      this.field_899.method_1562(var2);
   }

   public void onServiceDisconnected(ComponentName var1) {
      class_460.method_1546(this.field_899, (IInterface)null);
      class_460.method_1548(this.field_899).method_1066();
   }
}
