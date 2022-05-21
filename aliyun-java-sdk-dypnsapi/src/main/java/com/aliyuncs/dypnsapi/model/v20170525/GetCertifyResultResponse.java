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

package com.aliyuncs.dypnsapi.model.v20170525;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dypnsapi.transform.v20170525.GetCertifyResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCertifyResultResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private List<DataItem> data;

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String materialInfo;

		private String identityInfo;

		private String verifyDesc;

		private String verifyResult;

		private String deviceToken;

		public String getMaterialInfo() {
			return this.materialInfo;
		}

		public void setMaterialInfo(String materialInfo) {
			this.materialInfo = materialInfo;
		}

		public String getIdentityInfo() {
			return this.identityInfo;
		}

		public void setIdentityInfo(String identityInfo) {
			this.identityInfo = identityInfo;
		}

		public String getVerifyDesc() {
			return this.verifyDesc;
		}

		public void setVerifyDesc(String verifyDesc) {
			this.verifyDesc = verifyDesc;
		}

		public String getVerifyResult() {
			return this.verifyResult;
		}

		public void setVerifyResult(String verifyResult) {
			this.verifyResult = verifyResult;
		}

		public String getDeviceToken() {
			return this.deviceToken;
		}

		public void setDeviceToken(String deviceToken) {
			this.deviceToken = deviceToken;
		}
	}

	@Override
	public GetCertifyResultResponse getInstance(UnmarshallerContext context) {
		return	GetCertifyResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
