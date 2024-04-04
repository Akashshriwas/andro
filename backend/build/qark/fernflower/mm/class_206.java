package mm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.class_636;

// $FF: renamed from: mm.as
class class_206 extends BroadcastReceiver {
   // $FF: renamed from: a mm.rc
   // $FF: synthetic field
   final class_186 field_662;

   class_206(class_186 var1) {
      this.field_662 = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      try {
         if (class_186.method_764(this.field_662) != null) {
            class_186.method_764(this.field_662).method_2046((new class_636()).method_2054());
         }

      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }
}
