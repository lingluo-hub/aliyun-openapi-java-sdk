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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeClientUserDNSResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClientUserDNSResponse extends AcsResponse {

	private String requestId;

	private List<String> appDNS;

	private List<String> recoveredDNS;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getAppDNS() {
		return this.appDNS;
	}

	public void setAppDNS(List<String> appDNS) {
		this.appDNS = appDNS;
	}

	public List<String> getRecoveredDNS() {
		return this.recoveredDNS;
	}

	public void setRecoveredDNS(List<String> recoveredDNS) {
		this.recoveredDNS = recoveredDNS;
	}

	@Override
	public DescribeClientUserDNSResponse getInstance(UnmarshallerContext context) {
		return	DescribeClientUserDNSResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
