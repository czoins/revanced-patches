package app.revanced.extension.all.screencapture.removerestriction;

import android.media.AudioAttributes;
import android.os.Build;

import androidx.annotation.RequiresApi;

@SuppressWarnings("unused")
public final class RemoveScreenCaptureRestrictionPatch {
    // Member of AudioAttributes.Builder

    public static AudioAttributes.Builder setAllowedCapturePolicy(final AudioAttributes.Builder builder, final int capturePolicy) {
        builder.setAllowedCapturePolicy(AudioAttributes.ALLOW_CAPTURE_BY_ALL);

        return builder;
    }

    // Member of AudioManager static class
    public static void setAllowedCapturePolicy(final int capturePolicy) {
        // Ignore request
    }
    
    public static AudioAttributes.Builder setUsage(final AudioAttributes.Builder builder, final int usage) {
        // Force usage to USAGE_MEDIA (1)
        builder.setUsage(AudioAttributes.USAGE_MEDIA);  // AudioAttributes.USAGE_MEDIA
        return builder;
    }
    
    public static AudioAttributes.Builder setContentType(final AudioAttributes.Builder builder, final int usage) {
        builder.setContentType(AudioAttributes.CONTENT_TYPE_MUSIC);
        return builder;
    }
}
