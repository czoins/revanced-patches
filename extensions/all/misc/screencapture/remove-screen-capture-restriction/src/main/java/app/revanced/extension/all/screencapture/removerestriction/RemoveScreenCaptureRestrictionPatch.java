package app.revanced.extension.all.screencapture.removerestriction;

import android.media.AudioAttributes;
import android.os.Build;

import androidx.annotation.RequiresApi;

@SuppressWarnings("unused")
public final class RemoveScreenCaptureRestrictionPatch {
    // Member of AudioAttributes.Builder
    @RequiresApi(api = Build.VERSION_CODES.Q)
    public static AudioAttributes.Builder setAllowedCapturePolicy(final AudioAttributes.Builder builder, final int capturePolicy) {
        builder.setAllowedCapturePolicy(AudioAttributes.ALLOW_CAPTURE_BY_ALL);

        return builder;
    }

    // Member of AudioManager static class
    public static void setAllowedCapturePolicy(final int capturePolicy) {
        // Ignore request
    }
    
    @RequiresApi(api = Build.VERSION_CODES.Q)
    public static AudioAttributes.Builder setUsage(final AudioAttributes.Builder builder, final int usage) {
        // Force usage to USAGE_MEDIA (1)
        builder.setUsage(1);  // AudioAttributes.USAGE_MEDIA
        return builder;
    }
}
