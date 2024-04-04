package android.support.v4.c;

// $FF: renamed from: android.support.v4.c.c
public class class_230 {
   // $FF: renamed from: a java.lang.Object
   private static final Object field_704 = new Object();
   // $FF: renamed from: b boolean
   private boolean field_705;
   // $FF: renamed from: c int[]
   private int[] field_706;
   // $FF: renamed from: d java.lang.Object[]
   private Object[] field_707;
   // $FF: renamed from: e int
   private int field_708;

   public class_230() {
      this(10);
   }

   public class_230(int var1) {
      this.field_705 = false;
      var1 = method_855(var1);
      this.field_706 = new int[var1];
      this.field_707 = new Object[var1];
      this.field_708 = 0;
   }

   // $FF: renamed from: a (int[], int, int, int) int
   private static int method_852(int[] var0, int var1, int var2, int var3) {
      int var5 = var1 - 1;
      int var4 = var1 + var2;

      while(var4 - var5 > 1) {
         int var6 = (var4 + var5) / 2;
         if (var0[var6] < var3) {
            var5 = var6;
         } else {
            var4 = var6;
         }
      }

      if (var4 == var1 + var2) {
         var1 = ~(var1 + var2);
      } else {
         var1 = var4;
         if (var0[var4] != var3) {
            return ~var4;
         }
      }

      return var1;
   }

   // $FF: renamed from: c () void
   private void method_853() {
      int var4 = this.field_708;
      int[] var5 = this.field_706;
      Object[] var6 = this.field_707;
      int var1 = 0;

      int var2;
      int var3;
      for(var2 = 0; var1 < var4; var2 = var3) {
         Object var7 = var6[var1];
         var3 = var2;
         if (var7 != field_704) {
            if (var1 != var2) {
               var5[var2] = var5[var1];
               var6[var2] = var7;
            }

            var3 = var2 + 1;
         }

         ++var1;
      }

      this.field_705 = false;
      this.field_708 = var2;
   }

   // $FF: renamed from: g (int) int
   static int method_854(int var0) {
      int var1 = 4;

      int var2;
      while(true) {
         var2 = var0;
         if (var1 >= 32) {
            break;
         }

         if (var0 <= (1 << var1) - 12) {
            var2 = (1 << var1) - 12;
            break;
         }

         ++var1;
      }

      return var2;
   }

   // $FF: renamed from: h (int) int
   static int method_855(int var0) {
      return method_854(var0 * 4) / 4;
   }

   // $FF: renamed from: a () int
   public int method_856() {
      if (this.field_705) {
         this.method_853();
      }

      return this.field_708;
   }

   // $FF: renamed from: a (int) java.lang.Object
   public Object method_857(int var1) {
      return this.method_858(var1, (Object)null);
   }

   // $FF: renamed from: a (int, java.lang.Object) java.lang.Object
   public Object method_858(int var1, Object var2) {
      var1 = method_852(this.field_706, 0, this.field_708, var1);
      return var1 >= 0 && this.field_707[var1] != field_704 ? this.field_707[var1] : var2;
   }

   // $FF: renamed from: b () void
   public void method_859() {
      int var2 = this.field_708;
      Object[] var3 = this.field_707;

      for(int var1 = 0; var1 < var2; ++var1) {
         var3[var1] = null;
      }

      this.field_708 = 0;
      this.field_705 = false;
   }

   // $FF: renamed from: b (int) void
   public void method_860(int var1) {
      var1 = method_852(this.field_706, 0, this.field_708, var1);
      if (var1 >= 0 && this.field_707[var1] != field_704) {
         this.field_707[var1] = field_704;
         this.field_705 = true;
      }

   }

   // $FF: renamed from: b (int, java.lang.Object) void
   public void method_861(int var1, Object var2) {
      int var3 = method_852(this.field_706, 0, this.field_708, var1);
      if (var3 >= 0) {
         this.field_707[var3] = var2;
      } else {
         int var4 = ~var3;
         if (var4 < this.field_708 && this.field_707[var4] == field_704) {
            this.field_706[var4] = var1;
            this.field_707[var4] = var2;
         } else {
            var3 = var4;
            if (this.field_705) {
               var3 = var4;
               if (this.field_708 >= this.field_706.length) {
                  this.method_853();
                  var3 = ~method_852(this.field_706, 0, this.field_708, var1);
               }
            }

            if (this.field_708 >= this.field_706.length) {
               var4 = method_855(this.field_708 + 1);
               int[] var5 = new int[var4];
               Object[] var6 = new Object[var4];
               System.arraycopy(this.field_706, 0, var5, 0, this.field_706.length);
               System.arraycopy(this.field_707, 0, var6, 0, this.field_707.length);
               this.field_706 = var5;
               this.field_707 = var6;
            }

            if (this.field_708 - var3 != 0) {
               System.arraycopy(this.field_706, var3, this.field_706, var3 + 1, this.field_708 - var3);
               System.arraycopy(this.field_707, var3, this.field_707, var3 + 1, this.field_708 - var3);
            }

            this.field_706[var3] = var1;
            this.field_707[var3] = var2;
            ++this.field_708;
         }
      }
   }

   // $FF: renamed from: c (int) void
   public void method_862(int var1) {
      this.method_860(var1);
   }

   // $FF: renamed from: d (int) void
   public void method_863(int var1) {
      if (this.field_707[var1] != field_704) {
         this.field_707[var1] = field_704;
         this.field_705 = true;
      }

   }

   // $FF: renamed from: e (int) int
   public int method_864(int var1) {
      if (this.field_705) {
         this.method_853();
      }

      return this.field_706[var1];
   }

   // $FF: renamed from: f (int) java.lang.Object
   public Object method_865(int var1) {
      if (this.field_705) {
         this.method_853();
      }

      return this.field_707[var1];
   }
}
