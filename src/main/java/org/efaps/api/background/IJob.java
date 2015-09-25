/*
 * Copyright 2003 - 2015 The eFaps Team
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
package org.efaps.api.background;

import java.io.Serializable;

/**
 * The Interface IJob.
 *
 * @author The eFaps Team
 */
public interface IJob
    extends Serializable
{
    /**
     * Execute.
     *
     * @param _bridge the _bridge
     */
    void execute(final IExecutionBridge _bridge);
}
