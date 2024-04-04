package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// $FF: renamed from: com.google.android.gms.internal.gs
public class class_306 implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.ip
   public static final class_382 field_849 = new class_382();
   // $FF: renamed from: b int
   private final int field_850;
   // $FF: renamed from: c java.lang.String
   private final String field_851;
   // $FF: renamed from: d java.lang.String[]
   private final String[] field_852;
   // $FF: renamed from: e java.lang.String[]
   private final String[] field_853;
   // $FF: renamed from: f java.lang.String[]
   private final String[] field_854;
   // $FF: renamed from: g java.lang.String
   private final String field_855;
   // $FF: renamed from: h java.lang.String
   private final String field_856;
   // $FF: renamed from: i java.lang.String
   private final String field_857;
   // $FF: renamed from: j java.lang.String
   private final String field_858;

   class_306(int var1, String var2, String[] var3, String[] var4, String[] var5, String var6, String var7, String var8, String var9) {
      this.field_850 = var1;
      this.field_851 = var2;
      this.field_852 = var3;
      this.field_853 = var4;
      this.field_854 = var5;
      this.field_855 = var6;
      this.field_856 = var7;
      this.field_857 = var8;
      this.field_858 = var9;
   }

   // $FF: renamed from: a () int
   public int method_1023() {
      return this.field_850;
   }

   // $FF: renamed from: b () java.lang.String
   public String method_1024() {
      return this.field_851;
   }

   // $FF: renamed from: c () java.lang.String[]
   public String[] method_1025() {
      return this.field_852;
   }

   // $FF: renamed from: d () java.lang.String[]
   public String[] method_1026() {
      return this.field_853;
   }

   public int describeContents() {
      return 0;
   }

   // $FF: renamed from: e () java.lang.String[]
   public String[] method_1027() {
      return this.field_854;
   }

   public boolean equals(Object var1) {
      if (var1 instanceof class_306) {
         class_306 var2 = (class_306)var1;
         if (this.field_850 == var2.field_850 && class_310.method_1035(this.field_851, var2.field_851) && class_310.method_1035(this.field_852, var2.field_852) && class_310.method_1035(this.field_853, var2.field_853) && class_310.method_1035(this.field_854, var2.field_854) && class_310.method_1035(this.field_855, var2.field_855) && class_310.method_1035(this.field_856, var2.field_856) && class_310.method_1035(this.field_857, var2.field_857) && class_310.method_1035(this.field_858, var2.field_858)) {
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: f () java.lang.String
   public String method_1028() {
      return this.field_855;
   }

   // $FF: renamed from: g () java.lang.String
   public String method_1029() {
      return this.field_856;
   }

   // $FF: renamed from: h () java.lang.String
   public String method_1030() {
      return this.field_857;
   }

   public int hashCode() {
      return class_310.method_1033(this.field_850, this.field_851, this.field_852, this.field_853, this.field_854, this.field_855, this.field_856, this.field_857, this.field_858);
   }

   // $FF: renamed from: i () java.lang.String
   public String method_1031() {
      return this.field_858;
   }

   public String toString() {
      return class_310.method_1034(this).method_1032("versionCode", this.field_850).method_1032("accountName", this.field_851).method_1032("requestedScopes", this.field_852).method_1032("visibleActivities", this.field_853).method_1032("requiredFeatures", this.field_854).method_1032("packageNameForAuth", this.field_855).method_1032("callingPackageName", this.field_856).method_1032("applicationName", this.field_857).toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_382.method_1309(this, var1, var2);
   }
}
