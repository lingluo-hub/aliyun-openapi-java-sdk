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
import com.aliyuncs.scdn.transform.v20171115.DescribeScdnDomainConfigsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScdnDomainConfigsResponse extends AcsResponse {

	private String requestId;

	private List<DomainConfig> domainConfigs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DomainConfig> getDomainConfigs() {
		return this.domainConfigs;
	}

	public void setDomainConfigs(List<DomainConfig> domainConfigs) {
		this.domainConfigs = domainConfigs;
	}

	public static class DomainConfig {

		private String status;

		private String parentId;

		private String configId;

		private String functionName;

		private List<FunctionArg> functionArgs;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getParentId() {
			return this.parentId;
		}

		public void setParentId(String parentId) {
			this.parentId = parentId;
		}

		public String getConfigId() {
			return this.configId;
		}

		public void setConfigId(String configId) {
			this.configId = configId;
		}

		public String getFunctionName() {
			return this.functionName;
		}

		public void setFunctionName(String functionName) {
			this.functionName = functionName;
		}

		public List<FunctionArg> getFunctionArgs() {
			return this.functionArgs;
		}

		public void setFunctionArgs(List<FunctionArg> functionArgs) {
			this.functionArgs = functionArgs;
		}

		public static class FunctionArg {

			private String argName;

			private String argValue;

			public String getArgName() {
				return this.argName;
			}

			public void setArgName(String argName) {
				this.argName = argName;
			}

			public String getArgValue() {
				return this.argValue;
			}

			public void setArgValue(String argValue) {
				this.argValue = argValue;
			}
		}
	}

	@Override
	public DescribeScdnDomainConfigsResponse getInstance(UnmarshallerContext context) {
		return	DescribeScdnDomainConfigsResponseUnmarshaller.unmarshall(this, context);
	}
}
