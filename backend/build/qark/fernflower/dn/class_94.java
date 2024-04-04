package dn;

import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;

// $FF: renamed from: dn.d
class class_94 implements OnClickListener {
   // $FF: renamed from: a android.content.SharedPreferences.Editor
   // $FF: synthetic field
   private final Editor field_106;

   class_94(Editor var1) {
      this.field_106 = var1;
   }

   public void onClick(View var1) {
      try {
         if (this.field_106 != null) {
            this.field_106.putLong("date_reminder_pressed", System.currentTimeMillis());
            this.field_106.commit();
            class_98.field_109.cancel();
         }

      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }
}
