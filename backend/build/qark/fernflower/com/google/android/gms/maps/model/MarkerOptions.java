package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.class_375;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.class_294;

public final class MarkerOptions implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.maps.model.g
   public static final class_244 field_2232 = new class_244();
   // $FF: renamed from: b int
   private final int field_2233;
   // $FF: renamed from: c com.google.android.gms.maps.model.LatLng
   private LatLng field_2234;
   // $FF: renamed from: d java.lang.String
   private String field_2235;
   // $FF: renamed from: e java.lang.String
   private String field_2236;
   // $FF: renamed from: f com.google.android.gms.maps.model.a
   private class_231 field_2237;
   // $FF: renamed from: g float
   private float field_2238 = 0.5F;
   // $FF: renamed from: h float
   private float field_2239 = 1.0F;
   // $FF: renamed from: i boolean
   private boolean field_2240;
   // $FF: renamed from: j boolean
   private boolean field_2241 = true;
   // $FF: renamed from: k boolean
   private boolean field_2242 = false;
   // $FF: renamed from: l float
   private float field_2243 = 0.0F;
   // $FF: renamed from: m float
   private float field_2244 = 0.5F;
   // $FF: renamed from: n float
   private float field_2245 = 0.0F;
   // $FF: renamed from: o float
   private float field_2246 = 1.0F;

   public MarkerOptions() {
      this.field_2233 = 1;
   }

   MarkerOptions(int var1, LatLng var2, String var3, String var4, IBinder var5, float var6, float var7, boolean var8, boolean var9, boolean var10, float var11, float var12, float var13, float var14) {
      this.field_2233 = var1;
      this.field_2234 = var2;
      this.field_2235 = var3;
      this.field_2236 = var4;
      class_231 var15;
      if (var5 == null) {
         var15 = null;
      } else {
         var15 = new class_231(class_375.method_1292(var5));
      }

      this.field_2237 = var15;
      this.field_2238 = var6;
      this.field_2239 = var7;
      this.field_2240 = var8;
      this.field_2241 = var9;
      this.field_2242 = var10;
      this.field_2243 = var11;
      this.field_2244 = var12;
      this.field_2245 = var13;
      this.field_2246 = var14;
   }

   // $FF: renamed from: a () int
   int method_2156() {
      return this.field_2233;
   }

   // $FF: renamed from: b () android.os.IBinder
   IBinder method_2157() {
      return this.field_2237 == null ? null : this.field_2237.method_866().asBinder();
   }

   // $FF: renamed from: c () com.google.android.gms.maps.model.LatLng
   public LatLng method_2158() {
      return this.field_2234;
   }

   // $FF: renamed from: d () java.lang.String
   public String method_2159() {
      return this.field_2235;
   }

   public int describeContents() {
      return 0;
   }

   // $FF: renamed from: e () java.lang.String
   public String method_2160() {
      return this.field_2236;
   }

   // $FF: renamed from: f () float
   public float method_2161() {
      return this.field_2238;
   }

   // $FF: renamed from: g () float
   public float method_2162() {
      return this.field_2239;
   }

   // $FF: renamed from: h () boolean
   public boolean method_2163() {
      return this.field_2240;
   }

   // $FF: renamed from: i () boolean
   public boolean method_2164() {
      return this.field_2241;
   }

   // $FF: renamed from: j () boolean
   public boolean method_2165() {
      return this.field_2242;
   }

   // $FF: renamed from: k () float
   public float method_2166() {
      return this.field_2243;
   }

   // $FF: renamed from: l () float
   public float method_2167() {
      return this.field_2244;
   }

   // $FF: renamed from: m () float
   public float method_2168() {
      return this.field_2245;
   }

   // $FF: renamed from: n () float
   public float method_2169() {
      return this.field_2246;
   }

   public void writeToParcel(Parcel var1, int var2) {
      if (class_294.method_1007()) {
         class_195.method_810(this, var1, var2);
      } else {
         class_244.method_897(this, var1, var2);
      }
   }
}
