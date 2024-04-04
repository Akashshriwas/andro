package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

public final class dh$a implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.hb
   public static final class_344 field_666 = new class_344();
   // $FF: renamed from: b int
   private final int field_667;
   // $FF: renamed from: c java.lang.String
   private final String field_668;
   // $FF: renamed from: d java.util.List
   private final List field_669 = new ArrayList();
   // $FF: renamed from: e int
   private final int field_670;
   // $FF: renamed from: f java.lang.String
   private final String field_671;

   dh$a(int var1, String var2, List var3, int var4, String var5) {
      this.field_667 = var1;
      this.field_668 = var2;
      this.field_669.addAll(var3);
      this.field_670 = var4;
      this.field_671 = var5;
   }

   // $FF: renamed from: a () java.lang.String
   public String method_817() {
      return this.field_668;
   }

   // $FF: renamed from: b () int
   public int method_818() {
      return this.field_670;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_819() {
      return this.field_671;
   }

   // $FF: renamed from: d () java.util.List
   public List method_820() {
      return new ArrayList(this.field_669);
   }

   public int describeContents() {
      return 0;
   }

   // $FF: renamed from: e () int
   public int method_821() {
      return this.field_667;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_344.method_1199(this, var1, var2);
   }
}
