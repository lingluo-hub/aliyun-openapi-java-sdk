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

package com.aliyuncs.slb.model.v20140515;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.DescribeListenerAccessControlAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeListenerAccessControlAttributeResponse extends AcsResponse {

	private String sourceItems;

	private String accessControlStatus;

	private String requestId;

	public String getSourceItems() {
		return this.sourceItems;
	}

	public void setSourceItems(String sourceItems) {
		this.sourceItems = sourceItems;
	}

	public String getAccessControlStatus() {
		return this.accessControlStatus;
	}

	public void setAccessControlStatus(String accessControlStatus) {
		this.accessControlStatus = accessControlStatus;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public DescribeListenerAccessControlAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeListenerAccessControlAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
