package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// $FF: renamed from: com.google.android.gms.internal.gd
public final class class_319 implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.il
   public static final class_373 field_900 = new class_373();
   // $FF: renamed from: b int
   public final int field_901;
   // $FF: renamed from: c java.lang.String
   public final String field_902;
   // $FF: renamed from: d java.lang.String
   public final String field_903;
   // $FF: renamed from: e java.lang.String
   public final String field_904;
   // $FF: renamed from: f java.lang.String
   public final String field_905;
   // $FF: renamed from: g java.util.List
   public final List field_906;

   public class_319(int var1, String var2, String var3, String var4, String var5, List var6) {
      this.field_901 = var1;
      this.field_902 = var2;
      this.field_903 = var3;
      this.field_904 = var4;
      this.field_905 = var5;
      this.field_906 = var6;
   }

   public int describeContents() {
      class_373 var1 = field_900;
      return 0;
   }

   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof class_319)) {
            return false;
         }

         class_319 var2 = (class_319)var1;
         if (!class_310.method_1035(this.field_902, var2.field_902) || !class_310.method_1035(this.field_903, var2.field_903) || !class_310.method_1035(this.field_904, var2.field_904) || !class_310.method_1035(this.field_905, var2.field_905) || !class_310.method_1035(this.field_906, var2.field_906)) {
            return false;
         }
      }

      return true;
   }

   public int hashCode() {
      return class_310.method_1033(this.field_902, this.field_903, this.field_904, this.field_905);
   }

   public String toString() {
      return class_310.method_1034(this).method_1032("name", this.field_902).method_1032("address", this.field_903).method_1032("internationalPhoneNumber", this.field_904).method_1032("regularOpenHours", this.field_905).method_1032("attributions", this.field_906).toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_373 var3 = field_900;
      class_373.method_1286(this, var1, var2);
   }
}
