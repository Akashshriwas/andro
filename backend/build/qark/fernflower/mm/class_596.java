package mm;

import java.util.ArrayList;

// $FF: renamed from: mm.c
class class_596 implements Runnable {
   // $FF: renamed from: a mm.a
   // $FF: synthetic field
   final class_145 field_1978;

   class_596(class_145 var1) {
      this.field_1978 = var1;
   }

   public void run() {
      try {
         new ArrayList();
         ArrayList var1 = this.field_1978.method_642();
         this.field_1978.method_639(var1);
         this.field_1978.c().runOnUiThread(class_145.method_637(this.field_1978));
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }
}
