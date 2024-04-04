// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

class db implements Runnable
{
    final /* synthetic */ cy a;
    
    db(final cy a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        while (true) {
            synchronized (this.a.e) {
                if (this.a.i.f != -2) {
                    return;
                }
                this.a.c.e().a(this.a);
                if (this.a.i.f == -3) {
                    et.d("Loading URL in WebView: " + this.a.i.c);
                    this.a.c.loadUrl(this.a.i.c);
                    return;
                }
            }
            et.d("Loading HTML in WebView.");
            this.a.c.loadDataWithBaseURL(em.a(this.a.i.c), this.a.i.d, "text/html", "UTF-8", (String)null);
        }
    }
}
