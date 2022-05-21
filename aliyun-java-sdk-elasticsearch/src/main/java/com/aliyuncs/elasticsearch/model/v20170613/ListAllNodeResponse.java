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

package com.aliyuncs.elasticsearch.model.v20170613;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.elasticsearch.transform.v20170613.ListAllNodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAllNodeResponse extends AcsResponse {

	private String requestId;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String heapPercent;

		private String zoneId;

		private String hostName;

		private String cpuPercent;

		private String host;

		private String nodeType;

		private String diskUsedPercent;

		private Integer port;

		private String loadOneM;

		private String health;

		public String getHeapPercent() {
			return this.heapPercent;
		}

		public void setHeapPercent(String heapPercent) {
			this.heapPercent = heapPercent;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getCpuPercent() {
			return this.cpuPercent;
		}

		public void setCpuPercent(String cpuPercent) {
			this.cpuPercent = cpuPercent;
		}

		public String getHost() {
			return this.host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}

		public String getDiskUsedPercent() {
			return this.diskUsedPercent;
		}

		public void setDiskUsedPercent(String diskUsedPercent) {
			this.diskUsedPercent = diskUsedPercent;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getLoadOneM() {
			return this.loadOneM;
		}

		public void setLoadOneM(String loadOneM) {
			this.loadOneM = loadOneM;
		}

		public String getHealth() {
			return this.health;
		}

		public void setHealth(String health) {
			this.health = health;
		}
	}

	@Override
	public ListAllNodeResponse getInstance(UnmarshallerContext context) {
		return	ListAllNodeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
