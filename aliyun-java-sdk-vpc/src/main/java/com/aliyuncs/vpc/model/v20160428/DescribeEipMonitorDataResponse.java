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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeEipMonitorDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEipMonitorDataResponse extends AcsResponse {

	private String requestId;

	private List<EipMonitorData> eipMonitorDatas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EipMonitorData> getEipMonitorDatas() {
		return this.eipMonitorDatas;
	}

	public void setEipMonitorDatas(List<EipMonitorData> eipMonitorDatas) {
		this.eipMonitorDatas = eipMonitorDatas;
	}

	public static class EipMonitorData {

		private Long eipTX;

		private Integer eipPackets;

		private Integer eipBandwidth;

		private String timeStamp;

		private Integer eipFlow;

		private Long eipRX;

		public Long getEipTX() {
			return this.eipTX;
		}

		public void setEipTX(Long eipTX) {
			this.eipTX = eipTX;
		}

		public Integer getEipPackets() {
			return this.eipPackets;
		}

		public void setEipPackets(Integer eipPackets) {
			this.eipPackets = eipPackets;
		}

		public Integer getEipBandwidth() {
			return this.eipBandwidth;
		}

		public void setEipBandwidth(Integer eipBandwidth) {
			this.eipBandwidth = eipBandwidth;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public Integer getEipFlow() {
			return this.eipFlow;
		}

		public void setEipFlow(Integer eipFlow) {
			this.eipFlow = eipFlow;
		}

		public Long getEipRX() {
			return this.eipRX;
		}

		public void setEipRX(Long eipRX) {
			this.eipRX = eipRX;
		}
	}

	@Override
	public DescribeEipMonitorDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeEipMonitorDataResponseUnmarshaller.unmarshall(this, context);
	}
}
