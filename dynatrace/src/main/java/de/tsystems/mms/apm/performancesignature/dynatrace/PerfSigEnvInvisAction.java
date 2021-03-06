/*
 * Copyright (c) 2014 T-Systems Multimedia Solutions GmbH
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

package de.tsystems.mms.apm.performancesignature.dynatrace;

import hudson.model.InvisibleAction;

import java.util.Date;

class PerfSigEnvInvisAction extends InvisibleAction {
    private final String sessionName, testRunID, testCase;
    private final Date timeframeStart;

    PerfSigEnvInvisAction(final String sessionName, final Date timeframeStart, final String testCase, final String testRunID) {
        this.sessionName = sessionName;
        this.timeframeStart = timeframeStart != null ? (Date) timeframeStart.clone() : null;
        this.testCase = testCase;
        this.testRunID = testRunID;
    }

    public String getSessionName() {
        return sessionName;
    }

    public String getTestRunID() {
        return testRunID;
    }

    public String getTestCase() {
        return testCase;
    }

    public Date getTimeframeStart() {
        return timeframeStart != null ? (Date) timeframeStart.clone() : null;
    }
}
