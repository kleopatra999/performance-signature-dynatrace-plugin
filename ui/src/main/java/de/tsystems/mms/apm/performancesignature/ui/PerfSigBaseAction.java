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

package de.tsystems.mms.apm.performancesignature.ui;

import hudson.model.Action;

abstract class PerfSigBaseAction implements Action {
    public String getUrlName() {
        return Messages.PerfSigBaseAction_UrlName();
    }

    public String getDisplayName() {
        return Messages.PerfSigBuildAction_DisplayName();
    }

    public String getIconFileName() {
        return "/plugin/" + getUrlName() + "-ui/images/icon.png";
    }

    protected abstract String getTitle();
}
