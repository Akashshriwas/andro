package mm;

import android.view.View;
import android.view.View.OnClickListener;

// $FF: renamed from: mm.at
class class_203 implements OnClickListener {
   // $FF: renamed from: a mm.rc
   // $FF: synthetic field
   final class_186 field_658;

   class_203(class_186 var1) {
      this.field_658 = var1;
   }

   public void onClick(View var1) {
      try {
         switch(var1.getId()) {
         case 2131165223:
            this.field_658.method_779();
            return;
         case 2131165242:
            this.field_658.method_777();
            return;
         case 2131165243:
            this.field_658.method_780();
            return;
         case 2131165244:
            this.field_658.method_778();
            return;
         default:
         }
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }
}
