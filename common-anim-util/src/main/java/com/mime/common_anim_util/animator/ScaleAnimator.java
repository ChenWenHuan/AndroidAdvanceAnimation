package com.mime.common_anim_util.animator;

import android.animation.ObjectAnimator;
import android.view.View;

/**
 * <p>write the description
 *
 * @author renjialiang
 * @version [版本号]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class ScaleAnimator extends PropertyAnimator {

    public ScaleAnimator pivot(float xPivot, float yPivot) {
        checkObj();
        Object target = animator.getTarget();
        if(target != null && target instanceof View) {
            View view = (View)target;
            view.setPivotX(view.getWidth() * xPivot);
            view.setPivotY(view.getHeight() * yPivot);
        }
        return this;
    }

    public ScaleAnimator pivotX(float xPivot) {
        checkObj();
        Object target = animator.getTarget();
        if(target != null && target instanceof View) {
            View view = (View)target;
            view.setPivotX(view.getWidth() * xPivot);
        }
        return this;
    }

    public ScaleAnimator pivotY(float yPivot) {
        checkObj();
        Object target = animator.getTarget();
        if(target != null && target instanceof View) {
            View view = (View)target;
            view.setPivotY(view.getHeight() * yPivot);
        }
        return this;
    }

    @Override
    public ScaleAnimator generate(View view, String propertyName, float... values) {
        animator = ObjectAnimator.ofFloat(view, propertyName, values);
        return this;
    }
}