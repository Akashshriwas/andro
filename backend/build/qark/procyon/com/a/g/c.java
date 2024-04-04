// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.a.g;

class c implements Runnable
{
    b a;
    final /* synthetic */ a b;
    
    c(final a b, final b a) {
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
