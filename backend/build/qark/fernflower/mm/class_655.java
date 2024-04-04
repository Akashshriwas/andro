package mm;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.a.a.class_284;
import dn.class_100;

// $FF: renamed from: mm.o
class class_655 implements OnItemClickListener {
   // $FF: renamed from: a mm.l
   // $FF: synthetic field
   final class_144 field_2216;

   class_655(class_144 var1) {
      this.field_2216 = var1;
   }

   public void onItemClick(AdapterView var1, View var2, int var3, long var4) {
      try {
         this.field_2216.field_446 = var3;
         class_284 var7 = (class_284)this.field_2216.field_445.getItem(var3);
         this.field_2216.field_444.method_201(var7, var2);
      } catch (Exception var6) {
         class_100.method_311(var2.getContext(), var2.getResources().getString(2131230758));
      }
   }
}
