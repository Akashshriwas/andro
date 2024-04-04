package mm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.class_143;
import android.support.v4.app.class_616;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.a.a.class_284;
import com.slidemenu.lib.SlidingMenu;
import com.slidemenu.lib.class_182;
import com.slidemenu.lib.class_75;
import com.slidemenu.lib.class_77;
import dn.class_100;
import dn.class_91;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Locale;

// $FF: renamed from: mm.d
public abstract class class_183 extends class_182 implements class_75, class_77, class_80 {
   // $FF: renamed from: m java.lang.Boolean
   protected Boolean field_551 = false;
   // $FF: renamed from: n android.widget.LinearLayout
   protected LinearLayout field_552;
   // $FF: renamed from: o android.widget.ImageView
   protected ImageView field_553;
   // $FF: renamed from: p dn.f
   class_91 field_554;
   // $FF: renamed from: q android.support.v4.app.t
   private class_143 field_555;
   // $FF: renamed from: r android.widget.TextView
   private TextView field_556;
   // $FF: renamed from: s java.lang.Thread.UncaughtExceptionHandler
   private UncaughtExceptionHandler field_557 = new class_593(this);
   // $FF: renamed from: t android.view.View.OnClickListener
   private OnClickListener field_558 = new class_591(this);

   // $FF: renamed from: a (java.lang.String, android.content.Context) boolean
   private boolean method_709(String var1, Context var2) {
      PackageManager var4 = var2.getPackageManager();

      try {
         var4.getPackageInfo(var1, 1);
         return true;
      } catch (NameNotFoundException var3) {
         return false;
      }
   }

   // $FF: renamed from: b (java.lang.String) void
   private void method_710(String var1) {
      this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(var1)));
   }

   // $FF: renamed from: o () void
   private void method_711() {
      SlidingMenu var1 = this.f();
      var1.setMode(0);
      var1.setShadowWidthRes(2131427330);
      var1.setShadowDrawable(2130837603);
      var1.setBehindOffsetRes(2131427328);
      var1.setFadeDegree(0.35F);
      var1.setBehindScrollScale(1.0F);
      var1.setAnimationCacheEnabled(true);
      var1.setTouchModeAbove(1);
   }

   // $FF: renamed from: a () void
   public void method_195() {
      this.field_551 = false;
   }

   // $FF: renamed from: a (com.a.a.a, android.view.View) void
   public void method_201(class_284 var1, View var2) {
      if (var1 != null) {
         Exception var10000;
         label141: {
            boolean var10001;
            label140: {
               label139: {
                  label146: {
                     label137: {
                        label147: {
                           label148: {
                              try {
                                 switch(var1.method_981()) {
                                 case 0:
                                 case 1:
                                 case 2:
                                 case 3:
                                    break label147;
                                 case 4:
                                    break;
                                 case 5:
                                    break label148;
                                 case 6:
                                    break label137;
                                 case 7:
                                    break label146;
                                 case 8:
                                    break label139;
                                 case 9:
                                    break label140;
                                 default:
                                    return;
                                 }
                              } catch (Exception var16) {
                                 var10000 = var16;
                                 var10001 = false;
                                 break label141;
                              }

                              String var3 = "com.study.english.pronunciation";
                              String var17 = var3;

                              label149: {
                                 try {
                                    if (Locale.getDefault() == null) {
                                       break label149;
                                    }
                                 } catch (Exception var15) {
                                    var10000 = var15;
                                    var10001 = false;
                                    break label141;
                                 }

                                 var17 = var3;

                                 try {
                                    if (!Locale.getDefault().toString().contains("vi")) {
                                       break label149;
                                    }
                                 } catch (Exception var14) {
                                    var10000 = var14;
                                    var10001 = false;
                                    break label141;
                                 }

                                 var17 = "pronunciation.phat.am.tieng.anh";
                              }

                              try {
                                 if (this.method_709(var17, var2.getContext())) {
                                    this.startActivity(this.getPackageManager().getLaunchIntentForPackage(var17));
                                    return;
                                 }
                              } catch (Exception var13) {
                                 var10000 = var13;
                                 var10001 = false;
                                 break label141;
                              }

                              try {
                                 this.method_710("market://details?id=" + var17);
                                 return;
                              } catch (Exception var9) {
                                 var10000 = var9;
                                 var10001 = false;
                                 break label141;
                              }
                           }

                           try {
                              if (this.method_709("com.study.english.voa", var2.getContext())) {
                                 this.startActivity(this.getPackageManager().getLaunchIntentForPackage("com.study.english.voa"));
                                 return;
                              }
                           } catch (Exception var12) {
                              var10000 = var12;
                              var10001 = false;
                              break label141;
                           }

                           try {
                              this.method_710("market://details?id=com.study.english.voa&hl=vi");
                              return;
                           } catch (Exception var8) {
                              var10000 = var8;
                              var10001 = false;
                              break label141;
                           }
                        }

                        try {
                           this.field_554.method_282(class_91.field_82, var1.method_981());
                           ((class_144)this.field_555).field_445.notifyDataSetChanged();
                           this.field_554.method_283(class_91.field_83, var1.method_980());
                           this.field_556.setText(var1.method_980());
                           super.method_707();
                           return;
                        } catch (Exception var10) {
                           var10000 = var10;
                           var10001 = false;
                           break label141;
                        }
                     }

                     try {
                        if (this.method_709("com.hake.english.vn", var2.getContext())) {
                           this.startActivity(this.getPackageManager().getLaunchIntentForPackage("com.hake.english.vn"));
                           return;
                        }
                     } catch (Exception var11) {
                        var10000 = var11;
                        var10001 = false;
                        break label141;
                     }

                     try {
                        this.method_710("market://details?id=com.hake.english.vn&hl=vi");
                        return;
                     } catch (Exception var7) {
                        var10000 = var7;
                        var10001 = false;
                        break label141;
                     }
                  }

                  try {
                     this.method_710("market://details?id=" + this.getApplicationContext().getPackageName());
                     return;
                  } catch (Exception var6) {
                     var10000 = var6;
                     var10001 = false;
                     break label141;
                  }
               }

               try {
                  class_100.method_316(var2.getContext());
                  return;
               } catch (Exception var5) {
                  var10000 = var5;
                  var10001 = false;
                  break label141;
               }
            }

            try {
               class_100.method_320(this);
               return;
            } catch (Exception var4) {
               var10000 = var4;
               var10001 = false;
            }
         }

         Exception var18 = var10000;
         var18.printStackTrace();
      }
   }

   // $FF: renamed from: a (java.lang.String) void
   public void method_712(String var1) {
      if (this.field_556 != null && var1 != null) {
         this.field_556.setText(var1);
      }

   }

   // $FF: renamed from: b () void
   public void method_197() {
      this.field_551 = true;
   }

   // $FF: renamed from: i () void
   public abstract void method_713();

   // $FF: renamed from: j () int
   public abstract int method_714();

   // $FF: renamed from: k () void
   public void method_715() {
      if (this.field_553 != null) {
         this.field_553.setImageResource(2130837569);
      }

   }

   // $FF: renamed from: l () void
   public void method_716() {
      if (this.field_553 != null) {
         this.field_553.setImageResource(2130837573);
      }

   }

   // $FF: renamed from: m () void
   public void method_717() {
      if (this.field_556 == null) {
         this.field_556 = (TextView)this.findViewById(2131165211);
      }

      String var1 = this.field_554.method_284(class_91.field_83);
      if (var1 != null) {
         this.field_556.setText(var1);
      }

   }

   // $FF: renamed from: n () void
   public void method_718() {
      if (this.field_551) {
         this.g();
      } else {
         this.h();
      }
   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.requestWindowFeature(1);
      this.getWindow().addFlags(128);
      Thread.setDefaultUncaughtExceptionHandler(this.field_557);
      this.field_554 = class_91.method_281();
      this.b(2130903055);
      if (var1 == null) {
         class_616 var2 = this.e().method_1947();
         this.field_555 = new class_144();
         ((class_144)this.field_555).field_444 = this;
         var2.method_2011(2131165227, this.field_555);
         var2.method_2006();
      } else {
         this.field_555 = (class_143)this.e().method_1946(2131165227);
         ((class_144)this.field_555).field_444 = this;
      }

      this.method_711();
      if (this.method_714() != -1) {
         this.setContentView(this.method_714());
         this.field_552 = (LinearLayout)this.findViewById(2131165213);
         this.field_552.setOnClickListener(this.field_558);
         this.field_553 = (ImageView)this.findViewById(2131165209);
         this.method_713();
         this.method_717();
         this.method_715();
      }

   }
}
