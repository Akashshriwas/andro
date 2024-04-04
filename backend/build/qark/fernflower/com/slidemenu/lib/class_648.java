package com.slidemenu.lib;

// $FF: renamed from: com.slidemenu.lib.c
class class_648 extends class_647 {
   // $FF: renamed from: a com.slidemenu.lib.a
   // $FF: synthetic field
   final class_652 field_2156;

   class_648(class_652 var1) {
      this.field_2156 = var1;
   }

   // $FF: renamed from: a (int) void
   public void method_199(int var1) {
      if (class_652.method_2127(this.field_2156) != null) {
         switch(var1) {
         case 0:
         case 2:
            class_652.method_2127(this.field_2156).setChildrenEnabled(true);
            return;
         case 1:
            class_652.method_2127(this.field_2156).setChildrenEnabled(false);
            return;
         }
      }

   }
}
