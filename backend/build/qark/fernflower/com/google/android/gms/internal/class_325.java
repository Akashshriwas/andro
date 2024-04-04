package com.google.android.gms.internal;

import android.content.ComponentName;
import android.os.IBinder;
import java.util.HashSet;

// $FF: renamed from: com.google.android.gms.internal.gl
final class class_325 {
   // $FF: renamed from: a com.google.android.gms.internal.gk
   // $FF: synthetic field
   final class_326 field_922;
   // $FF: renamed from: b java.lang.String
   private final String field_923;
   // $FF: renamed from: c com.google.android.gms.internal.gm
   private final class_324 field_924;
   // $FF: renamed from: d java.util.HashSet
   private final HashSet field_925;
   // $FF: renamed from: e int
   private int field_926;
   // $FF: renamed from: f boolean
   private boolean field_927;
   // $FF: renamed from: g android.os.IBinder
   private IBinder field_928;
   // $FF: renamed from: h android.content.ComponentName
   private ComponentName field_929;

   public class_325(class_326 var1, String var2) {
      this.field_922 = var1;
      this.field_923 = var2;
      this.field_924 = new class_324(this);
      this.field_925 = new HashSet();
      this.field_926 = 0;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.gl, int) int
   // $FF: synthetic method
   static int method_1072(class_325 var0, int var1) {
      var0.field_926 = var1;
      return var1;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.gl, android.content.ComponentName) android.content.ComponentName
   // $FF: synthetic method
   static ComponentName method_1073(class_325 var0, ComponentName var1) {
      var0.field_929 = var1;
      return var1;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.gl, android.os.IBinder) android.os.IBinder
   // $FF: synthetic method
   static IBinder method_1074(class_325 var0, IBinder var1) {
      var0.field_928 = var1;
      return var1;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.gl) java.util.HashSet
   // $FF: synthetic method
   static HashSet method_1075(class_325 var0) {
      return var0.field_925;
   }

   // $FF: renamed from: a () com.google.android.gms.internal.gm
   public class_324 method_1076() {
      return this.field_924;
   }

   // $FF: renamed from: a (com.google.android.gms.internal.ge) void
   public void method_1077(class_318 var1) {
      this.field_925.add(var1);
   }

   // $FF: renamed from: a (boolean) void
   public void method_1078(boolean var1) {
      this.field_927 = var1;
   }

   // $FF: renamed from: b () java.lang.String
   public String method_1079() {
      return this.field_923;
   }

   // $FF: renamed from: b (com.google.android.gms.internal.ge) void
   public void method_1080(class_318 var1) {
      this.field_925.remove(var1);
   }

   // $FF: renamed from: c () boolean
   public boolean method_1081() {
      return this.field_927;
   }

   // $FF: renamed from: c (com.google.android.gms.internal.ge) boolean
   public boolean method_1082(class_318 var1) {
      return this.field_925.contains(var1);
   }

   // $FF: renamed from: d () int
   public int method_1083() {
      return this.field_926;
   }

   // $FF: renamed from: e () boolean
   public boolean method_1084() {
      return this.field_925.isEmpty();
   }

   // $FF: renamed from: f () android.os.IBinder
   public IBinder method_1085() {
      return this.field_928;
   }

   // $FF: renamed from: g () android.content.ComponentName
   public ComponentName method_1086() {
      return this.field_929;
   }
}
