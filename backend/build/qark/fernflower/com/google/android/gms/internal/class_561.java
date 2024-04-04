package com.google.android.gms.internal;

import android.app.Activity;
import android.os.RemoteException;
import com.google.a.a.class_29;
import com.google.a.a.class_403;
import com.google.a.a.class_5;
import com.google.a.a.class_6;
import com.google.a.a.class_7;
import com.google.a.a.a.class_404;
import com.google.android.gms.a.class_376;
import com.google.android.gms.a.class_43;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

// $FF: renamed from: com.google.android.gms.internal.bv
public final class class_561 extends class_560 {
   // $FF: renamed from: a com.google.a.a.b
   private final class_5 field_1906;
   // $FF: renamed from: b com.google.a.a.j
   private final class_29 field_1907;

   public class_561(class_5 var1, class_29 var2) {
      this.field_1906 = var1;
      this.field_1907 = var2;
   }

   // $FF: renamed from: a (java.lang.String, int, java.lang.String) com.google.a.a.g
   private class_403 method_1853(String var1, int var2, String var3) {
      Throwable var10000;
      label60: {
         HashMap var13;
         boolean var10001;
         if (var1 != null) {
            JSONObject var4;
            Iterator var5;
            try {
               var4 = new JSONObject(var1);
               var13 = new HashMap(var4.length());
               var5 = var4.keys();
            } catch (Throwable var11) {
               var10000 = var11;
               var10001 = false;
               break label60;
            }

            while(true) {
               try {
                  if (!var5.hasNext()) {
                     break;
                  }

                  String var6 = (String)var5.next();
                  var13.put(var6, var4.getString(var6));
               } catch (Throwable var12) {
                  var10000 = var12;
                  var10001 = false;
                  break label60;
               }
            }
         } else {
            try {
               var13 = new HashMap(0);
            } catch (Throwable var10) {
               var10000 = var10;
               var10001 = false;
               break label60;
            }
         }

         Class var17;
         try {
            var17 = this.field_1906.method_8();
         } catch (Throwable var9) {
            var10000 = var9;
            var10001 = false;
            break label60;
         }

         class_403 var16 = null;
         if (var17 != null) {
            try {
               var16 = (class_403)var17.newInstance();
               var16.method_1395(var13);
            } catch (Throwable var8) {
               var10000 = var8;
               var10001 = false;
               break label60;
            }
         }

         try {
            if (var16 instanceof class_404) {
               class_404 var15 = (class_404)var16;
               var15.field_1069 = var3;
               var15.field_1070 = var2;
               return var16;
            }

            return var16;
         } catch (Throwable var7) {
            var10000 = var7;
            var10001 = false;
         }
      }

      Throwable var14 = var10000;
      class_467.method_1607("Could not get MediationServerParameters.", var14);
      throw new RemoteException();
   }

   // $FF: renamed from: a () com.google.android.gms.a.a
   public class_43 method_171() {
      if (!(this.field_1906 instanceof class_7)) {
         class_467.method_1610("MediationAdapter is not a MediationBannerAdapter: " + this.field_1906.getClass().getCanonicalName());
         throw new RemoteException();
      } else {
         try {
            class_43 var1 = class_376.method_1293(((class_7)this.field_1906).method_12());
            return var1;
         } catch (Throwable var2) {
            class_467.method_1607("Could not get banner view from adapter.", var2);
            throw new RemoteException();
         }
      }
   }

   // $FF: renamed from: a (com.google.android.gms.a.a, com.google.android.gms.internal.v, java.lang.String, com.google.android.gms.internal.bs) void
   public void method_172(class_43 var1, class_597 var2, String var3, class_64 var4) {
      this.method_173(var1, var2, var3, (String)null, var4);
   }

   // $FF: renamed from: a (com.google.android.gms.a.a, com.google.android.gms.internal.v, java.lang.String, java.lang.String, com.google.android.gms.internal.bs) void
   public void method_173(class_43 var1, class_597 var2, String var3, String var4, class_64 var5) {
      if (!(this.field_1906 instanceof class_6)) {
         class_467.method_1610("MediationAdapter is not a MediationInterstitialAdapter: " + this.field_1906.getClass().getCanonicalName());
         throw new RemoteException();
      } else {
         class_467.method_1603("Requesting interstitial ad from adapter.");

         try {
            ((class_6)this.field_1906).method_9(new class_567(var5), (Activity)class_376.method_1294(var1), this.method_1853(var3, var2.field_1986, var4), class_566.method_1855(var2), this.field_1907);
         } catch (Throwable var6) {
            class_467.method_1607("Could not request interstitial ad from adapter.", var6);
            throw new RemoteException();
         }
      }
   }

   // $FF: renamed from: a (com.google.android.gms.a.a, com.google.android.gms.internal.x, com.google.android.gms.internal.v, java.lang.String, com.google.android.gms.internal.bs) void
   public void method_174(class_43 var1, class_607 var2, class_597 var3, String var4, class_64 var5) {
      this.method_175(var1, var2, var3, var4, (String)null, var5);
   }

   // $FF: renamed from: a (com.google.android.gms.a.a, com.google.android.gms.internal.x, com.google.android.gms.internal.v, java.lang.String, java.lang.String, com.google.android.gms.internal.bs) void
   public void method_175(class_43 var1, class_607 var2, class_597 var3, String var4, String var5, class_64 var6) {
      if (!(this.field_1906 instanceof class_7)) {
         class_467.method_1610("MediationAdapter is not a MediationBannerAdapter: " + this.field_1906.getClass().getCanonicalName());
         throw new RemoteException();
      } else {
         class_467.method_1603("Requesting banner ad from adapter.");

         try {
            ((class_7)this.field_1906).method_11(new class_567(var6), (Activity)class_376.method_1294(var1), this.method_1853(var4, var3.field_1986, var5), class_566.method_1857(var2), class_566.method_1855(var3), this.field_1907);
         } catch (Throwable var7) {
            class_467.method_1607("Could not request banner ad from adapter.", var7);
            throw new RemoteException();
         }
      }
   }

   // $FF: renamed from: b () void
   public void method_176() {
      if (!(this.field_1906 instanceof class_6)) {
         class_467.method_1610("MediationAdapter is not a MediationInterstitialAdapter: " + this.field_1906.getClass().getCanonicalName());
         throw new RemoteException();
      } else {
         class_467.method_1603("Showing interstitial from adapter.");

         try {
            ((class_6)this.field_1906).method_10();
         } catch (Throwable var2) {
            class_467.method_1607("Could not show interstitial from adapter.", var2);
            throw new RemoteException();
         }
      }
   }

   // $FF: renamed from: c () void
   public void method_177() {
      try {
         this.field_1906.method_6();
      } catch (Throwable var2) {
         class_467.method_1607("Could not destroy adapter.", var2);
         throw new RemoteException();
      }
   }
}
