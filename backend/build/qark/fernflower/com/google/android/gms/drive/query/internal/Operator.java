package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Operator implements SafeParcelable {
   public static final Creator CREATOR = new class_646();
   // $FF: renamed from: a com.google.android.gms.drive.query.internal.Operator
   public static final Operator field_1002 = new Operator("=");
   // $FF: renamed from: b com.google.android.gms.drive.query.internal.Operator
   public static final Operator field_1003 = new Operator("<");
   // $FF: renamed from: c com.google.android.gms.drive.query.internal.Operator
   public static final Operator field_1004 = new Operator("<=");
   // $FF: renamed from: d com.google.android.gms.drive.query.internal.Operator
   public static final Operator field_1005 = new Operator(">");
   // $FF: renamed from: e com.google.android.gms.drive.query.internal.Operator
   public static final Operator field_1006 = new Operator(">=");
   // $FF: renamed from: f com.google.android.gms.drive.query.internal.Operator
   public static final Operator field_1007 = new Operator("and");
   // $FF: renamed from: g com.google.android.gms.drive.query.internal.Operator
   public static final Operator field_1008 = new Operator("or");
   // $FF: renamed from: h com.google.android.gms.drive.query.internal.Operator
   public static final Operator field_1009 = new Operator("not");
   // $FF: renamed from: i com.google.android.gms.drive.query.internal.Operator
   public static final Operator field_1010 = new Operator("contains");
   // $FF: renamed from: j java.lang.String
   final String field_1011;
   // $FF: renamed from: k int
   final int field_1012;

   Operator(int var1, String var2) {
      this.field_1012 = var1;
      this.field_1011 = var2;
   }

   private Operator(String var1) {
      this(1, var1);
   }

   public int describeContents() {
      return 0;
   }

   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 == null) {
            return false;
         }

         if (this.getClass() != var1.getClass()) {
            return false;
         }

         Operator var2 = (Operator)var1;
         if (this.field_1011 == null) {
            if (var2.field_1011 != null) {
               return false;
            }
         } else if (!this.field_1011.equals(var2.field_1011)) {
            return false;
         }
      }

      return true;
   }

   public int hashCode() {
      int var1;
      if (this.field_1011 == null) {
         var1 = 0;
      } else {
         var1 = this.field_1011.hashCode();
      }

      return var1 + 31;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_646.method_2080(this, var1, var2);
   }
}
