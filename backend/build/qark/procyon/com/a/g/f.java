// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.a.g;

class f implements Runnable
{
    e a;
    final /* synthetic */ d b;
    
    f(final d b, final e a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        try {
            this.b.c(this.a.a, this.a.b);
        }
        catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
