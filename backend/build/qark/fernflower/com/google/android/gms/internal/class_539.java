package com.google.android.gms.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// $FF: renamed from: com.google.android.gms.internal.at
public final class class_539 {
   // $FF: renamed from: a (org.json.JSONObject, java.lang.String) java.util.List
   public static List method_1821(JSONObject var0, String var1) {
      JSONArray var3 = var0.optJSONArray(var1);
      if (var3 == null) {
         return null;
      } else {
         ArrayList var4 = new ArrayList(var3.length());

         for(int var2 = 0; var2 < var3.length(); ++var2) {
            var4.add(var3.getString(var2));
         }

         return Collections.unmodifiableList(var4);
      }
   }

   // $FF: renamed from: a (android.content.Context, java.lang.String, com.google.android.gms.internal.ec, java.lang.String, boolean, java.util.List) void
   public static void method_1822(Context var0, String var1, class_477 var2, String var3, boolean var4, List var5) {
      String var6;
      if (var4) {
         var6 = "1";
      } else {
         var6 = "0";
      }

      String var9;
      for(Iterator var8 = var5.iterator(); var8.hasNext(); (new class_427(var0, var1, var9)).e()) {
         String var7 = ((String)var8.next()).replaceAll("@gw_adlocid@", var3).replaceAll("@gw_adnetrefresh@", var6).replaceAll("@gw_qdata@", var2.field_1336.field_1670).replaceAll("@gw_sdkver@", var1).replaceAll("@gw_sessid@", class_476.field_1320).replaceAll("@gw_seqnum@", var2.field_1331);
         var9 = var7;
         if (var2.field_1333 != null) {
            var9 = var7.replaceAll("@gw_adnetid@", var2.field_1333.field_1618).replaceAll("@gw_allocid@", var2.field_1333.field_1620);
         }
      }

   }
}
