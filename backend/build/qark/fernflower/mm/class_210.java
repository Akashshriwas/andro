package mm;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;

// $FF: renamed from: mm.aw
class class_210 implements OnPreparedListener {
   // $FF: renamed from: a mm.rc
   // $FF: synthetic field
   final class_186 field_672;

   class_210(class_186 var1) {
      this.field_672 = var1;
   }

   // $FF: renamed from: a (mm.aw) mm.rc
   // $FF: synthetic method
   static class_186 method_822(class_210 var0) {
      return var0.field_672;
   }

   public void onPrepared(MediaPlayer var1) {
      this.field_672.field_592 = true;
      this.field_672.field_596 = new Thread(new class_207(this));
      this.field_672.field_596.start();
   }
}
