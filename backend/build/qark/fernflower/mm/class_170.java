package mm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// $FF: renamed from: mm.ap
class class_170 extends BroadcastReceiver {
   // $FF: renamed from: a mm.rc
   // $FF: synthetic field
   final class_186 field_489;

   class_170(class_186 var1) {
      this.field_489 = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      try {
         if (var2.getAction().compareTo("android.intent.action.HEADSET_PLUG") == 0 && var2.getIntExtra("state", -1) == 0 && this.field_489.field_615 != null && this.field_489.field_615.isPlaying()) {
            this.field_489.field_615.pause();
            this.field_489.field_612.setBackgroundResource(2130837595);
         }

      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }
}
