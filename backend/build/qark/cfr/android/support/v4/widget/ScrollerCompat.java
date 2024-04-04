/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.widget.Scroller
 *  java.lang.Object
 */
package android.support.v4.widget;

import android.content.Context;
import android.os.Build;
import android.support.v4.widget.ScrollerCompatIcs;
import android.widget.Scroller;

class ScrollerCompat {
    Scroller mScroller;

    ScrollerCompat(Context context) {
        this.mScroller = new Scroller(context);
    }

    public static ScrollerCompat from(Context context) {
        if (Build.VERSION.SDK_INT >= 14) {
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

    public void fling(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
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

    public void startScroll(int n, int n2, int n3, int n4) {
        this.mScroller.startScroll(n, n2, n3, n4);
    }

    public void startScroll(int n, int n2, int n3, int n4, int n5) {
        this.mScroller.startScroll(n, n2, n3, n4, n5);
    }

    static class ScrollerCompatImplIcs
    extends ScrollerCompat {
        public ScrollerCompatImplIcs(Context context) {
            super(context);
        }

        @Override
        public float getCurrVelocity() {
            return ScrollerCompatIcs.getCurrVelocity(this.mScroller);
        }
    }

}

