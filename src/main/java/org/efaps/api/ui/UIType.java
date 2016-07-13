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
 * UIType definitions used by the xml CI-Items.
 *
 * @author The eFaps Team
 * @version $Id$
 */
public enum UIType
{
    /** Default.*/
    DEFAULT,
    /** Render a button.*/
    BUTTON,
    /** Render CheckBox.*/
    CHECKBOX,
    /** Render Radio Buttons.*/
    RADIO,
    /** A raw unformatted snipplet from the underlying field.*/
    SNIPPLET,
    /** Render a DropDownBox. */
    DROPDOWN,
    /** Render a number input. For Decimal required if the spinner are wanted. */
    NUMBER,
    /** Render a file upload inpout. */
    UPLOAD;
}
