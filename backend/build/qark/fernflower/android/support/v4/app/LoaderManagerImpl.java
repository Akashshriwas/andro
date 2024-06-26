package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.Loader;
import android.support.v4.util.DebugUtils;
import android.support.v4.util.SparseArrayCompat;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

class LoaderManagerImpl extends LoaderManager {
   static boolean DEBUG = false;
   static final String TAG = "LoaderManager";
   FragmentActivity mActivity;
   boolean mCreatingLoader;
   final SparseArrayCompat mInactiveLoaders = new SparseArrayCompat();
   final SparseArrayCompat mLoaders = new SparseArrayCompat();
   boolean mRetaining;
   boolean mRetainingStarted;
   boolean mStarted;
   final String mWho;

   LoaderManagerImpl(String var1, FragmentActivity var2, boolean var3) {
      this.mWho = var1;
      this.mActivity = var2;
      this.mStarted = var3;
   }

   private LoaderManagerImpl.LoaderInfo createAndInstallLoader(int var1, Bundle var2, LoaderManager.LoaderCallbacks var3) {
      LoaderManagerImpl.LoaderInfo var6;
      try {
         this.mCreatingLoader = true;
         var6 = this.createLoader(var1, var2, var3);
         this.installLoader(var6);
      } finally {
         this.mCreatingLoader = false;
      }

      return var6;
   }

   private LoaderManagerImpl.LoaderInfo createLoader(int var1, Bundle var2, LoaderManager.LoaderCallbacks var3) {
      LoaderManagerImpl.LoaderInfo var4 = new LoaderManagerImpl.LoaderInfo(var1, var2, var3);
      var4.mLoader = var3.onCreateLoader(var1, var2);
      return var4;
   }

   public void destroyLoader(int var1) {
      if (this.mCreatingLoader) {
         throw new IllegalStateException("Called while creating a loader");
      } else {
         if (DEBUG) {
            Log.v("LoaderManager", "destroyLoader in " + this + " of " + var1);
         }

         int var2 = this.mLoaders.indexOfKey(var1);
         LoaderManagerImpl.LoaderInfo var3;
         if (var2 >= 0) {
            var3 = (LoaderManagerImpl.LoaderInfo)this.mLoaders.valueAt(var2);
            this.mLoaders.removeAt(var2);
            var3.destroy();
         }

         var1 = this.mInactiveLoaders.indexOfKey(var1);
         if (var1 >= 0) {
            var3 = (LoaderManagerImpl.LoaderInfo)this.mInactiveLoaders.valueAt(var1);
            this.mInactiveLoaders.removeAt(var1);
            var3.destroy();
         }

         if (this.mActivity != null && !this.hasRunningLoaders()) {
            this.mActivity.mFragments.startPendingDeferredFragments();
         }

      }
   }

   void doDestroy() {
      int var1;
      if (!this.mRetaining) {
         if (DEBUG) {
            Log.v("LoaderManager", "Destroying Active in " + this);
         }

         for(var1 = this.mLoaders.size() - 1; var1 >= 0; --var1) {
            ((LoaderManagerImpl.LoaderInfo)this.mLoaders.valueAt(var1)).destroy();
         }

         this.mLoaders.clear();
      }

      if (DEBUG) {
         Log.v("LoaderManager", "Destroying Inactive in " + this);
      }

      for(var1 = this.mInactiveLoaders.size() - 1; var1 >= 0; --var1) {
         ((LoaderManagerImpl.LoaderInfo)this.mInactiveLoaders.valueAt(var1)).destroy();
      }

      this.mInactiveLoaders.clear();
   }

   void doReportNextStart() {
      for(int var1 = this.mLoaders.size() - 1; var1 >= 0; --var1) {
         ((LoaderManagerImpl.LoaderInfo)this.mLoaders.valueAt(var1)).mReportNextStart = true;
      }

   }

   void doReportStart() {
      for(int var1 = this.mLoaders.size() - 1; var1 >= 0; --var1) {
         ((LoaderManagerImpl.LoaderInfo)this.mLoaders.valueAt(var1)).reportStart();
      }

   }

   void doRetain() {
      if (DEBUG) {
         Log.v("LoaderManager", "Retaining in " + this);
      }

      if (!this.mStarted) {
         RuntimeException var2 = new RuntimeException("here");
         var2.fillInStackTrace();
         Log.w("LoaderManager", "Called doRetain when not started: " + this, var2);
      } else {
         this.mRetaining = true;
         this.mStarted = false;

         for(int var1 = this.mLoaders.size() - 1; var1 >= 0; --var1) {
            ((LoaderManagerImpl.LoaderInfo)this.mLoaders.valueAt(var1)).retain();
         }
      }

   }

   void doStart() {
      if (DEBUG) {
         Log.v("LoaderManager", "Starting in " + this);
      }

      if (this.mStarted) {
         RuntimeException var2 = new RuntimeException("here");
         var2.fillInStackTrace();
         Log.w("LoaderManager", "Called doStart when already started: " + this, var2);
      } else {
         this.mStarted = true;

         for(int var1 = this.mLoaders.size() - 1; var1 >= 0; --var1) {
            ((LoaderManagerImpl.LoaderInfo)this.mLoaders.valueAt(var1)).start();
         }
      }

   }

   void doStop() {
      if (DEBUG) {
         Log.v("LoaderManager", "Stopping in " + this);
      }

      if (!this.mStarted) {
         RuntimeException var2 = new RuntimeException("here");
         var2.fillInStackTrace();
         Log.w("LoaderManager", "Called doStop when not started: " + this, var2);
      } else {
         for(int var1 = this.mLoaders.size() - 1; var1 >= 0; --var1) {
            ((LoaderManagerImpl.LoaderInfo)this.mLoaders.valueAt(var1)).stop();
         }

         this.mStarted = false;
      }
   }

   public void dump(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      int var5;
      String var6;
      LoaderManagerImpl.LoaderInfo var7;
      if (this.mLoaders.size() > 0) {
         var3.print(var1);
         var3.println("Active Loaders:");
         var6 = var1 + "    ";

         for(var5 = 0; var5 < this.mLoaders.size(); ++var5) {
            var7 = (LoaderManagerImpl.LoaderInfo)this.mLoaders.valueAt(var5);
            var3.print(var1);
            var3.print("  #");
            var3.print(this.mLoaders.keyAt(var5));
            var3.print(": ");
            var3.println(var7.toString());
            var7.dump(var6, var2, var3, var4);
         }
      }

      if (this.mInactiveLoaders.size() > 0) {
         var3.print(var1);
         var3.println("Inactive Loaders:");
         var6 = var1 + "    ";

         for(var5 = 0; var5 < this.mInactiveLoaders.size(); ++var5) {
            var7 = (LoaderManagerImpl.LoaderInfo)this.mInactiveLoaders.valueAt(var5);
            var3.print(var1);
            var3.print("  #");
            var3.print(this.mInactiveLoaders.keyAt(var5));
            var3.print(": ");
            var3.println(var7.toString());
            var7.dump(var6, var2, var3, var4);
         }
      }

   }

   void finishRetain() {
      if (this.mRetaining) {
         if (DEBUG) {
            Log.v("LoaderManager", "Finished Retaining in " + this);
         }

         this.mRetaining = false;

         for(int var1 = this.mLoaders.size() - 1; var1 >= 0; --var1) {
            ((LoaderManagerImpl.LoaderInfo)this.mLoaders.valueAt(var1)).finishRetain();
         }
      }

   }

   public Loader getLoader(int var1) {
      if (this.mCreatingLoader) {
         throw new IllegalStateException("Called while creating a loader");
      } else {
         LoaderManagerImpl.LoaderInfo var2 = (LoaderManagerImpl.LoaderInfo)this.mLoaders.get(var1);
         if (var2 != null) {
            return var2.mPendingLoader != null ? var2.mPendingLoader.mLoader : var2.mLoader;
         } else {
            return null;
         }
      }
   }

   public boolean hasRunningLoaders() {
      boolean var4 = false;
      int var3 = this.mLoaders.size();

      for(int var1 = 0; var1 < var3; ++var1) {
         LoaderManagerImpl.LoaderInfo var5 = (LoaderManagerImpl.LoaderInfo)this.mLoaders.valueAt(var1);
         boolean var2;
         if (var5.mStarted && !var5.mDeliveredData) {
            var2 = true;
         } else {
            var2 = false;
         }

         var4 |= var2;
      }

      return var4;
   }

   public Loader initLoader(int var1, Bundle var2, LoaderManager.LoaderCallbacks var3) {
      if (this.mCreatingLoader) {
         throw new IllegalStateException("Called while creating a loader");
      } else {
         LoaderManagerImpl.LoaderInfo var4 = (LoaderManagerImpl.LoaderInfo)this.mLoaders.get(var1);
         if (DEBUG) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + var2);
         }

         LoaderManagerImpl.LoaderInfo var5;
         if (var4 == null) {
            LoaderManagerImpl.LoaderInfo var6 = this.createAndInstallLoader(var1, var2, var3);
            var5 = var6;
            if (DEBUG) {
               Log.v("LoaderManager", "  Created new loader " + var6);
               var5 = var6;
            }
         } else {
            if (DEBUG) {
               Log.v("LoaderManager", "  Re-using existing loader " + var4);
            }

            var4.mCallbacks = var3;
            var5 = var4;
         }

         if (var5.mHaveData && this.mStarted) {
            var5.callOnLoadFinished(var5.mLoader, var5.mData);
         }

         return var5.mLoader;
      }
   }

   void installLoader(LoaderManagerImpl.LoaderInfo var1) {
      this.mLoaders.put(var1.mId, var1);
      if (this.mStarted) {
         var1.start();
      }

   }

   public Loader restartLoader(int var1, Bundle var2, LoaderManager.LoaderCallbacks var3) {
      if (this.mCreatingLoader) {
         throw new IllegalStateException("Called while creating a loader");
      } else {
         LoaderManagerImpl.LoaderInfo var4 = (LoaderManagerImpl.LoaderInfo)this.mLoaders.get(var1);
         if (DEBUG) {
            Log.v("LoaderManager", "restartLoader in " + this + ": args=" + var2);
         }

         if (var4 != null) {
            LoaderManagerImpl.LoaderInfo var5 = (LoaderManagerImpl.LoaderInfo)this.mInactiveLoaders.get(var1);
            if (var5 != null) {
               if (var4.mHaveData) {
                  if (DEBUG) {
                     Log.v("LoaderManager", "  Removing last inactive loader: " + var4);
                  }

                  var5.mDeliveredData = false;
                  var5.destroy();
                  var4.mLoader.abandon();
                  this.mInactiveLoaders.put(var1, var4);
               } else {
                  if (var4.mStarted) {
                     if (var4.mPendingLoader != null) {
                        if (DEBUG) {
                           Log.v("LoaderManager", "  Removing pending loader: " + var4.mPendingLoader);
                        }

                        var4.mPendingLoader.destroy();
                        var4.mPendingLoader = null;
                     }

                     if (DEBUG) {
                        Log.v("LoaderManager", "  Enqueuing as new pending loader");
                     }

                     var4.mPendingLoader = this.createLoader(var1, var2, var3);
                     return var4.mPendingLoader.mLoader;
                  }

                  if (DEBUG) {
                     Log.v("LoaderManager", "  Current loader is stopped; replacing");
                  }

                  this.mLoaders.put(var1, (Object)null);
                  var4.destroy();
               }
            } else {
               if (DEBUG) {
                  Log.v("LoaderManager", "  Making last loader inactive: " + var4);
               }

               var4.mLoader.abandon();
               this.mInactiveLoaders.put(var1, var4);
            }
         }

         return this.createAndInstallLoader(var1, var2, var3).mLoader;
      }
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder(128);
      var1.append("LoaderManager{");
      var1.append(Integer.toHexString(System.identityHashCode(this)));
      var1.append(" in ");
      DebugUtils.buildShortClassTag(this.mActivity, var1);
      var1.append("}}");
      return var1.toString();
   }

   void updateActivity(FragmentActivity var1) {
      this.mActivity = var1;
   }

   final class LoaderInfo implements Loader.OnLoadCompleteListener {
      final Bundle mArgs;
      LoaderManager.LoaderCallbacks mCallbacks;
      Object mData;
      boolean mDeliveredData;
      boolean mDestroyed;
      boolean mHaveData;
      final int mId;
      boolean mListenerRegistered;
      Loader mLoader;
      LoaderManagerImpl.LoaderInfo mPendingLoader;
      boolean mReportNextStart;
      boolean mRetaining;
      boolean mRetainingStarted;
      boolean mStarted;

      public LoaderInfo(int var2, Bundle var3, LoaderManager.LoaderCallbacks var4) {
         this.mId = var2;
         this.mArgs = var3;
         this.mCallbacks = var4;
      }

      void callOnLoadFinished(Loader var1, Object var2) {
         if (this.mCallbacks != null) {
            String var3 = null;
            if (LoaderManagerImpl.this.mActivity != null) {
               var3 = LoaderManagerImpl.this.mActivity.mFragments.mNoTransactionsBecause;
               LoaderManagerImpl.this.mActivity.mFragments.mNoTransactionsBecause = "onLoadFinished";
            }

            try {
               if (LoaderManagerImpl.DEBUG) {
                  Log.v("LoaderManager", "  onLoadFinished in " + var1 + ": " + var1.dataToString(var2));
               }

               this.mCallbacks.onLoadFinished(var1, var2);
            } finally {
               if (LoaderManagerImpl.this.mActivity != null) {
                  LoaderManagerImpl.this.mActivity.mFragments.mNoTransactionsBecause = var3;
               }

            }

            this.mDeliveredData = true;
         }

      }

      void destroy() {
         if (LoaderManagerImpl.DEBUG) {
            Log.v("LoaderManager", "  Destroying: " + this);
         }

         this.mDestroyed = true;
         boolean var1 = this.mDeliveredData;
         this.mDeliveredData = false;
         if (this.mCallbacks != null && this.mLoader != null && this.mHaveData && var1) {
            if (LoaderManagerImpl.DEBUG) {
               Log.v("LoaderManager", "  Reseting: " + this);
            }

            String var2 = null;
            if (LoaderManagerImpl.this.mActivity != null) {
               var2 = LoaderManagerImpl.this.mActivity.mFragments.mNoTransactionsBecause;
               LoaderManagerImpl.this.mActivity.mFragments.mNoTransactionsBecause = "onLoaderReset";
            }

            try {
               this.mCallbacks.onLoaderReset(this.mLoader);
            } finally {
               if (LoaderManagerImpl.this.mActivity != null) {
                  LoaderManagerImpl.this.mActivity.mFragments.mNoTransactionsBecause = var2;
               }

            }
         }

         this.mCallbacks = null;
         this.mData = null;
         this.mHaveData = false;
         if (this.mLoader != null) {
            if (this.mListenerRegistered) {
               this.mListenerRegistered = false;
               this.mLoader.unregisterListener(this);
            }

            this.mLoader.reset();
         }

         if (this.mPendingLoader != null) {
            this.mPendingLoader.destroy();
         }

      }

      public void dump(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
         var3.print(var1);
         var3.print("mId=");
         var3.print(this.mId);
         var3.print(" mArgs=");
         var3.println(this.mArgs);
         var3.print(var1);
         var3.print("mCallbacks=");
         var3.println(this.mCallbacks);
         var3.print(var1);
         var3.print("mLoader=");
         var3.println(this.mLoader);
         if (this.mLoader != null) {
            this.mLoader.dump(var1 + "  ", var2, var3, var4);
         }

         if (this.mHaveData || this.mDeliveredData) {
            var3.print(var1);
            var3.print("mHaveData=");
            var3.print(this.mHaveData);
            var3.print("  mDeliveredData=");
            var3.println(this.mDeliveredData);
            var3.print(var1);
            var3.print("mData=");
            var3.println(this.mData);
         }

         var3.print(var1);
         var3.print("mStarted=");
         var3.print(this.mStarted);
         var3.print(" mReportNextStart=");
         var3.print(this.mReportNextStart);
         var3.print(" mDestroyed=");
         var3.println(this.mDestroyed);
         var3.print(var1);
         var3.print("mRetaining=");
         var3.print(this.mRetaining);
         var3.print(" mRetainingStarted=");
         var3.print(this.mRetainingStarted);
         var3.print(" mListenerRegistered=");
         var3.println(this.mListenerRegistered);
         if (this.mPendingLoader != null) {
            var3.print(var1);
            var3.println("Pending Loader ");
            var3.print(this.mPendingLoader);
            var3.println(":");
            this.mPendingLoader.dump(var1 + "  ", var2, var3, var4);
         }

      }

      void finishRetain() {
         if (this.mRetaining) {
            if (LoaderManagerImpl.DEBUG) {
               Log.v("LoaderManager", "  Finished Retaining: " + this);
            }

            this.mRetaining = false;
            if (this.mStarted != this.mRetainingStarted && !this.mStarted) {
               this.stop();
            }
         }

         if (this.mStarted && this.mHaveData && !this.mReportNextStart) {
            this.callOnLoadFinished(this.mLoader, this.mData);
         }

      }

      public void onLoadComplete(Loader var1, Object var2) {
         if (LoaderManagerImpl.DEBUG) {
            Log.v("LoaderManager", "onLoadComplete: " + this);
         }

         if (this.mDestroyed) {
            if (LoaderManagerImpl.DEBUG) {
               Log.v("LoaderManager", "  Ignoring load complete -- destroyed");
            }
         } else if (LoaderManagerImpl.this.mLoaders.get(this.mId) != this) {
            if (LoaderManagerImpl.DEBUG) {
               Log.v("LoaderManager", "  Ignoring load complete -- not active");
               return;
            }
         } else {
            LoaderManagerImpl.LoaderInfo var3 = this.mPendingLoader;
            if (var3 != null) {
               if (LoaderManagerImpl.DEBUG) {
                  Log.v("LoaderManager", "  Switching to pending loader: " + var3);
               }

               this.mPendingLoader = null;
               LoaderManagerImpl.this.mLoaders.put(this.mId, (Object)null);
               this.destroy();
               LoaderManagerImpl.this.installLoader(var3);
               return;
            }

            if (this.mData != var2 || !this.mHaveData) {
               this.mData = var2;
               this.mHaveData = true;
               if (this.mStarted) {
                  this.callOnLoadFinished(var1, var2);
               }
            }

            LoaderManagerImpl.LoaderInfo var4 = (LoaderManagerImpl.LoaderInfo)LoaderManagerImpl.this.mInactiveLoaders.get(this.mId);
            if (var4 != null && var4 != this) {
               var4.mDeliveredData = false;
               var4.destroy();
               LoaderManagerImpl.this.mInactiveLoaders.remove(this.mId);
            }

            if (LoaderManagerImpl.this.mActivity != null && !LoaderManagerImpl.this.hasRunningLoaders()) {
               LoaderManagerImpl.this.mActivity.mFragments.startPendingDeferredFragments();
               return;
            }
         }

      }

      void reportStart() {
         if (this.mStarted && this.mReportNextStart) {
            this.mReportNextStart = false;
            if (this.mHaveData) {
               this.callOnLoadFinished(this.mLoader, this.mData);
            }
         }

      }

      void retain() {
         if (LoaderManagerImpl.DEBUG) {
            Log.v("LoaderManager", "  Retaining: " + this);
         }

         this.mRetaining = true;
         this.mRetainingStarted = this.mStarted;
         this.mStarted = false;
         this.mCallbacks = null;
      }

      void start() {
         if (this.mRetaining && this.mRetainingStarted) {
            this.mStarted = true;
         } else if (!this.mStarted) {
            this.mStarted = true;
            if (LoaderManagerImpl.DEBUG) {
               Log.v("LoaderManager", "  Starting: " + this);
            }

            if (this.mLoader == null && this.mCallbacks != null) {
               this.mLoader = this.mCallbacks.onCreateLoader(this.mId, this.mArgs);
            }

            if (this.mLoader != null) {
               if (this.mLoader.getClass().isMemberClass() && !Modifier.isStatic(this.mLoader.getClass().getModifiers())) {
                  throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.mLoader);
               }

               if (!this.mListenerRegistered) {
                  this.mLoader.registerListener(this.mId, this);
                  this.mListenerRegistered = true;
               }

               this.mLoader.startLoading();
               return;
            }
         }

      }

      void stop() {
         if (LoaderManagerImpl.DEBUG) {
            Log.v("LoaderManager", "  Stopping: " + this);
         }

         this.mStarted = false;
         if (!this.mRetaining && this.mLoader != null && this.mListenerRegistered) {
            this.mListenerRegistered = false;
            this.mLoader.unregisterListener(this);
            this.mLoader.stopLoading();
         }

      }

      public String toString() {
         StringBuilder var1 = new StringBuilder(64);
         var1.append("LoaderInfo{");
         var1.append(Integer.toHexString(System.identityHashCode(this)));
         var1.append(" #");
         var1.append(this.mId);
         var1.append(" : ");
         DebugUtils.buildShortClassTag(this.mLoader, var1);
         var1.append("}}");
         return var1.toString();
      }
   }
}
