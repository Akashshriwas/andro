package mm;

// $FF: renamed from: mm.x
class class_664 implements Runnable {
   // $FF: renamed from: a mm.w
   // $FF: synthetic field
   final class_665 field_2247;

   class_664(class_665 var1) {
      this.field_2247 = var1;
   }

   // $FF: renamed from: a (mm.x) mm.w
   // $FF: synthetic method
   static class_665 method_2170(class_664 var0) {
      return var0.field_2247;
   }

   public void run() {
      class_184.method_730(class_665.method_2202(this.field_2247));
      class_665.method_2202(this.field_2247).runOnUiThread(new class_662(this));
   }
}
