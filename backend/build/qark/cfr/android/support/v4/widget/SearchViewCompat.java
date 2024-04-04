/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.View
 *  java.lang.Object
 *  java.lang.String
 */
package android.support.v4.widget;

import android.content.Context;
import android.os.Build;
import android.support.v4.widget.SearchViewCompatHoneycomb;
import android.view.View;

public class SearchViewCompat {
    private static final SearchViewCompatImpl IMPL = Build.VERSION.SDK_INT >= 11 ? new SearchViewCompatHoneycombImpl() : new SearchViewCompatStubImpl();

    private SearchViewCompat(Context context) {
    }

    public static View newSearchView(Context context) {
        return IMPL.newSearchView(context);
    }

    public static void setOnQueryTextListener(View view, OnQueryTextListenerCompat onQueryTextListenerCompat) {
        IMPL.setOnQueryTextListener((Object)view, onQueryTextListenerCompat.mListener);
    }

    public static abstract class OnQueryTextListenerCompat {
        final Object mListener;

        public OnQueryTextListenerCompat() {
            this.mListener = IMPL.newOnQueryTextListener(this);
        }

        public boolean onQueryTextChange(String string2) {
            return false;
        }

        public boolean onQueryTextSubmit(String string2) {
            return false;
        }
    }

    static class SearchViewCompatHoneycombImpl
    extends SearchViewCompatStubImpl {
        SearchViewCompatHoneycombImpl() {
        }

        @Override
        public Object newOnQueryTextListener(final OnQueryTextListenerCompat onQueryTextListenerCompat) {
            return SearchViewCompatHoneycomb.newOnQueryTextListener(new SearchViewCompatHoneycomb.OnQueryTextListenerCompatBridge(){

                @Override
                public boolean onQueryTextChange(String string2) {
                    return onQueryTextListenerCompat.onQueryTextChange(string2);
                }

                @Override
                public boolean onQueryTextSubmit(String string2) {
                    return onQueryTextListenerCompat.onQueryTextSubmit(string2);
                }
            });
        }

        @Override
        public View newSearchView(Context context) {
            return SearchViewCompatHoneycomb.newSearchView(context);
        }

        @Override
        public void setOnQueryTextListener(Object object, Object object2) {
            SearchViewCompatHoneycomb.setOnQueryTextListener(object, object2);
        }

    }

    static interface SearchViewCompatImpl {
        public Object newOnQueryTextListener(OnQueryTextListenerCompat var1);

        public View newSearchView(Context var1);

        public void setOnQueryTextListener(Object var1, Object var2);
    }

    static class SearchViewCompatStubImpl
    implements SearchViewCompatImpl {
        SearchViewCompatStubImpl() {
        }

        @Override
        public Object newOnQueryTextListener(OnQueryTextListenerCompat onQueryTextListenerCompat) {
            return null;
        }

        @Override
        public View newSearchView(Context context) {
            return null;
        }

        @Override
        public void setOnQueryTextListener(Object object, Object object2) {
        }
    }

}

