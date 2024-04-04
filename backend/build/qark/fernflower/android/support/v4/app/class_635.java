package android.support.v4.app;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

// $FF: renamed from: android.support.v4.app.v
class class_635 implements OnItemClickListener {
   // $FF: renamed from: a android.support.v4.app.t
   // $FF: synthetic field
   final class_143 field_2133;

   class_635(class_143 var1) {
      this.field_2133 = var1;
   }

   public void onItemClick(AdapterView var1, View var2, int var3, long var4) {
      this.field_2133.method_634((ListView)var1, var2, var3, var4);
   }
}
