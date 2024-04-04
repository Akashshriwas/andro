package mm;

import android.content.Intent;

// $FF: renamed from: mm.bc
class class_199 implements Runnable {
   // $FF: renamed from: a mm.sp
   // $FF: synthetic field
   final class_519 field_646;

   class_199(class_519 var1) {
      this.field_646 = var1;
   }

   public void run() {
      Intent var1 = new Intent(this.field_646.getApplication(), m.class);
      var1.setFlags(67108864);
      this.field_646.startActivity(var1);
      this.field_646.finish();
   }
}
