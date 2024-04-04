package mm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// $FF: renamed from: mm.aa
class class_172 extends BroadcastReceiver {
   // $FF: renamed from: a mm.m
   // $FF: synthetic field
   final class_184 field_507;

   class_172(class_184 var1) {
      this.field_507 = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      try {
         if (var2.getAction().compareTo("android.intent.action.HEADSET_PLUG") == 0 && var2.getIntExtra("state", -1) == 0 && this.field_507.field_561 != null && this.field_507.field_561.isPlaying()) {
            this.field_507.field_561.pause();
            this.field_507.field_581.setBackgroundResource(2130837586);
         }

      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }
}
