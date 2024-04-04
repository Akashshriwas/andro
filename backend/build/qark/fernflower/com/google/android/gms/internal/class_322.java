package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// $FF: renamed from: com.google.android.gms.internal.gg
public class class_322 implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.io
   public static final class_384 field_915 = new class_384();
   // $FF: renamed from: b int
   public final int field_916;
   // $FF: renamed from: c java.lang.String
   public final String field_917;
   // $FF: renamed from: d java.lang.String
   public final String field_918;

   public class_322(int var1, String var2, String var3) {
      this.field_916 = var1;
      this.field_917 = var2;
      this.field_918 = var3;
   }

   public int describeContents() {
      class_384 var1 = field_915;
      return 0;
   }

   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && var1 instanceof class_322) {
            class_322 var2 = (class_322)var1;
            if (this.field_918.equals(var2.field_918) && this.field_917.equals(var2.field_917)) {
               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public int hashCode() {
      return class_310.method_1033(this.field_917, this.field_918);
   }

   public String toString() {
      return class_310.method_1034(this).method_1032("clientPackageName", this.field_917).method_1032("locale", this.field_918).toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_384 var3 = field_915;
      class_384.method_1312(this, var1, var2);
   }
}
