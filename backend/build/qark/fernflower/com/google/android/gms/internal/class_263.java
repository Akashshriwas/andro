package com.google.android.gms.internal;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

// $FF: renamed from: com.google.android.gms.internal.hd
public class class_263 {
   // $FF: renamed from: a java.util.LinkedHashMap
   private final LinkedHashMap field_753;
   // $FF: renamed from: b int
   private int field_754;
   // $FF: renamed from: c int
   private int field_755;
   // $FF: renamed from: d int
   private int field_756;
   // $FF: renamed from: e int
   private int field_757;
   // $FF: renamed from: f int
   private int field_758;
   // $FF: renamed from: g int
   private int field_759;

   // $FF: renamed from: c (java.lang.Object, java.lang.Object) int
   private int method_940(Object var1, Object var2) {
      int var3 = this.method_941(var1, var2);
      if (var3 < 0) {
         throw new IllegalStateException("Negative size: " + var1 + "=" + var2);
      } else {
         return var3;
      }
   }

   // $FF: renamed from: a (java.lang.Object, java.lang.Object) int
   protected int method_941(Object var1, Object var2) {
      return 1;
   }

   // $FF: renamed from: a () void
   public final void method_942() {
      this.method_943(-1);
   }

   // $FF: renamed from: a (int) void
   public void method_943(int var1) {
      while(true) {
         synchronized(this){}

         Throwable var10000;
         boolean var10001;
         label434: {
            label428: {
               try {
                  if (this.field_754 >= 0 && (!this.field_753.isEmpty() || this.field_754 == 0)) {
                     break label428;
                  }
               } catch (Throwable var45) {
                  var10000 = var45;
                  var10001 = false;
                  break label434;
               }

               try {
                  throw new IllegalStateException(this.getClass().getName() + ".sizeOf() is reporting inconsistent results!");
               } catch (Throwable var44) {
                  var10000 = var44;
                  var10001 = false;
                  break label434;
               }
            }

            label415: {
               try {
                  if (this.field_754 > var1 && !this.field_753.isEmpty()) {
                     break label415;
                  }
               } catch (Throwable var43) {
                  var10000 = var43;
                  var10001 = false;
                  break label434;
               }

               try {
                  return;
               } catch (Throwable var42) {
                  var10000 = var42;
                  var10001 = false;
                  break label434;
               }
            }

            Object var46;
            Object var47;
            try {
               Entry var3 = (Entry)this.field_753.entrySet().iterator().next();
               var46 = var3.getKey();
               var47 = var3.getValue();
               this.field_753.remove(var46);
               this.field_754 -= this.method_940(var46, var47);
               ++this.field_757;
            } catch (Throwable var41) {
               var10000 = var41;
               var10001 = false;
               break label434;
            }

            this.method_944(true, var46, var47, (Object)null);
            continue;
         }

         while(true) {
            Throwable var2 = var10000;

            try {
               throw var2;
            } catch (Throwable var40) {
               var10000 = var40;
               var10001 = false;
               continue;
            }
         }
      }
   }

   // $FF: renamed from: a (boolean, java.lang.Object, java.lang.Object, java.lang.Object) void
   protected void method_944(boolean var1, Object var2, Object var3, Object var4) {
   }

   // $FF: renamed from: b (java.lang.Object, java.lang.Object) java.lang.Object
   public final Object method_945(Object var1, Object var2) {
      if (var1 != null && var2 != null) {
         synchronized(this){}

         Object var3;
         label239: {
            Throwable var10000;
            boolean var10001;
            label240: {
               try {
                  ++this.field_756;
                  this.field_754 += this.method_940(var1, var2);
                  var3 = this.field_753.put(var1, var2);
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label240;
               }

               if (var3 != null) {
                  try {
                     this.field_754 -= this.method_940(var1, var3);
                  } catch (Throwable var22) {
                     var10000 = var22;
                     var10001 = false;
                     break label240;
                  }
               }

               label224:
               try {
                  break label239;
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label224;
               }
            }

            while(true) {
               Throwable var24 = var10000;

               try {
                  throw var24;
               } catch (Throwable var20) {
                  var10000 = var20;
                  var10001 = false;
                  continue;
               }
            }
         }

         if (var3 != null) {
            this.method_944(false, var1, var3, var2);
         }

         this.method_943(this.field_755);
         return var3;
      } else {
         throw new NullPointerException("key == null || value == null");
      }
   }

   public final String toString() {
      int var1 = 0;
      synchronized(this){}

      Throwable var10000;
      label116: {
         boolean var10001;
         int var2;
         try {
            var2 = this.field_758 + this.field_759;
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label116;
         }

         if (var2 != 0) {
            try {
               var1 = this.field_758 * 100 / var2;
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               break label116;
            }
         }

         label104:
         try {
            String var16 = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", this.field_755, this.field_758, this.field_759, var1);
            return var16;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            break label104;
         }
      }

      Throwable var3 = var10000;
      throw var3;
   }
}
