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

package com.aliyuncs.adb.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeEIURangeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEIURangeResponse extends AcsResponse {

	private String requestId;

	private EIUInfo eIUInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public EIUInfo getEIUInfo() {
		return this.eIUInfo;
	}

	public void setEIUInfo(EIUInfo eIUInfo) {
		this.eIUInfo = eIUInfo;
	}

	public static class EIUInfo {

		private String defaultValue;

		private List<Long> eIURange;

		public String getDefaultValue() {
			return this.defaultValue;
		}

		public void setDefaultValue(String defaultValue) {
			this.defaultValue = defaultValue;
		}

		public List<Long> getEIURange() {
			return this.eIURange;
		}

		public void setEIURange(List<Long> eIURange) {
			this.eIURange = eIURange;
		}
	}

	@Override
	public DescribeEIURangeResponse getInstance(UnmarshallerContext context) {
		return	DescribeEIURangeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
