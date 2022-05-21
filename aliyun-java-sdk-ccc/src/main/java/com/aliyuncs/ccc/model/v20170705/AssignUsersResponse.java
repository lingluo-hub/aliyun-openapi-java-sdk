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

package com.aliyuncs.ccc.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20170705.AssignUsersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AssignUsersResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private List<User> data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

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

	public List<User> getData() {
		return this.data;
	}

	public void setData(List<User> data) {
		this.data = data;
	}

	public static class User {

		private String instanceId;

		private String userId;

		private String ramId;

		private Boolean primary;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getRamId() {
			return this.ramId;
		}

		public void setRamId(String ramId) {
			this.ramId = ramId;
		}

		public Boolean getPrimary() {
			return this.primary;
		}

		public void setPrimary(Boolean primary) {
			this.primary = primary;
		}
	}

	@Override
	public AssignUsersResponse getInstance(UnmarshallerContext context) {
		return	AssignUsersResponseUnmarshaller.unmarshall(this, context);
	}
}
