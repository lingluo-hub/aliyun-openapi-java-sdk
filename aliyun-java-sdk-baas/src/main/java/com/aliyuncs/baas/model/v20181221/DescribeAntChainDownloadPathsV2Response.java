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
import com.aliyuncs.baas.transform.v20181221.DescribeAntChainDownloadPathsV2ResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAntChainDownloadPathsV2Response extends AcsResponse {

	private String httpStatusCode;

	private String requestId;

	private Boolean success;

	private String resultMessage;

	private String code;

	private String message;

	private String resultCode;

	private Result result;

	public String getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
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

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String sdkUrl;

		private String caCrtUrl;

		private String clientCrtUrl;

		private String trustCaUrl;

		public String getSdkUrl() {
			return this.sdkUrl;
		}

		public void setSdkUrl(String sdkUrl) {
			this.sdkUrl = sdkUrl;
		}

		public String getCaCrtUrl() {
			return this.caCrtUrl;
		}

		public void setCaCrtUrl(String caCrtUrl) {
			this.caCrtUrl = caCrtUrl;
		}

		public String getClientCrtUrl() {
			return this.clientCrtUrl;
		}

		public void setClientCrtUrl(String clientCrtUrl) {
			this.clientCrtUrl = clientCrtUrl;
		}

		public String getTrustCaUrl() {
			return this.trustCaUrl;
		}

		public void setTrustCaUrl(String trustCaUrl) {
			this.trustCaUrl = trustCaUrl;
		}
	}

	@Override
	public DescribeAntChainDownloadPathsV2Response getInstance(UnmarshallerContext context) {
		return	DescribeAntChainDownloadPathsV2ResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
