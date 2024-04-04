package mm;

import android.view.View;
import android.view.View.OnClickListener;

// $FF: renamed from: mm.u
class class_657 implements OnClickListener {
   // $FF: renamed from: a mm.m
   // $FF: synthetic field
   final class_184 field_2218;

   class_657(class_184 var1) {
      this.field_2218 = var1;
   }

   public void onClick(View var1) {
      try {
         switch(var1.getId()) {
         case 2131165215:
            class_184.method_729(this.field_2218);
            return;
         case 2131165216:
         case 2131165217:
         case 2131165218:
         case 2131165220:
         case 2131165221:
         default:
            return;
         case 2131165219:
            class_184.method_727(this.field_2218);
            return;
         case 2131165222:
            class_184.method_725(this.field_2218);
            return;
         case 2131165223:
            this.field_2218.method_751();
            return;
         case 2131165224:
            class_184.method_722(this.field_2218);
            return;
         case 2131165225:
            class_184.method_728(this.field_2218);
         }
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }
}
