package mm;

import android.telephony.PhoneStateListener;

// $FF: renamed from: mm.bb
class class_212 extends PhoneStateListener {
   // $FF: renamed from: a mm.rc
   // $FF: synthetic field
   final class_186 field_674;

   private class_212(class_186 var1) {
      this.field_674 = var1;
   }

   // $FF: synthetic method
   class_212(class_186 var1, class_212 var2) {
      this(var1);
   }

   public void onCallStateChanged(int var1, String var2) {
      switch(var1) {
      case 1:
      case 2:
         if (this.field_674.field_615 != null && this.field_674.field_615.isPlaying()) {
            this.field_674.field_612.setBackgroundResource(2130837595);
            this.field_674.field_615.pause();
            return;
         }
      default:
      }
   }
}
