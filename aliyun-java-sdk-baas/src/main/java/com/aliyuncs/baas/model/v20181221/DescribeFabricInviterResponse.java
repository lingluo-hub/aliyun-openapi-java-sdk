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
import com.aliyuncs.baas.transform.v20181221.DescribeFabricInviterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFabricInviterResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer errorCode;

	private Result result;

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

		private Long inviterId;

		private String expireTime;

		private String consortiumId;

		private String consortiumName;

		private String inviterName;

		public Long getInviterId() {
			return this.inviterId;
		}

		public void setInviterId(Long inviterId) {
			this.inviterId = inviterId;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getConsortiumId() {
			return this.consortiumId;
		}

		public void setConsortiumId(String consortiumId) {
			this.consortiumId = consortiumId;
		}

		public String getConsortiumName() {
			return this.consortiumName;
		}

		public void setConsortiumName(String consortiumName) {
			this.consortiumName = consortiumName;
		}

		public String getInviterName() {
			return this.inviterName;
		}

		public void setInviterName(String inviterName) {
			this.inviterName = inviterName;
		}
	}

	@Override
	public DescribeFabricInviterResponse getInstance(UnmarshallerContext context) {
		return	DescribeFabricInviterResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
