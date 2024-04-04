package mm;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.a.a.class_284;
import com.a.f.class_128;
import dn.class_91;
import java.util.ArrayList;

// $FF: renamed from: mm.k
public class class_131 extends class_128 {
   // $FF: renamed from: d android.widget.TextView
   TextView field_147;
   // $FF: renamed from: e android.widget.TextView
   TextView field_148;
   // $FF: renamed from: f android.widget.TextView
   TextView field_149;
   // $FF: renamed from: g android.widget.TextView
   TextView field_150;
   // $FF: renamed from: h android.widget.RelativeLayout
   RelativeLayout field_151;

   public class_131(Context var1) {
      super(var1);
   }

   // $FF: renamed from: a (int) int
   private int method_388(int var1) {
      int var2 = 2130837578;
      switch(var1) {
      case 1:
         return 2130837517;
      case 2:
         return 2130837518;
      case 3:
         return 2130837519;
      case 7:
         return 2130837592;
      case 8:
         return 2130837605;
      case 9:
         return 2130837548;
      default:
         var2 = 2130837516;
      case 4:
      case 5:
      case 6:
         return var2;
      }
   }

   // $FF: renamed from: a (java.lang.Object, android.view.View, int) android.view.View
   public View method_382(Object var1, View var2, int var3) {
      View var4 = var2;
      if (var2 == null) {
         var4 = this.c.inflate(2130903045, (ViewGroup)null);
      }

      this.field_147 = (TextView)var4.findViewById(2131165198);
      this.field_150 = (TextView)var4.findViewById(2131165204);
      this.field_148 = (TextView)var4.findViewById(2131165206);
      this.field_151 = (RelativeLayout)var4.findViewById(2131165203);
      this.field_149 = (TextView)var4.findViewById(2131165205);
      class_284 var5 = (class_284)var1;
      this.field_147.setText(var5.method_980());
      var4.setTag(var5.method_981());
      this.field_150.setBackgroundResource(var5.method_979());
      switch(var3) {
      case 0:
      case 1:
      case 2:
      case 3:
         this.field_150.setText(String.valueOf(var3 + 1));
         break;
      default:
         this.field_150.setText("");
      }

      switch(var3) {
      case 3:
         this.field_148.setVisibility(0);
         this.field_148.setText(this.c().getString(2131230784));
         break;
      case 4:
      case 5:
      default:
         this.field_148.setVisibility(8);
         break;
      case 6:
         this.field_148.setVisibility(0);
         this.field_148.setText(this.c().getString(2131230785));
      }

      var3 = (int)TypedValue.applyDimension(1, 46.0F, this.c().getResources().getDisplayMetrics());
      this.field_147.getLayoutParams().height = var3;
      this.field_149.setVisibility(8);
      if (var5.method_981() == class_91.method_281().method_286(class_91.field_82)) {
         var4.setBackgroundColor(var4.getResources().getColor(2131099679));
         return var4;
      } else {
         var4.setBackgroundResource(2130903043);
         return var4;
      }
   }

   // $FF: renamed from: a () java.util.ArrayList
   public ArrayList method_383() {
      ArrayList var2 = new ArrayList();
      String[] var3 = this.c().getResources().getStringArray(2131361792);

      for(int var1 = 0; var1 < var3.length; ++var1) {
         var2.add(new class_284(var3[var1], var1, this.method_388(var1), ""));
      }

      return var2;
   }
}
