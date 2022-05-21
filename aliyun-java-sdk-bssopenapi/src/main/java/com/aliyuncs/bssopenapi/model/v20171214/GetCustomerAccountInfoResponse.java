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

package com.aliyuncs.bssopenapi.model.v20171214;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.GetCustomerAccountInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCustomerAccountInfoResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long mpk;

		private String loginEmail;

		private String hostingStatus;

		private String accountType;

		private String creditLimitStatus;

		private Boolean isCertified;

		public Long getMpk() {
			return this.mpk;
		}

		public void setMpk(Long mpk) {
			this.mpk = mpk;
		}

		public String getLoginEmail() {
			return this.loginEmail;
		}

		public void setLoginEmail(String loginEmail) {
			this.loginEmail = loginEmail;
		}

		public String getHostingStatus() {
			return this.hostingStatus;
		}

		public void setHostingStatus(String hostingStatus) {
			this.hostingStatus = hostingStatus;
		}

		public String getAccountType() {
			return this.accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}

		public String getCreditLimitStatus() {
			return this.creditLimitStatus;
		}

		public void setCreditLimitStatus(String creditLimitStatus) {
			this.creditLimitStatus = creditLimitStatus;
		}

		public Boolean getIsCertified() {
			return this.isCertified;
		}

		public void setIsCertified(Boolean isCertified) {
			this.isCertified = isCertified;
		}
	}

	@Override
	public GetCustomerAccountInfoResponse getInstance(UnmarshallerContext context) {
		return	GetCustomerAccountInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
