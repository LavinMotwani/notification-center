/*
 *
 *  *
 *  * ******************************************************************************
 *  *
 *  *  Copyright (c) 2023-24 Harman International
 *  *
 *  *
 *  *
 *  *  Licensed under the Apache License, Version 2.0 (the "License");
 *  *
 *  *  you may not use this file except in compliance with the License.
 *  *
 *  *  You may obtain a copy of the License at
 *  *
 *  *
 *  *
 *  *  http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  **
 *  *  Unless required by applicable law or agreed to in writing, software
 *  *
 *  *  distributed under the License is distributed on an "AS IS" BASIS,
 *  *
 *  *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *
 *  *  See the License for the specific language governing permissions and
 *  *
 *  *  limitations under the License.
 *  *
 *  *
 *  *
 *  *  SPDX-License-Identifier: Apache-2.0
 *  *
 *  *  *******************************************************************************
 *  *
 *
 */

package org.eclipse.ecsp.domain.notification;

import org.eclipse.ecsp.annotations.EventMapping;
import org.eclipse.ecsp.domain.Version;
import org.eclipse.ecsp.domain.notification.commons.EventID;
import org.eclipse.ecsp.entities.AbstractEventData;

/**
 * NotificationUserProfileEventDataV1_0 event data for NotificationUserProfile event.
 */
@SuppressWarnings("checkstyle:TypeName")
@EventMapping(id = EventID.NOTIFICATION_USER_PROFILE, version = Version.V1_0)
public class NotificationUserProfileEventDataV1_0 extends AbstractEventData {
    private static final long serialVersionUID = 1L;
    private UserProfile userProfile;

    /**
     * Default constructor.
     */
    public NotificationUserProfileEventDataV1_0() {
    }

    /**
     * Constructor with UserProfile.
     *
     * @param userPref user profile
     */
    public NotificationUserProfileEventDataV1_0(UserProfile userPref) {
        this.userProfile = userPref;
    }

    /**
     * Getter for UserProfile.
     *
     * @return userprofile
     */
    public UserProfile getUserProfile() {
        return userProfile;
    }

    /**
     * Setter for UserProfile.
     *
     * @param userPreferences the new value
     */
    public void setUserProfile(UserProfile userPreferences) {
        this.userProfile = userPreferences;
    }

}
