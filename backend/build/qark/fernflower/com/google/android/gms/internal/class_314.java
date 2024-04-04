package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

// $FF: renamed from: com.google.android.gms.internal.gb
public final class class_314 extends class_313 implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.ik
   public static final class_374 field_873 = new class_374();
   // $FF: renamed from: b int
   final int field_874;
   // $FF: renamed from: c java.lang.String
   private final String field_875;
   // $FF: renamed from: d android.os.Bundle
   private final Bundle field_876;
   // $FF: renamed from: e com.google.android.gms.internal.gd
   private final class_319 field_877;
   // $FF: renamed from: f com.google.android.gms.maps.model.LatLng
   private final LatLng field_878;
   // $FF: renamed from: g float
   private final float field_879;
   // $FF: renamed from: h com.google.android.gms.maps.model.LatLngBounds
   private final LatLngBounds field_880;
   // $FF: renamed from: i java.lang.String
   private final String field_881;
   // $FF: renamed from: j android.net.Uri
   private final Uri field_882;
   // $FF: renamed from: k boolean
   private final boolean field_883;
   // $FF: renamed from: l float
   private final float field_884;
   // $FF: renamed from: m int
   private final int field_885;
   // $FF: renamed from: n long
   private final long field_886;
   // $FF: renamed from: o java.util.List
   private final List field_887;
   // $FF: renamed from: p java.util.Map
   private final Map field_888;
   // $FF: renamed from: q java.util.TimeZone
   private final TimeZone field_889;
   // $FF: renamed from: r java.util.Locale
   private Locale field_890;
   // $FF: renamed from: s com.google.android.gms.internal.im
   private class_386 field_891;

   class_314(int var1, String var2, List var3, Bundle var4, class_319 var5, LatLng var6, float var7, LatLngBounds var8, String var9, Uri var10, boolean var11, float var12, int var13, long var14) {
      this.field_874 = var1;
      this.field_875 = var2;
      this.field_887 = Collections.unmodifiableList(var3);
      this.field_876 = var4;
      this.field_877 = var5;
      this.field_878 = var6;
      this.field_879 = var7;
      this.field_880 = var8;
      this.field_881 = var9;
      this.field_882 = var10;
      this.field_883 = var11;
      this.field_884 = var12;
      this.field_885 = var13;
      this.field_886 = var14;
      HashMap var16 = new HashMap();
      Iterator var17 = var4.keySet().iterator();

      while(var17.hasNext()) {
         String var18 = (String)var17.next();
         var16.put(class_494.method_1704(var18), var4.getString(var18));
      }

      this.field_888 = Collections.unmodifiableMap(var16);
      this.field_889 = TimeZone.getTimeZone(this.field_881);
      this.field_890 = null;
      this.field_891 = null;
   }

   // $FF: renamed from: a (java.lang.String) void
   private void method_1036(String var1) {
      if (this.field_891 != null) {
         this.field_891.method_1315(this.field_875, "PlaceImpl", var1);
      }

   }

   // $FF: renamed from: a () java.lang.String
   public String method_1037() {
      this.method_1036("getId");
      return this.field_875;
   }

   // $FF: renamed from: b () java.util.List
   public List method_1038() {
      this.method_1036("getTypes");
      return this.field_887;
   }

   // $FF: renamed from: c () com.google.android.gms.maps.model.LatLng
   public LatLng method_1039() {
      this.method_1036("getLatLng");
      return this.field_878;
   }

   // $FF: renamed from: d () float
   public float method_1040() {
      this.method_1036("getLevelNumber");
      return this.field_879;
   }

   public int describeContents() {
      class_374 var1 = field_873;
      return 0;
   }

   // $FF: renamed from: e () com.google.android.gms.maps.model.LatLngBounds
   public LatLngBounds method_1041() {
      this.method_1036("getViewport");
      return this.field_880;
   }

   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof class_314)) {
            return false;
         }

         class_314 var2 = (class_314)var1;
         if (!this.field_875.equals(var2.field_875) || !class_310.method_1035(this.field_890, var2.field_890) || this.field_886 != var2.field_886) {
            return false;
         }
      }

      return true;
   }

   // $FF: renamed from: f () android.net.Uri
   public Uri method_1042() {
      this.method_1036("getWebsiteUri");
      return this.field_882;
   }

   // $FF: renamed from: g () boolean
   public boolean method_1043() {
      this.method_1036("isPermanentlyClosed");
      return this.field_883;
   }

   // $FF: renamed from: h () float
   public float method_1044() {
      this.method_1036("getRating");
      return this.field_884;
   }

   public int hashCode() {
      return class_310.method_1033(this.field_875, this.field_890, this.field_886);
   }

   // $FF: renamed from: i () int
   public int method_1045() {
      this.method_1036("getPriceLevel");
      return this.field_885;
   }

   // $FF: renamed from: j () long
   public long method_1046() {
      return this.field_886;
   }

   // $FF: renamed from: k () android.os.Bundle
   public Bundle method_1047() {
      return this.field_876;
   }

   // $FF: renamed from: l () com.google.android.gms.internal.gd
   public class_319 method_1048() {
      return this.field_877;
   }

   // $FF: renamed from: m () java.lang.String
   public String method_1049() {
      return this.field_881;
   }

   public String toString() {
      return class_310.method_1034(this).method_1032("id", this.field_875).method_1032("localization", this.field_877).method_1032("locale", this.field_890).method_1032("latlng", this.field_878).method_1032("levelNumber", this.field_879).method_1032("viewport", this.field_880).method_1032("timeZone", this.field_881).method_1032("websiteUri", this.field_882).method_1032("isPermanentlyClosed", this.field_883).method_1032("priceLevel", this.field_885).method_1032("timestampSecs", this.field_886).toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_374 var3 = field_873;
      class_374.method_1289(this, var1, var2);
   }
}
