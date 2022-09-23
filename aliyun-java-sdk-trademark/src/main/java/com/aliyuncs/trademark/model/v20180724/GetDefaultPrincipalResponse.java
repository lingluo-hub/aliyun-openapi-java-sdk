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

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20180724.GetDefaultPrincipalResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDefaultPrincipalResponse extends AcsResponse {

	private String principalDescription;

	private String principalName;

	private String requestId;

	private Integer principalValue;

	public String getPrincipalDescription() {
		return this.principalDescription;
	}

	public void setPrincipalDescription(String principalDescription) {
		this.principalDescription = principalDescription;
	}

	public String getPrincipalName() {
		return this.principalName;
	}

	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPrincipalValue() {
		return this.principalValue;
	}

	public void setPrincipalValue(Integer principalValue) {
		this.principalValue = principalValue;
	}

	@Override
	public GetDefaultPrincipalResponse getInstance(UnmarshallerContext context) {
		return	GetDefaultPrincipalResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
