package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.os.Build.VERSION;
import android.support.v4.util.SparseArrayCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class FragmentActivity extends Activity {
   private static final String FRAGMENTS_TAG = "android:support:fragments";
   private static final int HONEYCOMB = 11;
   static final int MSG_REALLY_STOPPED = 1;
   static final int MSG_RESUME_PENDING = 2;
   private static final String TAG = "FragmentActivity";
   SparseArrayCompat mAllLoaderManagers;
   boolean mCheckedForLoaderManager;
   boolean mCreated;
   final FragmentManagerImpl mFragments = new FragmentManagerImpl();
   final Handler mHandler = new Handler() {
      public void handleMessage(Message var1) {
         switch(var1.what) {
         case 1:
            if (FragmentActivity.this.mStopped) {
               FragmentActivity.this.doReallyStop(false);
               return;
            }
            break;
         case 2:
            FragmentActivity.this.onResumeFragments();
            FragmentActivity.this.mFragments.execPendingActions();
            return;
         default:
            super.handleMessage(var1);
         }

      }
   };
   LoaderManagerImpl mLoaderManager;
   boolean mLoadersStarted;
   boolean mOptionsMenuInvalidated;
   boolean mReallyStopped;
   boolean mResumed;
   boolean mRetaining;
   boolean mStopped;

   void doReallyStop(boolean var1) {
      if (!this.mReallyStopped) {
         this.mReallyStopped = true;
         this.mRetaining = var1;
         this.mHandler.removeMessages(1);
         this.onReallyStop();
      }

   }

   public void dump(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      if (VERSION.SDK_INT >= 11) {
      }

      var3.print(var1);
      var3.print("Local FragmentActivity ");
      var3.print(Integer.toHexString(System.identityHashCode(this)));
      var3.println(" State:");
      String var5 = var1 + "  ";
      var3.print(var5);
      var3.print("mCreated=");
      var3.print(this.mCreated);
      var3.print("mResumed=");
      var3.print(this.mResumed);
      var3.print(" mStopped=");
      var3.print(this.mStopped);
      var3.print(" mReallyStopped=");
      var3.println(this.mReallyStopped);
      var3.print(var5);
      var3.print("mLoadersStarted=");
      var3.println(this.mLoadersStarted);
      if (this.mLoaderManager != null) {
         var3.print(var1);
         var3.print("Loader Manager ");
         var3.print(Integer.toHexString(System.identityHashCode(this.mLoaderManager)));
         var3.println(":");
         this.mLoaderManager.dump(var1 + "  ", var2, var3, var4);
      }

      this.mFragments.dump(var1, var2, var3, var4);
   }

   public Object getLastCustomNonConfigurationInstance() {
      FragmentActivity.NonConfigurationInstances var1 = (FragmentActivity.NonConfigurationInstances)this.getLastNonConfigurationInstance();
      return var1 != null ? var1.custom : null;
   }

   LoaderManagerImpl getLoaderManager(int var1, boolean var2, boolean var3) {
      if (this.mAllLoaderManagers == null) {
         this.mAllLoaderManagers = new SparseArrayCompat();
      }

      LoaderManagerImpl var4 = (LoaderManagerImpl)this.mAllLoaderManagers.get(var1);
      if (var4 == null) {
         if (var3) {
            var4 = new LoaderManagerImpl(this, var2);
            this.mAllLoaderManagers.put(var1, var4);
         }

         return var4;
      } else {
         var4.updateActivity(this);
         return var4;
      }
   }

   public FragmentManager getSupportFragmentManager() {
      return this.mFragments;
   }

   public LoaderManager getSupportLoaderManager() {
      if (this.mLoaderManager != null) {
         return this.mLoaderManager;
      } else {
         this.mCheckedForLoaderManager = true;
         this.mLoaderManager = this.getLoaderManager(-1, this.mLoadersStarted, true);
         return this.mLoaderManager;
      }
   }

   void invalidateSupportFragmentIndex(int var1) {
      if (this.mAllLoaderManagers != null) {
         LoaderManagerImpl var2 = (LoaderManagerImpl)this.mAllLoaderManagers.get(var1);
         if (var2 != null && !var2.mRetaining) {
            var2.doDestroy();
            this.mAllLoaderManagers.remove(var1);
         }
      }

   }

   protected void onActivityResult(int var1, int var2, Intent var3) {
      int var4 = var1 >> 16;
      if (var4 != 0) {
         --var4;
         if (this.mFragments.mActive != null && var4 >= 0 && var4 < this.mFragments.mActive.size()) {
            Fragment var5 = (Fragment)this.mFragments.mActive.get(var4);
            if (var5 == null) {
               Log.w("FragmentActivity", "Activity result no fragment exists for index: 0x" + Integer.toHexString(var1));
            } else {
               var5.onActivityResult('\uffff' & var1, var2, var3);
            }
         } else {
            Log.w("FragmentActivity", "Activity result fragment index out of range: 0x" + Integer.toHexString(var1));
         }
      } else {
         super.onActivityResult(var1, var2, var3);
      }
   }

   public void onAttachFragment(Fragment var1) {
   }

   public void onBackPressed() {
      if (!this.mFragments.popBackStackImmediate()) {
         this.finish();
      }

   }

   public void onConfigurationChanged(Configuration var1) {
      super.onConfigurationChanged(var1);
      this.mFragments.dispatchConfigurationChanged(var1);
   }

   protected void onCreate(Bundle var1) {
      this.mFragments.attachActivity(this);
      if (this.getLayoutInflater().getFactory() == null) {
         this.getLayoutInflater().setFactory(this);
      }

      super.onCreate(var1);
      FragmentActivity.NonConfigurationInstances var4 = (FragmentActivity.NonConfigurationInstances)this.getLastNonConfigurationInstance();
      if (var4 != null) {
         this.mAllLoaderManagers = var4.loaders;
      }

      if (var1 != null) {
         Parcelable var2 = var1.getParcelable("android:support:fragments");
         FragmentManagerImpl var3 = this.mFragments;
         ArrayList var5;
         if (var4 != null) {
            var5 = var4.fragments;
         } else {
            var5 = null;
         }

         var3.restoreAllState(var2, var5);
      }

      this.mFragments.dispatchCreate();
   }

   public boolean onCreatePanelMenu(int var1, Menu var2) {
      if (var1 == 0) {
         boolean var3 = super.onCreatePanelMenu(var1, var2);
         boolean var4 = this.mFragments.dispatchCreateOptionsMenu(var2, this.getMenuInflater());
         return VERSION.SDK_INT >= 11 ? var3 | var4 : true;
      } else {
         return super.onCreatePanelMenu(var1, var2);
      }
   }

   public View onCreateView(String var1, Context var2, AttributeSet var3) {
      Object var7 = null;
      if (!"fragment".equals(var1)) {
         return super.onCreateView(var1, var2, var3);
      } else {
         var1 = var3.getAttributeValue((String)null, "class");
         TypedArray var10 = var2.obtainStyledAttributes(var3, FragmentActivity.FragmentTag.Fragment);
         String var6 = var1;
         if (var1 == null) {
            var6 = var10.getString(0);
         }

         int var5 = var10.getResourceId(1, -1);
         String var8 = var10.getString(2);
         var10.recycle();
         if (false) {
            throw new NullPointerException();
         } else if (-1 == 0 && var5 == -1 && var8 == null) {
            throw new IllegalArgumentException(var3.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + var6);
         } else {
            Fragment var11 = (Fragment)var7;
            if (var5 != -1) {
               var11 = this.mFragments.findFragmentById(var5);
            }

            Fragment var9 = var11;
            if (var11 == null) {
               var9 = var11;
               if (var8 != null) {
                  var9 = this.mFragments.findFragmentByTag(var8);
               }
            }

            var11 = var9;
            if (var9 == null) {
               var11 = var9;
               if (-1 != 0) {
                  var11 = this.mFragments.findFragmentById(0);
               }
            }

            if (FragmentManagerImpl.DEBUG) {
               Log.v("FragmentActivity", "onCreateView: id=0x" + Integer.toHexString(var5) + " fname=" + var6 + " existing=" + var11);
            }

            if (var11 == null) {
               var11 = Fragment.instantiate(this, var6);
               var11.mFromLayout = true;
               int var4;
               if (var5 != 0) {
                  var4 = var5;
               } else {
                  var4 = 0;
               }

               var11.mFragmentId = var4;
               var11.mContainerId = 0;
               var11.mTag = var8;
               var11.mInLayout = true;
               var11.mFragmentManager = this.mFragments;
               var11.onInflate(this, var3, var11.mSavedFragmentState);
               this.mFragments.addFragment(var11, true);
            } else {
               if (var11.mInLayout) {
                  throw new IllegalArgumentException(var3.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(var5) + ", tag " + var8 + ", or parent id 0x" + Integer.toHexString(0) + " with another fragment for " + var6);
               }

               var11.mInLayout = true;
               if (!var11.mRetaining) {
                  var11.onInflate(this, var3, var11.mSavedFragmentState);
               }

               this.mFragments.moveToState(var11);
            }

            if (var11.mView == null) {
               throw new IllegalStateException("Fragment " + var6 + " did not create a view.");
            } else {
               if (var5 != 0) {
                  var11.mView.setId(var5);
               }

               if (var11.mView.getTag() == null) {
                  var11.mView.setTag(var8);
               }

               return var11.mView;
            }
         }
      }
   }

   protected void onDestroy() {
      super.onDestroy();
      this.doReallyStop(false);
      this.mFragments.dispatchDestroy();
      if (this.mLoaderManager != null) {
         this.mLoaderManager.doDestroy();
      }

   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      if (VERSION.SDK_INT < 5 && var1 == 4 && var2.getRepeatCount() == 0) {
         this.onBackPressed();
         return true;
      } else {
         return super.onKeyDown(var1, var2);
      }
   }

   public void onLowMemory() {
      super.onLowMemory();
      this.mFragments.dispatchLowMemory();
   }

   public boolean onMenuItemSelected(int var1, MenuItem var2) {
      if (super.onMenuItemSelected(var1, var2)) {
         return true;
      } else {
         switch(var1) {
         case 0:
            return this.mFragments.dispatchOptionsItemSelected(var2);
         case 6:
            return this.mFragments.dispatchContextItemSelected(var2);
         default:
            return false;
         }
      }
   }

   public void onPanelClosed(int var1, Menu var2) {
      switch(var1) {
      case 0:
         this.mFragments.dispatchOptionsMenuClosed(var2);
      default:
         super.onPanelClosed(var1, var2);
      }
   }

   protected void onPause() {
      super.onPause();
      this.mResumed = false;
      if (this.mHandler.hasMessages(2)) {
         this.mHandler.removeMessages(2);
         this.onResumeFragments();
      }

      this.mFragments.dispatchPause();
   }

   protected void onPostResume() {
      super.onPostResume();
      this.mHandler.removeMessages(2);
      this.onResumeFragments();
      this.mFragments.execPendingActions();
   }

   public boolean onPreparePanel(int var1, View var2, Menu var3) {
      boolean var5 = false;
      if (var1 == 0 && var3 != null) {
         if (this.mOptionsMenuInvalidated) {
            this.mOptionsMenuInvalidated = false;
            var3.clear();
            this.onCreatePanelMenu(var1, var3);
         }

         boolean var4 = var5;
         if (super.onPreparePanel(var1, var2, var3) | this.mFragments.dispatchPrepareOptionsMenu(var3)) {
            var4 = var5;
            if (var3.hasVisibleItems()) {
               var4 = true;
            }
         }

         return var4;
      } else {
         return super.onPreparePanel(var1, var2, var3);
      }
   }

   void onReallyStop() {
      if (this.mLoadersStarted) {
         this.mLoadersStarted = false;
         if (this.mLoaderManager != null) {
            if (!this.mRetaining) {
               this.mLoaderManager.doStop();
            } else {
               this.mLoaderManager.doRetain();
            }
         }
      }

      this.mFragments.dispatchReallyStop();
   }

   protected void onResume() {
      super.onResume();
      this.mHandler.sendEmptyMessage(2);
      this.mResumed = true;
      this.mFragments.execPendingActions();
   }

   protected void onResumeFragments() {
      this.mFragments.dispatchResume();
   }

   public Object onRetainCustomNonConfigurationInstance() {
      return null;
   }

   public final Object onRetainNonConfigurationInstance() {
      if (this.mStopped) {
         this.doReallyStop(true);
      }

      Object var4 = this.onRetainCustomNonConfigurationInstance();
      ArrayList var5 = this.mFragments.retainNonConfig();
      boolean var3 = false;
      boolean var1 = false;
      if (this.mAllLoaderManagers != null) {
         int var2 = this.mAllLoaderManagers.size() - 1;

         while(true) {
            var3 = var1;
            if (var2 < 0) {
               break;
            }

            LoaderManagerImpl var6 = (LoaderManagerImpl)this.mAllLoaderManagers.valueAt(var2);
            if (var6.mRetaining) {
               var1 = true;
            } else {
               var6.doDestroy();
               this.mAllLoaderManagers.removeAt(var2);
            }

            --var2;
         }
      }

      if (var5 == null && !var3 && var4 == null) {
         return null;
      } else {
         FragmentActivity.NonConfigurationInstances var7 = new FragmentActivity.NonConfigurationInstances();
         var7.activity = null;
         var7.custom = var4;
         var7.children = null;
         var7.fragments = var5;
         var7.loaders = this.mAllLoaderManagers;
         return var7;
      }
   }

   protected void onSaveInstanceState(Bundle var1) {
      super.onSaveInstanceState(var1);
      Parcelable var2 = this.mFragments.saveAllState();
      if (var2 != null) {
         var1.putParcelable("android:support:fragments", var2);
      }

   }

   protected void onStart() {
      super.onStart();
      this.mStopped = false;
      this.mReallyStopped = false;
      this.mHandler.removeMessages(1);
      if (!this.mCreated) {
         this.mCreated = true;
         this.mFragments.dispatchActivityCreated();
      }

      this.mFragments.noteStateNotSaved();
      this.mFragments.execPendingActions();
      if (!this.mLoadersStarted) {
         this.mLoadersStarted = true;
         if (this.mLoaderManager != null) {
            this.mLoaderManager.doStart();
         } else if (!this.mCheckedForLoaderManager) {
            this.mLoaderManager = this.getLoaderManager(-1, this.mLoadersStarted, false);
         }

         this.mCheckedForLoaderManager = true;
      }

      this.mFragments.dispatchStart();
      if (this.mAllLoaderManagers != null) {
         for(int var1 = this.mAllLoaderManagers.size() - 1; var1 >= 0; --var1) {
            LoaderManagerImpl var2 = (LoaderManagerImpl)this.mAllLoaderManagers.valueAt(var1);
            var2.finishRetain();
            var2.doReportStart();
         }
      }

   }

   protected void onStop() {
      super.onStop();
      this.mStopped = true;
      this.mHandler.sendEmptyMessage(1);
      this.mFragments.dispatchStop();
   }

   public void startActivityForResult(Intent var1, int var2) {
      if (var2 != -1 && (-65536 & var2) != 0) {
         throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
      } else {
         super.startActivityForResult(var1, var2);
      }
   }

   public void startActivityFromFragment(Fragment var1, Intent var2, int var3) {
      if (var3 == -1) {
         super.startActivityForResult(var2, -1);
      } else if ((-65536 & var3) != 0) {
         throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
      } else {
         super.startActivityForResult(var2, (var1.mIndex + 1 << 16) + ('\uffff' & var3));
      }
   }

   public void supportInvalidateOptionsMenu() {
      if (VERSION.SDK_INT >= 11) {
         ActivityCompatHoneycomb.invalidateOptionsMenu(this);
      } else {
         this.mOptionsMenuInvalidated = true;
      }
   }

   static class FragmentTag {
      public static final int[] Fragment = new int[]{16842755, 16842960, 16842961};
      public static final int Fragment_id = 1;
      public static final int Fragment_name = 0;
      public static final int Fragment_tag = 2;
   }

   static final class NonConfigurationInstances {
      Object activity;
      HashMap children;
      Object custom;
      ArrayList fragments;
      SparseArrayCompat loaders;
   }
}
