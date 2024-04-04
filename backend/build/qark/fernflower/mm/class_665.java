package mm;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;

// $FF: renamed from: mm.w
class class_665 implements OnPreparedListener {
   // $FF: renamed from: a mm.m
   // $FF: synthetic field
   final class_184 field_2298;

   class_665(class_184 var1) {
      this.field_2298 = var1;
   }

   // $FF: renamed from: a (mm.w) mm.m
   // $FF: synthetic method
   static class_184 method_2202(class_665 var0) {
      return var0.field_2298;
   }

   public void onPrepared(MediaPlayer var1) {
      this.field_2298.field_564 = new Thread(new class_664(this));
      this.field_2298.field_564.start();
   }
}
