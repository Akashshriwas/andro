package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

// $FF: renamed from: com.google.android.gms.internal.cc
public final class class_420 extends class_419 {
   // $FF: renamed from: a android.app.Activity
   private final Activity field_1113;
   // $FF: renamed from: b com.google.android.gms.internal.bm
   private class_556 field_1114;
   // $FF: renamed from: c com.google.android.gms.internal.ci
   private class_440 field_1115;
   // $FF: renamed from: d com.google.android.gms.internal.ev
   private class_473 field_1116;
   // $FF: renamed from: e com.google.android.gms.internal.cf
   private class_436 field_1117;
   // $FF: renamed from: f com.google.android.gms.internal.cl
   private class_416 field_1118;
   // $FF: renamed from: g android.widget.FrameLayout
   private FrameLayout field_1119;
   // $FF: renamed from: h android.webkit.WebChromeClient.CustomViewCallback
   private CustomViewCallback field_1120;
   // $FF: renamed from: i boolean
   private boolean field_1121 = false;
   // $FF: renamed from: j boolean
   private boolean field_1122 = false;
   // $FF: renamed from: k android.widget.RelativeLayout
   private RelativeLayout field_1123;

   public class_420(Activity var1) {
      this.field_1113 = var1;
   }

   // $FF: renamed from: a (android.content.Context, com.google.android.gms.internal.bm) void
   public static void method_1437(Context var0, class_556 var1) {
      Intent var2 = new Intent();
      var2.setClassName(var0, "com.google.android.gms.ads.AdActivity");
      var2.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", var1.field_1895.field_1130);
      class_556.method_1843(var2, var1);
      var2.addFlags(524288);
      var0.startActivity(var2);
   }

   // $FF: renamed from: c (int, int, int, int) android.widget.RelativeLayout.LayoutParams
   private static LayoutParams method_1438(int var0, int var1, int var2, int var3) {
      LayoutParams var4 = new LayoutParams(var2, var3);
      var4.setMargins(var0, var1, 0, 0);
      var4.addRule(10);
      var4.addRule(9);
      return var4;
   }

   // $FF: renamed from: c (boolean) void
   private void method_1439(boolean var1) {
      this.field_1113.requestWindowFeature(1);
      Window var3 = this.field_1113.getWindow();
      var3.setFlags(1024, 1024);
      this.method_1442(this.field_1114.field_1892);
      if (VERSION.SDK_INT >= 11) {
         class_467.method_1603("Enabling hardware acceleration on the AdActivity window.");
         class_463.method_1573(var3);
      }

      this.field_1123 = new RelativeLayout(this.field_1113);
      this.field_1123.setBackgroundColor(-16777216);
      this.field_1113.setContentView(this.field_1123);
      boolean var2 = this.field_1114.field_1886.method_1649().method_1632();
      if (var1) {
         this.field_1116 = class_473.method_1636(this.field_1113, this.field_1114.field_1886.method_1648(), true, var2, (class_355)null, this.field_1114.field_1895);
         this.field_1116.method_1649().method_1626((class_44)null, (class_52)null, this.field_1114.field_1887, this.field_1114.field_1891, true);
         this.field_1116.method_1649().method_1625(new class_438(this));
         if (this.field_1114.field_1894 != null) {
            this.field_1116.loadUrl(this.field_1114.field_1894);
         } else {
            if (this.field_1114.field_1890 == null) {
               throw new class_437("No URL or HTML to display in ad overlay.");
            }

            this.field_1116.loadDataWithBaseURL(this.field_1114.field_1888, this.field_1114.field_1890, "text/html", "UTF-8", (String)null);
         }
      } else {
         this.field_1116 = this.field_1114.field_1886;
         this.field_1116.setContext(this.field_1113);
      }

      this.field_1116.method_1642(this);
      this.field_1123.addView(this.field_1116, -1, -1);
      if (!var1) {
         this.field_1116.method_1646();
      }

      this.method_1445(var2);
   }

   // $FF: renamed from: k () void
   private void method_1440() {
      if (this.field_1113.isFinishing() && !this.field_1122) {
         this.field_1122 = true;
         if (this.field_1113.isFinishing()) {
            if (this.field_1116 != null) {
               this.field_1116.method_1640();
               this.field_1123.removeView(this.field_1116);
               if (this.field_1117 != null) {
                  this.field_1116.method_1645(false);
                  this.field_1117.field_1184.addView(this.field_1116, this.field_1117.field_1182, this.field_1117.field_1183);
               }
            }

            if (this.field_1114 != null && this.field_1114.field_1885 != null) {
               this.field_1114.field_1885.method_151();
               return;
            }
         }
      }

   }

   // $FF: renamed from: a () void
   public void method_1441() {
      this.field_1113.finish();
   }

   // $FF: renamed from: a (int) void
   public void method_1442(int var1) {
      this.field_1113.setRequestedOrientation(var1);
   }

   // $FF: renamed from: a (int, int, int, int) void
   public void method_1443(int var1, int var2, int var3, int var4) {
      if (this.field_1115 != null) {
         this.field_1115.setLayoutParams(method_1438(var1, var2, var3, var4));
      }

   }

   // $FF: renamed from: a (android.os.Bundle) void
   public void method_141(Bundle var1) {
      boolean var2 = false;
      if (var1 != null) {
         var2 = var1.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
      }

      this.field_1121 = var2;

      class_437 var10000;
      label116: {
         boolean var10001;
         try {
            this.field_1114 = class_556.method_1842(this.field_1113.getIntent());
            if (this.field_1114 == null) {
               throw new class_437("Could not get info for ad overlay.");
            }
         } catch (class_437 var9) {
            var10000 = var9;
            var10001 = false;
            break label116;
         }

         if (var1 == null) {
            try {
               if (this.field_1114.field_1885 != null) {
                  this.field_1114.field_1885.method_152();
               }
            } catch (class_437 var12) {
               var10000 = var12;
               var10001 = false;
               break label116;
            }

            try {
               if (this.field_1114.field_1893 != 1 && this.field_1114.field_1884 != null) {
                  this.field_1114.field_1884.method_129();
               }
            } catch (class_437 var8) {
               var10000 = var8;
               var10001 = false;
               break label116;
            }
         }

         label100: {
            label99: {
               label117: {
                  label97: {
                     try {
                        switch(this.field_1114.field_1893) {
                        case 1:
                           break;
                        case 2:
                           break label117;
                        case 3:
                           break label99;
                        case 4:
                           break label97;
                        default:
                           break label100;
                        }
                     } catch (class_437 var11) {
                        var10000 = var11;
                        var10001 = false;
                        break label116;
                     }

                     try {
                        this.method_1439(false);
                        return;
                     } catch (class_437 var5) {
                        var10000 = var5;
                        var10001 = false;
                        break label116;
                     }
                  }

                  try {
                     if (this.field_1121) {
                        this.field_1113.finish();
                        return;
                     }
                  } catch (class_437 var10) {
                     var10000 = var10;
                     var10001 = false;
                     break label116;
                  }

                  try {
                     if (!class_565.method_1854(this.field_1113, this.field_1114.field_1883, this.field_1114.field_1891)) {
                        this.field_1113.finish();
                        return;
                     }

                     return;
                  } catch (class_437 var7) {
                     var10000 = var7;
                     var10001 = false;
                     break label116;
                  }
               }

               try {
                  this.field_1117 = new class_436(this.field_1114.field_1886);
                  this.method_1439(false);
                  return;
               } catch (class_437 var4) {
                  var10000 = var4;
                  var10001 = false;
                  break label116;
               }
            }

            try {
               this.method_1439(true);
               return;
            } catch (class_437 var3) {
               var10000 = var3;
               var10001 = false;
               break label116;
            }
         }

         try {
            throw new class_437("Could not determine ad overlay type.");
         } catch (class_437 var6) {
            var10000 = var6;
            var10001 = false;
         }
      }

      class_437 var13 = var10000;
      class_467.method_1610(var13.getMessage());
      this.field_1113.finish();
   }

   // $FF: renamed from: a (android.view.View, android.webkit.WebChromeClient.CustomViewCallback) void
   public void method_1444(View var1, CustomViewCallback var2) {
      this.field_1119 = new FrameLayout(this.field_1113);
      this.field_1119.setBackgroundColor(-16777216);
      this.field_1119.addView(var1, -1, -1);
      this.field_1113.setContentView(this.field_1119);
      this.field_1120 = var2;
   }

   // $FF: renamed from: a (boolean) void
   public void method_1445(boolean var1) {
      byte var2;
      if (var1) {
         var2 = 50;
      } else {
         var2 = 32;
      }

      this.field_1118 = new class_416(this.field_1113, var2);
      LayoutParams var3 = new LayoutParams(-2, -2);
      var3.addRule(10);
      if (var1) {
         var2 = 11;
      } else {
         var2 = 9;
      }

      var3.addRule(var2);
      this.field_1118.method_1435(this.field_1114.field_1889);
      this.field_1123.addView(this.field_1118, var3);
   }

   // $FF: renamed from: b () com.google.android.gms.internal.ci
   public class_440 method_1446() {
      return this.field_1115;
   }

   // $FF: renamed from: b (int, int, int, int) void
   public void method_1447(int var1, int var2, int var3, int var4) {
      if (this.field_1115 == null) {
         this.field_1115 = new class_440(this.field_1113, this.field_1116);
         this.field_1123.addView(this.field_1115, 0, method_1438(var1, var2, var3, var4));
         this.field_1116.method_1649().method_1628(false);
      }

   }

   // $FF: renamed from: b (android.os.Bundle) void
   public void method_142(Bundle var1) {
      var1.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.field_1121);
   }

   // $FF: renamed from: b (boolean) void
   public void method_1448(boolean var1) {
      if (this.field_1118 != null) {
         this.field_1118.method_1435(var1);
      }

   }

   // $FF: renamed from: c () void
   public void method_1449() {
      if (this.field_1114 != null) {
         this.method_1442(this.field_1114.field_1892);
      }

      if (this.field_1119 != null) {
         this.field_1113.setContentView(this.field_1123);
         this.field_1119.removeAllViews();
         this.field_1119 = null;
      }

      if (this.field_1120 != null) {
         this.field_1120.onCustomViewHidden();
         this.field_1120 = null;
      }

   }

   // $FF: renamed from: d () void
   public void method_143() {
   }

   // $FF: renamed from: e () void
   public void method_144() {
   }

   // $FF: renamed from: f () void
   public void method_145() {
      if (this.field_1114 != null && this.field_1114.field_1893 == 4) {
         if (this.field_1121) {
            this.field_1113.finish();
         } else {
            this.field_1121 = true;
         }
      }

      if (this.field_1116 != null) {
         class_466.method_1598(this.field_1116);
      }

   }

   // $FF: renamed from: g () void
   public void method_146() {
      if (this.field_1115 != null) {
         this.field_1115.method_1488();
      }

      this.method_1449();
      if (this.field_1116 != null && (!this.field_1113.isFinishing() || this.field_1117 == null)) {
         class_466.method_1588(this.field_1116);
      }

      this.method_1440();
   }

   // $FF: renamed from: h () void
   public void method_147() {
      this.method_1440();
   }

   // $FF: renamed from: i () void
   public void method_148() {
      if (this.field_1115 != null) {
         this.field_1115.method_1482();
      }

      if (this.field_1116 != null) {
         this.field_1123.removeView(this.field_1116);
      }

      this.method_1440();
   }

   // $FF: renamed from: j () void
   public void method_1450() {
      this.field_1123.removeView(this.field_1118);
      this.method_1445(true);
   }
}
