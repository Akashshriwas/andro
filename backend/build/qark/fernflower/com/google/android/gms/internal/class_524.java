package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// $FF: renamed from: com.google.android.gms.internal.al
public final class class_524 {
   // $FF: renamed from: a java.lang.String
   public final String field_1617;
   // $FF: renamed from: b java.lang.String
   public final String field_1618;
   // $FF: renamed from: c java.util.List
   public final List field_1619;
   // $FF: renamed from: d java.lang.String
   public final String field_1620;
   // $FF: renamed from: e java.util.List
   public final List field_1621;
   // $FF: renamed from: f java.lang.String
   public final String field_1622;

   public class_524(JSONObject var1) {
      Object var4 = null;
      super();
      this.field_1618 = var1.getString("id");
      JSONArray var3 = var1.getJSONArray("adapters");
      ArrayList var5 = new ArrayList(var3.length());

      for(int var2 = 0; var2 < var3.length(); ++var2) {
         var5.add(var3.getString(var2));
      }

      this.field_1619 = Collections.unmodifiableList(var5);
      this.field_1620 = var1.optString("allocation_id", (String)null);
      this.field_1621 = class_539.method_1821(var1, "imp_urls");
      JSONObject var7 = var1.optJSONObject("ad");
      String var8;
      if (var7 != null) {
         var8 = var7.toString();
      } else {
         var8 = null;
      }

      this.field_1617 = var8;
      var7 = var1.optJSONObject("data");
      String var6 = (String)var4;
      if (var7 != null) {
         var6 = var7.toString();
      }

      this.field_1622 = var6;
   }
}
