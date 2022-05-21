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

package com.aliyuncs.adb.model.v20190315;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.ModifyAuditLogConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyAuditLogConfigResponse extends AcsResponse {

	private String requestId;

	private Boolean updateSucceed;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getUpdateSucceed() {
		return this.updateSucceed;
	}

	public void setUpdateSucceed(Boolean updateSucceed) {
		this.updateSucceed = updateSucceed;
	}

	@Override
	public ModifyAuditLogConfigResponse getInstance(UnmarshallerContext context) {
		return	ModifyAuditLogConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
