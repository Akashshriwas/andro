package mm;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.a.f.class_128;
import com.a.g.class_155;
import com.a.h.class_517;
import dn.class_100;

// $FF: renamed from: mm.ao
class class_133 extends class_128 {
   // $FF: renamed from: d android.widget.TextView
   TextView field_159;
   // $FF: renamed from: e android.widget.TextView
   TextView field_160;
   // $FF: renamed from: f android.widget.ImageView
   ImageView field_161;
   // $FF: renamed from: g android.widget.ImageView
   ImageView field_162;
   // $FF: renamed from: h android.widget.ProgressBar
   ProgressBar field_163;
   // $FF: renamed from: i int
   int field_164;
   // $FF: renamed from: j com.a.g.d
   class_155 field_165;
   // $FF: renamed from: k mm.pr
   // $FF: synthetic field
   final class_187 field_166;

   public class_133(class_187 var1, Context var2) {
      super(var2);
      this.field_166 = var1;
      this.field_164 = -1;
      this.field_165 = new class_155(var2);
   }

   // $FF: renamed from: a (com.a.h.g) boolean
   private boolean method_389(class_517 var1) {
      boolean var3 = false;
      boolean var2 = var3;
      if (class_100.method_312()) {
         var2 = var3;
         if (!class_100.method_314(var1.method_1759())) {
            var2 = true;
         }
      }

      return var2;
   }

   // $FF: renamed from: a (java.lang.Object, android.view.View, int) android.view.View
   public View method_382(Object var1, View var2, int var3) {
      class_517 var4 = (class_517)var1;
      View var5 = var2;
      if (var2 == null) {
         var5 = this.c.inflate(2130903059, (ViewGroup)null);
      }

      if (var3 % 2 == 0) {
         var5.setBackgroundResource(2130837563);
      } else {
         var5.setBackgroundResource(2130837562);
      }

      this.field_159 = (TextView)var5.findViewById(2131165198);
      this.field_160 = (TextView)var5.findViewById(2131165199);
      this.field_161 = (ImageView)var5.findViewById(2131165196);
      this.field_162 = (ImageView)var5.findViewById(2131165234);
      this.field_163 = (ProgressBar)var5.findViewById(2131165221);
      if (var3 == this.method_391()) {
         this.field_162.setVisibility(8);
         this.field_163.setVisibility(0);
      } else {
         this.field_163.setVisibility(8);
         this.field_162.setVisibility(0);
      }

      if (var3 % 2 == 0) {
         this.field_161.setImageResource(2130837610);
      } else {
         this.field_161.setImageResource(2130837612);
      }

      this.field_159.setText(var4.method_1756());
      this.field_160.setText(var4.method_1758());
      if (var4.method_1753()) {
         this.field_159.setTextColor(this.c().getResources().getColor(2131099677));
      } else {
         this.field_159.setTextColor(this.c().getResources().getColor(2131099674));
      }

      if (this.method_389(var4)) {
         this.field_165.method_659(class_100.method_318(var4.method_1759()), var4.method_1759());
      }

      return var5;
   }

   // $FF: renamed from: a (int) void
   public void method_390(int var1) {
      this.field_164 = var1;
   }

   // $FF: renamed from: d () int
   public int method_391() {
      return this.field_164;
   }
}
