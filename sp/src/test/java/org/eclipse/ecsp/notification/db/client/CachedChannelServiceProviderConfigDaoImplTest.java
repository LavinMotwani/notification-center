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

package org.eclipse.ecsp.notification.db.client;

import org.eclipse.ecsp.domain.notification.commons.ChannelType;
import org.eclipse.ecsp.notification.config.ChannelServiceProviderConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

/**
 * CachedChannelServiceProviderConfigDaoImplTest.
 */
public class CachedChannelServiceProviderConfigDaoImplTest {

    @InjectMocks
    private CachedChannelServiceProviderConfigDaoImpl cacheChannelServiceProvider;

    @Before
    public void setup() {
        cacheChannelServiceProvider = new CachedChannelServiceProviderConfigDaoImpl();
        MockitoAnnotations.initMocks(this);
    }

    @Test(expected = Exception.class)
    public void testCacheChannelServiceProvider() {
        ChannelServiceProviderConfig cp = new ChannelServiceProviderConfig();
        cp.setChannelType(ChannelType.EMAIL);
        cp.setRegion("emea");
        cp.setNotificationId("notificationId");
        Optional<String> result =
            cacheChannelServiceProvider.getServiceProviderByChannelNotificationIdAndRegion(ChannelType.EMAIL,
                "notificationId", "emea");
        Assert.assertEquals(Optional.empty(), result);
    }

    @Test(expected = Exception.class)
    public void testCacheChannelServiceProviderNonNull() {
        ChannelServiceProviderConfig cp = new ChannelServiceProviderConfig();
        cp.setChannelType(ChannelType.EMAIL);
        cp.setRegion("emea");
        cp.setNotificationId("notificationId");
        cp.setServiceProvider("ses");
        Optional<String> result =
            cacheChannelServiceProvider.getServiceProviderByChannelNotificationIdAndRegion(ChannelType.EMAIL,
                "notificationId", "emea");
        Assert.assertEquals(cp.getServiceProvider(), result.get());
    }
}
