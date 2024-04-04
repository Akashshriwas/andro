package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.class_375;
import com.google.android.gms.a.class_376;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// $FF: renamed from: com.google.android.gms.internal.bm
public final class class_556 implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.cg
   public static final class_441 field_1881 = new class_441();
   // $FF: renamed from: b int
   public final int field_1882;
   // $FF: renamed from: c com.google.android.gms.internal.bj
   public final class_559 field_1883;
   // $FF: renamed from: d com.google.android.gms.internal.jt
   public final class_44 field_1884;
   // $FF: renamed from: e com.google.android.gms.internal.ch
   public final class_52 field_1885;
   // $FF: renamed from: f com.google.android.gms.internal.ev
   public final class_473 field_1886;
   // $FF: renamed from: g com.google.android.gms.internal.s
   public final class_71 field_1887;
   // $FF: renamed from: h java.lang.String
   public final String field_1888;
   // $FF: renamed from: i boolean
   public final boolean field_1889;
   // $FF: renamed from: j java.lang.String
   public final String field_1890;
   // $FF: renamed from: k com.google.android.gms.internal.cm
   public final class_48 field_1891;
   // $FF: renamed from: l int
   public final int field_1892;
   // $FF: renamed from: m int
   public final int field_1893;
   // $FF: renamed from: n java.lang.String
   public final String field_1894;
   // $FF: renamed from: o com.google.android.gms.internal.ct
   public final class_424 field_1895;

   class_556(int var1, class_559 var2, IBinder var3, IBinder var4, IBinder var5, IBinder var6, String var7, boolean var8, String var9, IBinder var10, int var11, int var12, String var13, class_424 var14) {
      this.field_1882 = var1;
      this.field_1883 = var2;
      this.field_1884 = (class_44)class_376.method_1294(class_375.method_1292(var3));
      this.field_1885 = (class_52)class_376.method_1294(class_375.method_1292(var4));
      this.field_1886 = (class_473)class_376.method_1294(class_375.method_1292(var5));
      this.field_1887 = (class_71)class_376.method_1294(class_375.method_1292(var6));
      this.field_1888 = var7;
      this.field_1889 = var8;
      this.field_1890 = var9;
      this.field_1891 = (class_48)class_376.method_1294(class_375.method_1292(var10));
      this.field_1892 = var11;
      this.field_1893 = var12;
      this.field_1894 = var13;
      this.field_1895 = var14;
   }

   public class_556(class_559 var1, class_44 var2, class_52 var3, class_48 var4, class_424 var5) {
      this.field_1882 = 1;
      this.field_1883 = var1;
      this.field_1884 = var2;
      this.field_1885 = var3;
      this.field_1886 = null;
      this.field_1887 = null;
      this.field_1888 = null;
      this.field_1889 = false;
      this.field_1890 = null;
      this.field_1891 = var4;
      this.field_1892 = -1;
      this.field_1893 = 4;
      this.field_1894 = null;
      this.field_1895 = var5;
   }

   public class_556(class_44 var1, class_52 var2, class_48 var3, class_473 var4, int var5, class_424 var6) {
      this.field_1882 = 1;
      this.field_1883 = null;
      this.field_1884 = var1;
      this.field_1885 = var2;
      this.field_1886 = var4;
      this.field_1887 = null;
      this.field_1888 = null;
      this.field_1889 = false;
      this.field_1890 = null;
      this.field_1891 = var3;
      this.field_1892 = var5;
      this.field_1893 = 1;
      this.field_1894 = null;
      this.field_1895 = var6;
   }

   public class_556(class_44 var1, class_52 var2, class_48 var3, class_473 var4, boolean var5, int var6, class_424 var7) {
      this.field_1882 = 1;
      this.field_1883 = null;
      this.field_1884 = var1;
      this.field_1885 = var2;
      this.field_1886 = var4;
      this.field_1887 = null;
      this.field_1888 = null;
      this.field_1889 = var5;
      this.field_1890 = null;
      this.field_1891 = var3;
      this.field_1892 = var6;
      this.field_1893 = 2;
      this.field_1894 = null;
      this.field_1895 = var7;
   }

   public class_556(class_44 var1, class_52 var2, class_71 var3, class_48 var4, class_473 var5, boolean var6, int var7, String var8, class_424 var9) {
      this.field_1882 = 1;
      this.field_1883 = null;
      this.field_1884 = var1;
      this.field_1885 = var2;
      this.field_1886 = var5;
      this.field_1887 = var3;
      this.field_1888 = null;
      this.field_1889 = var6;
      this.field_1890 = null;
      this.field_1891 = var4;
      this.field_1892 = var7;
      this.field_1893 = 3;
      this.field_1894 = var8;
      this.field_1895 = var9;
   }

   public class_556(class_44 var1, class_52 var2, class_71 var3, class_48 var4, class_473 var5, boolean var6, int var7, String var8, String var9, class_424 var10) {
      this.field_1882 = 1;
      this.field_1883 = null;
      this.field_1884 = var1;
      this.field_1885 = var2;
      this.field_1886 = var5;
      this.field_1887 = var3;
      this.field_1888 = var9;
      this.field_1889 = var6;
      this.field_1890 = var8;
      this.field_1891 = var4;
      this.field_1892 = var7;
      this.field_1893 = 3;
      this.field_1894 = null;
      this.field_1895 = var10;
   }

   // $FF: renamed from: a (android.content.Intent) com.google.android.gms.internal.bm
   public static class_556 method_1842(Intent var0) {
      try {
         Bundle var2 = var0.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
         var2.setClassLoader(bm.class.getClassLoader());
         class_556 var3 = (class_556)var2.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
         return var3;
      } catch (Exception var1) {
         return null;
      }
   }

   // $FF: renamed from: a (android.content.Intent, com.google.android.gms.internal.bm) void
   public static void method_1843(Intent var0, class_556 var1) {
      Bundle var2 = new Bundle(1);
      var2.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", var1);
      var0.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", var2);
   }

   // $FF: renamed from: a () android.os.IBinder
   IBinder method_1844() {
      return class_376.method_1293(this.field_1884).asBinder();
   }

   // $FF: renamed from: b () android.os.IBinder
   IBinder method_1845() {
      return class_376.method_1293(this.field_1885).asBinder();
   }

   // $FF: renamed from: c () android.os.IBinder
   IBinder method_1846() {
      return class_376.method_1293(this.field_1886).asBinder();
   }

   // $FF: renamed from: d () android.os.IBinder
   IBinder method_1847() {
      return class_376.method_1293(this.field_1887).asBinder();
   }

   public int describeContents() {
      return 0;
   }

   // $FF: renamed from: e () android.os.IBinder
   IBinder method_1848() {
      return class_376.method_1293(this.field_1891).asBinder();
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_441.method_1491(this, var1, var2);
   }
}
