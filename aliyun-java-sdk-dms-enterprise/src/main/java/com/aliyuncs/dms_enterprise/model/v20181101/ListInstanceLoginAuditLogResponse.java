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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.ListInstanceLoginAuditLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInstanceLoginAuditLogResponse extends AcsResponse {

	private Long totalCount;

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private List<InstanceLoginAuditLog> instanceLoginAuditLogList;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<InstanceLoginAuditLog> getInstanceLoginAuditLogList() {
		return this.instanceLoginAuditLogList;
	}

	public void setInstanceLoginAuditLogList(List<InstanceLoginAuditLog> instanceLoginAuditLogList) {
		this.instanceLoginAuditLogList = instanceLoginAuditLogList;
	}

	public static class InstanceLoginAuditLog {

		private String opTime;

		private String userName;

		private Long userId;

		private String instanceName;

		private Long instanceId;

		private String dbUser;

		private String requestIp;

		public String getOpTime() {
			return this.opTime;
		}

		public void setOpTime(String opTime) {
			this.opTime = opTime;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public Long getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(Long instanceId) {
			this.instanceId = instanceId;
		}

		public String getDbUser() {
			return this.dbUser;
		}

		public void setDbUser(String dbUser) {
			this.dbUser = dbUser;
		}

		public String getRequestIp() {
			return this.requestIp;
		}

		public void setRequestIp(String requestIp) {
			this.requestIp = requestIp;
		}
	}

	@Override
	public ListInstanceLoginAuditLogResponse getInstance(UnmarshallerContext context) {
		return	ListInstanceLoginAuditLogResponseUnmarshaller.unmarshall(this, context);
	}
}
