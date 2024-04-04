package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

public final class Cart implements SafeParcelable {
   public static final Creator CREATOR = new class_108();
   // $FF: renamed from: a java.lang.String
   String field_1243;
   // $FF: renamed from: b java.lang.String
   String field_1244;
   // $FF: renamed from: c java.util.ArrayList
   ArrayList field_1245;
   // $FF: renamed from: d int
   private final int field_1246;

   Cart() {
      this.field_1246 = 1;
      this.field_1245 = new ArrayList();
   }

   Cart(int var1, String var2, String var3, ArrayList var4) {
      this.field_1246 = var1;
      this.field_1243 = var2;
      this.field_1244 = var3;
      this.field_1245 = var4;
   }

   // $FF: renamed from: a () int
   public int method_1541() {
      return this.field_1246;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_108.method_340(this, var1, var2);
   }
}
