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

package org.eclipse.ecsp.notification.entities;


import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.eclipse.ecsp.entities.AbstractIgniteEntity;

import static org.eclipse.ecsp.notification.dao.NotificationDaoConstants.TOKEN_USER_MAP;

/**
 * token user map entity.
 */
@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(value = TOKEN_USER_MAP, useDiscriminator = false)
public class TokenUserMap extends AbstractIgniteEntity {
    @Id
    private String token;
    private String appPlatform;
    @SuppressWarnings("checkstyle:AbbreviationAsWordInName")
    private String userID;
}
