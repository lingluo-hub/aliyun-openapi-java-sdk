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

package com.aliyuncs.baas.model.v20181221;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20181221.SubmitFabricChaincodeDefinitionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SubmitFabricChaincodeDefinitionResponse extends AcsResponse {

	private String message;

	private String requestId;

	private Boolean success;

	private Integer errorCode;

	private Result result;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String name;

		private String version;

		private String input;

		private Integer type;

		private String state;

		private String path;

		private String chaincodeId;

		private Boolean install;

		private String message;

		private String createTime;

		private String deployTime;

		private String channelName;

		private String endorsePolicy;

		private String consortiumId;

		private String providerId;

		private String providerName;

		private String channelId;

		private Boolean management;

		private String chaincodePackageId;

		private Boolean initRequired;

		private String chaincodeDefinitionId;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getInput() {
			return this.input;
		}

		public void setInput(String input) {
			this.input = input;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getChaincodeId() {
			return this.chaincodeId;
		}

		public void setChaincodeId(String chaincodeId) {
			this.chaincodeId = chaincodeId;
		}

		public Boolean getInstall() {
			return this.install;
		}

		public void setInstall(Boolean install) {
			this.install = install;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getDeployTime() {
			return this.deployTime;
		}

		public void setDeployTime(String deployTime) {
			this.deployTime = deployTime;
		}

		public String getChannelName() {
			return this.channelName;
		}

		public void setChannelName(String channelName) {
			this.channelName = channelName;
		}

		public String getEndorsePolicy() {
			return this.endorsePolicy;
		}

		public void setEndorsePolicy(String endorsePolicy) {
			this.endorsePolicy = endorsePolicy;
		}

		public String getConsortiumId() {
			return this.consortiumId;
		}

		public void setConsortiumId(String consortiumId) {
			this.consortiumId = consortiumId;
		}

		public String getProviderId() {
			return this.providerId;
		}

		public void setProviderId(String providerId) {
			this.providerId = providerId;
		}

		public String getProviderName() {
			return this.providerName;
		}

		public void setProviderName(String providerName) {
			this.providerName = providerName;
		}

		public String getChannelId() {
			return this.channelId;
		}

		public void setChannelId(String channelId) {
			this.channelId = channelId;
		}

		public Boolean getManagement() {
			return this.management;
		}

		public void setManagement(Boolean management) {
			this.management = management;
		}

		public String getChaincodePackageId() {
			return this.chaincodePackageId;
		}

		public void setChaincodePackageId(String chaincodePackageId) {
			this.chaincodePackageId = chaincodePackageId;
		}

		public Boolean getInitRequired() {
			return this.initRequired;
		}

		public void setInitRequired(Boolean initRequired) {
			this.initRequired = initRequired;
		}

		public String getChaincodeDefinitionId() {
			return this.chaincodeDefinitionId;
		}

		public void setChaincodeDefinitionId(String chaincodeDefinitionId) {
			this.chaincodeDefinitionId = chaincodeDefinitionId;
		}
	}

	@Override
	public SubmitFabricChaincodeDefinitionResponse getInstance(UnmarshallerContext context) {
		return	SubmitFabricChaincodeDefinitionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
