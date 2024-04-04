package mm;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.a.f.class_128;
import com.a.h.class_514;

// $FF: renamed from: mm.t
public class class_129 extends class_128 {
   // $FF: renamed from: d android.widget.TextView
   TextView field_143;
   // $FF: renamed from: e android.widget.TextView
   TextView field_144;
   // $FF: renamed from: f android.widget.ImageView
   ImageView field_145;

   public class_129(Context var1) {
      super(var1);
   }

   // $FF: renamed from: a (java.lang.Object, android.view.View, int) android.view.View
   public View method_382(Object var1, View var2, int var3) {
      class_514 var4 = (class_514)var1;
      View var5 = var2;
      if (var2 == null) {
         var5 = this.c.inflate(2130903062, (ViewGroup)null);
      }

      if (var3 % 2 == 0) {
         var5.setBackgroundResource(2130837563);
      } else {
         var5.setBackgroundResource(2130837562);
      }

      this.field_143 = (TextView)var5.findViewById(2131165198);
      this.field_144 = (TextView)var5.findViewById(2131165197);
      this.field_145 = (ImageView)var5.findViewById(2131165196);
      if (var3 % 2 == 0) {
         this.field_145.setImageResource(2130837610);
      } else {
         this.field_145.setImageResource(2130837612);
      }

      this.field_143.setText(var4.method_1744());
      this.field_144.setText(var4.method_1746());
      if (var4.method_1743()) {
         this.field_143.setTextColor(this.c().getResources().getColor(2131099677));
         this.field_144.setTextColor(this.c().getResources().getColor(2131099677));
         return var5;
      } else {
         this.field_143.setTextColor(this.c().getResources().getColor(2131099674));
         this.field_144.setTextColor(this.c().getResources().getColor(2131099658));
         return var5;
      }
   }
}
