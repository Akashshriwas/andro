// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.widget.ListAdapter;
import android.content.Context;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.AdapterView$OnItemClickListener;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.support.v4.app.t;

public class l extends t
{
    public p V;
    public k W;
    int X;
    private ImageView Y;
    private View$OnClickListener Z;
    private AdapterView$OnItemClickListener aa;
    
    public l() {
        this.X = 0;
        this.Z = (View$OnClickListener)new n(this);
        this.aa = (AdapterView$OnItemClickListener)new o(this);
    }
    
    @Override
    public View a(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return layoutInflater.inflate(2130903044, (ViewGroup)null);
    }
    
    @Override
    public void c(final Bundle bundle) {
        super.c(bundle);
        this.r().setOnItemClickListener(this.aa);
        this.a((ListAdapter)(this.W = new k((Context)this.c())));
        (this.Y = (ImageView)this.c().findViewById(2131165201)).setOnClickListener(this.Z);
    }
}
