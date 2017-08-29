package br.com.leandroferreira.loading_view_core.interfaces;

/**
 * Created by hinovamobile on 23/12/16.
 */

public interface AnimatedView {
    void startAnimation();
    void revertAnimation();
    void revertAnimation(final OnAnimationEndListener onAnimationEndListener);
    void dispose();
}
