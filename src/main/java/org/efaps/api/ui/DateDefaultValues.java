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

package org.efaps.api.ui;

/**
 * TODO comment!
 *
 * @author The eFaps Team
 * @version $Id: $
 */
public enum DateDefaultValues
{
    /** The Value is today. */
    TODAY,
    /** The Value represents today +-n weeks. */
    WEEKS,
    /** The Value represents today +-n month. */
    MONTHS,
    /** The Value represents today +-n years. */
    YEARS,
    /**
     * The Value represents today 1,2,3,4,5,6,7. the Integer represents on of
     * the weekdays starting with Monday, Tuesday...
     */
    WITHDAYOFWEEK,
    /** Integer day of month. */
    WITHDAYOFMONTH,
    /** like today will be evaluated.*/
    LASTDAYOFMONTH,
    /** Integer day of month. */
    WITHDAYOFYEAR;
}
