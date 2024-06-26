package android.support.v7.internal.widget;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.appcompat.R$attr;
import android.support.v7.appcompat.R$styleable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

class SpinnerICS extends AbsSpinnerICS implements OnClickListener {
   private static final int MAX_ITEMS_MEASURED = 15;
   static final int MODE_DIALOG = 0;
   static final int MODE_DROPDOWN = 1;
   private static final int MODE_THEME = -1;
   private static final String TAG = "Spinner";
   int mDropDownWidth;
   private int mGravity;
   private SpinnerICS.SpinnerPopup mPopup;
   private SpinnerICS.DropDownAdapter mTempAdapter;
   private Rect mTempRect;

   SpinnerICS(Context var1) {
      this(var1, (AttributeSet)null);
   }

   SpinnerICS(Context var1, int var2) {
      this(var1, (AttributeSet)null, R$attr.spinnerStyle, var2);
   }

   SpinnerICS(Context var1, AttributeSet var2) {
      this(var1, var2, R$attr.spinnerStyle);
   }

   SpinnerICS(Context var1, AttributeSet var2, int var3) {
      this(var1, var2, var3, -1);
   }

   SpinnerICS(Context var1, AttributeSet var2, int var3, int var4) {
      super(var1, var2, var3);
      this.mTempRect = new Rect();
      TypedArray var6 = var1.obtainStyledAttributes(var2, R$styleable.Spinner, var3, 0);
      int var5 = var4;
      if (var4 == -1) {
         var5 = var6.getInt(7, 0);
      }

      switch(var5) {
      case 0:
         this.mPopup = new SpinnerICS.DialogPopup();
         break;
      case 1:
         SpinnerICS.DropdownPopup var7 = new SpinnerICS.DropdownPopup(var1, var2, var3);
         this.mDropDownWidth = var6.getLayoutDimension(3, -2);
         var7.setBackgroundDrawable(var6.getDrawable(2));
         var3 = var6.getDimensionPixelOffset(5, 0);
         if (var3 != 0) {
            var7.setVerticalOffset(var3);
         }

         var3 = var6.getDimensionPixelOffset(4, 0);
         if (var3 != 0) {
            var7.setHorizontalOffset(var3);
         }

         this.mPopup = var7;
      }

      this.mGravity = var6.getInt(0, 17);
      this.mPopup.setPromptText(var6.getString(6));
      var6.recycle();
      if (this.mTempAdapter != null) {
         this.mPopup.setAdapter(this.mTempAdapter);
         this.mTempAdapter = null;
      }

   }

   private View makeAndAddView(int var1) {
      View var2;
      if (!this.mDataChanged) {
         var2 = this.mRecycler.get(var1);
         if (var2 != null) {
            this.setUpChild(var2);
            return var2;
         }
      }

      var2 = this.mAdapter.getView(var1, (View)null, this);
      this.setUpChild(var2);
      return var2;
   }

   private void setUpChild(View var1) {
      LayoutParams var5 = var1.getLayoutParams();
      LayoutParams var4 = var5;
      if (var5 == null) {
         var4 = this.generateDefaultLayoutParams();
      }

      this.addViewInLayout(var1, 0, var4);
      var1.setSelected(this.hasFocus());
      int var2 = ViewGroup.getChildMeasureSpec(this.mHeightMeasureSpec, this.mSpinnerPadding.top + this.mSpinnerPadding.bottom, var4.height);
      var1.measure(ViewGroup.getChildMeasureSpec(this.mWidthMeasureSpec, this.mSpinnerPadding.left + this.mSpinnerPadding.right, var4.width), var2);
      var2 = this.mSpinnerPadding.top + (this.getMeasuredHeight() - this.mSpinnerPadding.bottom - this.mSpinnerPadding.top - var1.getMeasuredHeight()) / 2;
      int var3 = var1.getMeasuredHeight();
      var1.layout(0, var2, 0 + var1.getMeasuredWidth(), var2 + var3);
   }

   public int getBaseline() {
      byte var2 = -1;
      Object var5 = null;
      View var4;
      if (this.getChildCount() > 0) {
         var4 = this.getChildAt(0);
      } else {
         var4 = (View)var5;
         if (this.mAdapter != null) {
            var4 = (View)var5;
            if (this.mAdapter.getCount() > 0) {
               var4 = this.makeAndAddView(0);
               this.mRecycler.put(0, var4);
               this.removeAllViewsInLayout();
            }
         }
      }

      int var1 = var2;
      if (var4 != null) {
         int var3 = var4.getBaseline();
         var1 = var2;
         if (var3 >= 0) {
            var1 = var4.getTop() + var3;
         }
      }

      return var1;
   }

   public CharSequence getPrompt() {
      return this.mPopup.getHintText();
   }

   void layout(int var1, boolean var2) {
      int var3 = this.mSpinnerPadding.left;
      int var4 = this.getRight() - this.getLeft() - this.mSpinnerPadding.left - this.mSpinnerPadding.right;
      if (this.mDataChanged) {
         this.handleDataChanged();
      }

      if (this.mItemCount == 0) {
         this.resetList();
      } else {
         if (this.mNextSelectedPosition >= 0) {
            this.setSelectedPositionInt(this.mNextSelectedPosition);
         }

         this.recycleAllViews();
         this.removeAllViewsInLayout();
         this.mFirstPosition = this.mSelectedPosition;
         View var6 = this.makeAndAddView(this.mSelectedPosition);
         int var5 = var6.getMeasuredWidth();
         var1 = var3;
         switch(this.mGravity & 7) {
         case 1:
            var1 = var4 / 2 + var3 - var5 / 2;
            break;
         case 5:
            var1 = var3 + var4 - var5;
         }

         var6.offsetLeftAndRight(var1);
         this.mRecycler.clear();
         this.invalidate();
         this.checkSelectionChanged();
         this.mDataChanged = false;
         this.mNeedSync = false;
         this.setNextSelectedPositionInt(this.mSelectedPosition);
      }
   }

   int measureContentWidth(SpinnerAdapter var1, Drawable var2) {
      int var4;
      if (var1 == null) {
         var4 = 0;
      } else {
         int var3 = 0;
         View var11 = null;
         int var5 = 0;
         int var8 = MeasureSpec.makeMeasureSpec(0, 0);
         int var9 = MeasureSpec.makeMeasureSpec(0, 0);
         var4 = Math.max(0, this.getSelectedItemPosition());
         int var10 = Math.min(var1.getCount(), var4 + 15);

         int var6;
         for(var4 = Math.max(0, var4 - (15 - (var10 - var4))); var4 < var10; var5 = var6) {
            int var7 = var1.getItemViewType(var4);
            var6 = var5;
            if (var7 != var5) {
               var6 = var7;
               var11 = null;
            }

            var11 = var1.getView(var4, var11, this);
            if (var11.getLayoutParams() == null) {
               var11.setLayoutParams(new LayoutParams(-2, -2));
            }

            var11.measure(var8, var9);
            var3 = Math.max(var3, var11.getMeasuredWidth());
            ++var4;
         }

         var4 = var3;
         if (var2 != null) {
            var2.getPadding(this.mTempRect);
            return var3 + this.mTempRect.left + this.mTempRect.right;
         }
      }

      return var4;
   }

   public void onClick(DialogInterface var1, int var2) {
      this.setSelection(var2);
      var1.dismiss();
   }

   protected void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      if (this.mPopup != null && this.mPopup.isShowing()) {
         this.mPopup.dismiss();
      }

   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      this.mInLayout = true;
      this.layout(0, false);
      this.mInLayout = false;
   }

   protected void onMeasure(int var1, int var2) {
      super.onMeasure(var1, var2);
      if (this.mPopup != null && MeasureSpec.getMode(var1) == Integer.MIN_VALUE) {
         this.setMeasuredDimension(Math.min(Math.max(this.getMeasuredWidth(), this.measureContentWidth(this.getAdapter(), this.getBackground())), MeasureSpec.getSize(var1)), this.getMeasuredHeight());
      }

   }

   public boolean performClick() {
      boolean var2 = super.performClick();
      boolean var1 = var2;
      if (!var2) {
         var2 = true;
         var1 = var2;
         if (!this.mPopup.isShowing()) {
            this.mPopup.show();
            var1 = var2;
         }
      }

      return var1;
   }

   public void setAdapter(SpinnerAdapter var1) {
      super.setAdapter(var1);
      if (this.mPopup != null) {
         this.mPopup.setAdapter(new SpinnerICS.DropDownAdapter(var1));
      } else {
         this.mTempAdapter = new SpinnerICS.DropDownAdapter(var1);
      }
   }

   public void setGravity(int var1) {
      if (this.mGravity != var1) {
         int var2 = var1;
         if ((var1 & 7) == 0) {
            var2 = var1 | 3;
         }

         this.mGravity = var2;
         this.requestLayout();
      }

   }

   public void setOnItemClickListener(AdapterViewICS.OnItemClickListener var1) {
      throw new RuntimeException("setOnItemClickListener cannot be used with a spinner.");
   }

   void setOnItemClickListenerInt(AdapterViewICS.OnItemClickListener var1) {
      super.setOnItemClickListener(var1);
   }

   public void setPrompt(CharSequence var1) {
      this.mPopup.setPromptText(var1);
   }

   public void setPromptId(int var1) {
      this.setPrompt(this.getContext().getText(var1));
   }

   private class DialogPopup implements SpinnerICS.SpinnerPopup, OnClickListener {
      private ListAdapter mListAdapter;
      private AlertDialog mPopup;
      private CharSequence mPrompt;

      private DialogPopup() {
      }

      // $FF: synthetic method
      DialogPopup(Object var2) {
         this();
      }

      public void dismiss() {
         this.mPopup.dismiss();
         this.mPopup = null;
      }

      public CharSequence getHintText() {
         return this.mPrompt;
      }

      public boolean isShowing() {
         return this.mPopup != null ? this.mPopup.isShowing() : false;
      }

      public void onClick(DialogInterface var1, int var2) {
         SpinnerICS.this.setSelection(var2);
         if (SpinnerICS.this.mOnItemClickListener != null) {
            SpinnerICS.this.performItemClick((View)null, var2, this.mListAdapter.getItemId(var2));
         }

         this.dismiss();
      }

      public void setAdapter(ListAdapter var1) {
         this.mListAdapter = var1;
      }

      public void setPromptText(CharSequence var1) {
         this.mPrompt = var1;
      }

      public void show() {
         Builder var1 = new Builder(SpinnerICS.this.getContext());
         if (this.mPrompt != null) {
            var1.setTitle(this.mPrompt);
         }

         this.mPopup = var1.setSingleChoiceItems(this.mListAdapter, SpinnerICS.this.getSelectedItemPosition(), this).show();
      }
   }

   private static class DropDownAdapter implements ListAdapter, SpinnerAdapter {
      private SpinnerAdapter mAdapter;
      private ListAdapter mListAdapter;

      public DropDownAdapter(SpinnerAdapter var1) {
         this.mAdapter = var1;
         if (var1 instanceof ListAdapter) {
            this.mListAdapter = (ListAdapter)var1;
         }

      }

      public boolean areAllItemsEnabled() {
         ListAdapter var1 = this.mListAdapter;
         return var1 != null ? var1.areAllItemsEnabled() : true;
      }

      public int getCount() {
         return this.mAdapter == null ? 0 : this.mAdapter.getCount();
      }

      public View getDropDownView(int var1, View var2, ViewGroup var3) {
         return this.mAdapter == null ? null : this.mAdapter.getDropDownView(var1, var2, var3);
      }

      public Object getItem(int var1) {
         return this.mAdapter == null ? null : this.mAdapter.getItem(var1);
      }

      public long getItemId(int var1) {
         return this.mAdapter == null ? -1L : this.mAdapter.getItemId(var1);
      }

      public int getItemViewType(int var1) {
         return 0;
      }

      public View getView(int var1, View var2, ViewGroup var3) {
         return this.getDropDownView(var1, var2, var3);
      }

      public int getViewTypeCount() {
         return 1;
      }

      public boolean hasStableIds() {
         return this.mAdapter != null && this.mAdapter.hasStableIds();
      }

      public boolean isEmpty() {
         return this.getCount() == 0;
      }

      public boolean isEnabled(int var1) {
         ListAdapter var2 = this.mListAdapter;
         return var2 != null ? var2.isEnabled(var1) : true;
      }

      public void registerDataSetObserver(DataSetObserver var1) {
         if (this.mAdapter != null) {
            this.mAdapter.registerDataSetObserver(var1);
         }

      }

      public void unregisterDataSetObserver(DataSetObserver var1) {
         if (this.mAdapter != null) {
            this.mAdapter.unregisterDataSetObserver(var1);
         }

      }
   }

   private class DropdownPopup extends ListPopupWindow implements SpinnerICS.SpinnerPopup {
      private ListAdapter mAdapter;
      private CharSequence mHintText;

      public DropdownPopup(Context var2, AttributeSet var3, int var4) {
         super(var2, var3, var4);
         this.setAnchorView(SpinnerICS.this);
         this.setModal(true);
         this.setPromptPosition(0);
         this.setOnItemClickListener(SpinnerICS.this.new OnItemClickListenerWrapper(new AdapterViewICS.OnItemClickListener() {
            public void onItemClick(AdapterViewICS var1, View var2, int var3, long var4) {
               SpinnerICS.this.setSelection(var3);
               if (SpinnerICS.this.mOnItemClickListener != null) {
                  SpinnerICS.this.performItemClick(var2, var3, DropdownPopup.this.mAdapter.getItemId(var3));
               }

               DropdownPopup.this.dismiss();
            }
         }));
      }

      public CharSequence getHintText() {
         return this.mHintText;
      }

      public void setAdapter(ListAdapter var1) {
         super.setAdapter(var1);
         this.mAdapter = var1;
      }

      public void setPromptText(CharSequence var1) {
         this.mHintText = var1;
      }

      public void show() {
         int var2 = SpinnerICS.this.getPaddingLeft();
         int var1;
         if (SpinnerICS.this.mDropDownWidth == -2) {
            var1 = SpinnerICS.this.getWidth();
            int var3 = SpinnerICS.this.getPaddingRight();
            this.setContentWidth(Math.max(SpinnerICS.this.measureContentWidth((SpinnerAdapter)this.mAdapter, this.getBackground()), var1 - var2 - var3));
         } else if (SpinnerICS.this.mDropDownWidth == -1) {
            this.setContentWidth(SpinnerICS.this.getWidth() - var2 - SpinnerICS.this.getPaddingRight());
         } else {
            this.setContentWidth(SpinnerICS.this.mDropDownWidth);
         }

         Drawable var4 = this.getBackground();
         var1 = 0;
         if (var4 != null) {
            var4.getPadding(SpinnerICS.this.mTempRect);
            var1 = -SpinnerICS.this.mTempRect.left;
         }

         this.setHorizontalOffset(var1 + var2);
         this.setInputMethodMode(2);
         super.show();
         this.getListView().setChoiceMode(1);
         this.setSelection(SpinnerICS.this.getSelectedItemPosition());
      }
   }

   private interface SpinnerPopup {
      void dismiss();

      CharSequence getHintText();

      boolean isShowing();

      void setAdapter(ListAdapter var1);

      void setPromptText(CharSequence var1);

      void show();
   }
}
