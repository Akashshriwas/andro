package com.a.g;

// $FF: renamed from: com.a.g.c
class class_521 implements Runnable {
   // $FF: renamed from: a com.a.g.b
   class_520 field_1614;
   // $FF: renamed from: b com.a.g.a
   // $FF: synthetic field
   final class_522 field_1615;

   class_521(class_522 var1, class_520 var2) {
      this.field_1615 = var1;
      this.field_1614 = var2;
   }

   public void run() {
      try {
         class_522.method_1773(this.field_1615, this.field_1614.field_1611, this.field_1614.field_1612);
      } catch (Throwable var2) {
         var2.printStackTrace();
      }
   }
}
