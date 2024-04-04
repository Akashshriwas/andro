package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashMap;

public class ee$a implements SafeParcelable {
   // $FF: renamed from: i com.google.android.gms.internal.hj
   public static final class_348 field_2158 = new class_348();
   // $FF: renamed from: a int
   protected final int field_2159;
   // $FF: renamed from: b boolean
   protected final boolean field_2160;
   // $FF: renamed from: c int
   protected final int field_2161;
   // $FF: renamed from: d boolean
   protected final boolean field_2162;
   // $FF: renamed from: e java.lang.String
   protected final String field_2163;
   // $FF: renamed from: f int
   protected final int field_2164;
   // $FF: renamed from: g java.lang.Class
   protected final Class field_2165;
   // $FF: renamed from: h java.lang.String
   protected final String field_2166;
   // $FF: renamed from: j int
   private final int field_2167;
   // $FF: renamed from: k com.google.android.gms.internal.eh
   private class_480 field_2168;
   // $FF: renamed from: l com.google.android.gms.internal.hi
   private class_42 field_2169;

   ee$a(int var1, int var2, boolean var3, int var4, boolean var5, String var6, int var7, String var8, class_453 var9) {
      this.field_2167 = var1;
      this.field_2159 = var2;
      this.field_2160 = var3;
      this.field_2161 = var4;
      this.field_2162 = var5;
      this.field_2163 = var6;
      this.field_2164 = var7;
      if (var8 == null) {
         this.field_2165 = null;
         this.field_2166 = null;
      } else {
         this.field_2165 = ek.class;
         this.field_2166 = var8;
      }

      if (var9 == null) {
         this.field_2169 = null;
      } else {
         this.field_2169 = var9.method_1522();
      }
   }

   protected ee$a(int var1, boolean var2, int var3, boolean var4, String var5, int var6, Class var7, class_42 var8) {
      this.field_2167 = 1;
      this.field_2159 = var1;
      this.field_2160 = var2;
      this.field_2161 = var3;
      this.field_2162 = var4;
      this.field_2163 = var5;
      this.field_2164 = var6;
      this.field_2165 = var7;
      if (var7 == null) {
         this.field_2166 = null;
      } else {
         this.field_2166 = var7.getCanonicalName();
      }

      this.field_2169 = var8;
   }

   // $FF: renamed from: a (java.lang.String, int) com.google.android.gms.internal.ee$a
   public static ee$a method_2083(String var0, int var1) {
      return new ee$a(0, false, 0, false, var0, var1, (Class)null, (class_42)null);
   }

   // $FF: renamed from: a (java.lang.String, int, com.google.android.gms.internal.hi, boolean) com.google.android.gms.internal.ee$a
   public static ee$a method_2084(String var0, int var1, class_42 var2, boolean var3) {
      return new ee$a(var2.method_127(), var3, var2.method_128(), false, var0, var1, (Class)null, var2);
   }

   // $FF: renamed from: a (java.lang.String, int, java.lang.Class) com.google.android.gms.internal.ee$a
   public static ee$a method_2085(String var0, int var1, Class var2) {
      return new ee$a(11, false, 11, false, var0, var1, var2, (class_42)null);
   }

   // $FF: renamed from: a (com.google.android.gms.internal.ee$a) com.google.android.gms.internal.hi
   // $FF: synthetic method
   static class_42 method_2086(ee$a var0) {
      return var0.field_2169;
   }

   // $FF: renamed from: b (java.lang.String, int) com.google.android.gms.internal.ee$a
   public static ee$a method_2087(String var0, int var1) {
      return new ee$a(4, false, 4, false, var0, var1, (Class)null, (class_42)null);
   }

   // $FF: renamed from: b (java.lang.String, int, java.lang.Class) com.google.android.gms.internal.ee$a
   public static ee$a method_2088(String var0, int var1, Class var2) {
      return new ee$a(11, true, 11, true, var0, var1, var2, (class_42)null);
   }

   // $FF: renamed from: c (java.lang.String, int) com.google.android.gms.internal.ee$a
   public static ee$a method_2089(String var0, int var1) {
      return new ee$a(6, false, 6, false, var0, var1, (Class)null, (class_42)null);
   }

   // $FF: renamed from: d (java.lang.String, int) com.google.android.gms.internal.ee$a
   public static ee$a method_2090(String var0, int var1) {
      return new ee$a(7, false, 7, false, var0, var1, (Class)null, (class_42)null);
   }

   // $FF: renamed from: e (java.lang.String, int) com.google.android.gms.internal.ee$a
   public static ee$a method_2091(String var0, int var1) {
      return new ee$a(7, true, 7, true, var0, var1, (Class)null, (class_42)null);
   }

   // $FF: renamed from: a () int
   public int method_2092() {
      return this.field_2167;
   }

   // $FF: renamed from: a (java.lang.Object) java.lang.Object
   public Object method_2093(Object var1) {
      return this.field_2169.method_126(var1);
   }

   // $FF: renamed from: a (com.google.android.gms.internal.eh) void
   public void method_2094(class_480 var1) {
      this.field_2168 = var1;
   }

   // $FF: renamed from: b () int
   public int method_2095() {
      return this.field_2159;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2096() {
      return this.field_2160;
   }

   // $FF: renamed from: d () int
   public int method_2097() {
      return this.field_2161;
   }

   public int describeContents() {
      class_348 var1 = field_2158;
      return 0;
   }

   // $FF: renamed from: e () boolean
   public boolean method_2098() {
      return this.field_2162;
   }

   // $FF: renamed from: f () java.lang.String
   public String method_2099() {
      return this.field_2163;
   }

   // $FF: renamed from: g () int
   public int method_2100() {
      return this.field_2164;
   }

   // $FF: renamed from: h () java.lang.Class
   public Class method_2101() {
      return this.field_2165;
   }

   // $FF: renamed from: i () java.lang.String
   String method_2102() {
      return this.field_2166 == null ? null : this.field_2166;
   }

   // $FF: renamed from: j () boolean
   public boolean method_2103() {
      return this.field_2169 != null;
   }

   // $FF: renamed from: k () com.google.android.gms.internal.dz
   class_453 method_2104() {
      return this.field_2169 == null ? null : class_453.method_1519(this.field_2169);
   }

   // $FF: renamed from: l () java.util.HashMap
   public HashMap method_2105() {
      class_343.method_1189(this.field_2166);
      class_343.method_1189(this.field_2168);
      return this.field_2168.method_1672(this.field_2166);
   }

   public String toString() {
      StringBuilder var2 = new StringBuilder();
      var2.append("Field\n");
      var2.append("            versionCode=").append(this.field_2167).append('\n');
      var2.append("                 typeIn=").append(this.field_2159).append('\n');
      var2.append("            typeInArray=").append(this.field_2160).append('\n');
      var2.append("                typeOut=").append(this.field_2161).append('\n');
      var2.append("           typeOutArray=").append(this.field_2162).append('\n');
      var2.append("        outputFieldName=").append(this.field_2163).append('\n');
      var2.append("      safeParcelFieldId=").append(this.field_2164).append('\n');
      var2.append("       concreteTypeName=").append(this.method_2102()).append('\n');
      if (this.method_2101() != null) {
         var2.append("     concreteType.class=").append(this.method_2101().getCanonicalName()).append('\n');
      }

      StringBuilder var3 = var2.append("          converterName=");
      String var1;
      if (this.field_2169 == null) {
         var1 = "null";
      } else {
         var1 = this.field_2169.getClass().getCanonicalName();
      }

      var3.append(var1).append('\n');
      return var2.toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_348 var3 = field_2158;
      class_348.method_1212(this, var1, var2);
   }
}
