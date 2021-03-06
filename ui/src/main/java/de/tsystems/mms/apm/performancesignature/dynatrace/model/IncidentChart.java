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

package de.tsystems.mms.apm.performancesignature.dynatrace.model;

import de.tsystems.mms.apm.performancesignature.dynatrace.util.AttributeUtils;
import org.kohsuke.stapler.export.Exported;
import org.kohsuke.stapler.export.ExportedBean;

import java.util.ArrayList;
import java.util.List;

@ExportedBean
public class IncidentChart {
    private final String rule;
    private final Severity severity;
    private final List<IncidentViolation> violations;

    public IncidentChart(final Object attr) {
        this.rule = AttributeUtils.getStringAttribute("rule", attr);
        this.severity = Severity.fromString(AttributeUtils.getStringAttribute("severity", attr));
        this.violations = new ArrayList<IncidentViolation>();
    }

    @Exported
    public String getRule() {
        return rule;
    }

    public Severity getSeverity() {
        return severity;
    }

    @Exported
    public String getSeverityString() {
        return severity.toString();
    }

    @Exported
    public List<IncidentViolation> getViolations() {
        return violations;
    }

    public void add(final IncidentViolation incidentViolation) {
        this.violations.add(incidentViolation);
    }

    public enum Severity {
        SEVERE, WARNING, INFORMATIONAL;

        public static Severity fromString(final String string) {
            return Severity.valueOf(string.toUpperCase());
        }
    }
}
