/*
 * Copyright (C) 2015 hops.io.
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
package io.hops.metadata.yarn.entity;

/**
 * Pojo for RMNode.finishedApplications list.
 */
public class FinishedApplications implements Comparable<FinishedApplications>{

    private final String rmnodeid;
    private final String applicationId;
    private final int pendingEventId;

    public FinishedApplications(String rmnodeid, String applicationId, int pendingId) {
        this.rmnodeid = rmnodeid;
        this.applicationId = applicationId;
        this.pendingEventId = pendingId;
    }

    public String getRMNodeID() {
        return rmnodeid;
    }

    public int getPendingEventId() {
        return pendingEventId;
    }

    public String getApplicationId() {
        return applicationId;
    }

    @Override
    public String toString() {
        return "HopFinishedApplications{" + "rmnodeid=" + rmnodeid
                + ", applicationId=" + applicationId + '}';
    }

  public int compareTo(FinishedApplications f) {
    if (this.rmnodeid.compareTo(f.rmnodeid) != 0) {
      return this.rmnodeid.compareTo(f.rmnodeid);
    }
    return this.applicationId.compareTo(f.applicationId);
  }
}
