package mm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.class_636;

// $FF: renamed from: mm.ab
class class_157 extends BroadcastReceiver {
   // $FF: renamed from: a mm.m
   // $FF: synthetic field
   final class_184 field_474;

   class_157(class_184 var1) {
      this.field_474 = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      try {
         if (class_184.method_732(this.field_474) != null) {
            class_184.method_732(this.field_474).method_2046((new class_636()).method_2054());
         }

      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }
}
