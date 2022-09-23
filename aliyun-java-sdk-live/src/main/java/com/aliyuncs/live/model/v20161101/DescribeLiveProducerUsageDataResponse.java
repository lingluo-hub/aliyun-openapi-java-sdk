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
import com.aliyuncs.live.transform.v20161101.DescribeLiveProducerUsageDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveProducerUsageDataResponse extends AcsResponse {

	private String endTime;

	private String startTime;

	private String requestId;

	private List<BillProducerDataItem> billProducerData;

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BillProducerDataItem> getBillProducerData() {
		return this.billProducerData;
	}

	public void setBillProducerData(List<BillProducerDataItem> billProducerData) {
		this.billProducerData = billProducerData;
	}

	public static class BillProducerDataItem {

		private Long tranSdDuration;

		private String type;

		private Long tranLdDuration;

		private String instance;

		private Long tranHdDuration;

		private String region;

		private String timeStamp;

		private Long outputHdDuration;

		private Long outputSdDuration;

		private String domainName;

		private Long outputLdDuration;

		public Long getTranSdDuration() {
			return this.tranSdDuration;
		}

		public void setTranSdDuration(Long tranSdDuration) {
			this.tranSdDuration = tranSdDuration;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Long getTranLdDuration() {
			return this.tranLdDuration;
		}

		public void setTranLdDuration(Long tranLdDuration) {
			this.tranLdDuration = tranLdDuration;
		}

		public String getInstance() {
			return this.instance;
		}

		public void setInstance(String instance) {
			this.instance = instance;
		}

		public Long getTranHdDuration() {
			return this.tranHdDuration;
		}

		public void setTranHdDuration(Long tranHdDuration) {
			this.tranHdDuration = tranHdDuration;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public Long getOutputHdDuration() {
			return this.outputHdDuration;
		}

		public void setOutputHdDuration(Long outputHdDuration) {
			this.outputHdDuration = outputHdDuration;
		}

		public Long getOutputSdDuration() {
			return this.outputSdDuration;
		}

		public void setOutputSdDuration(Long outputSdDuration) {
			this.outputSdDuration = outputSdDuration;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public Long getOutputLdDuration() {
			return this.outputLdDuration;
		}

		public void setOutputLdDuration(Long outputLdDuration) {
			this.outputLdDuration = outputLdDuration;
		}
	}

	@Override
	public DescribeLiveProducerUsageDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveProducerUsageDataResponseUnmarshaller.unmarshall(this, context);
	}
}
