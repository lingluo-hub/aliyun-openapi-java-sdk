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

package com.aliyuncs.netana.model.v20181018;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.netana.transform.v20181018.CreateNetworkDiagnosticResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateNetworkDiagnosticResponse extends AcsResponse {

	private String status;

	private String tpl;

	private String requestId;

	private String params;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTpl() {
		return this.tpl;
	}

	public void setTpl(String tpl) {
		this.tpl = tpl;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	@Override
	public CreateNetworkDiagnosticResponse getInstance(UnmarshallerContext context) {
		return	CreateNetworkDiagnosticResponseUnmarshaller.unmarshall(this, context);
	}
}
