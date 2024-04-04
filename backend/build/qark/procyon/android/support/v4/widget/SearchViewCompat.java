// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.widget;

import android.view.View;
import android.content.Context;
import android.os.Build$VERSION;

public class SearchViewCompat
{
    private static final SearchViewCompatImpl IMPL;
    
    static {
        if (Build$VERSION.SDK_INT >= 11) {
            IMPL = (SearchViewCompatImpl)new SearchViewCompatHoneycombImpl();
            return;
        }
        IMPL = (SearchViewCompatImpl)new SearchViewCompatStubImpl();
    }
    
    private SearchViewCompat(final Context context) {
    }
    
    public static View newSearchView(final Context context) {
        return SearchViewCompat.IMPL.newSearchView(context);
    }
    
    public static void setOnQueryTextListener(final View view, final OnQueryTextListenerCompat onQueryTextListenerCompat) {
        SearchViewCompat.IMPL.setOnQueryTextListener(view, onQueryTextListenerCompat.mListener);
    }
    
    public abstract static class OnQueryTextListenerCompat
    {
        final Object mListener;
        
        public OnQueryTextListenerCompat() {
            this.mListener = SearchViewCompat.IMPL.newOnQueryTextListener(this);
        }
        
        public boolean onQueryTextChange(final String s) {
            return false;
        }
        
        public boolean onQueryTextSubmit(final String s) {
            return false;
        }
    }
    
    static class SearchViewCompatHoneycombImpl extends SearchViewCompatStubImpl
    {
        @Override
        public Object newOnQueryTextListener(final OnQueryTextListenerCompat onQueryTextListenerCompat) {
            return SearchViewCompatHoneycomb.newOnQueryTextListener((SearchViewCompatHoneycomb.OnQueryTextListenerCompatBridge)new SearchViewCompatHoneycomb.OnQueryTextListenerCompatBridge() {
                @Override
                public boolean onQueryTextChange(final String s) {
                    return onQueryTextListenerCompat.onQueryTextChange(s);
                }
                
                @Override
                public boolean onQueryTextSubmit(final String s) {
                    return onQueryTextListenerCompat.onQueryTextSubmit(s);
                }
            });
        }
        
        @Override
        public View newSearchView(final Context context) {
            return SearchViewCompatHoneycomb.newSearchView(context);
        }
        
        @Override
        public void setOnQueryTextListener(final Object o, final Object o2) {
            SearchViewCompatHoneycomb.setOnQueryTextListener(o, o2);
        }
    }
    
    interface SearchViewCompatImpl
    {
        Object newOnQueryTextListener(final OnQueryTextListenerCompat p0);
        
        View newSearchView(final Context p0);
        
        void setOnQueryTextListener(final Object p0, final Object p1);
    }
    
    static class SearchViewCompatStubImpl implements SearchViewCompatImpl
    {
        @Override
        public Object newOnQueryTextListener(final OnQueryTextListenerCompat onQueryTextListenerCompat) {
            return null;
        }
        
        @Override
        public View newSearchView(final Context context) {
            return null;
        }
        
        @Override
        public void setOnQueryTextListener(final Object o, final Object o2) {
        }
    }
}
