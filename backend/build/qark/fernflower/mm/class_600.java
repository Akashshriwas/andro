package mm;

import android.view.View;
import android.view.View.OnClickListener;

// $FF: renamed from: mm.h
class class_600 implements OnClickListener {
   // $FF: renamed from: a mm.g
   // $FF: synthetic field
   final class_132 field_2004;

   class_600(class_132 var1) {
      this.field_2004 = var1;
   }

   public void onClick(View var1) {
      try {
         if (this.field_2004.field_157 != null) {
            this.field_2004.field_157.method_188(Integer.parseInt(var1.getTag().toString()));
         }

      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }
}
