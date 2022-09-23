/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ehpc.model.v20180412;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.ListCloudMetricProfilingsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCloudMetricProfilingsResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<ProfilingInfo> profilings;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ProfilingInfo> getProfilings() {
		return this.profilings;
	}

	public void setProfilings(List<ProfilingInfo> profilings) {
		this.profilings = profilings;
	}

	public static class ProfilingInfo {

		private String profilingId;

		private String triggerTime;

		private Integer pid;

		private String hostName;

		private Integer duration;

		private String instanceId;

		private Integer freq;

		public String getProfilingId() {
			return this.profilingId;
		}

		public void setProfilingId(String profilingId) {
			this.profilingId = profilingId;
		}

		public String getTriggerTime() {
			return this.triggerTime;
		}

		public void setTriggerTime(String triggerTime) {
			this.triggerTime = triggerTime;
		}

		public Integer getPid() {
			return this.pid;
		}

		public void setPid(Integer pid) {
			this.pid = pid;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public Integer getDuration() {
			return this.duration;
		}

		public void setDuration(Integer duration) {
			this.duration = duration;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getFreq() {
			return this.freq;
		}

		public void setFreq(Integer freq) {
			this.freq = freq;
		}
	}

	@Override
	public ListCloudMetricProfilingsResponse getInstance(UnmarshallerContext context) {
		return	ListCloudMetricProfilingsResponseUnmarshaller.unmarshall(this, context);
	}
}
