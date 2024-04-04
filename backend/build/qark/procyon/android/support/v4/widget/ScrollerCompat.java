// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.widget;

import android.os.Build$VERSION;
import android.content.Context;
import android.widget.Scroller;

class ScrollerCompat
{
    Scroller mScroller;
    
    ScrollerCompat(final Context context) {
        this.mScroller = new Scroller(context);
    }
    
    public static ScrollerCompat from(final Context context) {
        if (Build$VERSION.SDK_INT >= 14) {
            return new ScrollerCompatImplIcs(context);
        }
        return new ScrollerCompat(context);
    }
    
    public void abortAnimation() {
        this.mScroller.abortAnimation();
    }
    
    public boolean computeScrollOffset() {
        return this.mScroller.computeScrollOffset();
    }
    
    public void fling(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        this.mScroller.fling(n, n2, n3, n4, n5, n6, n7, n8);
    }
    
    public float getCurrVelocity() {
        return 0.0f;
    }
    
    public int getCurrX() {
        return this.mScroller.getCurrX();
    }
    
    public int getCurrY() {
        return this.mScroller.getCurrY();
    }
    
    public int getDuration() {
        return this.mScroller.getDuration();
    }
    
    public boolean isFinished() {
        return this.mScroller.isFinished();
    }
    
    public void startScroll(final int n, final int n2, final int n3, final int n4) {
        this.mScroller.startScroll(n, n2, n3, n4);
    }
    
    public void startScroll(final int n, final int n2, final int n3, final int n4, final int n5) {
        this.mScroller.startScroll(n, n2, n3, n4, n5);
    }
    
    static class ScrollerCompatImplIcs extends ScrollerCompat
    {
        public ScrollerCompatImplIcs(final Context context) {
            super(context);
        }
        
        @Override
        public float getCurrVelocity() {
            return ScrollerCompatIcs.getCurrVelocity(this.mScroller);
        }
    }
}
