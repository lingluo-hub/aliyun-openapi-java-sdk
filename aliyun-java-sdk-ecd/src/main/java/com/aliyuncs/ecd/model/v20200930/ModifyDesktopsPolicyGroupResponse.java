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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.ModifyDesktopsPolicyGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyDesktopsPolicyGroupResponse extends AcsResponse {

	private String requestId;

	private List<ModifyResult> modifyResults;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ModifyResult> getModifyResults() {
		return this.modifyResults;
	}

	public void setModifyResults(List<ModifyResult> modifyResults) {
		this.modifyResults = modifyResults;
	}

	public static class ModifyResult {

		private String code;

		private String message;

		private String desktopId;

		private Boolean checkResult;

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

		public String getDesktopId() {
			return this.desktopId;
		}

		public void setDesktopId(String desktopId) {
			this.desktopId = desktopId;
		}

		public Boolean getCheckResult() {
			return this.checkResult;
		}

		public void setCheckResult(Boolean checkResult) {
			this.checkResult = checkResult;
		}
	}

	@Override
	public ModifyDesktopsPolicyGroupResponse getInstance(UnmarshallerContext context) {
		return	ModifyDesktopsPolicyGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
