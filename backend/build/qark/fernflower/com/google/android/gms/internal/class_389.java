package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.a.class_376;
import com.google.android.gms.a.class_43;

// $FF: renamed from: com.google.android.gms.internal.ju
public final class class_389 extends class_388 implements class_57, class_52, class_48, class_51, class_44, class_71 {
   // $FF: renamed from: a com.google.android.gms.internal.bl
   private final class_62 field_1028;
   // $FF: renamed from: b com.google.android.gms.internal.jv
   private final class_396 field_1029;
   // $FF: renamed from: c com.google.android.gms.internal.jw
   private final class_395 field_1030;

   public class_389(Context var1, class_607 var2, String var3, class_62 var4, class_424 var5) {
      this.field_1029 = new class_396(var1, var2, var3, var5);
      this.field_1028 = var4;
      this.field_1030 = new class_395(this);
      class_467.method_1608("Use AdRequest.Builder.addTestDevice(\"" + class_468.method_1613(var1) + "\") to get test ads on this device.");
      class_466.method_1597(var1);
   }

   // $FF: renamed from: a (int) void
   private void method_1317(int var1) {
      class_467.method_1610("Failed to load ad: " + var1);
      if (this.field_1029.field_1057 != null) {
         try {
            this.field_1029.field_1057.method_216(var1);
         } catch (RemoteException var3) {
            class_467.method_1607("Could not call AdListener.onAdFailedToLoad().", var3);
            return;
         }
      }

   }

   // $FF: renamed from: a (android.view.View) void
   private void method_1318(View var1) {
      LayoutParams var2 = new LayoutParams(-2, -2);
      this.field_1029.field_1052.addView(var1, var2);
   }

   // $FF: renamed from: a (boolean) void
   private void method_1319(boolean var1) {
      if (this.field_1029.field_1060 == null) {
         class_467.method_1610("Ad state was null when trying to ping impression URLs.");
      } else {
         class_467.method_1603("Pinging Impression URLs.");
         if (this.field_1029.field_1060.field_1327 != null) {
            class_466.method_1586(this.field_1029.field_1054, this.field_1029.field_1056.field_1127, this.field_1029.field_1060.field_1327);
         }

         if (this.field_1029.field_1060.field_1336 != null && this.field_1029.field_1060.field_1336.field_1668 != null) {
            class_539.method_1822(this.field_1029.field_1054, this.field_1029.field_1056.field_1127, this.field_1029.field_1060, this.field_1029.field_1053, var1, this.field_1029.field_1060.field_1336.field_1668);
         }

         if (this.field_1029.field_1060.field_1333 != null && this.field_1029.field_1060.field_1333.field_1621 != null) {
            class_539.method_1822(this.field_1029.field_1054, this.field_1029.field_1056.field_1127, this.field_1029.field_1060, this.field_1029.field_1053, var1, this.field_1029.field_1060.field_1333.field_1621);
            return;
         }
      }

   }

   // $FF: renamed from: b (com.google.android.gms.internal.ec) boolean
   private boolean method_1320(class_477 var1) {
      View var6;
      if (var1.field_1332) {
         try {
            var6 = (View)class_376.method_1294(var1.field_1334.method_171());
         } catch (RemoteException var5) {
            class_467.method_1607("Could not get View from mediation adapter.", var5);
            return false;
         }

         View var2 = this.field_1029.field_1052.getNextView();
         if (var2 != null) {
            this.field_1029.field_1052.removeView(var2);
         }

         try {
            this.method_1318(var6);
         } catch (Throwable var4) {
            class_467.method_1607("Could not add mediation view to view hierarchy.", var4);
            return false;
         }
      } else if (var1.field_1339 != null) {
         var1.field_1324.method_1643(var1.field_1339);
         this.field_1029.field_1052.removeAllViews();
         this.field_1029.field_1052.setMinimumWidth(var1.field_1339.field_2026);
         this.field_1029.field_1052.setMinimumHeight(var1.field_1339.field_2023);
         this.method_1318(var1.field_1324);
      }

      if (this.field_1029.field_1052.getChildCount() > 1) {
         this.field_1029.field_1052.showNext();
      }

      if (this.field_1029.field_1060 != null) {
         var6 = this.field_1029.field_1052.getNextView();
         if (var6 instanceof class_473) {
            ((class_473)var6).method_1641(this.field_1029.field_1054, this.field_1029.field_1059);
         } else if (var6 != null) {
            this.field_1029.field_1052.removeView(var6);
         }

         if (this.field_1029.field_1060.field_1334 != null) {
            try {
               this.field_1029.field_1060.field_1334.method_177();
            } catch (RemoteException var3) {
               class_467.method_1610("Could not destroy previous mediation adapter.");
            }
         }
      }

      this.field_1029.field_1052.setVisibility(0);
      return true;
   }

   // $FF: renamed from: c (com.google.android.gms.internal.v) com.google.android.gms.internal.dl
   private class_445 method_1321(class_597 var1) {
      ApplicationInfo var9 = this.field_1029.field_1054.getApplicationInfo();

      PackageInfo var7;
      try {
         var7 = this.field_1029.field_1054.getPackageManager().getPackageInfo(var9.packageName, 0);
      } catch (NameNotFoundException var10) {
         var7 = null;
      }

      Bundle var8;
      if (!this.field_1029.field_1059.field_2024 && this.field_1029.field_1052.getParent() != null) {
         int[] var11 = new int[2];
         this.field_1029.field_1052.getLocationOnScreen(var11);
         int var3 = var11[0];
         int var4 = var11[1];
         DisplayMetrics var12 = this.field_1029.field_1054.getResources().getDisplayMetrics();
         int var5 = this.field_1029.field_1052.getWidth();
         int var6 = this.field_1029.field_1052.getHeight();
         byte var2;
         if (this.field_1029.field_1052.isShown() && var3 + var5 > 0 && var4 + var6 > 0 && var3 <= var12.widthPixels && var4 <= var12.heightPixels) {
            var2 = 1;
         } else {
            var2 = 0;
         }

         var8 = new Bundle(5);
         var8.putInt("x", var3);
         var8.putInt("y", var4);
         var8.putInt("width", var5);
         var8.putInt("height", var6);
         var8.putInt("visible", var2);
      } else {
         var8 = null;
      }

      return new class_445(var8, var1, this.field_1029.field_1059, this.field_1029.field_1053, var9, var7, class_476.method_1662(), class_476.field_1320, this.field_1029.field_1056);
   }

   // $FF: renamed from: s () void
   private void method_1322() {
      class_467.method_1608("Ad closing.");
      if (this.field_1029.field_1057 != null) {
         try {
            this.field_1029.field_1057.method_215();
         } catch (RemoteException var2) {
            class_467.method_1607("Could not call AdListener.onAdClosed().", var2);
            return;
         }
      }

   }

   // $FF: renamed from: t () void
   private void method_1323() {
      class_467.method_1608("Ad leaving application.");
      if (this.field_1029.field_1057 != null) {
         try {
            this.field_1029.field_1057.method_217();
         } catch (RemoteException var2) {
            class_467.method_1607("Could not call AdListener.onAdLeftApplication().", var2);
            return;
         }
      }

   }

   // $FF: renamed from: u () void
   private void method_1324() {
      class_467.method_1608("Ad opening.");
      if (this.field_1029.field_1057 != null) {
         try {
            this.field_1029.field_1057.method_219();
         } catch (RemoteException var2) {
            class_467.method_1607("Could not call AdListener.onAdOpened().", var2);
            return;
         }
      }

   }

   // $FF: renamed from: v () void
   private void method_1325() {
      class_467.method_1608("Ad finished loading.");
      if (this.field_1029.field_1057 != null) {
         try {
            this.field_1029.field_1057.method_218();
         } catch (RemoteException var2) {
            class_467.method_1607("Could not call AdListener.onAdLoaded().", var2);
            return;
         }
      }

   }

   // $FF: renamed from: w () boolean
   private boolean method_1326() {
      boolean var1 = true;
      if (!class_466.method_1593(this.field_1029.field_1054.getPackageManager(), this.field_1029.field_1054.getPackageName(), "android.permission.INTERNET")) {
         if (!this.field_1029.field_1059.field_2024) {
            class_468.method_1616(this.field_1029.field_1052, this.field_1029.field_1059, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
         }

         var1 = false;
      }

      if (!class_466.method_1592(this.field_1029.field_1054)) {
         if (!this.field_1029.field_1059.field_2024) {
            class_468.method_1616(this.field_1029.field_1052, this.field_1029.field_1059, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
         }

         var1 = false;
      }

      if (!var1 && !this.field_1029.field_1059.field_2024) {
         this.field_1029.field_1052.setVisibility(0);
      }

      return var1;
   }

   // $FF: renamed from: x () void
   private void method_1327() {
      if (this.field_1029.field_1060 == null) {
         class_467.method_1610("Ad state was null when trying to ping click URLs.");
      } else {
         class_467.method_1603("Pinging click URLs.");
         if (this.field_1029.field_1060.field_1325 != null) {
            class_466.method_1586(this.field_1029.field_1054, this.field_1029.field_1056.field_1127, this.field_1029.field_1060.field_1325);
         }

         if (this.field_1029.field_1060.field_1336 != null && this.field_1029.field_1060.field_1336.field_1667 != null) {
            class_539.method_1822(this.field_1029.field_1054, this.field_1029.field_1056.field_1127, this.field_1029.field_1060, this.field_1029.field_1053, false, this.field_1029.field_1060.field_1336.field_1667);
            return;
         }
      }

   }

   // $FF: renamed from: y () void
   private void method_1328() {
      if (this.field_1029.field_1060 != null) {
         this.field_1029.field_1060.field_1324.destroy();
         this.field_1029.field_1060 = null;
      }

   }

   // $FF: renamed from: a () com.google.android.gms.a.a
   public class_43 method_202() {
      class_343.method_1195("getAdFrame must be called on the main UI thread.");
      return class_376.method_1293(this.field_1029.field_1052);
   }

   // $FF: renamed from: a (com.google.android.gms.internal.b) void
   public void method_203(class_82 var1) {
      class_343.method_1195("setAdListener must be called on the main UI thread.");
      this.field_1029.field_1057 = var1;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.ec) void
   public void method_150(class_477 var1) {
      this.field_1029.field_1058 = null;
      if (var1.field_1326 != -1) {
         boolean var2;
         if (var1.field_1323.field_1982 != null) {
            var2 = var1.field_1323.field_1982.getBoolean("_noRefresh", false);
         } else {
            var2 = false;
         }

         if (this.field_1029.field_1059.field_2024) {
            class_466.method_1588(var1.field_1324);
         } else if (!var2) {
            if (var1.field_1330 > 0L) {
               this.field_1030.method_1354(var1.field_1323, var1.field_1330);
            } else if (var1.field_1336 != null && var1.field_1336.field_1671 > 0L) {
               this.field_1030.method_1354(var1.field_1323, var1.field_1336.field_1671);
            } else if (!var1.field_1332 && var1.field_1326 == 2) {
               this.field_1030.method_1353(var1.field_1323);
            }
         }

         if (var1.field_1326 == 3 && var1.field_1336 != null && var1.field_1336.field_1669 != null) {
            class_467.method_1603("Pinging no fill URLs.");
            class_539.method_1822(this.field_1029.field_1054, this.field_1029.field_1056.field_1127, var1, this.field_1029.field_1053, false, var1.field_1336.field_1669);
         }

         if (var1.field_1326 != -2) {
            this.method_1317(var1.field_1326);
         } else if (!this.field_1029.field_1059.field_2024 && !this.method_1320(var1)) {
            this.method_1317(0);
         } else {
            if (this.field_1029.field_1060 != null && this.field_1029.field_1060.field_1337 != null) {
               this.field_1029.field_1060.field_1337.method_1810((class_57)null);
            }

            if (var1.field_1337 != null) {
               var1.field_1337.method_1810(this);
            }

            this.field_1029.field_1060 = var1;
            if (var1.field_1339 != null) {
               this.field_1029.field_1059 = var1.field_1339;
            }

            if (!this.field_1029.field_1059.field_2024) {
               this.method_1319(false);
            }

            this.method_1325();
         }
      }
   }

   // $FF: renamed from: a (com.google.android.gms.internal.k) void
   public void method_204(class_67 var1) {
      class_343.method_1195("setAppEventListener must be called on the main UI thread.");
      this.field_1029.field_1061 = var1;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.x) void
   public void method_205(class_607 var1) {
      class_343.method_1195("setAdSize must be called on the main UI thread.");
      this.field_1029.field_1059 = var1;
      if (this.field_1029.field_1060 != null) {
         this.field_1029.field_1060.field_1324.method_1643(var1);
      }

      if (this.field_1029.field_1052.getChildCount() > 1) {
         this.field_1029.field_1052.removeView(this.field_1029.field_1052.getNextView());
      }

      this.field_1029.field_1052.setMinimumWidth(var1.field_2026);
      this.field_1029.field_1052.setMinimumHeight(var1.field_2023);
      this.field_1029.field_1052.requestLayout();
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) void
   public void method_189(String var1, String var2) {
      if (this.field_1029.field_1061 != null) {
         try {
            this.field_1029.field_1061.method_184(var1, var2);
         } catch (RemoteException var3) {
            class_467.method_1607("Could not call the AppEventListener.", var3);
            return;
         }
      }

   }

   // $FF: renamed from: a (com.google.android.gms.internal.v) boolean
   public boolean method_206(class_597 var1) {
      class_343.method_1195("loadAd must be called on the main UI thread.");
      if (this.field_1029.field_1058 != null) {
         class_467.method_1610("An ad request is already in progress. Aborting.");
      } else {
         if (this.field_1029.field_1059.field_2024 && this.field_1029.field_1060 != null) {
            class_467.method_1610("An interstitial is already loading. Aborting.");
            return false;
         }

         if (this.method_1326()) {
            class_467.method_1608("Starting ad request.");
            this.field_1030.method_1352();
            class_445 var3 = this.method_1321(var1);
            class_473 var4;
            if (this.field_1029.field_1059.field_2024) {
               var4 = class_473.method_1636(this.field_1029.field_1054, this.field_1029.field_1059, false, false, this.field_1029.field_1055, this.field_1029.field_1056);
               var4.method_1649().method_1626(this, (class_52)null, this, this, true);
            } else {
               View var5 = this.field_1029.field_1052.getNextView();
               if (var5 instanceof class_473) {
                  var4 = (class_473)var5;
                  var4.method_1641(this.field_1029.field_1054, this.field_1029.field_1059);
               } else {
                  if (var5 != null) {
                     this.field_1029.field_1052.removeView(var5);
                  }

                  class_473 var2 = class_473.method_1636(this.field_1029.field_1054, this.field_1029.field_1059, false, false, this.field_1029.field_1055, this.field_1029.field_1056);
                  var4 = var2;
                  if (this.field_1029.field_1059.field_2027 == null) {
                     this.method_1318(var2);
                     var4 = var2;
                  }
               }

               var4.method_1649().method_1626(this, this, this, this, false);
            }

            this.field_1029.field_1058 = class_432.method_1471(this.field_1029.field_1054, var3, this.field_1029.field_1055, var4, this.field_1028, this);
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: b () void
   public void method_207() {
      class_343.method_1195("destroy must be called on the main UI thread.");
      this.field_1029.field_1057 = null;
      this.field_1029.field_1061 = null;
      this.field_1030.method_1352();
      this.method_212();
      if (this.field_1029.field_1052 != null) {
         this.field_1029.field_1052.removeAllViews();
      }

      if (this.field_1029.field_1060 != null && this.field_1029.field_1060.field_1324 != null) {
         this.field_1029.field_1060.field_1324.destroy();
      }

   }

   // $FF: renamed from: b (com.google.android.gms.internal.v) void
   public void method_1329(class_597 var1) {
      ViewParent var2 = this.field_1029.field_1052.getParent();
      if (var2 instanceof View && ((View)var2).isShown() && class_466.method_1591()) {
         this.method_206(var1);
      } else {
         class_467.method_1608("Ad is not visible. Not refreshing ad.");
         this.field_1030.method_1353(var1);
      }
   }

   // $FF: renamed from: c () boolean
   public boolean method_208() {
      class_343.method_1195("isLoaded must be called on the main UI thread.");
      return this.field_1029.field_1058 == null && this.field_1029.field_1060 != null;
   }

   // $FF: renamed from: d () void
   public void method_209() {
      class_343.method_1195("pause must be called on the main UI thread.");
      if (this.field_1029.field_1060 != null) {
         class_466.method_1588(this.field_1029.field_1060.field_1324);
      }

   }

   // $FF: renamed from: e () void
   public void method_210() {
      class_343.method_1195("resume must be called on the main UI thread.");
      if (this.field_1029.field_1060 != null) {
         class_466.method_1598(this.field_1029.field_1060.field_1324);
      }

   }

   // $FF: renamed from: f () void
   public void method_211() {
      class_343.method_1195("showInterstitial must be called on the main UI thread.");
      if (!this.field_1029.field_1059.field_2024) {
         class_467.method_1610("Cannot call showInterstitial on a banner ad.");
      } else if (this.field_1029.field_1060 == null) {
         class_467.method_1610("The interstitial has not loaded.");
      } else if (this.field_1029.field_1060.field_1324.method_1652()) {
         class_467.method_1610("The interstitial is already showing.");
      } else {
         this.field_1029.field_1060.field_1324.method_1645(true);
         if (this.field_1029.field_1060.field_1332) {
            try {
               this.field_1029.field_1060.field_1334.method_176();
            } catch (RemoteException var2) {
               class_467.method_1607("Could not show interstitial.", var2);
               this.method_1328();
            }
         } else {
            class_556 var1 = new class_556(this, this, this, this.field_1029.field_1060.field_1324, this.field_1029.field_1060.field_1329, this.field_1029.field_1056);
            class_420.method_1437(this.field_1029.field_1054, var1);
         }
      }
   }

   // $FF: renamed from: g () void
   public void method_212() {
      class_343.method_1195("stopLoading must be called on the main UI thread.");
      if (this.field_1029.field_1060 != null) {
         this.field_1029.field_1060.field_1324.stopLoading();
         this.field_1029.field_1060 = null;
      }

      if (this.field_1029.field_1058 != null) {
         this.field_1029.field_1058.method_1456();
      }

   }

   // $FF: renamed from: h () void
   public void method_213() {
      class_343.method_1195("recordManualImpression must be called on the main UI thread.");
      if (this.field_1029.field_1060 == null) {
         class_467.method_1610("Ad state was null when trying to ping manual tracking URLs.");
      } else {
         class_467.method_1603("Pinging manual tracking URLs.");
         if (this.field_1029.field_1060.field_1328 != null) {
            class_466.method_1586(this.field_1029.field_1054, this.field_1029.field_1056.field_1127, this.field_1029.field_1060.field_1328);
            return;
         }
      }

   }

   // $FF: renamed from: i () com.google.android.gms.internal.x
   public class_607 method_214() {
      class_343.method_1195("getAdSize must be called on the main UI thread.");
      return this.field_1029.field_1059;
   }

   // $FF: renamed from: j () void
   public void method_160() {
      this.method_129();
   }

   // $FF: renamed from: k () void
   public void method_161() {
      this.method_151();
   }

   // $FF: renamed from: l () void
   public void method_162() {
      this.method_140();
   }

   // $FF: renamed from: m () void
   public void method_163() {
      this.method_152();
   }

   // $FF: renamed from: n () void
   public void method_164() {
      if (this.field_1029.field_1060 != null) {
         class_467.method_1610("Mediation adapter " + this.field_1029.field_1060.field_1335 + " refreshed, but mediation adapters should never refresh.");
      }

      this.method_1319(true);
      this.method_1325();
   }

   // $FF: renamed from: o () void
   public void method_151() {
      if (this.field_1029.field_1059.field_2024) {
         this.method_1328();
      }

      this.method_1322();
   }

   // $FF: renamed from: p () void
   public void method_152() {
      if (this.field_1029.field_1059.field_2024) {
         this.method_1319(false);
      }

      this.method_1324();
   }

   // $FF: renamed from: q () void
   public void method_140() {
      this.method_1323();
   }

   // $FF: renamed from: r () void
   public void method_129() {
      this.method_1327();
   }
}
