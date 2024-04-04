package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LineItem implements SafeParcelable {
   public static final Creator CREATOR = new class_103();
   // $FF: renamed from: a java.lang.String
   String field_828;
   // $FF: renamed from: b java.lang.String
   String field_829;
   // $FF: renamed from: c java.lang.String
   String field_830;
   // $FF: renamed from: d java.lang.String
   String field_831;
   // $FF: renamed from: e int
   int field_832;
   // $FF: renamed from: f java.lang.String
   String field_833;
   // $FF: renamed from: g int
   private final int field_834;

   LineItem() {
      this.field_834 = 1;
      this.field_832 = 0;
   }

   LineItem(int var1, String var2, String var3, String var4, String var5, int var6, String var7) {
      this.field_834 = var1;
      this.field_828 = var2;
      this.field_829 = var3;
      this.field_830 = var4;
      this.field_831 = var5;
      this.field_832 = var6;
      this.field_833 = var7;
   }

   // $FF: renamed from: a () int
   public int method_1018() {
      return this.field_834;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_103.method_329(this, var1, var2);
   }
}
