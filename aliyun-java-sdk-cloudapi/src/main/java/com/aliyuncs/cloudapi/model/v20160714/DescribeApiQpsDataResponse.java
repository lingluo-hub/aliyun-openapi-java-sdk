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

package com.aliyuncs.cloudapi.model.v20160714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeApiQpsDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApiQpsDataResponse extends AcsResponse {

	private String requestId;

	private List<MonitorItem> callSuccesses;

	private List<MonitorItem> callFails;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MonitorItem> getCallSuccesses() {
		return this.callSuccesses;
	}

	public void setCallSuccesses(List<MonitorItem> callSuccesses) {
		this.callSuccesses = callSuccesses;
	}

	public List<MonitorItem> getCallFails() {
		return this.callFails;
	}

	public void setCallFails(List<MonitorItem> callFails) {
		this.callFails = callFails;
	}

	public static class MonitorItem {

		private String itemValue;

		private String itemTime;

		public String getItemValue() {
			return this.itemValue;
		}

		public void setItemValue(String itemValue) {
			this.itemValue = itemValue;
		}

		public String getItemTime() {
			return this.itemTime;
		}

		public void setItemTime(String itemTime) {
			this.itemTime = itemTime;
		}
	}

	@Override
	public DescribeApiQpsDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeApiQpsDataResponseUnmarshaller.unmarshall(this, context);
	}
}
