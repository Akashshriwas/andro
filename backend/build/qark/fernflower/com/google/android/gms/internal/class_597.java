package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.c.a.a;
import com.google.android.gms.ads.c.a.class_659;
import com.google.android.gms.ads.d.class_225;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

// $FF: renamed from: com.google.android.gms.internal.v
public final class class_597 implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.ka
   public static final class_398 field_1979 = new class_398();
   // $FF: renamed from: b int
   public final int field_1980;
   // $FF: renamed from: c long
   public final long field_1981;
   // $FF: renamed from: d android.os.Bundle
   public final Bundle field_1982;
   // $FF: renamed from: e int
   public final int field_1983;
   // $FF: renamed from: f java.util.List
   public final List field_1984;
   // $FF: renamed from: g boolean
   public final boolean field_1985;
   // $FF: renamed from: h int
   public final int field_1986;
   // $FF: renamed from: i boolean
   public final boolean field_1987;
   // $FF: renamed from: j java.lang.String
   public final String field_1988;
   // $FF: renamed from: k com.google.android.gms.internal.ai
   public final class_530 field_1989;
   // $FF: renamed from: l android.location.Location
   public final Location field_1990;

   class_597(int var1, long var2, Bundle var4, int var5, List var6, boolean var7, int var8, boolean var9, String var10, class_530 var11, Location var12) {
      this.field_1980 = var1;
      this.field_1981 = var2;
      this.field_1982 = var4;
      this.field_1983 = var5;
      this.field_1984 = var6;
      this.field_1985 = var7;
      this.field_1986 = var8;
      this.field_1987 = var9;
      this.field_1988 = var10;
      this.field_1989 = var11;
      this.field_1990 = var12;
   }

   public class_597(Context var1, class_583 var2) {
      Object var6 = null;
      super();
      this.field_1980 = 2;
      Date var5 = var2.method_1893();
      long var3;
      if (var5 != null) {
         var3 = var5.getTime();
      } else {
         var3 = -1L;
      }

      this.field_1981 = var3;
      this.field_1983 = var2.method_1895();
      Set var11 = var2.method_1896();
      List var12;
      if (!var11.isEmpty()) {
         var12 = Collections.unmodifiableList(new ArrayList(var11));
      } else {
         var12 = null;
      }

      this.field_1984 = var12;
      this.field_1985 = var2.method_1894(var1);
      this.field_1986 = var2.method_1902();
      this.field_1990 = var2.method_1897();
      class_659 var7 = (class_659)var2.method_1892(a.class);
      Bundle var8;
      if (var7 != null) {
         var8 = var7.method_2155();
      } else {
         var8 = null;
      }

      this.field_1982 = var8;
      this.field_1987 = var2.method_1898();
      this.field_1988 = var2.method_1899();
      class_225 var9 = var2.method_1900();
      class_530 var10 = (class_530)var6;
      if (var9 != null) {
         var10 = new class_530(var9);
      }

      this.field_1989 = var10;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_398.method_1358(this, var1, var2);
   }
}
