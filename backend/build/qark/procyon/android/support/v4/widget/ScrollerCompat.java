// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.widget;

import android.widget.Scroller;
import android.view.animation.Interpolator;
import android.content.Context;
import android.os.Build$VERSION;

public class ScrollerCompat
{
    static final ScrollerCompatImpl IMPL;
    Object mScroller;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 14) {
            IMPL = (ScrollerCompatImpl)new ScrollerCompatImplIcs();
            return;
        }
        if (sdk_INT >= 9) {
            IMPL = (ScrollerCompatImpl)new ScrollerCompatImplGingerbread();
            return;
        }
        IMPL = (ScrollerCompatImpl)new ScrollerCompatImplBase();
    }
    
    ScrollerCompat(final Context context, final Interpolator interpolator) {
        this.mScroller = ScrollerCompat.IMPL.createScroller(context, interpolator);
    }
    
    public static ScrollerCompat create(final Context context) {
        return create(context, null);
    }
    
    public static ScrollerCompat create(final Context context, final Interpolator interpolator) {
        return new ScrollerCompat(context, interpolator);
    }
    
    public void abortAnimation() {
        ScrollerCompat.IMPL.abortAnimation(this.mScroller);
    }
    
    public boolean computeScrollOffset() {
        return ScrollerCompat.IMPL.computeScrollOffset(this.mScroller);
    }
    
    public void fling(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        ScrollerCompat.IMPL.fling(this.mScroller, n, n2, n3, n4, n5, n6, n7, n8);
    }
    
    public void fling(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10) {
        ScrollerCompat.IMPL.fling(this.mScroller, n, n2, n3, n4, n5, n6, n7, n8, n9, n10);
    }
    
    public float getCurrVelocity() {
        return ScrollerCompat.IMPL.getCurrVelocity(this.mScroller);
    }
    
    public int getCurrX() {
        return ScrollerCompat.IMPL.getCurrX(this.mScroller);
    }
    
    public int getCurrY() {
        return ScrollerCompat.IMPL.getCurrY(this.mScroller);
    }
    
    public int getFinalX() {
        return ScrollerCompat.IMPL.getFinalX(this.mScroller);
    }
    
    public int getFinalY() {
        return ScrollerCompat.IMPL.getFinalY(this.mScroller);
    }
    
    public boolean isFinished() {
        return ScrollerCompat.IMPL.isFinished(this.mScroller);
    }
    
    public boolean isOverScrolled() {
        return ScrollerCompat.IMPL.isOverScrolled(this.mScroller);
    }
    
    public void notifyHorizontalEdgeReached(final int n, final int n2, final int n3) {
        ScrollerCompat.IMPL.notifyHorizontalEdgeReached(this.mScroller, n, n2, n3);
    }
    
    public void notifyVerticalEdgeReached(final int n, final int n2, final int n3) {
        ScrollerCompat.IMPL.notifyVerticalEdgeReached(this.mScroller, n, n2, n3);
    }
    
    public void startScroll(final int n, final int n2, final int n3, final int n4) {
        ScrollerCompat.IMPL.startScroll(this.mScroller, n, n2, n3, n4);
    }
    
    public void startScroll(final int n, final int n2, final int n3, final int n4, final int n5) {
        ScrollerCompat.IMPL.startScroll(this.mScroller, n, n2, n3, n4, n5);
    }
    
    interface ScrollerCompatImpl
    {
        void abortAnimation(final Object p0);
        
        boolean computeScrollOffset(final Object p0);
        
        Object createScroller(final Context p0, final Interpolator p1);
        
        void fling(final Object p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final int p8);
        
        void fling(final Object p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final int p8, final int p9, final int p10);
        
        float getCurrVelocity(final Object p0);
        
        int getCurrX(final Object p0);
        
        int getCurrY(final Object p0);
        
        int getFinalX(final Object p0);
        
        int getFinalY(final Object p0);
        
        boolean isFinished(final Object p0);
        
        boolean isOverScrolled(final Object p0);
        
        void notifyHorizontalEdgeReached(final Object p0, final int p1, final int p2, final int p3);
        
        void notifyVerticalEdgeReached(final Object p0, final int p1, final int p2, final int p3);
        
        void startScroll(final Object p0, final int p1, final int p2, final int p3, final int p4);
        
        void startScroll(final Object p0, final int p1, final int p2, final int p3, final int p4, final int p5);
    }
    
    static class ScrollerCompatImplBase implements ScrollerCompatImpl
    {
        @Override
        public void abortAnimation(final Object o) {
            ((Scroller)o).abortAnimation();
        }
        
        @Override
        public boolean computeScrollOffset(final Object o) {
            return ((Scroller)o).computeScrollOffset();
        }
        
        @Override
        public Object createScroller(final Context context, final Interpolator interpolator) {
            if (interpolator != null) {
                return new Scroller(context, interpolator);
            }
            return new Scroller(context);
        }
        
        @Override
        public void fling(final Object o, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
            ((Scroller)o).fling(n, n2, n3, n4, n5, n6, n7, n8);
        }
        
        @Override
        public void fling(final Object o, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10) {
            ((Scroller)o).fling(n, n2, n3, n4, n5, n6, n7, n8);
        }
        
        @Override
        public float getCurrVelocity(final Object o) {
            return 0.0f;
        }
        
        @Override
        public int getCurrX(final Object o) {
            return ((Scroller)o).getCurrX();
        }
        
        @Override
        public int getCurrY(final Object o) {
            return ((Scroller)o).getCurrY();
        }
        
        @Override
        public int getFinalX(final Object o) {
            return ((Scroller)o).getFinalX();
        }
        
        @Override
        public int getFinalY(final Object o) {
            return ((Scroller)o).getFinalY();
        }
        
        @Override
        public boolean isFinished(final Object o) {
            return ((Scroller)o).isFinished();
        }
        
        @Override
        public boolean isOverScrolled(final Object o) {
            return false;
        }
        
        @Override
        public void notifyHorizontalEdgeReached(final Object o, final int n, final int n2, final int n3) {
        }
        
        @Override
        public void notifyVerticalEdgeReached(final Object o, final int n, final int n2, final int n3) {
        }
        
        @Override
        public void startScroll(final Object o, final int n, final int n2, final int n3, final int n4) {
            ((Scroller)o).startScroll(n, n2, n3, n4);
        }
        
        @Override
        public void startScroll(final Object o, final int n, final int n2, final int n3, final int n4, final int n5) {
            ((Scroller)o).startScroll(n, n2, n3, n4, n5);
        }
    }
    
    static class ScrollerCompatImplGingerbread implements ScrollerCompatImpl
    {
        @Override
        public void abortAnimation(final Object o) {
            ScrollerCompatGingerbread.abortAnimation(o);
        }
        
        @Override
        public boolean computeScrollOffset(final Object o) {
            return ScrollerCompatGingerbread.computeScrollOffset(o);
        }
        
        @Override
        public Object createScroller(final Context context, final Interpolator interpolator) {
            return ScrollerCompatGingerbread.createScroller(context, interpolator);
        }
        
        @Override
        public void fling(final Object o, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
            ScrollerCompatGingerbread.fling(o, n, n2, n3, n4, n5, n6, n7, n8);
        }
        
        @Override
        public void fling(final Object o, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10) {
            ScrollerCompatGingerbread.fling(o, n, n2, n3, n4, n5, n6, n7, n8, n9, n10);
        }
        
        @Override
        public float getCurrVelocity(final Object o) {
            return 0.0f;
        }
        
        @Override
        public int getCurrX(final Object o) {
            return ScrollerCompatGingerbread.getCurrX(o);
        }
        
        @Override
        public int getCurrY(final Object o) {
            return ScrollerCompatGingerbread.getCurrY(o);
        }
        
        @Override
        public int getFinalX(final Object o) {
            return ScrollerCompatGingerbread.getFinalX(o);
        }
        
        @Override
        public int getFinalY(final Object o) {
            return ScrollerCompatGingerbread.getFinalY(o);
        }
        
        @Override
        public boolean isFinished(final Object o) {
            return ScrollerCompatGingerbread.isFinished(o);
        }
        
        @Override
        public boolean isOverScrolled(final Object o) {
            return ScrollerCompatGingerbread.isOverScrolled(o);
        }
        
        @Override
        public void notifyHorizontalEdgeReached(final Object o, final int n, final int n2, final int n3) {
            ScrollerCompatGingerbread.notifyHorizontalEdgeReached(o, n, n2, n3);
        }
        
        @Override
        public void notifyVerticalEdgeReached(final Object o, final int n, final int n2, final int n3) {
            ScrollerCompatGingerbread.notifyVerticalEdgeReached(o, n, n2, n3);
        }
        
        @Override
        public void startScroll(final Object o, final int n, final int n2, final int n3, final int n4) {
            ScrollerCompatGingerbread.startScroll(o, n, n2, n3, n4);
        }
        
        @Override
        public void startScroll(final Object o, final int n, final int n2, final int n3, final int n4, final int n5) {
            ScrollerCompatGingerbread.startScroll(o, n, n2, n3, n4, n5);
        }
    }
    
    static class ScrollerCompatImplIcs extends ScrollerCompatImplGingerbread
    {
        @Override
        public float getCurrVelocity(final Object o) {
            return ScrollerCompatIcs.getCurrVelocity(o);
        }
    }
}
