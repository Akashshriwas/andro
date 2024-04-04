package mm;

import android.telephony.PhoneStateListener;

// $FF: renamed from: mm.ae
class class_154 extends PhoneStateListener {
   // $FF: renamed from: a mm.m
   // $FF: synthetic field
   final class_184 field_472;

   private class_154(class_184 var1) {
      this.field_472 = var1;
   }

   // $FF: synthetic method
   class_154(class_184 var1, class_154 var2) {
      this(var1);
   }

   public void onCallStateChanged(int var1, String var2) {
      switch(var1) {
      case 1:
      case 2:
         if (this.field_472.field_561 != null && this.field_472.field_561.isPlaying()) {
            this.field_472.field_561.pause();
            this.field_472.field_581.setBackgroundResource(2130837586);
            return;
         }
      default:
      }
   }
}
