package com.whisperonnx.utils;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.os.Build;
import android.view.WindowInsetsController;
import android.widget.ImageView;

import com.google.android.material.color.MaterialColors;

public class ThemeUtils {

    public static void setActiveIconTint(ImageView view, boolean active) {
        int attr = active
                ? com.google.android.material.R.attr.colorPrimary
                : com.google.android.material.R.attr.colorOnSurfaceVariant;
        int color = MaterialColors.getColor(view, attr);
        view.setImageTintList(ColorStateList.valueOf(color));
    }

    public static void setOnPrimaryIconTint(ImageView view) {
        int color = MaterialColors.getColor(
                view, com.google.android.material.R.attr.colorOnPrimary);
        view.setImageTintList(ColorStateList.valueOf(color));
    }

    public static void setStatusBarAppearance(Activity activity){
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.UPSIDE_DOWN_CAKE) {
            int nightModeFlags = activity.getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK;
            boolean isDarkMode = (nightModeFlags == Configuration.UI_MODE_NIGHT_YES);
            WindowInsetsController insetsController = activity.getWindow().getInsetsController();
            if (insetsController != null) {
                if (isDarkMode) {
                    // Dark mode: remove light status bar appearance (use light icons)
                    insetsController.setSystemBarsAppearance(
                            0,
                            WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
                    );
                } else {
                    // Light mode: enable light status bar appearance (dark icons)
                    insetsController.setSystemBarsAppearance(
                            WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS,
                            WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
                    );
                }
            }
        }
    }
}
