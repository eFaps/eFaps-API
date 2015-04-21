/*
 * Copyright 2003 - 2014 The eFaps Team
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
 *
 * Revision:        $Rev$
 * Last Changed:    $Date$
 * Last Changed By: $Author$
 */

package org.efaps.api.ui;

import java.io.Serializable;

import org.efaps.util.EFapsBaseException;

/**
 * ESJP snipplet interface.
 *
 * @author The eFaps Team
 * @version $Id$
 */
public interface IEsjpSnipplet
    extends Serializable
{

    /**
     * A Html Snipplet for UserInterface.
     * @return the html snipplet to be presented in the UserInterface
     * @throws EFapsBaseException on error
     */
    CharSequence getHtmlSnipplet()
        throws EFapsBaseException;

    /**
     * The visible status.
     * @return true is visible
     * @throws EFapsBaseException on error
     */
    boolean isVisible()
        throws EFapsBaseException;
}
