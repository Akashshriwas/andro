// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.widget.ListAdapter;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.ArrayList;
import android.widget.ListView;
import com.a.f.e;
import android.widget.AdapterView$OnItemClickListener;
import android.support.v4.app.Fragment;

public abstract class a extends Fragment implements AdapterView$OnItemClickListener
{
    protected Boolean N;
    protected e O;
    public ListView P;
    private ArrayList Q;
    private Runnable R;
    
    public a() {
        this.N = false;
        this.R = new b(this);
    }
    
    @Override
    public View a(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(this.r(), viewGroup, false);
        if (inflate != null) {
            this.P = (ListView)inflate.findViewById(2131165194);
            this.a(inflate);
        }
        return inflate;
    }
    
    public abstract void a(final View p0);
    
    public void a(final ArrayList q) {
        this.Q = q;
    }
    
    @Override
    public void b(final Bundle bundle) {
        super.b(bundle);
        this.b(true);
    }
    
    @Override
    public void c(final Bundle bundle) {
        super.c(bundle);
        if (this.P != null && this.s() != null) {
            this.P.setOnItemClickListener((AdapterView$OnItemClickListener)this);
            this.O = this.s();
            this.P.setAdapter((ListAdapter)this.O);
            this.v();
        }
    }
    
    public abstract int r();
    
    public abstract e s();
    
    public abstract ArrayList t();
    
    public ArrayList u() {
        return this.Q;
    }
    
    protected void v() {
        new Thread(new c(this)).start();
    }
}
