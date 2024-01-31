/*
 * Copyright © 2003 - 2024 The eFaps Team (-)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.efaps.api.ui;

import java.io.Serializable;
import java.util.Map;

import org.efaps.util.EFapsBaseException;

/**
 * The Interface IPreferencesProvider.
 */
public interface IPreferencesProvider
    extends Serializable
{
    /**
     * Gets the preferences.
     *
     * @return the preferences
     * @throws EFapsBaseException the e faps base exception
     */
    Map<String, String> getPreferences()
        throws EFapsBaseException;

    /**
     * Update preferences.
     *
     * @param _preferences the preferences
     * @throws EFapsBaseException the e faps base exception
     */
    void updatePreferences(Map<String, String> _preferences)
        throws EFapsBaseException;
}
