/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.settings.accessibility;

import android.content.Context;
import android.util.FeatureFlagUtils;

import com.android.settings.core.BasePreferenceController;

/**
 * Preference controller for the software cursor feature.
 */
public class SoftwareCursorPreferenceController extends BasePreferenceController {

    public SoftwareCursorPreferenceController(Context context, String preferenceKey) {
        super(context, preferenceKey);
    }

    @Override
    public int getAvailabilityStatus() {
        // Hide the Software Cursor preference if the feature flag is not enabled.
        return FeatureFlagUtils.isEnabled(mContext,
                FeatureFlagUtils.SETTINGS_ACCESSIBILITY_SIMPLE_CURSOR) ? AVAILABLE
                : CONDITIONALLY_UNAVAILABLE;
    }
}
