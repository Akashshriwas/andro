// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import java.util.ArrayList;
import android.support.v4.app.Fragment;
import android.widget.AdapterView;
import android.view.View;
import dn.f;
import android.content.Context;
import android.content.Intent;
import com.a.h.e;

public class q extends a
{
    private void a(final e e) {
        if (this.c() != null) {
            final Intent intent = new Intent((Context)this.c(), (Class)pr.class);
            final int d = e.d();
            int n;
            if ((n = d) >= 15) {
                n = d + 1;
            }
            intent.putExtra(dn.f.c, n);
            intent.putExtra(dn.f.b, e.b());
            this.a(intent);
            this.c().overridePendingTransition(2130968576, 2130968577);
        }
    }
    
    @Override
    public void a(final View view) {
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        while (true) {
            while (true) {
                e e;
                m m;
                try {
                    e = (e)this.O.getItem(n);
                    m = (m)this.c();
                    if (m == null || e == null || !(this.c() instanceof m)) {
                        break;
                    }
                    if (dn.f.a().b(dn.f.a) == 3) {
                        this.a(e);
                        return;
                    }
                    final j j = new j();
                    m.a(Boolean.valueOf(true));
                    m.l();
                    m.a(String.valueOf(e.d()) + ". " + e.b());
                    m.b(false);
                    m.c(true);
                    j.a(e);
                    if (m.o() != null && e.a() != m.o().a()) {
                        m.c(e);
                        m.a(e);
                        m.b(e);
                        m.a(j, true);
                        return;
                    }
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                    return;
                }
                m.c(e);
                m.a(e);
                continue;
            }
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
        final com.a.d.a a = new com.a.d.a();
        new ArrayList();
        switch (dn.f.a().b(dn.f.a)) {
            default: {
                return a.a(1, 34);
            }
            case 1: {
                return a.a(35, 68);
            }
            case 2: {
                return a.a(69, 100);
            }
            case 3: {
                return a.d();
            }
        }
    }
}
