package com.google.android.gms.internal;

import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.util.Map;

// $FF: renamed from: com.google.android.gms.internal.af
public final class class_554 implements class_60 {
   // $FF: renamed from: a (android.util.DisplayMetrics, java.util.Map, java.lang.String, int) int
   private static int method_1839(DisplayMetrics var0, Map var1, String var2, int var3) {
      String var6 = (String)var1.get(var2);
      int var4 = var3;
      if (var6 != null) {
         try {
            var4 = class_468.method_1612(var0, Integer.parseInt(var6));
         } catch (NumberFormatException var5) {
            class_467.method_1610("Could not parse " + var2 + " in a video GMSG: " + var6);
            return var3;
         }
      }

      return var4;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.ev, java.util.Map) void
   public void method_167(class_473 var1, Map var2) {
      String var12 = (String)var2.get("action");
      if (var12 == null) {
         class_467.method_1610("Action missing from video GMSG.");
      } else {
         class_420 var11 = var1.method_1647();
         if (var11 == null) {
            class_467.method_1610("Could not get ad overlay for a video GMSG.");
         } else {
            boolean var7 = "new".equalsIgnoreCase(var12);
            boolean var8 = "position".equalsIgnoreCase(var12);
            int var3;
            int var4;
            DisplayMetrics var14;
            if (!var7 && !var8) {
               class_440 var17 = var11.method_1446();
               if (var17 == null) {
                  class_440.method_1479(var1, "no_video_view", (String)null);
               } else if ("click".equalsIgnoreCase(var12)) {
                  var14 = var1.getContext().getResources().getDisplayMetrics();
                  var3 = method_1839(var14, var2, "x", 0);
                  var4 = method_1839(var14, var2, "y", 0);
                  long var9 = SystemClock.uptimeMillis();
                  MotionEvent var16 = MotionEvent.obtain(var9, var9, 0, (float)var3, (float)var4, 0);
                  var17.method_1484(var16);
                  var16.recycle();
               } else {
                  String var15;
                  if ("controls".equalsIgnoreCase(var12)) {
                     var15 = (String)var2.get("enabled");
                     if (var15 == null) {
                        class_467.method_1610("Enabled parameter missing from controls video GMSG.");
                     } else {
                        var17.method_1486(Boolean.parseBoolean(var15));
                     }
                  } else if ("currentTime".equalsIgnoreCase(var12)) {
                     var15 = (String)var2.get("time");
                     if (var15 == null) {
                        class_467.method_1610("Time parameter missing from currentTime video GMSG.");
                     } else {
                        try {
                           var17.method_1483((int)(Float.parseFloat(var15) * 1000.0F));
                        } catch (NumberFormatException var13) {
                           class_467.method_1610("Could not parse time parameter from currentTime video GMSG: " + var15);
                        }
                     }
                  } else if ("hide".equalsIgnoreCase(var12)) {
                     var17.setVisibility(4);
                  } else if ("load".equalsIgnoreCase(var12)) {
                     var17.method_1487();
                  } else if ("pause".equalsIgnoreCase(var12)) {
                     var17.method_1488();
                  } else if ("play".equalsIgnoreCase(var12)) {
                     var17.method_1489();
                  } else if ("show".equalsIgnoreCase(var12)) {
                     var17.setVisibility(0);
                  } else if ("src".equalsIgnoreCase(var12)) {
                     var17.method_1485((String)var2.get("src"));
                  } else {
                     class_467.method_1610("Unknown video action: " + var12);
                  }
               }
            } else {
               var14 = var1.getContext().getResources().getDisplayMetrics();
               var3 = method_1839(var14, var2, "x", 0);
               var4 = method_1839(var14, var2, "y", 0);
               int var5 = method_1839(var14, var2, "w", -1);
               int var6 = method_1839(var14, var2, "h", -1);
               if (var7 && var11.method_1446() == null) {
                  var11.method_1447(var3, var4, var5, var6);
               } else {
                  var11.method_1443(var3, var4, var5, var6);
               }
            }
         }
      }
   }
}
