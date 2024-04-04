package mm;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import dn.class_100;
import java.io.File;

// $FF: renamed from: mm.ba
class class_211 implements OnClickListener {
   // $FF: renamed from: a mm.rc
   // $FF: synthetic field
   final class_186 field_673;

   class_211(class_186 var1) {
      this.field_673 = var1;
   }

   public void onClick(DialogInterface var1, int var2) {
      try {
         File var3 = new File(class_100.method_321(this.field_673.field_606));
         if (class_100.method_317(this.field_673.field_606) && var3.delete()) {
            this.field_673.field_611.setVisibility(8);
            this.field_673.field_610.setVisibility(0);
            this.field_673.field_612.setVisibility(8);
            this.field_673.field_613.setVisibility(8);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      var1.dismiss();
   }
}
