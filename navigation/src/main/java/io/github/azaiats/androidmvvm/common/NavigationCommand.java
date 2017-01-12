/*
 * Copyright 2016 Andrei Zaiats.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.azaiats.androidmvvm.common;

import android.support.annotation.NonNull;

/**
 * Provides command for Navigator
 *
 * @param <T> the type of {@link Navigator}
 * @author Andrei Zaiats
 * @since 0.2.1
 */
public interface NavigationCommand<T extends Navigator> {

    /**
     * Defines the method to be called when the command is invoked.
     *
     * @param navigator navigator instance
     */
    void execute(@NonNull T navigator);
}