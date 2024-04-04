package com.a.b;

import android.view.View;
import android.view.View.OnClickListener;

// $FF: renamed from: com.a.b.e
class class_299 implements OnClickListener {
   // $FF: renamed from: a com.a.b.d
   // $FF: synthetic field
   final class_295 field_835;

   class_299(class_295 var1) {
      this.field_835 = var1;
   }

   public void onClick(View var1) {
      try {
         this.field_835.field_815.dismiss();
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }
}
