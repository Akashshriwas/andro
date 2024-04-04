// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.slidemenu.lib;

class j implements d
{
    final /* synthetic */ SlidingMenu a;
    
    j(final SlidingMenu a) {
        this.a = a;
    }
    
    @Override
    public void a(final int n) {
        if (n == 0 && this.a.d != null) {
            this.a.d.b();
        }
        else {
            if (n == 1 && this.a.f != null) {
                this.a.f.a();
                return;
            }
            if (n == 2 && this.a.e != null) {
                this.a.e.b();
            }
        }
    }
    
    @Override
    public void a(final int n, final float n2, final int n3) {
    }
}
