package mm;

// $FF: renamed from: mm.ai
class class_162 implements Runnable {
   // $FF: renamed from: a mm.ah
   // $FF: synthetic field
   final class_160 field_482;

   class_162(class_160 var1) {
      this.field_482 = var1;
   }

   public void run() {
      class_187.method_786(class_164.method_665(class_160.method_662(this.field_482)));
      if (class_187.method_783(class_164.method_665(class_160.method_662(this.field_482))) != null) {
         ((class_133)class_187.method_783(class_164.method_665(class_160.method_662(this.field_482)))).method_390(-1);
         ((class_133)class_187.method_783(class_164.method_665(class_160.method_662(this.field_482)))).notifyDataSetChanged();
      }

   }
}
