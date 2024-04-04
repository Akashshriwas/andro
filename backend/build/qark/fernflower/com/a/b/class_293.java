package com.a.b;

import android.view.View;
import android.view.View.OnClickListener;

// $FF: renamed from: com.a.b.c
class class_293 implements OnClickListener {
   // $FF: renamed from: a com.a.b.b
   // $FF: synthetic field
   final class_297 field_809;

   class_293(class_297 var1) {
      this.field_809 = var1;
   }

   public void onClick(View var1) {
      try {
         this.field_809.field_826.dismiss();
         class_297.method_1011(this.field_809, this.field_809.method_1015());
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }
}
