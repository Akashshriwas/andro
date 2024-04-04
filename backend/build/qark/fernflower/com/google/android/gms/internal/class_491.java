package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// $FF: renamed from: com.google.android.gms.internal.fs
public final class class_491 implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.ie
   public static final class_371 field_1395 = new class_371();
   // $FF: renamed from: b int
   final int field_1396;
   // $FF: renamed from: c java.util.List
   final List field_1397;
   // $FF: renamed from: d int
   private final int field_1398;
   // $FF: renamed from: e java.lang.String
   private final String field_1399;
   // $FF: renamed from: f java.lang.String
   private final String field_1400;
   // $FF: renamed from: g boolean
   private final boolean field_1401;
   // $FF: renamed from: h java.util.Set
   private final Set field_1402;

   class_491(int var1, int var2, List var3, String var4, String var5, boolean var6) {
      this.field_1396 = var1;
      this.field_1398 = var2;
      if (var3 == null) {
         var3 = Collections.emptyList();
      } else {
         var3 = Collections.unmodifiableList(var3);
      }

      this.field_1397 = var3;
      String var7 = var4;
      if (var4 == null) {
         var7 = "";
      }

      this.field_1399 = var7;
      var7 = var5;
      if (var5 == null) {
         var7 = "";
      }

      this.field_1400 = var7;
      this.field_1401 = var6;
      if (this.field_1397.isEmpty()) {
         this.field_1402 = Collections.emptySet();
      } else {
         this.field_1402 = Collections.unmodifiableSet(new HashSet(this.field_1397));
      }
   }

   // $FF: renamed from: a () int
   public int method_1699() {
      return this.field_1398;
   }

   // $FF: renamed from: b () java.lang.String
   public String method_1700() {
      return this.field_1399;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1701() {
      return this.field_1400;
   }

   // $FF: renamed from: d () boolean
   public boolean method_1702() {
      return this.field_1401;
   }

   public int describeContents() {
      class_371 var1 = field_1395;
      return 0;
   }

   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof class_491)) {
            return false;
         }

         class_491 var2 = (class_491)var1;
         if (this.field_1398 != var2.field_1398 || !this.field_1402.equals(var2.field_1402) || this.field_1399 != var2.field_1399 || this.field_1400 != var2.field_1400 || this.field_1401 != var2.field_1401) {
            return false;
         }
      }

      return true;
   }

   public int hashCode() {
      return class_310.method_1033(this.field_1398, this.field_1402, this.field_1399, this.field_1400, this.field_1401);
   }

   public String toString() {
      return class_310.method_1034(this).method_1032("maxResults", this.field_1398).method_1032("types", this.field_1402).method_1032("nameQuery", this.field_1399).method_1032("textQuery", this.field_1400).method_1032("isOpenNowRequired", this.field_1401).toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_371 var3 = field_1395;
      class_371.method_1283(this, var1, var2);
   }
}
