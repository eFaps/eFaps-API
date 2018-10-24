/*
 * Copyright 2003 - 2018 The eFaps Team
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

import java.io.Serializable;
import java.util.List;

public interface IPivotProvider
    extends Serializable
{

    /**
     * Get a list of options, to be shown in the UserInterface.
     *
     * @return list of IOption
     */
    List<IOption> getDataSources();

    /**
     * Gets the json data.
     *
     * @param _dataSource the data source
     * @return the json data
     */
    CharSequence getJsonData(String _dataSource);

}
