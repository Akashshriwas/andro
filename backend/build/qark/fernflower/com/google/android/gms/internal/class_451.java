package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// $FF: renamed from: com.google.android.gms.internal.du
public final class class_451 {
   // $FF: renamed from: a java.text.SimpleDateFormat
   private static final SimpleDateFormat field_1217 = new SimpleDateFormat("yyyyMMdd");

   // $FF: renamed from: a (android.content.Context, com.google.android.gms.internal.bz, java.lang.String) com.google.android.gms.internal.cb
   public static class_434 method_1511(Context var0, class_433 var1, String var2) {
      JSONException var10000;
      label245: {
         long var5;
         String var9;
         String var10;
         String var13;
         JSONObject var14;
         boolean var10001;
         label242: {
            try {
               var14 = new JSONObject(var2);
               var2 = var14.optString("ad_base_url", (String)null);
               var10 = var14.optString("ad_url", (String)null);
               var13 = var14.optString("ad_size", (String)null);
               var9 = var14.optString("ad_html", (String)null);
               if (var14.has("interstitial_timeout")) {
                  var5 = (long)(var14.getDouble("interstitial_timeout") * 1000.0D);
                  break label242;
               }
            } catch (JSONException var36) {
               var10000 = var36;
               var10001 = false;
               break label245;
            }

            var5 = -1L;
         }

         String var11;
         try {
            var11 = var14.optString("orientation", (String)null);
         } catch (JSONException var31) {
            var10000 = var31;
            var10001 = false;
            break label245;
         }

         int var3 = -1;

         label246: {
            try {
               if ("portrait".equals(var11)) {
                  var3 = class_466.method_1599();
                  break label246;
               }
            } catch (JSONException var35) {
               var10000 = var35;
               var10001 = false;
               break label245;
            }

            try {
               if ("landscape".equals(var11)) {
                  var3 = class_466.method_1595();
               }
            } catch (JSONException var34) {
               var10000 = var34;
               var10001 = false;
               break label245;
            }
         }

         class_434 var37;
         class_434 var42;
         label222: {
            label247: {
               try {
                  if (!TextUtils.isEmpty(var9)) {
                     if (!TextUtils.isEmpty(var2)) {
                        break label247;
                     }

                     class_467.method_1610("Could not parse the mediation config: Missing required ad_base_url field");
                     return new class_434(0);
                  }
               } catch (JSONException var33) {
                  var10000 = var33;
                  var10001 = false;
                  break label245;
               }

               try {
                  if (!TextUtils.isEmpty(var10)) {
                     var42 = class_447.method_1502(var0, var1.field_1167.field_1127, var10);
                     var2 = var42.field_1170;
                     var9 = var42.field_1171;
                     break label222;
                  }
               } catch (JSONException var32) {
                  var10000 = var32;
                  var10001 = false;
                  break label245;
               }

               try {
                  class_467.method_1610("Could not parse the mediation config: Missing required ad_html or ad_url field.");
                  var37 = new class_434(0);
                  return var37;
               } catch (JSONException var30) {
                  var10000 = var30;
                  var10001 = false;
                  break label245;
               }
            }

            var42 = null;
         }

         JSONArray var43;
         try {
            var43 = var14.optJSONArray("click_urls");
         } catch (JSONException var29) {
            var10000 = var29;
            var10001 = false;
            break label245;
         }

         List var38;
         if (var42 == null) {
            var38 = null;
         } else {
            try {
               var38 = var42.field_1172;
            } catch (JSONException var28) {
               var10000 = var28;
               var10001 = false;
               break label245;
            }
         }

         int var4;
         Object var39;
         Object var44;
         if (var43 != null) {
            var39 = var38;
            if (var38 == null) {
               try {
                  var39 = new LinkedList();
               } catch (JSONException var26) {
                  var10000 = var26;
                  var10001 = false;
                  break label245;
               }
            }

            var4 = 0;

            while(true) {
               try {
                  if (var4 >= var43.length()) {
                     break;
                  }

                  ((List)var39).add(var43.getString(var4));
               } catch (JSONException var27) {
                  var10000 = var27;
                  var10001 = false;
                  break label245;
               }

               ++var4;
            }

            var44 = var39;
         } else {
            var44 = var38;
         }

         JSONArray var12;
         try {
            var12 = var14.optJSONArray("impression_urls");
         } catch (JSONException var25) {
            var10000 = var25;
            var10001 = false;
            break label245;
         }

         if (var42 == null) {
            var38 = null;
         } else {
            try {
               var38 = var42.field_1174;
            } catch (JSONException var24) {
               var10000 = var24;
               var10001 = false;
               break label245;
            }
         }

         Object var45;
         if (var12 != null) {
            var39 = var38;
            if (var38 == null) {
               try {
                  var39 = new LinkedList();
               } catch (JSONException var22) {
                  var10000 = var22;
                  var10001 = false;
                  break label245;
               }
            }

            var4 = 0;

            while(true) {
               try {
                  if (var4 >= var12.length()) {
                     break;
                  }

                  ((List)var39).add(var12.getString(var4));
               } catch (JSONException var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label245;
               }

               ++var4;
            }

            var45 = var39;
         } else {
            var45 = var38;
         }

         JSONArray var46;
         try {
            var46 = var14.optJSONArray("manual_impression_urls");
         } catch (JSONException var21) {
            var10000 = var21;
            var10001 = false;
            break label245;
         }

         Object var40;
         if (var42 == null) {
            var40 = null;
         } else {
            try {
               var40 = var42.field_1178;
            } catch (JSONException var20) {
               var10000 = var20;
               var10001 = false;
               break label245;
            }
         }

         if (var46 != null) {
            var39 = var40;
            if (var40 == null) {
               try {
                  var39 = new LinkedList();
               } catch (JSONException var18) {
                  var10000 = var18;
                  var10001 = false;
                  break label245;
               }
            }

            var4 = 0;

            while(true) {
               try {
                  if (var4 >= var46.length()) {
                     break;
                  }

                  ((List)var39).add(var46.getString(var4));
               } catch (JSONException var19) {
                  var10000 = var19;
                  var10001 = false;
                  break label245;
               }

               ++var4;
            }

            var40 = var39;
         }

         long var7 = var5;
         var4 = var3;
         if (var42 != null) {
            label252: {
               try {
                  if (var42.field_1180 != -1) {
                     var3 = var42.field_1180;
                  }
               } catch (JSONException var17) {
                  var10000 = var17;
                  var10001 = false;
                  break label245;
               }

               var7 = var5;
               var4 = var3;

               try {
                  if (var42.field_1175 <= 0L) {
                     break label252;
                  }

                  var7 = var42.field_1175;
               } catch (JSONException var16) {
                  var10000 = var16;
                  var10001 = false;
                  break label245;
               }

               var4 = var3;
            }
         }

         try {
            var37 = new class_434(var2, var9, (List)var44, (List)var45, var7, false, -1L, (List)var40, -1L, var4, var13);
            return var37;
         } catch (JSONException var15) {
            var10000 = var15;
            var10001 = false;
         }
      }

      JSONException var41 = var10000;
      class_467.method_1610("Could not parse the mediation config: " + var41.getMessage());
      return new class_434(0);
   }

   // $FF: renamed from: a (boolean) java.lang.Integer
   private static Integer method_1512(boolean var0) {
      byte var1;
      if (var0) {
         var1 = 1;
      } else {
         var1 = 0;
      }

      return Integer.valueOf(var1);
   }

   // $FF: renamed from: a (int) java.lang.String
   private static String method_1513(int var0) {
      return String.format(Locale.US, "#%06x", 16777215 & var0);
   }

   // $FF: renamed from: a (com.google.android.gms.internal.bz, com.google.android.gms.internal.ea, android.location.Location) java.lang.String
   public static String method_1514(class_433 var0, class_479 var1, Location var2) {
      JSONException var10000;
      label143: {
         boolean var10001;
         HashMap var26;
         try {
            var26 = new HashMap();
            if (var0.field_1158 != null) {
               var26.put("ad_pos", var0.field_1158);
            }
         } catch (JSONException var23) {
            var10000 = var23;
            var10001 = false;
            break label143;
         }

         try {
            method_1518(var26, var0.field_1159);
            var26.put("format", var0.field_1160.field_2021);
            if (var0.field_1160.field_2025 == -1) {
               var26.put("smart_w", "full");
            }
         } catch (JSONException var22) {
            var10000 = var22;
            var10001 = false;
            break label143;
         }

         try {
            if (var0.field_1160.field_2022 == -2) {
               var26.put("smart_h", "auto");
            }
         } catch (JSONException var21) {
            var10000 = var21;
            var10001 = false;
            break label143;
         }

         label144: {
            int var5;
            StringBuilder var6;
            class_607[] var7;
            try {
               if (var0.field_1160.field_2027 == null) {
                  break label144;
               }

               var6 = new StringBuilder();
               var7 = var0.field_1160.field_2027;
               var5 = var7.length;
            } catch (JSONException var20) {
               var10000 = var20;
               var10001 = false;
               break label143;
            }

            for(int var3 = 0; var3 < var5; ++var3) {
               class_607 var8 = var7[var3];

               try {
                  if (var6.length() != 0) {
                     var6.append("|");
                  }
               } catch (JSONException var17) {
                  var10000 = var17;
                  var10001 = false;
                  break label143;
               }

               int var4;
               label146: {
                  try {
                     if (var8.field_2025 == -1) {
                        var4 = (int)((float)var8.field_2026 / var1.field_1362);
                        break label146;
                     }
                  } catch (JSONException var18) {
                     var10000 = var18;
                     var10001 = false;
                     break label143;
                  }

                  try {
                     var4 = var8.field_2025;
                  } catch (JSONException var16) {
                     var10000 = var16;
                     var10001 = false;
                     break label143;
                  }
               }

               label147: {
                  try {
                     var6.append(var4);
                     var6.append("x");
                     if (var8.field_2022 == -2) {
                        var4 = (int)((float)var8.field_2023 / var1.field_1362);
                        break label147;
                     }
                  } catch (JSONException var19) {
                     var10000 = var19;
                     var10001 = false;
                     break label143;
                  }

                  try {
                     var4 = var8.field_2022;
                  } catch (JSONException var15) {
                     var10000 = var15;
                     var10001 = false;
                     break label143;
                  }
               }

               try {
                  var6.append(var4);
               } catch (JSONException var14) {
                  var10000 = var14;
                  var10001 = false;
                  break label143;
               }
            }

            try {
               var26.put("sz", var6);
            } catch (JSONException var13) {
               var10000 = var13;
               var10001 = false;
               break label143;
            }
         }

         try {
            var26.put("slotname", var0.field_1161);
            var26.put("pn", var0.field_1162.packageName);
            if (var0.field_1163 != null) {
               var26.put("vc", var0.field_1163.versionCode);
            }
         } catch (JSONException var12) {
            var10000 = var12;
            var10001 = false;
            break label143;
         }

         try {
            var26.put("ms", var0.field_1164);
            var26.put("seq_num", var0.field_1165);
            var26.put("session_id", var0.field_1166);
            var26.put("js", var0.field_1167.field_1127);
            method_1517(var26, var1);
            if (var0.field_1159.field_1980 >= 2 && var0.field_1159.field_1990 != null) {
               method_1515(var26, var0.field_1159.field_1990);
            }
         } catch (JSONException var11) {
            var10000 = var11;
            var10001 = false;
            break label143;
         }

         String var24;
         try {
            if (class_467.method_1605(2)) {
               var24 = class_466.method_1584(var26).toString(2);
               class_467.method_1609("Ad Request JSON: " + var24);
            }
         } catch (JSONException var10) {
            var10000 = var10;
            var10001 = false;
            break label143;
         }

         try {
            var24 = class_466.method_1584(var26).toString();
            return var24;
         } catch (JSONException var9) {
            var10000 = var9;
            var10001 = false;
         }
      }

      JSONException var25 = var10000;
      class_467.method_1610("Problem serializing ad request to JSON: " + var25.getMessage());
      return null;
   }

   // $FF: renamed from: a (java.util.HashMap, android.location.Location) void
   private static void method_1515(HashMap var0, Location var1) {
      HashMap var9 = new HashMap();
      float var2 = var1.getAccuracy();
      long var3 = var1.getTime();
      long var5 = (long)(var1.getLatitude() * 1.0E7D);
      long var7 = (long)(var1.getLongitude() * 1.0E7D);
      var9.put("radius", var2 * 1000.0F);
      var9.put("lat", var5);
      var9.put("long", var7);
      var9.put("time", var3 * 1000L);
      var0.put("uule", var9);
   }

   // $FF: renamed from: a (java.util.HashMap, com.google.android.gms.internal.ai) void
   private static void method_1516(HashMap var0, class_530 var1) {
      Object var3 = null;
      if (Color.alpha(var1.field_1638) != 0) {
         var0.put("acolor", method_1513(var1.field_1638));
      }

      if (Color.alpha(var1.field_1639) != 0) {
         var0.put("bgcolor", method_1513(var1.field_1639));
      }

      if (Color.alpha(var1.field_1640) != 0 && Color.alpha(var1.field_1641) != 0) {
         var0.put("gradientto", method_1513(var1.field_1640));
         var0.put("gradientfrom", method_1513(var1.field_1641));
      }

      if (Color.alpha(var1.field_1642) != 0) {
         var0.put("bcolor", method_1513(var1.field_1642));
      }

      var0.put("bthick", Integer.toString(var1.field_1643));
      String var2;
      switch(var1.field_1644) {
      case 0:
         var2 = "none";
         break;
      case 1:
         var2 = "dashed";
         break;
      case 2:
         var2 = "dotted";
         break;
      case 3:
         var2 = "solid";
         break;
      default:
         var2 = null;
      }

      if (var2 != null) {
         var0.put("btype", var2);
      }

      switch(var1.field_1645) {
      case 0:
         var2 = "light";
         break;
      case 1:
         var2 = "medium";
         break;
      case 2:
         var2 = "dark";
         break;
      default:
         var2 = (String)var3;
      }

      if (var2 != null) {
         var0.put("callbuttoncolor", var2);
      }

      if (var1.field_1646 != null) {
         var0.put("channel", var1.field_1646);
      }

      if (Color.alpha(var1.field_1647) != 0) {
         var0.put("dcolor", method_1513(var1.field_1647));
      }

      if (var1.field_1648 != null) {
         var0.put("font", var1.field_1648);
      }

      if (Color.alpha(var1.field_1649) != 0) {
         var0.put("hcolor", method_1513(var1.field_1649));
      }

      var0.put("headersize", Integer.toString(var1.field_1650));
      if (var1.field_1651 != null) {
         var0.put("q", var1.field_1651);
      }

   }

   // $FF: renamed from: a (java.util.HashMap, com.google.android.gms.internal.ea) void
   private static void method_1517(HashMap var0, class_479 var1) {
      var0.put("am", var1.field_1346);
      var0.put("cog", method_1512(var1.field_1347));
      var0.put("coh", method_1512(var1.field_1348));
      if (!TextUtils.isEmpty(var1.field_1349)) {
         var0.put("carrier", var1.field_1349);
      }

      var0.put("gl", var1.field_1350);
      if (var1.field_1351) {
         var0.put("simulator", 1);
      }

      var0.put("ma", method_1512(var1.field_1352));
      var0.put("sp", method_1512(var1.field_1353));
      var0.put("hl", var1.field_1354);
      if (!TextUtils.isEmpty(var1.field_1355)) {
         var0.put("mv", var1.field_1355);
      }

      var0.put("muv", var1.field_1356);
      if (var1.field_1357 != -2) {
         var0.put("cnt", var1.field_1357);
      }

      var0.put("gnt", var1.field_1358);
      var0.put("pt", var1.field_1359);
      var0.put("rm", var1.field_1360);
      var0.put("riv", var1.field_1361);
      var0.put("u_sd", var1.field_1362);
      var0.put("sh", var1.field_1364);
      var0.put("sw", var1.field_1363);
   }

   // $FF: renamed from: a (java.util.HashMap, com.google.android.gms.internal.v) void
   private static void method_1518(HashMap var0, class_597 var1) {
      if (var1.field_1981 != -1L) {
         var0.put("cust_age", field_1217.format(new Date(var1.field_1981)));
      }

      if (var1.field_1982 != null) {
         var0.put("extras", var1.field_1982);
      }

      if (var1.field_1983 != -1) {
         var0.put("cust_gender", var1.field_1983);
      }

      if (var1.field_1984 != null) {
         var0.put("kw", var1.field_1984);
      }

      if (var1.field_1986 != -1) {
         var0.put("tag_for_child_directed_treatment", var1.field_1986);
      }

      if (var1.field_1985) {
         var0.put("adtest", "on");
      }

      if (var1.field_1980 >= 2) {
         if (var1.field_1987) {
            var0.put("d_imp_hdr", 1);
         }

         if (!TextUtils.isEmpty(var1.field_1988)) {
            var0.put("ppid", var1.field_1988);
         }

         if (var1.field_1989 != null) {
            method_1516(var0, var1.field_1989);
         }
      }

   }
}
