package mm;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.a.f.class_128;
import com.a.h.class_514;

// $FF: renamed from: mm.g
public class class_132 extends class_128 {
   // $FF: renamed from: d android.widget.TextView
   TextView field_152;
   // $FF: renamed from: e android.widget.TextView
   TextView field_153;
   // $FF: renamed from: f android.widget.TextView
   TextView field_154;
   // $FF: renamed from: g android.widget.ImageView
   ImageView field_155;
   // $FF: renamed from: h android.widget.LinearLayout
   LinearLayout field_156;
   // $FF: renamed from: i mm.i
   class_70 field_157;
   // $FF: renamed from: j android.view.View.OnClickListener
   private OnClickListener field_158 = new class_600(this);

   public class_132(Context var1, class_70 var2) {
      super(var1);
      this.field_157 = var2;
   }

   // $FF: renamed from: a (java.lang.Object, android.view.View, int) android.view.View
   public View method_382(Object var1, View var2, int var3) {
      class_514 var4 = (class_514)var1;
      View var5 = var2;
      if (var2 == null) {
         var5 = this.c.inflate(2130903041, (ViewGroup)null);
      }

      if (var3 % 2 == 0) {
         var5.setBackgroundResource(2130837563);
      } else {
         var5.setBackgroundResource(2130837562);
      }

      this.field_152 = (TextView)var5.findViewById(2131165198);
      this.field_153 = (TextView)var5.findViewById(2131165199);
      this.field_154 = (TextView)var5.findViewById(2131165197);
      this.field_156 = (LinearLayout)var5.findViewById(2131165200);
      this.field_156.setTag(var3);
      this.field_156.setOnClickListener(this.field_158);
      this.field_155 = (ImageView)var5.findViewById(2131165196);
      if (var3 % 2 == 0) {
         this.field_155.setImageResource(2130837610);
      } else {
         this.field_155.setImageResource(2130837612);
      }

      this.field_152.setText(var4.method_1744());
      this.field_153.setText(var4.method_1749());
      this.field_154.setText(var4.method_1746());
      if (var4.method_1743()) {
         this.field_152.setTextColor(this.c().getResources().getColor(2131099677));
      } else {
         this.field_152.setTextColor(this.c().getResources().getColor(2131099674));
      }

      if (var4.method_1740()) {
         this.field_153.setVisibility(0);
         return var5;
      } else {
         this.field_153.setVisibility(8);
         return var5;
      }
   }
}
