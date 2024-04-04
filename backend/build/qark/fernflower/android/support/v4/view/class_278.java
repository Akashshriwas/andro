package android.support.v4.view;

// $FF: renamed from: android.support.v4.view.b
class class_278 implements class_36 {
   // $FF: renamed from: a (int, int, int, int, int) int
   private static int method_963(int var0, int var1, int var2, int var3, int var4) {
      boolean var6 = true;
      boolean var5;
      if ((var1 & var2) != 0) {
         var5 = true;
      } else {
         var5 = false;
      }

      var3 |= var4;
      boolean var7;
      if ((var1 & var3) != 0) {
         var7 = var6;
      } else {
         var7 = false;
      }

      if (var5) {
         if (var7) {
            throw new IllegalArgumentException("bad arguments");
         }

         var3 = var0 & ~var3;
      } else {
         var3 = var0;
         if (var7) {
            return var0 & ~var2;
         }
      }

      return var3;
   }

   // $FF: renamed from: a (int) int
   public int method_964(int var1) {
      if ((var1 & 192) != 0) {
         var1 |= 1;
      }

      int var2 = var1;
      if ((var1 & 48) != 0) {
         var2 = var1 | 2;
      }

      return var2 & 247;
   }

   // $FF: renamed from: a (int, int) boolean
   public boolean method_94(int var1, int var2) {
      return method_963(method_963(this.method_964(var1) & 247, var2, 1, 64, 128), var2, 2, 16, 32) == var2;
   }

   // $FF: renamed from: b (int) boolean
   public boolean method_95(int var1) {
      return (this.method_964(var1) & 247) == 0;
   }
}
