package android.support.v4.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;

public class SearchViewCompat {
   private static final SearchViewCompat.SearchViewCompatImpl IMPL;

   static {
      if (VERSION.SDK_INT >= 11) {
         IMPL = new SearchViewCompat.SearchViewCompatHoneycombImpl();
      } else {
         IMPL = new SearchViewCompat.SearchViewCompatStubImpl();
      }
   }

   private SearchViewCompat(Context var1) {
   }

   public static View newSearchView(Context var0) {
      return IMPL.newSearchView(var0);
   }

   public static void setOnQueryTextListener(View var0, SearchViewCompat.OnQueryTextListenerCompat var1) {
      IMPL.setOnQueryTextListener(var0, var1.mListener);
   }

   public abstract static class OnQueryTextListenerCompat {
      final Object mListener;

      public OnQueryTextListenerCompat() {
         this.mListener = SearchViewCompat.IMPL.newOnQueryTextListener(this);
      }

      public boolean onQueryTextChange(String var1) {
         return false;
      }

      public boolean onQueryTextSubmit(String var1) {
         return false;
      }
   }

   static class SearchViewCompatHoneycombImpl extends SearchViewCompat.SearchViewCompatStubImpl {
      public Object newOnQueryTextListener(final SearchViewCompat.OnQueryTextListenerCompat var1) {
         return SearchViewCompatHoneycomb.newOnQueryTextListener(new SearchViewCompatHoneycomb.OnQueryTextListenerCompatBridge() {
            public boolean onQueryTextChange(String var1x) {
               return var1.onQueryTextChange(var1x);
            }

            public boolean onQueryTextSubmit(String var1x) {
               return var1.onQueryTextSubmit(var1x);
            }
         });
      }

      public View newSearchView(Context var1) {
         return SearchViewCompatHoneycomb.newSearchView(var1);
      }

      public void setOnQueryTextListener(Object var1, Object var2) {
         SearchViewCompatHoneycomb.setOnQueryTextListener(var1, var2);
      }
   }

   interface SearchViewCompatImpl {
      Object newOnQueryTextListener(SearchViewCompat.OnQueryTextListenerCompat var1);

      View newSearchView(Context var1);

      void setOnQueryTextListener(Object var1, Object var2);
   }

   static class SearchViewCompatStubImpl implements SearchViewCompat.SearchViewCompatImpl {
      public Object newOnQueryTextListener(SearchViewCompat.OnQueryTextListenerCompat var1) {
         return null;
      }

      public View newSearchView(Context var1) {
         return null;
      }

      public void setOnQueryTextListener(Object var1, Object var2) {
      }
   }
}
