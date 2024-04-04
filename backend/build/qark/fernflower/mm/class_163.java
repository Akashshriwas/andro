package mm;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import dn.class_100;

// $FF: renamed from: mm.af
class class_163 implements OnErrorListener {
   // $FF: renamed from: a mm.pr
   // $FF: synthetic field
   final class_187 field_483;

   class_163(class_187 var1) {
      this.field_483 = var1;
   }

   public boolean onError(MediaPlayer var1, int var2, int var3) {
      class_100.method_311(this.field_483.field_622.getContext(), this.field_483.getString(2131230758));
      if (class_187.method_783(this.field_483) != null) {
         ((class_133)class_187.method_783(this.field_483)).method_390(-1);
         ((class_133)class_187.method_783(this.field_483)).notifyDataSetChanged();
      }

      return false;
   }
}
