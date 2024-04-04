/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.content.res.TypedArray
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Message
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.KeyEvent
 *  android.view.LayoutInflater
 *  android.view.LayoutInflater$Factory
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.HashMap
 */
package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.v4.app.ActivityCompatHoneycomb;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentManagerImpl;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.LoaderManagerImpl;
import android.support.v4.util.SparseArrayCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class FragmentActivity
extends Activity {
    private static final String FRAGMENTS_TAG = "android:support:fragments";
    private static final int HONEYCOMB = 11;
    static final int MSG_REALLY_STOPPED = 1;
    static final int MSG_RESUME_PENDING = 2;
    private static final String TAG = "FragmentActivity";
    SparseArrayCompat<LoaderManagerImpl> mAllLoaderManagers;
    boolean mCheckedForLoaderManager;
    boolean mCreated;
    final FragmentManagerImpl mFragments;
    final Handler mHandler;
    LoaderManagerImpl mLoaderManager;
    boolean mLoadersStarted;
    boolean mOptionsMenuInvalidated;
    boolean mReallyStopped;
    boolean mResumed;
    boolean mRetaining;
    boolean mStopped;

    public FragmentActivity() {
        this.mHandler = new Handler(){

            /*
             * Enabled aggressive block sorting
             */
            public void handleMessage(Message message) {
                switch (message.what) {
                    default: {
                        super.handleMessage(message);
                        return;
                    }
                    case 1: {
                        if (!FragmentActivity.this.mStopped) return;
                        {
                            FragmentActivity.this.doReallyStop(false);
                            return;
                        }
                    }
                    case 2: 
                }
                FragmentActivity.this.onResumeFragments();
                FragmentActivity.this.mFragments.execPendingActions();
            }
        };
        this.mFragments = new FragmentManagerImpl();
    }

    void doReallyStop(boolean bl) {
        if (!this.mReallyStopped) {
            this.mReallyStopped = true;
            this.mRetaining = bl;
            this.mHandler.removeMessages(1);
            this.onReallyStop();
        }
    }

    public void dump(String string2, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
        if (Build.VERSION.SDK_INT >= 11) {
            // empty if block
        }
        printWriter.print(string2);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString((int)System.identityHashCode((Object)((Object)this))));
        printWriter.println(" State:");
        String string3 = string2 + "  ";
        printWriter.print(string3);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print("mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.mReallyStopped);
        printWriter.print(string3);
        printWriter.print("mLoadersStarted=");
        printWriter.println(this.mLoadersStarted);
        if (this.mLoaderManager != null) {
            printWriter.print(string2);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString((int)System.identityHashCode((Object)this.mLoaderManager)));
            printWriter.println(":");
            this.mLoaderManager.dump(string2 + "  ", fileDescriptor, printWriter, arrstring);
        }
        this.mFragments.dump(string2, fileDescriptor, printWriter, arrstring);
    }

    public Object getLastCustomNonConfigurationInstance() {
        NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances)this.getLastNonConfigurationInstance();
        if (nonConfigurationInstances != null) {
            return nonConfigurationInstances.custom;
        }
        return null;
    }

    LoaderManagerImpl getLoaderManager(int n, boolean bl, boolean bl2) {
        LoaderManagerImpl loaderManagerImpl;
        if (this.mAllLoaderManagers == null) {
            this.mAllLoaderManagers = new SparseArrayCompat();
        }
        if ((loaderManagerImpl = this.mAllLoaderManagers.get(n)) == null) {
            if (bl2) {
                loaderManagerImpl = new LoaderManagerImpl(this, bl);
                this.mAllLoaderManagers.put(n, loaderManagerImpl);
            }
            return loaderManagerImpl;
        }
        loaderManagerImpl.updateActivity(this);
        return loaderManagerImpl;
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments;
    }

    public LoaderManager getSupportLoaderManager() {
        if (this.mLoaderManager != null) {
            return this.mLoaderManager;
        }
        this.mCheckedForLoaderManager = true;
        this.mLoaderManager = this.getLoaderManager(-1, this.mLoadersStarted, true);
        return this.mLoaderManager;
    }

    void invalidateSupportFragmentIndex(int n) {
        LoaderManagerImpl loaderManagerImpl;
        if (this.mAllLoaderManagers != null && (loaderManagerImpl = this.mAllLoaderManagers.get(n)) != null && !loaderManagerImpl.mRetaining) {
            loaderManagerImpl.doDestroy();
            this.mAllLoaderManagers.remove(n);
        }
    }

    protected void onActivityResult(int n, int n2, Intent intent) {
        int n3 = n >> 16;
        if (n3 != 0) {
            if (this.mFragments.mActive == null || n3 < 0 || --n3 >= this.mFragments.mActive.size()) {
                Log.w((String)"FragmentActivity", (String)("Activity result fragment index out of range: 0x" + Integer.toHexString((int)n)));
                return;
            }
            Fragment fragment = (Fragment)this.mFragments.mActive.get(n3);
            if (fragment == null) {
                Log.w((String)"FragmentActivity", (String)("Activity result no fragment exists for index: 0x" + Integer.toHexString((int)n)));
                return;
            }
            fragment.onActivityResult(65535 & n, n2, intent);
            return;
        }
        super.onActivityResult(n, n2, intent);
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public void onBackPressed() {
        if (!this.mFragments.popBackStackImmediate()) {
            this.finish();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.dispatchConfigurationChanged(configuration);
    }

    /*
     * Enabled aggressive block sorting
     */
    protected void onCreate(Bundle arrayList) {
        this.mFragments.attachActivity(this);
        if (this.getLayoutInflater().getFactory() == null) {
            this.getLayoutInflater().setFactory((LayoutInflater.Factory)this);
        }
        super.onCreate(arrayList);
        NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances)this.getLastNonConfigurationInstance();
        if (nonConfigurationInstances != null) {
            this.mAllLoaderManagers = nonConfigurationInstances.loaders;
        }
        if (arrayList != null) {
            Parcelable parcelable = arrayList.getParcelable("android:support:fragments");
            FragmentManagerImpl fragmentManagerImpl = this.mFragments;
            arrayList = nonConfigurationInstances != null ? nonConfigurationInstances.fragments : null;
            fragmentManagerImpl.restoreAllState(parcelable, arrayList);
        }
        this.mFragments.dispatchCreate();
    }

    public boolean onCreatePanelMenu(int n, Menu menu2) {
        if (n == 0) {
            boolean bl = super.onCreatePanelMenu(n, menu2);
            boolean bl2 = this.mFragments.dispatchCreateOptionsMenu(menu2, this.getMenuInflater());
            if (Build.VERSION.SDK_INT >= 11) {
                return bl | bl2;
            }
            return true;
        }
        return super.onCreatePanelMenu(n, menu2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public View onCreateView(String object, Context object2, AttributeSet attributeSet) {
        Object var7_4 = null;
        if (!"fragment".equals(object)) {
            return super.onCreateView((String)object, (Context)object2, attributeSet);
        }
        object = attributeSet.getAttributeValue(null, "class");
        object2 = object2.obtainStyledAttributes(attributeSet, FragmentTag.Fragment);
        Object object3 = object;
        if (object == null) {
            object3 = object2.getString(0);
        }
        int n = object2.getResourceId(1, -1);
        String string2 = object2.getString(2);
        object2.recycle();
        if (false) {
            throw new NullPointerException();
        }
        if (-1 == 0 && n == -1 && string2 == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + (String)object3);
        }
        object2 = var7_4;
        if (n != -1) {
            object2 = this.mFragments.findFragmentById(n);
        }
        object = object2;
        if (object2 == null) {
            object = object2;
            if (string2 != null) {
                object = this.mFragments.findFragmentByTag(string2);
            }
        }
        object2 = object;
        if (object == null) {
            object2 = object;
            if (-1 != 0) {
                object2 = this.mFragments.findFragmentById(0);
            }
        }
        if (FragmentManagerImpl.DEBUG) {
            Log.v((String)"FragmentActivity", (String)("onCreateView: id=0x" + Integer.toHexString((int)n) + " fname=" + (String)object3 + " existing=" + object2));
        }
        if (object2 == null) {
            object2 = Fragment.instantiate((Context)this, (String)object3);
            object2.mFromLayout = true;
            int n2 = n != 0 ? n : 0;
            object2.mFragmentId = n2;
            object2.mContainerId = 0;
            object2.mTag = string2;
            object2.mInLayout = true;
            object2.mFragmentManager = this.mFragments;
            object2.onInflate(this, attributeSet, object2.mSavedFragmentState);
            this.mFragments.addFragment((Fragment)object2, true);
        } else {
            if (object2.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString((int)n) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString((int)0) + " with another fragment for " + (String)object3);
            }
            object2.mInLayout = true;
            if (!object2.mRetaining) {
                object2.onInflate(this, attributeSet, object2.mSavedFragmentState);
            }
            this.mFragments.moveToState((Fragment)object2);
        }
        if (object2.mView == null) {
            throw new IllegalStateException("Fragment " + (String)object3 + " did not create a view.");
        }
        if (n != 0) {
            object2.mView.setId(n);
        }
        if (object2.mView.getTag() == null) {
            object2.mView.setTag((Object)string2);
        }
        return object2.mView;
    }

    protected void onDestroy() {
        super.onDestroy();
        this.doReallyStop(false);
        this.mFragments.dispatchDestroy();
        if (this.mLoaderManager != null) {
            this.mLoaderManager.doDestroy();
        }
    }

    public boolean onKeyDown(int n, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT < 5 && n == 4 && keyEvent.getRepeatCount() == 0) {
            this.onBackPressed();
            return true;
        }
        return super.onKeyDown(n, keyEvent);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.dispatchLowMemory();
    }

    public boolean onMenuItemSelected(int n, MenuItem menuItem) {
        if (super.onMenuItemSelected(n, menuItem)) {
            return true;
        }
        switch (n) {
            default: {
                return false;
            }
            case 0: {
                return this.mFragments.dispatchOptionsItemSelected(menuItem);
            }
            case 6: 
        }
        return this.mFragments.dispatchContextItemSelected(menuItem);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onPanelClosed(int n, Menu menu2) {
        switch (n) {
            default: {
                break;
            }
            case 0: {
                this.mFragments.dispatchOptionsMenuClosed(menu2);
            }
        }
        super.onPanelClosed(n, menu2);
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

    public boolean onPreparePanel(int n, View view, Menu menu2) {
        boolean bl = false;
        if (n == 0 && menu2 != null) {
            if (this.mOptionsMenuInvalidated) {
                this.mOptionsMenuInvalidated = false;
                menu2.clear();
                this.onCreatePanelMenu(n, menu2);
            }
            boolean bl2 = bl;
            if (super.onPreparePanel(n, view, menu2) | this.mFragments.dispatchPrepareOptionsMenu(menu2)) {
                bl2 = bl;
                if (menu2.hasVisibleItems()) {
                    bl2 = true;
                }
            }
            return bl2;
        }
        return super.onPreparePanel(n, view, menu2);
    }

    /*
     * Enabled aggressive block sorting
     */
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

    /*
     * Enabled aggressive block sorting
     */
    public final Object onRetainNonConfigurationInstance() {
        Object object;
        if (this.mStopped) {
            this.doReallyStop(true);
        }
        Object object2 = this.onRetainCustomNonConfigurationInstance();
        ArrayList<Fragment> arrayList = this.mFragments.retainNonConfig();
        boolean bl = false;
        boolean bl2 = false;
        if (this.mAllLoaderManagers != null) {
            int n = this.mAllLoaderManagers.size() - 1;
            do {
                bl = bl2;
                if (n < 0) break;
                object = this.mAllLoaderManagers.valueAt(n);
                if (object.mRetaining) {
                    bl2 = true;
                } else {
                    object.doDestroy();
                    this.mAllLoaderManagers.removeAt(n);
                }
                --n;
            } while (true);
        }
        if (arrayList == null && !bl && object2 == null) {
            return null;
        }
        object = new NonConfigurationInstances();
        object.activity = null;
        object.custom = object2;
        object.children = null;
        object.fragments = arrayList;
        object.loaders = this.mAllLoaderManagers;
        return object;
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Parcelable parcelable = this.mFragments.saveAllState();
        if (parcelable != null) {
            bundle.putParcelable("android:support:fragments", parcelable);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
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
            for (int i = this.mAllLoaderManagers.size() - 1; i >= 0; --i) {
                LoaderManagerImpl loaderManagerImpl = this.mAllLoaderManagers.valueAt(i);
                loaderManagerImpl.finishRetain();
                loaderManagerImpl.doReportStart();
            }
        }
    }

    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        this.mHandler.sendEmptyMessage(1);
        this.mFragments.dispatchStop();
    }

    public void startActivityForResult(Intent intent, int n) {
        if (n != -1 && (-65536 & n) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
        super.startActivityForResult(intent, n);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int n) {
        if (n == -1) {
            super.startActivityForResult(intent, -1);
            return;
        }
        if ((-65536 & n) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
        super.startActivityForResult(intent, (fragment.mIndex + 1 << 16) + (65535 & n));
    }

    public void supportInvalidateOptionsMenu() {
        if (Build.VERSION.SDK_INT >= 11) {
            ActivityCompatHoneycomb.invalidateOptionsMenu(this);
            return;
        }
        this.mOptionsMenuInvalidated = true;
    }

    static class FragmentTag {
        public static final int[] Fragment = new int[]{16842755, 16842960, 16842961};
        public static final int Fragment_id = 1;
        public static final int Fragment_name = 0;
        public static final int Fragment_tag = 2;

        FragmentTag() {
        }
    }

    static final class NonConfigurationInstances {
        Object activity;
        HashMap<String, Object> children;
        Object custom;
        ArrayList<Fragment> fragments;
        SparseArrayCompat<LoaderManagerImpl> loaders;

        NonConfigurationInstances() {
        }
    }

}

