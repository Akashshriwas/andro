package com.a.g;

// $FF: renamed from: com.a.g.f
class class_149 implements Runnable {
   // $FF: renamed from: a com.a.g.e
   class_158 field_464;
   // $FF: renamed from: b com.a.g.d
   // $FF: synthetic field
   final class_155 field_465;

   class_149(class_155 var1, class_158 var2) {
      this.field_465 = var1;
      this.field_464 = var2;
   }

   public void run() {
      try {
         class_155.method_656(this.field_465, this.field_464.field_475, this.field_464.field_476);
      } catch (Throwable var2) {
         var2.printStackTrace();
      }
   }
}
