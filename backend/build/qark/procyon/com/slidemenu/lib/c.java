// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.slidemenu.lib;

class c extends e
{
    final /* synthetic */ a a;
    
    c(final a a) {
        this.a = a;
    }
    
    @Override
    public void a(final int n) {
        if (this.a.s != null) {
            switch (n) {
                case 0:
                case 2: {
                    this.a.s.setChildrenEnabled(true);
                }
                case 1: {
                    this.a.s.setChildrenEnabled(false);
                }
            }
        }
    }
}
