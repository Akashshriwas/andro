package mm;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import com.a.c.class_110;
import dn.class_100;
import dn.class_91;

// $FF: renamed from: mm.sp
public class class_519 extends Activity {
   // $FF: renamed from: a int
   protected int field_1606 = 1000;
   // $FF: renamed from: b dn.f
   class_91 field_1607;
   // $FF: renamed from: c android.widget.ProgressBar
   ProgressBar field_1608;

   // $FF: renamed from: a (mm.sp) java.lang.Boolean
   // $FF: synthetic method
   static Boolean method_1770(class_519 var0) {
      return var0.method_1772();
   }

   // $FF: renamed from: a () void
   private void method_1771() {
      class_100.method_319();
      if (class_91.field_89 > this.field_1607.method_286(class_91.field_94)) {
         this.field_1607.method_288();
         this.field_1607.method_282(class_91.field_82, 0);
         this.field_1607.method_282(class_91.field_94, class_91.field_89);
      }

      if (this.field_1607.method_286(class_91.field_93) == class_91.field_88) {
         (new Handler()).postDelayed(new class_199(this), (long)this.field_1606);
      } else {
         (new class_201(this)).execute(new Boolean[]{true});
      }
   }

   // $FF: renamed from: b () java.lang.Boolean
   private Boolean method_1772() {
      class_110 var1 = new class_110();

      try {
         var1.method_346();
         var1.method_345();
         this.field_1607.method_282(class_91.field_93, class_91.field_88);
      } catch (Exception var2) {
         var2.printStackTrace();
         return false;
      }

      return true;
   }

   public void onBackPressed() {
   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.requestWindowFeature(1);
      this.setContentView(2130903069);
      this.field_1608 = (ProgressBar)this.findViewById(2131165249);
      this.field_1607 = class_91.method_281();
      this.method_1771();
   }
}
