package android.support.v4.app;

import android.os.Handler;
import android.os.Message;

// $FF: renamed from: android.support.v4.app.h
class class_609 extends Handler {
   // $FF: renamed from: a android.support.v4.app.g
   // $FF: synthetic field
   final class_181 field_2030;

   class_609(class_181 var1) {
      this.field_2030 = var1;
   }

   public void handleMessage(Message var1) {
      switch(var1.what) {
      case 1:
         if (this.field_2030.field_542) {
            this.field_2030.method_698(false);
            return;
         }
         break;
      case 2:
         this.field_2030.method_699();
         this.field_2030.field_539.method_1991();
         return;
      default:
         super.handleMessage(var1);
      }

   }
}
