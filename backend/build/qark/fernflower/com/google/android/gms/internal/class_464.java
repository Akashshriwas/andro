package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// $FF: renamed from: com.google.android.gms.internal.eo
final class class_464 extends BroadcastReceiver {
   private class_464() {
   }

   // $FF: synthetic method
   class_464(class_465 var1) {
      this();
   }

   public void onReceive(Context var1, Intent var2) {
      if ("android.intent.action.USER_PRESENT".equals(var2.getAction())) {
         class_466.method_1594(true);
      } else if ("android.intent.action.SCREEN_OFF".equals(var2.getAction())) {
         class_466.method_1594(false);
         return;
      }

   }
}
