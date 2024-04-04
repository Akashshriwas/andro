package com.slidemenu.lib;

// $FF: renamed from: com.slidemenu.lib.h
class class_639 implements Runnable {
   // $FF: renamed from: a com.slidemenu.lib.g
   // $FF: synthetic field
   final class_638 field_2150;
   // $FF: renamed from: b boolean
   // $FF: synthetic field
   private final boolean field_2151;
   // $FF: renamed from: c boolean
   // $FF: synthetic field
   private final boolean field_2152;

   class_639(class_638 var1, boolean var2, boolean var3) {
      this.field_2150 = var1;
      this.field_2151 = var2;
      this.field_2152 = var3;
   }

   public void run() {
      if (this.field_2151) {
         if (this.field_2152) {
            class_638.method_2056(this.field_2150).method_583(false);
         } else {
            class_638.method_2056(this.field_2150).method_581(false);
         }
      } else {
         class_638.method_2056(this.field_2150).method_584(false);
      }
   }
}
