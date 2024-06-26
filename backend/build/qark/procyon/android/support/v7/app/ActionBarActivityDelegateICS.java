// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v7.app;

import android.view.WindowManager$LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ActionMode$Callback;
import android.view.MenuItem;
import android.support.v7.internal.view.menu.MenuWrapperFactory;
import android.view.Window;
import android.os.Bundle;
import android.content.res.Configuration;
import android.view.Window$Callback;
import android.app.Activity;
import android.support.v7.internal.view.ActionModeWrapper;
import android.support.v7.view.ActionMode;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.Menu;

class ActionBarActivityDelegateICS extends ActionBarActivityDelegate
{
    Menu mMenu;
    
    ActionBarActivityDelegateICS(final ActionBarActivity actionBarActivity) {
        super(actionBarActivity);
    }
    
    public void addContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.mActivity.superAddContentView(view, viewGroup$LayoutParams);
    }
    
    ActionModeWrapper.CallbackWrapper createActionModeCallbackWrapper(final Context context, final ActionMode.Callback callback) {
        return new ActionModeWrapper.CallbackWrapper(context, callback);
    }
    
    ActionModeWrapper createActionModeWrapper(final Context context, final android.view.ActionMode actionMode) {
        return new ActionModeWrapper(context, actionMode);
    }
    
    public ActionBar createSupportActionBar() {
        return new ActionBarImplICS(this.mActivity, this.mActivity);
    }
    
    Window$Callback createWindowCallbackWrapper(final Window$Callback window$Callback) {
        return (Window$Callback)new WindowCallbackWrapper(window$Callback);
    }
    
    @Override
    int getHomeAsUpIndicatorAttrId() {
        return 16843531;
    }
    
    public void onActionModeFinished(final android.view.ActionMode actionMode) {
        this.mActivity.onSupportActionModeFinished(this.createActionModeWrapper(this.getActionBarThemedContext(), actionMode));
    }
    
    public void onActionModeStarted(final android.view.ActionMode actionMode) {
        this.mActivity.onSupportActionModeStarted(this.createActionModeWrapper(this.getActionBarThemedContext(), actionMode));
    }
    
    public boolean onBackPressed() {
        return false;
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
    }
    
    public void onContentChanged() {
        this.mActivity.onSupportContentChanged();
    }
    
    public void onCreate(final Bundle bundle) {
        if ("splitActionBarWhenNarrow".equals(this.getUiOptionsFromMetadata())) {
            this.mActivity.getWindow().setUiOptions(1, 1);
        }
        super.onCreate(bundle);
        if (this.mHasActionBar) {
            this.mActivity.requestWindowFeature(8);
        }
        if (this.mOverlayActionBar) {
            this.mActivity.requestWindowFeature(9);
        }
        final Window window = this.mActivity.getWindow();
        window.setCallback(this.createWindowCallbackWrapper(window.getCallback()));
    }
    
    public boolean onCreatePanelMenu(final int n, final Menu menu) {
        if (n == 0 || n == 8) {
            if (this.mMenu == null) {
                this.mMenu = MenuWrapperFactory.createMenuWrapper(menu);
            }
            return this.mActivity.superOnCreatePanelMenu(n, this.mMenu);
        }
        return this.mActivity.superOnCreatePanelMenu(n, menu);
    }
    
    public View onCreatePanelView(final int n) {
        return null;
    }
    
    public boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        MenuItem menuItemWrapper = menuItem;
        if (n == 0) {
            menuItemWrapper = MenuWrapperFactory.createMenuItemWrapper(menuItem);
        }
        return this.mActivity.superOnMenuItemSelected(n, menuItemWrapper);
    }
    
    public void onPostResume() {
    }
    
    public boolean onPreparePanel(final int n, final View view, final Menu menu) {
        if (n == 0 || n == 8) {
            return this.mActivity.superOnPreparePanel(n, view, this.mMenu);
        }
        return this.mActivity.superOnPreparePanel(n, view, menu);
    }
    
    public void onStop() {
    }
    
    public void onTitleChanged(final CharSequence charSequence) {
    }
    
    public void setContentView(final int n) {
        this.mActivity.superSetContentView(n);
    }
    
    public void setContentView(final View view) {
        this.mActivity.superSetContentView(view);
    }
    
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.mActivity.superSetContentView(view, viewGroup$LayoutParams);
    }
    
    @Override
    void setSupportProgress(final int progress) {
        this.mActivity.setProgress(progress);
    }
    
    @Override
    void setSupportProgressBarIndeterminate(final boolean progressBarIndeterminate) {
        this.mActivity.setProgressBarIndeterminate(progressBarIndeterminate);
    }
    
    @Override
    void setSupportProgressBarIndeterminateVisibility(final boolean progressBarIndeterminateVisibility) {
        this.mActivity.setProgressBarIndeterminateVisibility(progressBarIndeterminateVisibility);
    }
    
    @Override
    void setSupportProgressBarVisibility(final boolean progressBarVisibility) {
        this.mActivity.setProgressBarVisibility(progressBarVisibility);
    }
    
    public ActionMode startSupportActionMode(final ActionMode.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        final Context actionBarThemedContext = this.getActionBarThemedContext();
        final ActionModeWrapper.CallbackWrapper actionModeCallbackWrapper = this.createActionModeCallbackWrapper(actionBarThemedContext, callback);
        ActionModeWrapper actionModeWrapper = null;
        final android.view.ActionMode startActionMode = this.mActivity.startActionMode((ActionMode$Callback)actionModeCallbackWrapper);
        if (startActionMode != null) {
            actionModeWrapper = this.createActionModeWrapper(actionBarThemedContext, startActionMode);
            actionModeCallbackWrapper.setLastStartedActionMode(actionModeWrapper);
        }
        return actionModeWrapper;
    }
    
    public void supportInvalidateOptionsMenu() {
        this.mMenu = null;
    }
    
    public boolean supportRequestWindowFeature(final int n) {
        return this.mActivity.requestWindowFeature(n);
    }
    
    class WindowCallbackWrapper implements Window$Callback
    {
        final Window$Callback mWrapped;
        
        public WindowCallbackWrapper(final Window$Callback mWrapped) {
            this.mWrapped = mWrapped;
        }
        
        public boolean dispatchGenericMotionEvent(final MotionEvent motionEvent) {
            return this.mWrapped.dispatchGenericMotionEvent(motionEvent);
        }
        
        public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
            return this.mWrapped.dispatchKeyEvent(keyEvent);
        }
        
        public boolean dispatchKeyShortcutEvent(final KeyEvent keyEvent) {
            return this.mWrapped.dispatchKeyShortcutEvent(keyEvent);
        }
        
        public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
            return this.mWrapped.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        
        public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
            return this.mWrapped.dispatchTouchEvent(motionEvent);
        }
        
        public boolean dispatchTrackballEvent(final MotionEvent motionEvent) {
            return this.mWrapped.dispatchTrackballEvent(motionEvent);
        }
        
        public void onActionModeFinished(final android.view.ActionMode actionMode) {
            this.mWrapped.onActionModeFinished(actionMode);
            ActionBarActivityDelegateICS.this.onActionModeFinished(actionMode);
        }
        
        public void onActionModeStarted(final android.view.ActionMode actionMode) {
            this.mWrapped.onActionModeStarted(actionMode);
            ActionBarActivityDelegateICS.this.onActionModeStarted(actionMode);
        }
        
        public void onAttachedToWindow() {
            this.mWrapped.onAttachedToWindow();
        }
        
        public void onContentChanged() {
            this.mWrapped.onContentChanged();
        }
        
        public boolean onCreatePanelMenu(final int n, final Menu menu) {
            return this.mWrapped.onCreatePanelMenu(n, menu);
        }
        
        public View onCreatePanelView(final int n) {
            return this.mWrapped.onCreatePanelView(n);
        }
        
        public void onDetachedFromWindow() {
            this.mWrapped.onDetachedFromWindow();
        }
        
        public boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
            return this.mWrapped.onMenuItemSelected(n, menuItem);
        }
        
        public boolean onMenuOpened(final int n, final Menu menu) {
            return this.mWrapped.onMenuOpened(n, menu);
        }
        
        public void onPanelClosed(final int n, final Menu menu) {
            this.mWrapped.onPanelClosed(n, menu);
        }
        
        public boolean onPreparePanel(final int n, final View view, final Menu menu) {
            return this.mWrapped.onPreparePanel(n, view, menu);
        }
        
        public boolean onSearchRequested() {
            return this.mWrapped.onSearchRequested();
        }
        
        public void onWindowAttributesChanged(final WindowManager$LayoutParams windowManager$LayoutParams) {
            this.mWrapped.onWindowAttributesChanged(windowManager$LayoutParams);
        }
        
        public void onWindowFocusChanged(final boolean b) {
            this.mWrapped.onWindowFocusChanged(b);
        }
        
        public android.view.ActionMode onWindowStartingActionMode(final ActionMode$Callback actionMode$Callback) {
            return this.mWrapped.onWindowStartingActionMode(actionMode$Callback);
        }
    }
}
