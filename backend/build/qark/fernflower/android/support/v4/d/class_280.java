package android.support.v4.d;

import android.graphics.Canvas;
import android.os.Build.VERSION;

// $FF: renamed from: android.support.v4.d.a
public class class_280 {
   // $FF: renamed from: b android.support.v4.d.d
   private static final class_37 field_776;
   // $FF: renamed from: a java.lang.Object
   private Object field_777;

   static {
      if (VERSION.SDK_INT >= 14) {
         field_776 = new class_281();
      } else {
         field_776 = new class_282();
      }
   }

   // $FF: renamed from: a (int, int) void
   public void method_967(int var1, int var2) {
      field_776.method_96(this.field_777, var1, var2);
   }

   // $FF: renamed from: a () boolean
   public boolean method_968() {
      return field_776.method_97(this.field_777);
   }

   // $FF: renamed from: a (float) boolean
   public boolean method_969(float var1) {
      return field_776.method_98(this.field_777, var1);
   }

   // $FF: renamed from: a (android.graphics.Canvas) boolean
   public boolean method_970(Canvas var1) {
      return field_776.method_99(this.field_777, var1);
   }

   // $FF: renamed from: b () void
   public void method_971() {
      field_776.method_100(this.field_777);
   }

   // $FF: renamed from: c () boolean
   public boolean method_972() {
      return field_776.method_101(this.field_777);
   }
}
