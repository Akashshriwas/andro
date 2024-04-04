package mm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.class_636;

// $FF: renamed from: mm.al
class class_165 extends BroadcastReceiver {
   // $FF: renamed from: a mm.pr
   // $FF: synthetic field
   final class_187 field_485;

   class_165(class_187 var1) {
      this.field_485 = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      try {
         if (class_187.method_787(this.field_485) != null) {
            class_187.method_787(this.field_485).method_2046((new class_636()).method_2054());
         }

      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }
}
