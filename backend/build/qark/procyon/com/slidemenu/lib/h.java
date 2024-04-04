// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.slidemenu.lib;

class h implements Runnable
{
    final /* synthetic */ g a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ boolean c;
    
    h(final g a, final boolean b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void run() {
        if (!this.b) {
            this.a.b.c(false);
            return;
        }
        if (this.c) {
            this.a.b.b(false);
            return;
        }
        this.a.b.a(false);
    }
}
