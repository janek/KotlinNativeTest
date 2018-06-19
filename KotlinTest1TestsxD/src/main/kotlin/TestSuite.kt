//
//  TestSuite.kt
//  KotlinTest1TestsxD
//
//  Created by Janek Szynal on 27/05/2018.
//  Copyright © 2018 PJM. All rights reserved.
//

import kotlin.test.Test
import kotlin.test.assertTrue

class TestSuite {
    @Test
    fun testSuccess() {
        assertTrue(true, "This will succeed")
    }

    @Test
    fun testFailure() {
        assertTrue(false, "This will fail")
    }
}
