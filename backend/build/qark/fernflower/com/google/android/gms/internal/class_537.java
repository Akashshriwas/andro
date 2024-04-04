package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// $FF: renamed from: com.google.android.gms.internal.am
public final class class_537 {
   // $FF: renamed from: a java.util.List
   public final List field_1665;
   // $FF: renamed from: b long
   public final long field_1666;
   // $FF: renamed from: c java.util.List
   public final List field_1667;
   // $FF: renamed from: d java.util.List
   public final List field_1668;
   // $FF: renamed from: e java.util.List
   public final List field_1669;
   // $FF: renamed from: f java.lang.String
   public final String field_1670;
   // $FF: renamed from: g long
   public final long field_1671;

   public class_537(String var1) {
      JSONObject var7 = new JSONObject(var1);
      if (class_467.method_1605(2)) {
         class_467.method_1609("Mediation Response JSON: " + var7.toString(2));
      }

      JSONArray var5 = var7.getJSONArray("ad_networks");
      ArrayList var6 = new ArrayList(var5.length());

      for(int var2 = 0; var2 < var5.length(); ++var2) {
         var6.add(new class_524(var5.getJSONObject(var2)));
      }

      this.field_1665 = Collections.unmodifiableList(var6);
      this.field_1670 = var7.getString("qdata");
      var7 = var7.optJSONObject("settings");
      if (var7 != null) {
         this.field_1666 = var7.optLong("ad_network_timeout_millis", -1L);
         this.field_1667 = class_539.method_1821(var7, "click_urls");
         this.field_1668 = class_539.method_1821(var7, "imp_urls");
         this.field_1669 = class_539.method_1821(var7, "nofill_urls");
         long var3 = var7.optLong("refresh", -1L);
         if (var3 > 0L) {
            var3 = 1000L * var3;
         } else {
            var3 = -1L;
         }

         this.field_1671 = var3;
      } else {
         this.field_1666 = -1L;
         this.field_1667 = null;
         this.field_1668 = null;
         this.field_1669 = null;
         this.field_1671 = -1L;
      }
   }
}
