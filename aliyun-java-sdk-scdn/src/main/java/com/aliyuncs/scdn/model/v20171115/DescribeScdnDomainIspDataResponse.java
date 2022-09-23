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

package com.aliyuncs.scdn.model.v20171115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.scdn.transform.v20171115.DescribeScdnDomainIspDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScdnDomainIspDataResponse extends AcsResponse {

	private String endTime;

	private String startTime;

	private String requestId;

	private String domainName;

	private String dataInterval;

	private List<ISPProportionData> value;

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

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getDataInterval() {
		return this.dataInterval;
	}

	public void setDataInterval(String dataInterval) {
		this.dataInterval = dataInterval;
	}

	public List<ISPProportionData> getValue() {
		return this.value;
	}

	public void setValue(List<ISPProportionData> value) {
		this.value = value;
	}

	public static class ISPProportionData {

		private String totalQuery;

		private String totalBytes;

		private String avgResponseRate;

		private String avgResponseTime;

		private String reqErrRate;

		private String avgObjectSize;

		private String bps;

		private String qps;

		private String proportion;

		private String ispEname;

		private String iSP;

		private String bytesProportion;

		public String getTotalQuery() {
			return this.totalQuery;
		}

		public void setTotalQuery(String totalQuery) {
			this.totalQuery = totalQuery;
		}

		public String getTotalBytes() {
			return this.totalBytes;
		}

		public void setTotalBytes(String totalBytes) {
			this.totalBytes = totalBytes;
		}

		public String getAvgResponseRate() {
			return this.avgResponseRate;
		}

		public void setAvgResponseRate(String avgResponseRate) {
			this.avgResponseRate = avgResponseRate;
		}

		public String getAvgResponseTime() {
			return this.avgResponseTime;
		}

		public void setAvgResponseTime(String avgResponseTime) {
			this.avgResponseTime = avgResponseTime;
		}

		public String getReqErrRate() {
			return this.reqErrRate;
		}

		public void setReqErrRate(String reqErrRate) {
			this.reqErrRate = reqErrRate;
		}

		public String getAvgObjectSize() {
			return this.avgObjectSize;
		}

		public void setAvgObjectSize(String avgObjectSize) {
			this.avgObjectSize = avgObjectSize;
		}

		public String getBps() {
			return this.bps;
		}

		public void setBps(String bps) {
			this.bps = bps;
		}

		public String getQps() {
			return this.qps;
		}

		public void setQps(String qps) {
			this.qps = qps;
		}

		public String getProportion() {
			return this.proportion;
		}

		public void setProportion(String proportion) {
			this.proportion = proportion;
		}

		public String getIspEname() {
			return this.ispEname;
		}

		public void setIspEname(String ispEname) {
			this.ispEname = ispEname;
		}

		public String getISP() {
			return this.iSP;
		}

		public void setISP(String iSP) {
			this.iSP = iSP;
		}

		public String getBytesProportion() {
			return this.bytesProportion;
		}

		public void setBytesProportion(String bytesProportion) {
			this.bytesProportion = bytesProportion;
		}
	}

	@Override
	public DescribeScdnDomainIspDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeScdnDomainIspDataResponseUnmarshaller.unmarshall(this, context);
	}
}
