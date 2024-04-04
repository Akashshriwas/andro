/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.al;
import com.google.android.gms.internal.am;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.ed;
import com.google.android.gms.internal.er;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class at {
    public static List a(JSONObject jSONObject, String string) {
        if ((jSONObject = jSONObject.optJSONArray(string)) != null) {
            string = new ArrayList(jSONObject.length());
            for (int i2 = 0; i2 < jSONObject.length(); ++i2) {
                string.add((Object)jSONObject.getString(i2));
            }
            return Collections.unmodifiableList((List)string);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(Context context, String string, ec ec2, String string2, boolean bl2, List object) {
        String string3 = bl2 ? "1" : "0";
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            String string4 = ((String)iterator.next()).replaceAll("@gw_adlocid@", string2).replaceAll("@gw_adnetrefresh@", string3).replaceAll("@gw_qdata@", ec2.n.f).replaceAll("@gw_sdkver@", string).replaceAll("@gw_sessid@", ed.a).replaceAll("@gw_seqnum@", ec2.i);
            object = string4;
            if (ec2.k != null) {
                object = string4.replaceAll("@gw_adnetid@", ec2.k.b).replaceAll("@gw_allocid@", ec2.k.d);
            }
            new er(context, string, (String)object).e();
        }
        return;
    }
}

