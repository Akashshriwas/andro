package mm;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.a.f.class_128;
import com.a.g.class_522;
import com.a.h.class_513;
import dn.class_100;

// $FF: renamed from: mm.r
public class class_130 extends class_128 {
   // $FF: renamed from: d com.a.g.a
   class_522 field_146;

   public class_130(Context var1) {
      super(var1);
      this.field_146 = new class_522(var1);
   }

   // $FF: renamed from: a (com.a.h.e) boolean
   private boolean method_387(class_513 var1) {
      boolean var3 = false;
      boolean var2 = var3;
      if (class_100.method_312()) {
         var2 = var3;
         if (var1.method_1729() > 5) {
            var2 = var3;
            if (!class_100.method_313(var1.method_1729())) {
               var2 = true;
            }
         }
      }

      return var2;
   }

   // $FF: renamed from: a (java.lang.Object, android.view.View, int) android.view.View
   public View method_382(Object var1, View var2, int var3) {
      class_513 var4 = (class_513)var1;
      View var5 = var2;
      if (var2 == null) {
         var5 = this.c.inflate(2130903050, (ViewGroup)null);
      }

      class_658 var6 = new class_658(this);
      if (var5.getTag() == null) {
         var6.field_2223 = (TextView)var5.findViewById(2131165198);
         var6.field_2224 = (TextView)var5.findViewById(2131165199);
         var6.field_2225 = (TextView)var5.findViewById(2131165226);
         var5.setTag(var6);
      } else {
         var6 = (class_658)var5.getTag();
      }

      if (var3 % 2 == 0) {
         var5.setBackgroundResource(2130837563);
      } else {
         var5.setBackgroundResource(2130837562);
      }

      var6.field_2223.setText(var4.method_1732());
      var6.field_2224.setText(var4.method_1735());
      var6.field_2225.setText(String.valueOf(var4.method_1736()));
      if (this.method_387(var4)) {
         this.field_146.method_1776(class_100.method_322(var4.method_1729()), var4.method_1729());
      }

      return var5;
   }
}
