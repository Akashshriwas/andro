package mm;

// $FF: renamed from: mm.ar
class class_205 implements Runnable {
   // $FF: renamed from: a mm.rc
   // $FF: synthetic field
   final class_186 field_660;
   // $FF: renamed from: b long
   // $FF: synthetic field
   private final long field_661;

   class_205(class_186 var1, long var2) {
      this.field_660 = var1;
      this.field_661 = var2;
   }

   public void run() {
      long var1 = this.field_661;
      class_186.method_767(this.field_660, var1 + 1000L);
   }
}
