package mm;

import android.view.View;
import android.view.View.OnClickListener;
import dn.class_100;

// $FF: renamed from: mm.au
class class_204 implements OnClickListener {
   // $FF: renamed from: a mm.rc
   // $FF: synthetic field
   final class_186 field_659;

   class_204(class_186 var1) {
      this.field_659 = var1;
   }

   public void onClick(View var1) {
      try {
         this.field_659.onBackPressed();
      } catch (Exception var3) {
         class_100.method_311(var1.getContext(), var1.getResources().getString(2131230758));
      }
   }
}
