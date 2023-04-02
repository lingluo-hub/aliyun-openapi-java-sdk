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
import com.aliyuncs.cloudapi.transform.v20160714.DescribeSystemParametersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSystemParametersResponse extends AcsResponse {

	private String requestId;

	private List<SystemParamItem> systemParams;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SystemParamItem> getSystemParams() {
		return this.systemParams;
	}

	public void setSystemParams(List<SystemParamItem> systemParams) {
		this.systemParams = systemParams;
	}

	public static class SystemParamItem {

		private String demoValue;

		private String description;

		private String paramName;

		private String paramType;

		public String getDemoValue() {
			return this.demoValue;
		}

		public void setDemoValue(String demoValue) {
			this.demoValue = demoValue;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getParamName() {
			return this.paramName;
		}

		public void setParamName(String paramName) {
			this.paramName = paramName;
		}

		public String getParamType() {
			return this.paramType;
		}

		public void setParamType(String paramType) {
			this.paramType = paramType;
		}
	}

	@Override
	public DescribeSystemParametersResponse getInstance(UnmarshallerContext context) {
		return	DescribeSystemParametersResponseUnmarshaller.unmarshall(this, context);
	}
}
