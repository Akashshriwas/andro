package com.google.android.gms.internal;

import android.os.RemoteException;

// $FF: renamed from: com.google.android.gms.internal.ak
class class_526 implements Runnable {
   // $FF: renamed from: a com.google.android.gms.internal.ar
   // $FF: synthetic field
   final class_542 field_1627;
   // $FF: renamed from: b com.google.android.gms.internal.aj
   // $FF: synthetic field
   final class_528 field_1628;

   class_526(class_528 var1, class_542 var2) {
      this.field_1628 = var1;
      this.field_1627 = var2;
   }

   public void run() {
      try {
         this.field_1627.field_1674.method_177();
      } catch (RemoteException var2) {
         class_467.method_1607("Could not destroy mediation adapter.", var2);
      }
   }
}
