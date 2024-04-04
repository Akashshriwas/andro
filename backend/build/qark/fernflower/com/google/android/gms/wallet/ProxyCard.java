package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ProxyCard implements SafeParcelable {
   public static final Creator CREATOR = new class_169();
   // $FF: renamed from: a java.lang.String
   String field_1305;
   // $FF: renamed from: b java.lang.String
   String field_1306;
   // $FF: renamed from: c int
   int field_1307;
   // $FF: renamed from: d int
   int field_1308;
   // $FF: renamed from: e int
   private final int field_1309;

   ProxyCard(int var1, String var2, String var3, int var4, int var5) {
      this.field_1309 = var1;
      this.field_1305 = var2;
      this.field_1306 = var3;
      this.field_1307 = var4;
      this.field_1308 = var5;
   }

   // $FF: renamed from: a () int
   public int method_1656() {
      return this.field_1309;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_169.method_666(this, var1, var2);
   }
}
