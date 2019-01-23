/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.internal.processors.affinity;

import org.apache.ignite.IgniteSystemProperties;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for {@link GridAffinityAssignment} without IGNITE_DISABLE_AFFINITY_MEMORY_OPTIMIZATION.
 */
@RunWith(JUnit4.class)
public class GridAffinityAssignmentTestNoOptimizations extends GridAffinityAssignmentTest {
    /** */
    @BeforeClass
    public static void beforeTests() {
        System.setProperty(IgniteSystemProperties.IGNITE_DISABLE_AFFINITY_MEMORY_OPTIMIZATION, "true");
    }

    @AfterClass
    public static void afterTests() {
        System.clearProperty(IgniteSystemProperties.IGNITE_DISABLE_AFFINITY_MEMORY_OPTIMIZATION);
    }
}