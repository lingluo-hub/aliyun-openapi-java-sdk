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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.AddMigrationTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddMigrationTaskResponse extends AcsResponse {

	private String httpCode;

	private String requestId;

	private String message;

	private String errorCode;

	private Boolean success;

	private Data data;

	public String getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(String httpCode) {
		this.httpCode = httpCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String id;

		private String userId;

		private String clusterType;

		private String originInstanceAddress;

		private String originInstanceName;

		private String originInstanceNamespace;

		private String targetInstanceId;

		private String targetClusterName;

		private String targetClusterUrl;

		private String projectDesc;

		private String gmtCreate;

		private String gmtModified;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getClusterType() {
			return this.clusterType;
		}

		public void setClusterType(String clusterType) {
			this.clusterType = clusterType;
		}

		public String getOriginInstanceAddress() {
			return this.originInstanceAddress;
		}

		public void setOriginInstanceAddress(String originInstanceAddress) {
			this.originInstanceAddress = originInstanceAddress;
		}

		public String getOriginInstanceName() {
			return this.originInstanceName;
		}

		public void setOriginInstanceName(String originInstanceName) {
			this.originInstanceName = originInstanceName;
		}

		public String getOriginInstanceNamespace() {
			return this.originInstanceNamespace;
		}

		public void setOriginInstanceNamespace(String originInstanceNamespace) {
			this.originInstanceNamespace = originInstanceNamespace;
		}

		public String getTargetInstanceId() {
			return this.targetInstanceId;
		}

		public void setTargetInstanceId(String targetInstanceId) {
			this.targetInstanceId = targetInstanceId;
		}

		public String getTargetClusterName() {
			return this.targetClusterName;
		}

		public void setTargetClusterName(String targetClusterName) {
			this.targetClusterName = targetClusterName;
		}

		public String getTargetClusterUrl() {
			return this.targetClusterUrl;
		}

		public void setTargetClusterUrl(String targetClusterUrl) {
			this.targetClusterUrl = targetClusterUrl;
		}

		public String getProjectDesc() {
			return this.projectDesc;
		}

		public void setProjectDesc(String projectDesc) {
			this.projectDesc = projectDesc;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}
	}

	@Override
	public AddMigrationTaskResponse getInstance(UnmarshallerContext context) {
		return	AddMigrationTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
