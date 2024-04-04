package com.a.h;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.a.b.class_297;
import dn.class_100;
import dn.class_91;
import java.io.InputStream;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// $FF: renamed from: com.a.h.b
public class class_577 {
   // $FF: renamed from: a (java.lang.String) com.a.h.a
   private static class_575 method_1878(String var0) {
      JSONException var1;
      class_575 var5;
      label17: {
         class_575 var6;
         try {
            var6 = new class_575();
         } catch (JSONException var4) {
            var1 = var4;
            var5 = null;
            break label17;
         }

         try {
            JSONObject var7 = new JSONObject(var0);
            var6.method_1869(var7.getString("adsLinkEN"));
            var6.method_1867(var7.getString("adsLinkVN"));
            var6.method_1873(var7.getString("adsTitleEN"));
            var6.method_1871(var7.getString("adsTitleVI"));
            var6.method_1864(var7.getInt("adsVersion"));
            var6.method_1860(var7.getInt("appVersion"));
            var6.method_1865(var7.getString("appVersionTitleEN"));
            var6.method_1861(var7.getString("appVersionTitleVI"));
            var6.method_1862(var7.getBoolean("notified"));
            var6.method_1875(var7.getString("serverLink"));
            return var6;
         } catch (JSONException var3) {
            var5 = var6;
            var1 = var3;
         }
      }

      var1.printStackTrace();
      return var5;
   }

   // $FF: renamed from: a (java.io.InputStream) java.lang.String
   private static String method_1879(InputStream param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (android.content.Context) void
   public static void method_1880(Context var0) {
      if (class_100.method_312() && var0 != null) {
         (new Thread(new class_515(var0))).start();
      }

   }

   // $FF: renamed from: a () boolean
   // $FF: synthetic method
   static boolean method_1881() {
      return method_1884();
   }

   // $FF: renamed from: a (java.lang.String, android.content.Context) boolean
   private static boolean method_1882(String var0, Context var1) {
      PackageManager var3 = var1.getPackageManager();

      try {
         var3.getPackageInfo(var0, 1);
         return true;
      } catch (NameNotFoundException var2) {
         return false;
      }
   }

   // $FF: renamed from: b (android.content.Context) void
   // $FF: synthetic method
   static void method_1883(Context var0) {
      method_1885(var0);
   }

   // $FF: renamed from: b () boolean
   private static boolean method_1884() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (android.content.Context) void
   private static void method_1885(Context var0) {
      Exception var10000;
      label156: {
         String var4;
         boolean var10001;
         try {
            var4 = class_91.method_281().method_284(class_91.field_87);
            if (!class_100.method_312()) {
               return;
            }
         } catch (Exception var23) {
            var10000 = var23;
            var10001 = false;
            break label156;
         }

         if (var4 == null) {
            return;
         }

         class_575 var6;
         try {
            var6 = method_1878(var4);
         } catch (Exception var22) {
            var10000 = var22;
            var10001 = false;
            break label156;
         }

         if (var6 == null) {
            return;
         }

         int var1;
         int var2;
         try {
            var1 = class_91.method_281().method_286(class_91.field_94);
            var2 = var6.method_1859();
         } catch (Exception var21) {
            var10000 = var21;
            var10001 = false;
            break label156;
         }

         if (var1 == -1) {
            var1 = var2;
         }

         String var5 = null;

         try {
            if (var6.method_1877() != null) {
               class_91.method_281().method_283(class_91.field_86, var6.method_1877());
            }
         } catch (Exception var20) {
            var10000 = var20;
            var10001 = false;
            break label156;
         }

         try {
            if (!var6.field_1933) {
               return;
            }
         } catch (Exception var19) {
            var10000 = var19;
            var10001 = false;
            break label156;
         }

         class_297 var25;
         if (var2 > var1) {
            label157: {
               try {
                  if (Locale.getDefault().getLanguage().equalsIgnoreCase("en")) {
                     var4 = var6.method_1866();
                     break label157;
                  }
               } catch (Exception var15) {
                  var10000 = var15;
                  var10001 = false;
                  break label156;
               }

               try {
                  var4 = var6.method_1863();
               } catch (Exception var14) {
                  var10000 = var14;
                  var10001 = false;
                  break label156;
               }
            }

            try {
               var25 = new class_297(var0, var4, var0.getPackageName());
            } catch (Exception var13) {
               var10000 = var13;
               var10001 = false;
               break label156;
            }
         } else {
            label158: {
               int var3;
               try {
                  var3 = class_91.method_281().method_286(class_91.field_95);
               } catch (Exception var12) {
                  var10000 = var12;
                  var10001 = false;
                  break label156;
               }

               var1 = var3;
               if (var3 == -1) {
                  try {
                     var1 = var6.method_1876();
                  } catch (Exception var11) {
                     var10000 = var11;
                     var10001 = false;
                     break label156;
                  }
               }

               var25 = var5;

               try {
                  if (var6.method_1876() <= var1) {
                     break label158;
                  }
               } catch (Exception var18) {
                  var10000 = var18;
                  var10001 = false;
                  break label156;
               }

               var25 = var5;

               try {
                  if (method_1882(var6.method_1870(), var0)) {
                     break label158;
                  }
               } catch (Exception var17) {
                  var10000 = var17;
                  var10001 = false;
                  break label156;
               }

               var25 = var5;

               label159: {
                  try {
                     if (method_1882(var6.method_1868(), var0)) {
                        break label158;
                     }

                     if (Locale.getDefault().getLanguage().equalsIgnoreCase("en")) {
                        var4 = var6.method_1874();
                        var5 = var6.method_1870();
                        break label159;
                     }
                  } catch (Exception var16) {
                     var10000 = var16;
                     var10001 = false;
                     break label156;
                  }

                  try {
                     var4 = var6.method_1872();
                     var5 = var6.method_1868();
                  } catch (Exception var10) {
                     var10000 = var10;
                     var10001 = false;
                     break label156;
                  }
               }

               try {
                  var25 = new class_297(var0, var4, var5);
               } catch (Exception var9) {
                  var10000 = var9;
                  var10001 = false;
                  break label156;
               }
            }
         }

         try {
            class_91.method_281().method_282(class_91.field_94, var2);
            class_91.method_281().method_282(class_91.field_95, var6.method_1876());
         } catch (Exception var8) {
            var10000 = var8;
            var10001 = false;
            break label156;
         }

         if (var25 == null) {
            return;
         }

         try {
            var25.method_1013();
            return;
         } catch (Exception var7) {
            var10000 = var7;
            var10001 = false;
         }
      }

      Exception var24 = var10000;
      var24.printStackTrace();
   }
}
