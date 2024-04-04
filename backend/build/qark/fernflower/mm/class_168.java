package mm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// $FF: renamed from: mm.ak
class class_168 extends BroadcastReceiver {
   // $FF: renamed from: a mm.pr
   // $FF: synthetic field
   final class_187 field_488;

   class_168(class_187 var1) {
      this.field_488 = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      try {
         var2.getAction().compareTo("android.intent.action.HEADSET_PLUG");
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }
}
