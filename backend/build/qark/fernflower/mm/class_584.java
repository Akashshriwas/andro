package mm;

// $FF: renamed from: mm.b
class class_584 implements Runnable {
   // $FF: renamed from: a mm.a
   // $FF: synthetic field
   final class_145 field_1955;

   class_584(class_145 var1) {
      this.field_1955 = var1;
   }

   public void run() {
      if (class_145.method_636(this.field_1955) != null && class_145.method_636(this.field_1955).size() > 0) {
         this.field_1955.field_451.method_384(class_145.method_636(this.field_1955));
         this.field_1955.field_451.notifyDataSetChanged();
         this.field_1955.field_452.smoothScrollToPosition(0);
      } else {
         this.field_1955.field_451.method_385().clear();
         this.field_1955.field_451.notifyDataSetChanged();
      }
   }
}
