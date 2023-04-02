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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.ListLiveDelayConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLiveDelayConfigResponse extends AcsResponse {

	private Integer total;

	private String requestId;

	private List<DelayConfig> delayConfigList;

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DelayConfig> getDelayConfigList() {
		return this.delayConfigList;
	}

	public void setDelayConfigList(List<DelayConfig> delayConfigList) {
		this.delayConfigList = delayConfigList;
	}

	public static class DelayConfig {

		private String stream;

		private String domain;

		private String taskTriggerMode;

		private String delayTime;

		private String app;

		public String getStream() {
			return this.stream;
		}

		public void setStream(String stream) {
			this.stream = stream;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getTaskTriggerMode() {
			return this.taskTriggerMode;
		}

		public void setTaskTriggerMode(String taskTriggerMode) {
			this.taskTriggerMode = taskTriggerMode;
		}

		public String getDelayTime() {
			return this.delayTime;
		}

		public void setDelayTime(String delayTime) {
			this.delayTime = delayTime;
		}

		public String getApp() {
			return this.app;
		}

		public void setApp(String app) {
			this.app = app;
		}
	}

	@Override
	public ListLiveDelayConfigResponse getInstance(UnmarshallerContext context) {
		return	ListLiveDelayConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
