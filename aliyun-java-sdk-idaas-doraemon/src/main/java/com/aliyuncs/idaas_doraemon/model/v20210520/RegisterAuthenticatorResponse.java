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

package com.aliyuncs.idaas_doraemon.model.v20210520;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.idaas_doraemon.transform.v20210520.RegisterAuthenticatorResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RegisterAuthenticatorResponse extends AcsResponse {

	private String requestId;

	private String authenticatorUuid;

	private String etasResponseSting;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAuthenticatorUuid() {
		return this.authenticatorUuid;
	}

	public void setAuthenticatorUuid(String authenticatorUuid) {
		this.authenticatorUuid = authenticatorUuid;
	}

	public String getEtasResponseSting() {
		return this.etasResponseSting;
	}

	public void setEtasResponseSting(String etasResponseSting) {
		this.etasResponseSting = etasResponseSting;
	}

	@Override
	public RegisterAuthenticatorResponse getInstance(UnmarshallerContext context) {
		return	RegisterAuthenticatorResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
