// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.a.f;

import java.util.ArrayList;
import com.a.b.a;
import android.os.AsyncTask;

class d extends AsyncTask
{
    a a;
    final /* synthetic */ com.a.f.a b;
    
    private d(final com.a.f.a b) {
        this.b = b;
    }
    
    protected Void a(final Void... array) {
        try {
            new ArrayList();
            this.b.a(this.b.i());
            return null;
        }
        catch (Exception ex) {
            this.a.dismiss();
            return null;
        }
    }
    
    protected void a(final Void void1) {
        this.a.dismiss();
        if (this.b.p != null && this.b.p.size() > 0) {
            this.b.m.a(this.b.k());
            this.b.m.notifyDataSetChanged();
            return;
        }
        this.b.m.b().clear();
        this.b.m.notifyDataSetChanged();
    }
    
    protected void onPreExecute() {
        (this.a = new a(this.b.n.getContext())).show();
    }
}
