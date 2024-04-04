package mm;

import android.view.View;
import android.view.View.OnClickListener;
import dn.class_100;

// $FF: renamed from: mm.am
class class_166 implements OnClickListener {
   // $FF: renamed from: a mm.pr
   // $FF: synthetic field
   final class_187 field_486;

   class_166(class_187 var1) {
      this.field_486 = var1;
   }

   public void onClick(View var1) {
      try {
         this.field_486.onBackPressed();
      } catch (Exception var3) {
         class_100.method_311(var1.getContext(), var1.getResources().getString(2131230758));
      }
   }
}
