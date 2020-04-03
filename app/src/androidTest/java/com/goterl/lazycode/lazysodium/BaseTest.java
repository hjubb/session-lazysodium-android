/*
 * Copyright (c) Terl Tech Ltd • 04/04/2020, 00:05 • goterl.com
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at http://mozilla.org/MPL/2.0/.
 */

package com.goterl.lazycode.lazysodium;

import org.junit.Before;

public class BaseTest {

    public static LazySodiumAndroid lazySodium;

    @Before
    public void doBeforeEverything() {
        lazySodium = new LazySodiumAndroid(new SodiumAndroid());
    }

}
