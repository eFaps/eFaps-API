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

import org.efaps.util.EFapsBaseException;

/**
 * The Class IHelpProvider.
 *
 * @author The eFaps Team
 */
public interface IHelpProvider
    extends Serializable
{

    /**
     * Checks if a Command has a help assigned.
     *
     * @param _cmdId the cmd id
     * @return true, if successful
     * @throws EFapsBaseException the eFaps base exception
     */
    default boolean hasHelp(final Long _cmdId)
        throws EFapsBaseException
    {
        return false;
    }

    /**
     * Gets the help.
     *
     * @param _cmdId the cmd id
     * @return the help
     * @throws EFapsBaseException the eFaps base exception
     */
    CharSequence getHelp(Long _cmdId)
        throws EFapsBaseException;

    /**
     * Checks if is help admin.
     *
     * @return true, if is help admin
     * @throws EFapsBaseException the eFaps base exception
     */
    default boolean isHelpAdmin()
        throws EFapsBaseException
    {
        return false;
    }

    /**
     * Checks if is help admin.
     *
     * @return true, if is help admin
     * @throws EFapsBaseException the eFaps base exception
     */
    default boolean isEditMode()
        throws EFapsBaseException
    {
        return false;
    }
}
