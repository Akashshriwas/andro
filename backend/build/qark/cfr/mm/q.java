/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.view.View
 *  android.widget.AdapterView
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package mm;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.g;
import android.view.View;
import android.widget.AdapterView;
import com.a.h.e;
import dn.f;
import java.util.ArrayList;
import mm.a;
import mm.j;
import mm.m;
import mm.pr;
import mm.r;

public class q
extends a {
    private void a(e e2) {
        if (this.c() != null) {
            int n2;
            Intent intent = new Intent((Context)this.c(), pr.class);
            int n3 = n2 = e2.d();
            if (n2 >= 15) {
                n3 = n2 + 1;
            }
            intent.putExtra(f.c, n3);
            intent.putExtra(f.b, e2.b());
            this.a(intent);
            this.c().overridePendingTransition(2130968576, 2130968577);
        }
    }

    @Override
    public void a(View view) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onItemClick(AdapterView object, View object2, int n2, long l2) {
        try {
            object = (e)this.O.getItem(n2);
            object2 = (m)this.c();
            if (object2 == null || object == null || !(this.c() instanceof m)) return;
            {
                if (f.a().b(f.a) == 3) {
                    this.a((e)object);
                    return;
                }
                j j2 = new j();
                object2.a(true);
                object2.l();
                object2.a(String.valueOf((int)object.d()) + ". " + object.b());
                object2.b(false);
                object2.c(true);
                j2.a((e)object);
                if (object2.o() != null && object.a() != object2.o().a()) {
                    object2.c((e)object);
                    object2.a((e)object);
                    object2.b((e)object);
                } else {
                    object2.c((e)object);
                    object2.a((e)object);
                }
                object2.a(j2, true);
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    @Override
    public int r() {
        return 2130903046;
    }

    @Override
    public com.a.f.e s() {
        return new r((Context)this.c());
    }

    @Override
    public ArrayList t() {
        com.a.d.a a2 = new com.a.d.a();
        new ArrayList();
        switch (f.a().b(f.a)) {
            default: {
                return a2.a(1, 34);
            }
            case 1: {
                return a2.a(35, 68);
            }
            case 2: {
                return a2.a(69, 100);
            }
            case 3: 
        }
        return a2.d();
    }
}

