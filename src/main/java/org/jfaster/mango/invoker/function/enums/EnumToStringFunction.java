/*
 * Copyright 2014 mango.jfaster.org
 *
 * The Mango Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.jfaster.mango.invoker.function.enums;

import org.jfaster.mango.invoker.GetterFunction;

import javax.annotation.Nullable;

/**
 * Enum --> String
 *
 * @author ash
 */
public class EnumToStringFunction implements GetterFunction<Enum, String> {

    @Nullable
    @Override
    public String apply(@Nullable Enum input) {
        return input == null ? null : input.name();
    }

}
