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

package com.aliyuncs.mpaas.model.v20200415;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpaas.transform.v20200415.AddMcubeMiniprogramConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddMcubeMiniprogramConfigResponse extends AcsResponse {

	private String resultMessage;

	private String resultCode;

	private String requestId;

	private AddMiniConfigResult addMiniConfigResult;

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AddMiniConfigResult getAddMiniConfigResult() {
		return this.addMiniConfigResult;
	}

	public void setAddMiniConfigResult(AddMiniConfigResult addMiniConfigResult) {
		this.addMiniConfigResult = addMiniConfigResult;
	}

	public static class AddMiniConfigResult {

		private Boolean success;

		private String resultMsg;

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getResultMsg() {
			return this.resultMsg;
		}

		public void setResultMsg(String resultMsg) {
			this.resultMsg = resultMsg;
		}
	}

	@Override
	public AddMcubeMiniprogramConfigResponse getInstance(UnmarshallerContext context) {
		return	AddMcubeMiniprogramConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
