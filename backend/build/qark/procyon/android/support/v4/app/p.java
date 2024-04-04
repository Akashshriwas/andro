// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.app;

import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;

class p implements Animation$AnimationListener
{
    final /* synthetic */ Fragment a;
    final /* synthetic */ m b;
    
    p(final m b, final Fragment a) {
        this.b = b;
        this.a = a;
    }
    
    public void onAnimationEnd(final Animation animation) {
        if (this.a.b != null) {
            this.a.b = null;
            this.b.a(this.a, this.a.c, 0, 0, false);
        }
    }
    
    public void onAnimationRepeat(final Animation animation) {
    }
    
    public void onAnimationStart(final Animation animation) {
    }
}
