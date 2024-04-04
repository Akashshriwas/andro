package mm;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;

// $FF: renamed from: mm.av
class class_209 implements OnErrorListener {
   // $FF: renamed from: a mm.rc
   // $FF: synthetic field
   final class_186 field_665;

   class_209(class_186 var1) {
      this.field_665 = var1;
   }

   public boolean onError(MediaPlayer var1, int var2, int var3) {
      class_186.method_768(this.field_665).notifyDataSetChanged();
      return false;
   }
}
