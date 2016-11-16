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
package org.efaps.api.datamodel;

import org.efaps.api.IEnumValue;

/**
 * The Enum Overwrite.
 *
 * @author The eFaps Team
 */
public enum Overwrite
    implements IEnumValue
{

    /** The attribute. */
    ATTRIBUTE("eFapsPropertiesOverwriteAttribute"),

    /** The systemconfig. */
    SYSTEMCONFIG("eFapsPropertiesOverwriteSystemConfig");

    /** The value. */
    private final String value;

    /**
     * Instantiates a new overwrite.
     *
     * @param _value the value
     */
    Overwrite(final String _value)
    {
        this.value = _value;
    }

    @Override
    public String value()
    {
        return this.value;
    }
}
