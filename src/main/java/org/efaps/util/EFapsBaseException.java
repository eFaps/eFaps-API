/*
 * Copyright 2003 - 2016 The eFaps Team
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
 */

package org.efaps.util;

/**
 * TODO comment!
 *
 * @author The eFaps Team
 */
public class EFapsBaseException
    extends Exception
{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new eFaps Base exception.
     *
     * @param _message the message
     * @param _cause the cause
     */
    public EFapsBaseException(final String _message,
                              final Throwable _cause)
    {
        super(_message, _cause);
    }

    /**
     * Instantiates a new eFaps Base exception.
     *
     * @param _string the string
     */
    public EFapsBaseException(final String _string)
    {
        super(_string);
    }
}
