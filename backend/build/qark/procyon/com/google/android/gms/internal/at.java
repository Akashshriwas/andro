// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.util.Iterator;
import android.content.Context;
import org.json.JSONArray;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class at
{
    public static List a(final JSONObject jsonObject, final String s) {
        final JSONArray optJSONArray = jsonObject.optJSONArray(s);
        if (optJSONArray != null) {
            final ArrayList<String> list = new ArrayList<String>(optJSONArray.length());
            for (int i = 0; i < optJSONArray.length(); ++i) {
                list.add(optJSONArray.getString(i));
            }
            return Collections.unmodifiableList((List<?>)list);
        }
        return null;
    }
    
    public static void a(final Context context, final String replacement, final ec ec, final String replacement2, final boolean b, final List list) {
        String replacement3;
        if (b) {
            replacement3 = "1";
        }
        else {
            replacement3 = "0";
        }
        final Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next().replaceAll("@gw_adlocid@", replacement2).replaceAll("@gw_adnetrefresh@", replacement3).replaceAll("@gw_qdata@", ec.n.f).replaceAll("@gw_sdkver@", replacement).replaceAll("@gw_sessid@", ed.a).replaceAll("@gw_seqnum@", ec.i);
            if (ec.k != null) {
                s = s.replaceAll("@gw_adnetid@", ec.k.b).replaceAll("@gw_allocid@", ec.k.d);
            }
            new er(context, replacement, s).e();
        }
    }
}
