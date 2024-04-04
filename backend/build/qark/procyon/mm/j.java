// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import java.util.ArrayList;
import android.content.Context;
import android.widget.AdapterView;
import android.os.Bundle;
import com.a.h.f;
import android.view.View;
import com.a.h.e;

public class j extends a implements i
{
    e Q;
    int R;
    int S;
    
    public int a(final String s) {
        final String[] split = s.split(":");
        return Integer.parseInt(split[1].substring(3, 5)) + Integer.parseInt(split[1].substring(0, 2)) * 1000;
    }
    
    @Override
    public void a(final View view) {
    }
    
    public void a(final e q) {
        this.Q = q;
    }
    
    @Override
    public void a_(final int index) {
        try {
            if (this.u() != null && this.u().size() > index) {
                final f f = this.u().get(index);
                f.a(!f.a());
                this.O.notifyDataSetChanged();
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void b(int r) {
        while (true) {
            while (true) {
                int s = 0;
                Label_0254: {
                    while (true) {
                        Label_0232: {
                            try {
                                s = this.S;
                                if (s <= this.R) {
                                    final f f = this.u().get(s);
                                    int r2;
                                    if ((r2 = s + 1) > this.R) {
                                        r2 = this.R;
                                    }
                                    int a = this.a(this.u().get(r2).e());
                                    if (s == this.R) {
                                        a += 2000;
                                    }
                                    if (f.b() || r < this.a(f.e()) || r >= a) {
                                        break Label_0254;
                                    }
                                    if (s > this.S) {
                                        this.S = s;
                                    }
                                    f.b(true);
                                    r = 0;
                                    if (r < this.S) {
                                        break Label_0232;
                                    }
                                    this.O.notifyDataSetChanged();
                                }
                                final f f2 = this.u().get(this.S);
                                if (this.S > 2 && f2 != null && f2.b()) {
                                    if ((r = this.S + 1) > this.R) {
                                        r = this.R;
                                        this.S = 0;
                                    }
                                    this.P.smoothScrollToPosition(r);
                                    return;
                                }
                                break;
                            }
                            catch (Exception ex) {
                                ex.printStackTrace();
                                return;
                            }
                        }
                        this.u().get(r).b(true);
                        ++r;
                        continue;
                    }
                }
                ++s;
                continue;
            }
        }
    }
    
    @Override
    public void b(final Bundle bundle) {
        super.b(bundle);
    }
    
    @Override
    public void d(final Bundle bundle) {
        super.d(bundle);
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        try {
            final m m = (m)this.c();
            if (m != null && m.C != null && m.C.isPlaying()) {
                for (int i = n; i >= 0; --i) {
                    ((f)this.u().get(i)).b(true);
                }
                this.O.notifyDataSetChanged();
                String e = ((f)this.O.getItem(n)).e();
                if (n == 0) {
                    e = "00:00.00";
                }
                m.b(e);
                return;
            }
            if (m != null && m.C != null && !m.C.isPlaying()) {
                m.p();
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public int r() {
        return 2130903040;
    }
    
    @Override
    public com.a.f.e s() {
        return new g((Context)this.c(), this);
    }
    
    @Override
    public ArrayList t() {
        final ArrayList d = new com.a.d.a().d(this.Q.a());
        if (d != null) {
            this.R = d.size() - 1;
            this.S = 0;
        }
        return d;
    }
    
    public void w() {
        if (this.u() != null) {
            for (int i = 1; i <= this.R; ++i) {
                ((f)this.u().get(i)).b(false);
            }
            this.O.notifyDataSetChanged();
            this.x();
        }
    }
    
    public void x() {
        if (this.P != null) {
            this.P.smoothScrollToPosition(0);
        }
    }
}
