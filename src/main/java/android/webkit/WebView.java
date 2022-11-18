package android.webkit;

import android.annotation.Nullable;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.WindowInsets;

public class WebView {

    public class PrivateAccess {
        // ---- Access to super-class methods ----
        public int super_getScrollBarStyle() {
            return 0;
        }

        public void super_scrollTo(int scrollX, int scrollY) {
        }

        public void super_computeScroll() {
        }

        public boolean super_onHoverEvent(MotionEvent event) {
            return false;
        }

        public boolean super_performAccessibilityAction(int action, Bundle arguments) {
            return false;
        }

        public boolean super_performLongClick() {
            return false;
        }

        public boolean super_setFrame(int left, int top, int right, int bottom) {
            return false;
        }

        public boolean super_dispatchKeyEvent(KeyEvent event) {
            return false;
        }

        public boolean super_onGenericMotionEvent(MotionEvent event) {
            return false;
        }

        public boolean super_requestFocus(int direction, Rect previouslyFocusedRect) {
            return false;
        }

        public void super_setLayoutParams(ViewGroup.LayoutParams params) {
        }

        public void super_startActivityForResult(Intent intent, int requestCode) {
        }

        @Nullable
        public WindowInsets super_onApplyWindowInsets(@Nullable WindowInsets insets) {
            return null;
        }

        // ---- Access to non-public methods ----
        public void overScrollBy(int deltaX, int deltaY,
                                 int scrollX, int scrollY,
                                 int scrollRangeX, int scrollRangeY,
                                 int maxOverScrollX, int maxOverScrollY,
                                 boolean isTouchEvent) {
        }

        public void awakenScrollBars(int duration) {
        }

        public void awakenScrollBars(int duration, boolean invalidate) {
        }

        public float getVerticalScrollFactor() {
            return 0.0F;
        }

        public float getHorizontalScrollFactor() {
            return 0.0F;
        }

        public void setMeasuredDimension(int measuredWidth, int measuredHeight) {
        }

        public void onScrollChanged(int l, int t, int oldl, int oldt) {
        }

        public int getHorizontalScrollbarHeight() {
            return 0;
        }

        public void super_onDrawVerticalScrollBar(Canvas canvas, Drawable scrollBar,
                                                  int l, int t, int r, int b) {
        }
        // ---- Access to (non-public) fields ----

        /**
         * Raw setter for the scroll X value, without invoking onScrollChanged handlers etc.
         */
        public void setScrollXRaw(int scrollX) {
        }

        /**
         * Raw setter for the scroll Y value, without invoking onScrollChanged handlers etc.
         */
        public void setScrollYRaw(int scrollY) {
        }

    }
    public static abstract class VisualStateCallback {}

    public static class HitTestResult {}

    public interface FindListener {
        /**
         * Notifies the listener about progress made by a find operation.
         *
         * @param activeMatchOrdinal the zero-based ordinal of the currently selected match
         * @param numberOfMatches how many matches have been found
         * @param isDoneCounting whether the find operation has actually completed. The listener
         *                       may be notified multiple times while the
         *                       operation is underway, and the numberOfMatches
         *                       value should not be considered final unless
         *                       isDoneCounting is {@code true}.
         */
        public void onFindResultReceived(int activeMatchOrdinal, int numberOfMatches,
                                         boolean isDoneCounting);
    }

    /**
     * Interface to listen for new pictures as they change.
     *
     * @deprecated This interface is now obsolete.
     */
    @Deprecated
    public interface PictureListener {
        @Deprecated
        void onNewPicture(WebView view, @Nullable Picture picture);
    }
}
