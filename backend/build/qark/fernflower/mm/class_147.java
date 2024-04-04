package mm;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.a.d.class_111;
import com.a.f.class_128;
import com.a.h.class_513;
import com.a.h.class_514;
import java.util.ArrayList;

// $FF: renamed from: mm.j
public class class_147 extends class_145 implements class_70 {
   // $FF: renamed from: Q com.a.h.e
   class_513 field_455;
   // $FF: renamed from: R int
   int field_456;
   // $FF: renamed from: S int
   int field_457;

   // $FF: renamed from: a (java.lang.String) int
   public int method_646(String var1) {
      String[] var3 = var1.split(":");
      int var2 = Integer.parseInt(var3[1].substring(0, 2));
      return Integer.parseInt(var3[1].substring(3, 5)) + var2 * 1000;
   }

   // $FF: renamed from: a (android.view.View) void
   public void method_638(View var1) {
   }

   // $FF: renamed from: a (com.a.h.e) void
   public void method_647(class_513 var1) {
      this.field_455 = var1;
   }

   // $FF: renamed from: a_ (int) void
   public void method_188(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int) void
   public void method_648(int var1) {
      Exception var10000;
      label144: {
         int var2;
         boolean var10001;
         try {
            var2 = this.field_457;
         } catch (Exception var14) {
            var10000 = var14;
            var10001 = false;
            break label144;
         }

         label143:
         while(true) {
            label147: {
               class_514 var5;
               label148: {
                  try {
                     if (var2 > this.field_456) {
                        break label148;
                     }
                  } catch (Exception var18) {
                     var10000 = var18;
                     var10001 = false;
                     break;
                  }

                  try {
                     var5 = (class_514)this.u().get(var2);
                  } catch (Exception var13) {
                     var10000 = var13;
                     var10001 = false;
                     break;
                  }

                  int var4 = var2 + 1;
                  int var3 = var4;

                  try {
                     if (var4 > this.field_456) {
                        var3 = this.field_456;
                     }
                  } catch (Exception var20) {
                     var10000 = var20;
                     var10001 = false;
                     break;
                  }

                  try {
                     var4 = this.method_646(((class_514)this.u().get(var3)).method_1748());
                  } catch (Exception var12) {
                     var10000 = var12;
                     var10001 = false;
                     break;
                  }

                  var3 = var4;

                  label132: {
                     try {
                        if (var2 != this.field_456) {
                           break label132;
                        }
                     } catch (Exception var19) {
                        var10000 = var19;
                        var10001 = false;
                        break;
                     }

                     var3 = var4 + 2000;
                  }

                  try {
                     if (var5.method_1743() || var1 < this.method_646(var5.method_1748())) {
                        break label147;
                     }
                  } catch (Exception var17) {
                     var10000 = var17;
                     var10001 = false;
                     break;
                  }

                  if (var1 >= var3) {
                     break label147;
                  }

                  try {
                     if (var2 > this.field_457) {
                        this.field_457 = var2;
                     }
                  } catch (Exception var16) {
                     var10000 = var16;
                     var10001 = false;
                     break;
                  }

                  try {
                     var5.method_1742(true);
                  } catch (Exception var11) {
                     var10000 = var11;
                     var10001 = false;
                     break;
                  }

                  var1 = 0;

                  while(true) {
                     try {
                        if (var1 >= this.field_457) {
                           this.O.notifyDataSetChanged();
                           break;
                        }
                     } catch (Exception var15) {
                        var10000 = var15;
                        var10001 = false;
                        break label143;
                     }

                     try {
                        ((class_514)this.u().get(var1)).method_1742(true);
                     } catch (Exception var10) {
                        var10000 = var10;
                        var10001 = false;
                        break label143;
                     }

                     ++var1;
                  }
               }

               try {
                  var5 = (class_514)this.u().get(this.field_457);
                  if (this.field_457 <= 2) {
                     return;
                  }
               } catch (Exception var9) {
                  var10000 = var9;
                  var10001 = false;
                  break;
               }

               if (var5 == null) {
                  return;
               }

               try {
                  if (!var5.method_1743()) {
                     return;
                  }

                  var2 = this.field_457 + 1;
               } catch (Exception var8) {
                  var10000 = var8;
                  var10001 = false;
                  break;
               }

               var1 = var2;

               try {
                  if (var2 > this.field_456) {
                     var1 = this.field_456;
                     this.field_457 = 0;
                  }
               } catch (Exception var7) {
                  var10000 = var7;
                  var10001 = false;
                  break;
               }

               try {
                  this.P.smoothScrollToPosition(var1);
                  return;
               } catch (Exception var6) {
                  var10000 = var6;
                  var10001 = false;
                  break;
               }
            }

            ++var2;
         }
      }

      Exception var21 = var10000;
      var21.printStackTrace();
   }

   // $FF: renamed from: b (android.os.Bundle) void
   public void method_609(Bundle var1) {
      super.method_609(var1);
   }

   // $FF: renamed from: d (android.os.Bundle) void
   public void method_617(Bundle var1) {
      super.d(var1);
   }

   public void onItemClick(AdapterView var1, View var2, int var3, long var4) {
      Exception var10000;
      label78: {
         class_184 var15;
         boolean var10001;
         try {
            var15 = (class_184)this.c();
         } catch (Exception var12) {
            var10000 = var12;
            var10001 = false;
            break label78;
         }

         label76: {
            if (var15 != null) {
               try {
                  if (var15.field_561 != null && var15.field_561.isPlaying()) {
                     break label76;
                  }
               } catch (Exception var11) {
                  var10000 = var11;
                  var10001 = false;
                  break label78;
               }
            }

            if (var15 == null) {
               return;
            }

            try {
               if (var15.field_561 != null && !var15.field_561.isPlaying()) {
                  var15.method_751();
                  return;
               }

               return;
            } catch (Exception var10) {
               var10000 = var10;
               var10001 = false;
               break label78;
            }
         }

         for(int var6 = var3; var6 >= 0; --var6) {
            try {
               ((class_514)this.u().get(var6)).method_1742(true);
            } catch (Exception var9) {
               var10000 = var9;
               var10001 = false;
               break label78;
            }
         }

         String var13;
         try {
            this.O.notifyDataSetChanged();
            var13 = ((class_514)this.O.getItem(var3)).method_1748();
         } catch (Exception var8) {
            var10000 = var8;
            var10001 = false;
            break label78;
         }

         if (var3 == 0) {
            var13 = "00:00.00";
         }

         try {
            var15.method_746(var13);
            return;
         } catch (Exception var7) {
            var10000 = var7;
            var10001 = false;
         }
      }

      Exception var14 = var10000;
      var14.printStackTrace();
   }

   // $FF: renamed from: r () int
   public int method_640() {
      return 2130903040;
   }

   // $FF: renamed from: s () com.a.f.e
   public class_128 method_641() {
      return new class_132(this.c(), this);
   }

   // $FF: renamed from: t () java.util.ArrayList
   public ArrayList method_642() {
      ArrayList var1 = (new class_111()).method_355(this.field_455.method_1729());
      if (var1 != null) {
         this.field_456 = var1.size() - 1;
         this.field_457 = 0;
      }

      return var1;
   }

   // $FF: renamed from: w () void
   public void method_649() {
      if (this.u() != null) {
         for(int var1 = 1; var1 <= this.field_456; ++var1) {
            ((class_514)this.u().get(var1)).method_1742(false);
         }

         this.O.notifyDataSetChanged();
         this.method_650();
      }

   }

   // $FF: renamed from: x () void
   public void method_650() {
      if (this.P != null) {
         this.P.smoothScrollToPosition(0);
      }

   }
}
