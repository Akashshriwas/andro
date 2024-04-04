package dn;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;

// $FF: renamed from: dn.c
class class_96 implements OnClickListener {
   // $FF: renamed from: a android.content.Context
   // $FF: synthetic field
   private final Context field_107;
   // $FF: renamed from: b android.content.SharedPreferences.Editor
   // $FF: synthetic field
   private final Editor field_108;

   class_96(Context var1, Editor var2) {
      this.field_107 = var1;
      this.field_108 = var2;
   }

   public void onClick(View var1) {
      try {
         class_98.field_109.cancel();
         class_98.method_302(this.field_107, this.field_108);
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }
}
