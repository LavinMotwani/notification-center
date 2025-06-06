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

package org.eclipse.ecsp.platform.notification.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * PlaceholderService contract.
 */
public interface PlaceholderService {
    /**
     * Import placeholders from file.
     *
     * @param file File
     */
    void importPlaceholders(MultipartFile file);

    /**
     * Export placeholders to file.
     *
     * @param key Key
     * @return byte[]
     */
    byte[] exportPlaceholders(String key);

    /**
     * Delete placeholder.
     *
     * @param key Key
     */
    void deletePlaceholder(String key);
}
