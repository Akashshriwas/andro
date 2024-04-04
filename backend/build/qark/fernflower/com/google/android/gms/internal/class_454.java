package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

// $FF: renamed from: com.google.android.gms.internal.dy
public final class class_454 {
   // $FF: renamed from: a java.lang.String
   private String field_1225;
   // $FF: renamed from: b java.lang.String
   private String field_1226;
   // $FF: renamed from: c java.lang.String
   private String field_1227;
   // $FF: renamed from: d java.util.List
   private List field_1228;
   // $FF: renamed from: e java.util.List
   private List field_1229;
   // $FF: renamed from: f long
   private long field_1230 = -1L;
   // $FF: renamed from: g boolean
   private boolean field_1231 = false;
   // $FF: renamed from: h long
   private final long field_1232 = -1L;
   // $FF: renamed from: i java.util.List
   private List field_1233;
   // $FF: renamed from: j long
   private long field_1234 = -1L;
   // $FF: renamed from: k int
   private int field_1235 = -1;

   // $FF: renamed from: a (java.util.Map, java.lang.String) long
   private static long method_1523(Map var0, String var1) {
      List var5 = (List)var0.get(var1);
      if (var5 != null && !var5.isEmpty()) {
         String var6 = (String)var5.get(0);

         float var2;
         try {
            var2 = Float.parseFloat(var6);
         } catch (NumberFormatException var4) {
            class_467.method_1610("Could not parse float from " + var1 + " header: " + var6);
            return -1L;
         }

         return (long)(var2 * 1000.0F);
      } else {
         return -1L;
      }
   }

   // $FF: renamed from: b (java.util.Map, java.lang.String) java.util.List
   private static List method_1524(Map var0, String var1) {
      List var2 = (List)var0.get(var1);
      if (var2 != null && !var2.isEmpty()) {
         String var3 = (String)var2.get(0);
         if (var3 != null) {
            return Arrays.asList(var3.trim().split("\\s+"));
         }
      }

      return null;
   }

   // $FF: renamed from: b (java.util.Map) void
   private void method_1525(Map var1) {
      List var2 = (List)var1.get("X-Afma-Ad-Size");
      if (var2 != null && !var2.isEmpty()) {
         this.field_1225 = (String)var2.get(0);
      }

   }

   // $FF: renamed from: c (java.util.Map) void
   private void method_1526(Map var1) {
      List var2 = method_1524(var1, "X-Afma-Click-Tracking-Urls");
      if (var2 != null) {
         this.field_1228 = var2;
      }

   }

   // $FF: renamed from: d (java.util.Map) void
   private void method_1527(Map var1) {
      List var2 = method_1524(var1, "X-Afma-Tracking-Urls");
      if (var2 != null) {
         this.field_1229 = var2;
      }

   }

   // $FF: renamed from: e (java.util.Map) void
   private void method_1528(Map var1) {
      long var2 = method_1523(var1, "X-Afma-Interstitial-Timeout");
      if (var2 != -1L) {
         this.field_1230 = var2;
      }

   }

   // $FF: renamed from: f (java.util.Map) void
   private void method_1529(Map var1) {
      List var2 = (List)var1.get("X-Afma-Mediation");
      if (var2 != null && !var2.isEmpty()) {
         this.field_1231 = Boolean.valueOf((String)var2.get(0));
      }

   }

   // $FF: renamed from: g (java.util.Map) void
   private void method_1530(Map var1) {
      List var2 = method_1524(var1, "X-Afma-Manual-Tracking-Urls");
      if (var2 != null) {
         this.field_1233 = var2;
      }

   }

   // $FF: renamed from: h (java.util.Map) void
   private void method_1531(Map var1) {
      long var2 = method_1523(var1, "X-Afma-Refresh-Rate");
      if (var2 != -1L) {
         this.field_1234 = var2;
      }

   }

   // $FF: renamed from: i (java.util.Map) void
   private void method_1532(Map var1) {
      List var2 = (List)var1.get("X-Afma-Orientation");
      if (var2 != null && !var2.isEmpty()) {
         String var3 = (String)var2.get(0);
         if ("portrait".equalsIgnoreCase(var3)) {
            this.field_1235 = class_466.method_1599();
         } else if ("landscape".equalsIgnoreCase(var3)) {
            this.field_1235 = class_466.method_1595();
            return;
         }
      }

   }

   // $FF: renamed from: a () com.google.android.gms.internal.cb
   public class_434 method_1533() {
      return new class_434(this.field_1226, this.field_1227, this.field_1228, this.field_1229, this.field_1230, this.field_1231, -1L, this.field_1233, this.field_1234, this.field_1235, this.field_1225);
   }

   // $FF: renamed from: a (java.lang.String, java.util.Map, java.lang.String) void
   public void method_1534(String var1, Map var2, String var3) {
      this.field_1226 = var1;
      this.field_1227 = var3;
      this.method_1535(var2);
   }

   // $FF: renamed from: a (java.util.Map) void
   public void method_1535(Map var1) {
      this.method_1525(var1);
      this.method_1526(var1);
      this.method_1527(var1);
      this.method_1528(var1);
      this.method_1529(var1);
      this.method_1530(var1);
      this.method_1531(var1);
      this.method_1532(var1);
   }
}
