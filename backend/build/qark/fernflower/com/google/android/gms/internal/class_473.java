package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

// $FF: renamed from: com.google.android.gms.internal.ev
public final class class_473 extends WebView implements DownloadListener {
   // $FF: renamed from: a com.google.android.gms.internal.ex
   private final class_470 field_1296;
   // $FF: renamed from: b com.google.android.gms.internal.ew
   private final class_472 field_1297;
   // $FF: renamed from: c java.lang.Object
   private final Object field_1298 = new Object();
   // $FF: renamed from: d com.google.android.gms.internal.is
   private final class_355 field_1299;
   // $FF: renamed from: e com.google.android.gms.internal.ct
   private final class_424 field_1300;
   // $FF: renamed from: f com.google.android.gms.internal.cc
   private class_420 field_1301;
   // $FF: renamed from: g com.google.android.gms.internal.x
   private class_607 field_1302;
   // $FF: renamed from: h boolean
   private boolean field_1303;
   // $FF: renamed from: i boolean
   private boolean field_1304;

   private class_473(class_472 var1, class_607 var2, boolean var3, boolean var4, class_355 var5, class_424 var6) {
      super(var1);
      this.field_1297 = var1;
      this.field_1302 = var2;
      this.field_1303 = var3;
      this.field_1299 = var5;
      this.field_1300 = var6;
      this.setBackgroundColor(0);
      WebSettings var7 = this.getSettings();
      var7.setJavaScriptEnabled(true);
      var7.setSavePassword(false);
      var7.setSupportMultipleWindows(true);
      var7.setJavaScriptCanOpenWindowsAutomatically(true);
      class_466.method_1585(var1, var6.field_1127, var7);
      if (VERSION.SDK_INT >= 17) {
         class_469.method_1620(this.getContext(), var7);
      } else if (VERSION.SDK_INT >= 11) {
         class_463.method_1571(this.getContext(), var7);
      }

      this.setDownloadListener(this);
      if (VERSION.SDK_INT >= 11) {
         this.field_1296 = new class_471(this, var4);
      } else {
         this.field_1296 = new class_470(this, var4);
      }

      this.setWebViewClient(this.field_1296);
      if (VERSION.SDK_INT >= 14) {
         this.setWebChromeClient(new class_505(this));
      } else if (VERSION.SDK_INT >= 11) {
         this.setWebChromeClient(new class_504(this));
      }

      this.method_1637();
   }

   // $FF: renamed from: a (android.content.Context, com.google.android.gms.internal.x, boolean, boolean, com.google.android.gms.internal.is, com.google.android.gms.internal.ct) com.google.android.gms.internal.ev
   public static class_473 method_1636(Context var0, class_607 var1, boolean var2, boolean var3, class_355 var4, class_424 var5) {
      return new class_473(new class_472(var0), var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: i () void
   private void method_1637() {
      Object var1 = this.field_1298;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label536: {
         label540: {
            label542: {
               try {
                  if (this.field_1303 || this.field_1302.field_2024) {
                     break label542;
                  }
               } catch (Throwable var58) {
                  var10000 = var58;
                  var10001 = false;
                  break label536;
               }

               try {
                  if (VERSION.SDK_INT < 18) {
                     class_467.method_1603("Disabling hardware acceleration on an AdView.");
                     this.method_1638();
                     break label540;
                  }
               } catch (Throwable var56) {
                  var10000 = var56;
                  var10001 = false;
                  break label536;
               }

               try {
                  class_467.method_1603("Enabling hardware acceleration on an AdView.");
                  this.method_1639();
                  break label540;
               } catch (Throwable var54) {
                  var10000 = var54;
                  var10001 = false;
                  break label536;
               }
            }

            try {
               if (VERSION.SDK_INT < 14) {
                  class_467.method_1603("Disabling hardware acceleration on an overlay.");
                  this.method_1638();
                  break label540;
               }
            } catch (Throwable var57) {
               var10000 = var57;
               var10001 = false;
               break label536;
            }

            try {
               class_467.method_1603("Enabling hardware acceleration on an overlay.");
               this.method_1639();
            } catch (Throwable var55) {
               var10000 = var55;
               var10001 = false;
               break label536;
            }
         }

         label509:
         try {
            return;
         } catch (Throwable var53) {
            var10000 = var53;
            var10001 = false;
            break label509;
         }
      }

      while(true) {
         Throwable var2 = var10000;

         try {
            throw var2;
         } catch (Throwable var52) {
            var10000 = var52;
            var10001 = false;
            continue;
         }
      }
   }

   // $FF: renamed from: j () void
   private void method_1638() {
      Object var1 = this.field_1298;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label130: {
         try {
            if (!this.field_1304 && VERSION.SDK_INT >= 11) {
               class_463.method_1572(this);
            }
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label130;
         }

         label127:
         try {
            this.field_1304 = true;
            return;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            break label127;
         }
      }

      while(true) {
         Throwable var2 = var10000;

         try {
            throw var2;
         } catch (Throwable var12) {
            var10000 = var12;
            var10001 = false;
            continue;
         }
      }
   }

   // $FF: renamed from: k () void
   private void method_1639() {
      Object var1 = this.field_1298;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label130: {
         try {
            if (this.field_1304 && VERSION.SDK_INT >= 11) {
               class_463.method_1575(this);
            }
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label130;
         }

         label127:
         try {
            this.field_1304 = false;
            return;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            break label127;
         }
      }

      while(true) {
         Throwable var2 = var10000;

         try {
            throw var2;
         } catch (Throwable var12) {
            var10000 = var12;
            var10001 = false;
            continue;
         }
      }
   }

   // $FF: renamed from: a () void
   public void method_1640() {
      HashMap var1 = new HashMap(1);
      var1.put("version", this.field_1300.field_1127);
      this.method_1644("onhide", var1);
   }

   // $FF: renamed from: a (android.content.Context, com.google.android.gms.internal.x) void
   public void method_1641(Context param1, class_607 param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (com.google.android.gms.internal.cc) void
   public void method_1642(class_420 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (com.google.android.gms.internal.x) void
   public void method_1643(class_607 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (java.lang.String, java.util.Map) void
   public void method_1644(String var1, Map var2) {
      StringBuilder var3 = new StringBuilder();
      var3.append("javascript:AFMA_ReceiveMessage('");
      var3.append(var1);
      var3.append("'");
      if (var2 != null) {
         try {
            var1 = class_466.method_1584(var2).toString();
            var3.append(",");
            var3.append(var1);
         } catch (JSONException var4) {
            class_467.method_1610("Could not convert AFMA event parameters to JSON.");
            return;
         }
      }

      var3.append(");");
      class_467.method_1609("Dispatching AFMA event: " + var3);
      this.loadUrl(var3.toString());
   }

   // $FF: renamed from: a (boolean) void
   public void method_1645(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () void
   public void method_1646() {
      HashMap var1 = new HashMap(1);
      var1.put("version", this.field_1300.field_1127);
      this.method_1644("onshow", var1);
   }

   // $FF: renamed from: c () com.google.android.gms.internal.cc
   public class_420 method_1647() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d () com.google.android.gms.internal.x
   public class_607 method_1648() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () com.google.android.gms.internal.ex
   public class_470 method_1649() {
      return this.field_1296;
   }

   // $FF: renamed from: f () com.google.android.gms.internal.is
   public class_355 method_1650() {
      return this.field_1299;
   }

   // $FF: renamed from: g () com.google.android.gms.internal.ct
   public class_424 method_1651() {
      return this.field_1300;
   }

   // $FF: renamed from: h () boolean
   public boolean method_1652() {
      // $FF: Couldn't be decompiled
   }

   public void onDownloadStart(String var1, String var2, String var3, String var4, long var5) {
      try {
         Intent var8 = new Intent("android.intent.action.VIEW");
         var8.setDataAndType(Uri.parse(var1), var4);
         this.getContext().startActivity(var8);
      } catch (ActivityNotFoundException var7) {
         class_467.method_1603("Couldn't find an Activity to view url/mimetype: " + var1 + " / " + var4);
      }
   }

   protected void onMeasure(int var1, int var2) {
      int var4 = Integer.MAX_VALUE;
      Object var8 = this.field_1298;
      synchronized(var8){}

      Throwable var10000;
      boolean var10001;
      label1107: {
         label1099: {
            try {
               if (!this.isInEditMode() && !this.field_1303) {
                  break label1099;
               }
            } catch (Throwable var119) {
               var10000 = var119;
               var10001 = false;
               break label1107;
            }

            try {
               super.onMeasure(var1, var2);
               return;
            } catch (Throwable var118) {
               var10000 = var118;
               var10001 = false;
               break label1107;
            }
         }

         int var3;
         int var5;
         int var6;
         int var7;
         try {
            var7 = MeasureSpec.getMode(var1);
            var3 = MeasureSpec.getSize(var1);
            var6 = MeasureSpec.getMode(var2);
            var5 = MeasureSpec.getSize(var2);
         } catch (Throwable var117) {
            var10000 = var117;
            var10001 = false;
            break label1107;
         }

         if (var7 != Integer.MIN_VALUE && var7 != 1073741824) {
            var1 = Integer.MAX_VALUE;
         } else {
            var1 = var3;
         }

         label1053: {
            if (var6 != Integer.MIN_VALUE) {
               var2 = var4;
               if (var6 != 1073741824) {
                  break label1053;
               }
            }

            var2 = var5;
         }

         label1105: {
            label1106: {
               try {
                  if (this.field_1302.field_2026 <= var1 && this.field_1302.field_2023 <= var2) {
                     break label1106;
                  }
               } catch (Throwable var116) {
                  var10000 = var116;
                  var10001 = false;
                  break label1107;
               }

               try {
                  class_467.method_1610("Not enough space to show ad. Needs " + this.field_1302.field_2026 + "x" + this.field_1302.field_2023 + " pixels, but only has " + var3 + "x" + var5 + " pixels.");
                  if (this.getVisibility() != 8) {
                     this.setVisibility(4);
                  }
               } catch (Throwable var114) {
                  var10000 = var114;
                  var10001 = false;
                  break label1107;
               }

               try {
                  this.setMeasuredDimension(0, 0);
                  break label1105;
               } catch (Throwable var113) {
                  var10000 = var113;
                  var10001 = false;
                  break label1107;
               }
            }

            try {
               if (this.getVisibility() != 8) {
                  this.setVisibility(0);
               }
            } catch (Throwable var115) {
               var10000 = var115;
               var10001 = false;
               break label1107;
            }

            try {
               this.setMeasuredDimension(this.field_1302.field_2026, this.field_1302.field_2023);
            } catch (Throwable var112) {
               var10000 = var112;
               var10001 = false;
               break label1107;
            }
         }

         label1061:
         try {
            return;
         } catch (Throwable var111) {
            var10000 = var111;
            var10001 = false;
            break label1061;
         }
      }

      while(true) {
         Throwable var9 = var10000;

         try {
            throw var9;
         } catch (Throwable var110) {
            var10000 = var110;
            var10001 = false;
            continue;
         }
      }
   }

   public boolean onTouchEvent(MotionEvent var1) {
      if (this.field_1299 != null) {
         this.field_1299.method_1241(var1);
      }

      return super.onTouchEvent(var1);
   }

   public void setContext(Context var1) {
      this.field_1297.setBaseContext(var1);
   }
}
