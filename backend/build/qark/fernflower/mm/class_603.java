package mm;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import dn.class_100;

// $FF: renamed from: mm.n
class class_603 implements OnClickListener {
   // $FF: renamed from: a mm.l
   // $FF: synthetic field
   final class_144 field_2006;

   class_603(class_144 var1) {
      this.field_2006 = var1;
   }

   public void onClick(View var1) {
      try {
         Intent var2 = new Intent("android.intent.action.SEND");
         var2.setType("text/plain");
         var2.putExtra("android.intent.extra.SUBJECT", var1.getResources().getString(2131230746));
         var2.putExtra("android.intent.extra.TEXT", "https://play.google.com/store/apps/details?id=" + var1.getContext().getPackageName());
         this.field_2006.a(class_100.method_307(var2, this.field_2006.c()));
      } catch (Exception var3) {
         class_100.method_311(var1.getContext(), var1.getResources().getString(2131230758));
      }
   }
}
