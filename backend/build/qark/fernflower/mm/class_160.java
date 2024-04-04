package mm;

// $FF: renamed from: mm.ah
class class_160 implements Runnable {
   // $FF: renamed from: a mm.ag
   // $FF: synthetic field
   final class_164 field_479;

   class_160(class_164 var1) {
      this.field_479 = var1;
   }

   // $FF: renamed from: a (mm.ah) mm.ag
   // $FF: synthetic method
   static class_164 method_662(class_160 var0) {
      return var0.field_479;
   }

   public void run() {
      class_164.method_665(this.field_479).runOnUiThread(new class_162(this));
   }
}
