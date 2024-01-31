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
package org.efaps.api.background;

import java.io.Serializable;

/**
 * The Interface IExecutionBridge.
 *
 * @author The eFaps Team
 */
public interface IExecutionBridge
    extends Serializable
{

    /**
     * Gets the job name.
     *
     * @return the job name
     */
    String getJobName();

    /**
     * Checks if is stop.
     *
     * @return true, if is stop
     */
    boolean isStop();

    /**
     * Checks if is cancel.
     *
     * @return true, if is cancel
     */
    boolean isCancel();

    /**
     * Gets the progress.
     *
     * @return the progress
     */
    int getProgress();

    /**
     * Checks if is finished.
     *
     * @return true, if is finished
     */
    boolean isFinished();

    /**
     * Gets the context.
     *
     * @return the context
     */
    IJobContext getJobContext();

    /**
     * Gets the content.
     *
     * @return the content
     */
    Serializable getContent();
}
