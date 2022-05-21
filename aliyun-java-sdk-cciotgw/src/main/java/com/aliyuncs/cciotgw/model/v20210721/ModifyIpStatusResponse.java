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

package com.aliyuncs.cciotgw.model.v20210721;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cciotgw.transform.v20210721.ModifyIpStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyIpStatusResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private String success;

	private List<ErrorIp> errorIpList;

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

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public List<ErrorIp> getErrorIpList() {
		return this.errorIpList;
	}

	public void setErrorIpList(List<ErrorIp> errorIpList) {
		this.errorIpList = errorIpList;
	}

	public static class ErrorIp {

		private String cause;

		private String ip;

		public String getCause() {
			return this.cause;
		}

		public void setCause(String cause) {
			this.cause = cause;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}
	}

	@Override
	public ModifyIpStatusResponse getInstance(UnmarshallerContext context) {
		return	ModifyIpStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
