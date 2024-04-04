// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.view;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.accessibility.AccessibilityEvent;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.view.View;
import android.os.Build$VERSION;

public class ViewCompat
{
    private static final long FAKE_FRAME_TIME = 10L;
    static final ViewCompatImpl IMPL;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
    public static final int OVER_SCROLL_ALWAYS = 0;
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;
    public static final int OVER_SCROLL_NEVER = 2;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 16 || Build$VERSION.CODENAME.equals("JellyBean")) {
            IMPL = (ViewCompatImpl)new JBViewCompatImpl();
            return;
        }
        if (sdk_INT >= 14) {
            IMPL = (ViewCompatImpl)new ICSViewCompatImpl();
            return;
        }
        if (sdk_INT >= 11) {
            IMPL = (ViewCompatImpl)new HCViewCompatImpl();
            return;
        }
        if (sdk_INT >= 9) {
            IMPL = (ViewCompatImpl)new GBViewCompatImpl();
            return;
        }
        IMPL = (ViewCompatImpl)new BaseViewCompatImpl();
    }
    
    public static boolean canScrollHorizontally(final View view, final int n) {
        return ViewCompat.IMPL.canScrollHorizontally(view, n);
    }
    
    public static boolean canScrollVertically(final View view, final int n) {
        return ViewCompat.IMPL.canScrollVertically(view, n);
    }
    
    public static AccessibilityNodeProviderCompat getAccessibilityNodeProvider(final View view) {
        return ViewCompat.IMPL.getAccessibilityNodeProvider(view);
    }
    
    public static int getImportantForAccessibility(final View view) {
        return ViewCompat.IMPL.getImportantForAccessibility(view);
    }
    
    public static int getOverScrollMode(final View view) {
        return ViewCompat.IMPL.getOverScrollMode(view);
    }
    
    public static boolean hasTransientState(final View view) {
        return ViewCompat.IMPL.hasTransientState(view);
    }
    
    public static void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        ViewCompat.IMPL.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
    
    public static void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewCompat.IMPL.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
    }
    
    public static void onPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        ViewCompat.IMPL.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }
    
    public static void postInvalidateOnAnimation(final View view) {
        ViewCompat.IMPL.postInvalidateOnAnimation(view);
    }
    
    public static void postInvalidateOnAnimation(final View view, final int n, final int n2, final int n3, final int n4) {
        ViewCompat.IMPL.postInvalidateOnAnimation(view, n, n2, n3, n4);
    }
    
    public static void postOnAnimation(final View view, final Runnable runnable) {
        ViewCompat.IMPL.postOnAnimation(view, runnable);
    }
    
    public static void postOnAnimationDelayed(final View view, final Runnable runnable, final long n) {
        ViewCompat.IMPL.postOnAnimationDelayed(view, runnable, n);
    }
    
    public static void setAccessibilityDelegate(final View view, final AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.IMPL.setAccessibilityDelegate(view, accessibilityDelegateCompat);
    }
    
    public static void setHasTransientState(final View view, final boolean b) {
        ViewCompat.IMPL.setHasTransientState(view, b);
    }
    
    public static void setImportantForAccessibility(final View view, final int n) {
        ViewCompat.IMPL.setImportantForAccessibility(view, n);
    }
    
    public static void setOverScrollMode(final View view, final int n) {
        ViewCompat.IMPL.setOverScrollMode(view, n);
    }
    
    static class BaseViewCompatImpl implements ViewCompatImpl
    {
        @Override
        public boolean canScrollHorizontally(final View view, final int n) {
            return false;
        }
        
        @Override
        public boolean canScrollVertically(final View view, final int n) {
            return false;
        }
        
        @Override
        public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(final View view) {
            return null;
        }
        
        long getFrameTime() {
            return 10L;
        }
        
        @Override
        public int getImportantForAccessibility(final View view) {
            return 0;
        }
        
        @Override
        public int getOverScrollMode(final View view) {
            return 2;
        }
        
        @Override
        public boolean hasTransientState(final View view) {
            return false;
        }
        
        @Override
        public void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        }
        
        @Override
        public void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }
        
        @Override
        public void onPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        }
        
        @Override
        public void postInvalidateOnAnimation(final View view) {
            view.postInvalidateDelayed(this.getFrameTime());
        }
        
        @Override
        public void postInvalidateOnAnimation(final View view, final int n, final int n2, final int n3, final int n4) {
            view.postInvalidateDelayed(this.getFrameTime(), n, n2, n3, n4);
        }
        
        @Override
        public void postOnAnimation(final View view, final Runnable runnable) {
            view.postDelayed(runnable, this.getFrameTime());
        }
        
        @Override
        public void postOnAnimationDelayed(final View view, final Runnable runnable, final long n) {
            view.postDelayed(runnable, this.getFrameTime() + n);
        }
        
        @Override
        public void setAccessibilityDelegate(final View view, final AccessibilityDelegateCompat accessibilityDelegateCompat) {
        }
        
        @Override
        public void setHasTransientState(final View view, final boolean b) {
        }
        
        @Override
        public void setImportantForAccessibility(final View view, final int n) {
        }
        
        @Override
        public void setOverScrollMode(final View view, final int n) {
        }
    }
    
    static class GBViewCompatImpl extends BaseViewCompatImpl
    {
        @Override
        public int getOverScrollMode(final View view) {
            return ViewCompatGingerbread.getOverScrollMode(view);
        }
        
        @Override
        public void setOverScrollMode(final View view, final int n) {
            ViewCompatGingerbread.setOverScrollMode(view, n);
        }
    }
    
    static class HCViewCompatImpl extends GBViewCompatImpl
    {
        @Override
        long getFrameTime() {
            return ViewCompatHC.getFrameTime();
        }
    }
    
    static class ICSViewCompatImpl extends HCViewCompatImpl
    {
        @Override
        public boolean canScrollHorizontally(final View view, final int n) {
            return ViewCompatICS.canScrollHorizontally(view, n);
        }
        
        @Override
        public boolean canScrollVertically(final View view, final int n) {
            return ViewCompatICS.canScrollVertically(view, n);
        }
        
        @Override
        public void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
            ViewCompatICS.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
        
        @Override
        public void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            ViewCompatICS.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.getInfo());
        }
        
        @Override
        public void onPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
            ViewCompatICS.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        
        @Override
        public void setAccessibilityDelegate(final View view, final AccessibilityDelegateCompat accessibilityDelegateCompat) {
            ViewCompatICS.setAccessibilityDelegate(view, accessibilityDelegateCompat.getBridge());
        }
    }
    
    static class JBViewCompatImpl extends ICSViewCompatImpl
    {
        @Override
        public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(final View view) {
            final Object accessibilityNodeProvider = ViewCompatJB.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return new AccessibilityNodeProviderCompat(accessibilityNodeProvider);
            }
            return null;
        }
        
        @Override
        public int getImportantForAccessibility(final View view) {
            return ViewCompatJB.getImportantForAccessibility(view);
        }
        
        @Override
        public boolean hasTransientState(final View view) {
            return ViewCompatJB.hasTransientState(view);
        }
        
        @Override
        public void postInvalidateOnAnimation(final View view) {
            ViewCompatJB.postInvalidateOnAnimation(view);
        }
        
        @Override
        public void postInvalidateOnAnimation(final View view, final int n, final int n2, final int n3, final int n4) {
            ViewCompatJB.postInvalidateOnAnimation(view, n, n2, n3, n4);
        }
        
        @Override
        public void postOnAnimation(final View view, final Runnable runnable) {
            ViewCompatJB.postOnAnimation(view, runnable);
        }
        
        @Override
        public void postOnAnimationDelayed(final View view, final Runnable runnable, final long n) {
            ViewCompatJB.postOnAnimationDelayed(view, runnable, n);
        }
        
        @Override
        public void setHasTransientState(final View view, final boolean b) {
            ViewCompatJB.setHasTransientState(view, b);
        }
        
        @Override
        public void setImportantForAccessibility(final View view, final int n) {
            ViewCompatJB.setImportantForAccessibility(view, n);
        }
    }
    
    interface ViewCompatImpl
    {
        boolean canScrollHorizontally(final View p0, final int p1);
        
        boolean canScrollVertically(final View p0, final int p1);
        
        AccessibilityNodeProviderCompat getAccessibilityNodeProvider(final View p0);
        
        int getImportantForAccessibility(final View p0);
        
        int getOverScrollMode(final View p0);
        
        boolean hasTransientState(final View p0);
        
        void onInitializeAccessibilityEvent(final View p0, final AccessibilityEvent p1);
        
        void onInitializeAccessibilityNodeInfo(final View p0, final AccessibilityNodeInfoCompat p1);
        
        void onPopulateAccessibilityEvent(final View p0, final AccessibilityEvent p1);
        
        void postInvalidateOnAnimation(final View p0);
        
        void postInvalidateOnAnimation(final View p0, final int p1, final int p2, final int p3, final int p4);
        
        void postOnAnimation(final View p0, final Runnable p1);
        
        void postOnAnimationDelayed(final View p0, final Runnable p1, final long p2);
        
        void setAccessibilityDelegate(final View p0, final AccessibilityDelegateCompat p1);
        
        void setHasTransientState(final View p0, final boolean p1);
        
        void setImportantForAccessibility(final View p0, final int p1);
        
        void setOverScrollMode(final View p0, final int p1);
    }
}
