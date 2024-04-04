package mm;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.a.d.class_111;
import com.a.f.class_128;
import com.a.h.class_513;
import dn.class_91;
import java.util.ArrayList;

// $FF: renamed from: mm.q
public class class_146 extends class_145 {
   // $FF: renamed from: a (com.a.h.e) void
   private void method_645(class_513 var1) {
      if (this.c() != null) {
         Intent var4 = new Intent(this.c(), pr.class);
         int var3 = var1.method_1736();
         int var2 = var3;
         if (var3 >= 15) {
            var2 = var3 + 1;
         }

         var4.putExtra(class_91.field_84, var2);
         var4.putExtra(class_91.field_83, var1.method_1732());
         this.a(var4);
         this.c().overridePendingTransition(2130968576, 2130968577);
      }

   }

   // $FF: renamed from: a (android.view.View) void
   public void method_638(View var1) {
   }

   public void onItemClick(AdapterView var1, View var2, int var3, long var4) {
      Exception var10000;
      label60: {
         class_513 var12;
         class_184 var14;
         boolean var10001;
         try {
            var12 = (class_513)this.O.getItem(var3);
            var14 = (class_184)this.c();
         } catch (Exception var11) {
            var10000 = var11;
            var10001 = false;
            break label60;
         }

         if (var14 == null || var12 == null) {
            return;
         }

         try {
            if (!(this.c() instanceof class_184)) {
               return;
            }

            if (class_91.method_281().method_286(class_91.field_82) == 3) {
               this.method_645(var12);
               return;
            }
         } catch (Exception var10) {
            var10000 = var10;
            var10001 = false;
            break label60;
         }

         class_147 var6;
         label61: {
            try {
               var6 = new class_147();
               var14.method_743(true);
               var14.l();
               var14.a(var12.method_1736() + ". " + var12.method_1732());
               var14.method_747(false);
               var14.method_749(true);
               var6.method_647(var12);
               if (var14.method_750() != null && var12.method_1729() != var14.method_750().method_1729()) {
                  var14.method_748(var12);
                  var14.method_742(var12);
                  var14.method_745(var12);
                  break label61;
               }
            } catch (Exception var9) {
               var10000 = var9;
               var10001 = false;
               break label60;
            }

            try {
               var14.method_748(var12);
               var14.method_742(var12);
            } catch (Exception var8) {
               var10000 = var8;
               var10001 = false;
               break label60;
            }
         }

         try {
            var14.method_741(var6, true);
            return;
         } catch (Exception var7) {
            var10000 = var7;
            var10001 = false;
         }
      }

      Exception var13 = var10000;
      var13.printStackTrace();
   }

   // $FF: renamed from: r () int
   public int method_640() {
      return 2130903046;
   }

   // $FF: renamed from: s () com.a.f.e
   public class_128 method_641() {
      return new class_130(this.c());
   }

   // $FF: renamed from: t () java.util.ArrayList
   public ArrayList method_642() {
      class_111 var1 = new class_111();
      new ArrayList();
      switch(class_91.method_281().method_286(class_91.field_82)) {
      case 1:
         return var1.method_350(35, 68);
      case 2:
         return var1.method_350(69, 100);
      case 3:
         return var1.method_354();
      default:
         return var1.method_350(1, 34);
      }
   }
}
