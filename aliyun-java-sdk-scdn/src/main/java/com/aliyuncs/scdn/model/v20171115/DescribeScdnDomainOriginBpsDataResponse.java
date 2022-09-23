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
import com.aliyuncs.scdn.transform.v20171115.DescribeScdnDomainOriginBpsDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScdnDomainOriginBpsDataResponse extends AcsResponse {

	private String endTime;

	private String startTime;

	private String requestId;

	private String domainName;

	private String dataInterval;

	private List<DataModule> originBpsDataPerInterval;

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

	public List<DataModule> getOriginBpsDataPerInterval() {
		return this.originBpsDataPerInterval;
	}

	public void setOriginBpsDataPerInterval(List<DataModule> originBpsDataPerInterval) {
		this.originBpsDataPerInterval = originBpsDataPerInterval;
	}

	public static class DataModule {

		private String httpOriginBpsValue;

		private String timeStamp;

		private String httpsOriginBpsValue;

		private String originBpsValue;

		public String getHttpOriginBpsValue() {
			return this.httpOriginBpsValue;
		}

		public void setHttpOriginBpsValue(String httpOriginBpsValue) {
			this.httpOriginBpsValue = httpOriginBpsValue;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getHttpsOriginBpsValue() {
			return this.httpsOriginBpsValue;
		}

		public void setHttpsOriginBpsValue(String httpsOriginBpsValue) {
			this.httpsOriginBpsValue = httpsOriginBpsValue;
		}

		public String getOriginBpsValue() {
			return this.originBpsValue;
		}

		public void setOriginBpsValue(String originBpsValue) {
			this.originBpsValue = originBpsValue;
		}
	}

	@Override
	public DescribeScdnDomainOriginBpsDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeScdnDomainOriginBpsDataResponseUnmarshaller.unmarshall(this, context);
	}
}
