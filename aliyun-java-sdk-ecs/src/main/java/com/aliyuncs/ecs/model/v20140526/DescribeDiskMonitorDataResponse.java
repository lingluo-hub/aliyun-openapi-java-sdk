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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeDiskMonitorDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDiskMonitorDataResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<DiskMonitorData> monitorData;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DiskMonitorData> getMonitorData() {
		return this.monitorData;
	}

	public void setMonitorData(List<DiskMonitorData> monitorData) {
		this.monitorData = monitorData;
	}

	public static class DiskMonitorData {

		private Integer bPSRead;

		private Integer iOPSRead;

		private Integer latencyRead;

		private Integer bPSTotal;

		private Integer iOPSTotal;

		private String timeStamp;

		private Integer latencyWrite;

		private Integer iOPSWrite;

		private String diskId;

		private Integer bPSWrite;

		public Integer getBPSRead() {
			return this.bPSRead;
		}

		public void setBPSRead(Integer bPSRead) {
			this.bPSRead = bPSRead;
		}

		public Integer getIOPSRead() {
			return this.iOPSRead;
		}

		public void setIOPSRead(Integer iOPSRead) {
			this.iOPSRead = iOPSRead;
		}

		public Integer getLatencyRead() {
			return this.latencyRead;
		}

		public void setLatencyRead(Integer latencyRead) {
			this.latencyRead = latencyRead;
		}

		public Integer getBPSTotal() {
			return this.bPSTotal;
		}

		public void setBPSTotal(Integer bPSTotal) {
			this.bPSTotal = bPSTotal;
		}

		public Integer getIOPSTotal() {
			return this.iOPSTotal;
		}

		public void setIOPSTotal(Integer iOPSTotal) {
			this.iOPSTotal = iOPSTotal;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public Integer getLatencyWrite() {
			return this.latencyWrite;
		}

		public void setLatencyWrite(Integer latencyWrite) {
			this.latencyWrite = latencyWrite;
		}

		public Integer getIOPSWrite() {
			return this.iOPSWrite;
		}

		public void setIOPSWrite(Integer iOPSWrite) {
			this.iOPSWrite = iOPSWrite;
		}

		public String getDiskId() {
			return this.diskId;
		}

		public void setDiskId(String diskId) {
			this.diskId = diskId;
		}

		public Integer getBPSWrite() {
			return this.bPSWrite;
		}

		public void setBPSWrite(Integer bPSWrite) {
			this.bPSWrite = bPSWrite;
		}
	}

	@Override
	public DescribeDiskMonitorDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeDiskMonitorDataResponseUnmarshaller.unmarshall(this, context);
	}
}
