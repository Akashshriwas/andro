package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.ads.c.class_28;
import com.google.android.gms.ads.d.class_225;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

// $FF: renamed from: com.google.android.gms.internal.n
public final class class_583 {
   // $FF: renamed from: a java.lang.String
   public static final String field_1944 = class_468.method_1614("emulator");
   // $FF: renamed from: b java.util.Date
   private final Date field_1945;
   // $FF: renamed from: c int
   private final int field_1946;
   // $FF: renamed from: d java.util.Set
   private final Set field_1947;
   // $FF: renamed from: e android.location.Location
   private final Location field_1948;
   // $FF: renamed from: f boolean
   private final boolean field_1949;
   // $FF: renamed from: g java.util.Map
   private final Map field_1950;
   // $FF: renamed from: h java.lang.String
   private final String field_1951;
   // $FF: renamed from: i com.google.android.gms.ads.d.a
   private final class_225 field_1952;
   // $FF: renamed from: j int
   private final int field_1953;
   // $FF: renamed from: k java.util.Set
   private final Set field_1954;

   public class_583(class_587 var1) {
      this(var1, (class_225)null);
   }

   public class_583(class_587 var1, class_225 var2) {
      this.field_1945 = class_587.method_1906(var1);
      this.field_1946 = class_587.method_1907(var1);
      this.field_1947 = Collections.unmodifiableSet(class_587.method_1908(var1));
      this.field_1948 = class_587.method_1909(var1);
      this.field_1949 = class_587.method_1910(var1);
      this.field_1950 = Collections.unmodifiableMap(class_587.method_1911(var1));
      this.field_1951 = class_587.method_1912(var1);
      this.field_1952 = var2;
      this.field_1953 = class_587.method_1913(var1);
      this.field_1954 = Collections.unmodifiableSet(class_587.method_1914(var1));
   }

   // $FF: renamed from: a (java.lang.Class) com.google.android.gms.ads.c.a
   public class_28 method_1892(Class var1) {
      return (class_28)this.field_1950.get(var1);
   }

   // $FF: renamed from: a () java.util.Date
   public Date method_1893() {
      return this.field_1945;
   }

   // $FF: renamed from: a (android.content.Context) boolean
   public boolean method_1894(Context var1) {
      return this.field_1954.contains(class_468.method_1613(var1));
   }

   // $FF: renamed from: b () int
   public int method_1895() {
      return this.field_1946;
   }

   // $FF: renamed from: c () java.util.Set
   public Set method_1896() {
      return this.field_1947;
   }

   // $FF: renamed from: d () android.location.Location
   public Location method_1897() {
      return this.field_1948;
   }

   // $FF: renamed from: e () boolean
   public boolean method_1898() {
      return this.field_1949;
   }

   // $FF: renamed from: f () java.lang.String
   public String method_1899() {
      return this.field_1951;
   }

   // $FF: renamed from: g () com.google.android.gms.ads.d.a
   public class_225 method_1900() {
      return this.field_1952;
   }

   // $FF: renamed from: h () java.util.Map
   public Map method_1901() {
      return this.field_1950;
   }

   // $FF: renamed from: i () int
   public int method_1902() {
      return this.field_1953;
   }
}
