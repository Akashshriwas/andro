package mm;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;

// $FF: renamed from: mm.ag
class class_164 implements OnPreparedListener {
   // $FF: renamed from: a mm.pr
   // $FF: synthetic field
   final class_187 field_484;

   class_164(class_187 var1) {
      this.field_484 = var1;
   }

   // $FF: renamed from: a (mm.ag) mm.pr
   // $FF: synthetic method
   static class_187 method_665(class_164 var0) {
      return var0.field_484;
   }

   public void onPrepared(MediaPlayer var1) {
      (new Thread(new class_160(this))).start();
   }
}
