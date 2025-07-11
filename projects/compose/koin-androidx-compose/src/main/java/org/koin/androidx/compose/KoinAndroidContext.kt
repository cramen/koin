/*
 * Copyright 2017-present the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.koin.androidx.compose

import androidx.compose.runtime.Composable
import org.koin.compose.KoinContext
import org.koin.mp.KoinPlatformTools


/**
 * PR Proposal https://github.com/InsertKoinIO/koin/pull/1586
 * from @jjkester
 */

/**
 * Run and bind Compose with existing Koin context, from current Android application context
 *
 * This extend the existing KoinApplication, by looking at Koin context in current Android context
 *
 * @see KoinPlatformTools.defaultContext()
 * @param content - following compose function
 *
 * @author Arnaud Giuliani
 * @author jjkester
 */
@Composable
@Deprecated("KoinAndroidContext is not needed anymore. This can be removed. Compose Koin context is setup with StartKoin()")
fun KoinAndroidContext(
    content: @Composable () -> Unit
) {
    KoinContext(content = content)
}