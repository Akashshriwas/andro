package mm;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

// $FF: renamed from: mm.ay
class class_208 implements OnCompletionListener {
   // $FF: renamed from: a mm.rc
   // $FF: synthetic field
   final class_186 field_664;

   class_208(class_186 var1) {
      this.field_664 = var1;
   }

   public void onCompletion(MediaPlayer var1) {
      this.field_664.field_612.setBackgroundResource(2130837595);
   }
}
