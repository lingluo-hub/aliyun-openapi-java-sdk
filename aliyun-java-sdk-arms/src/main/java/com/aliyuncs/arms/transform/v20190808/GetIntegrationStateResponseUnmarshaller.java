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

package com.aliyuncs.arms.transform.v20190808;

import com.aliyuncs.arms.model.v20190808.GetIntegrationStateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetIntegrationStateResponseUnmarshaller {

	public static GetIntegrationStateResponse unmarshall(GetIntegrationStateResponse getIntegrationStateResponse, UnmarshallerContext _ctx) {
		
		getIntegrationStateResponse.setRequestId(_ctx.stringValue("GetIntegrationStateResponse.RequestId"));
		getIntegrationStateResponse.setState(_ctx.booleanValue("GetIntegrationStateResponse.State"));
		getIntegrationStateResponse.setCode(_ctx.integerValue("GetIntegrationStateResponse.Code"));
		getIntegrationStateResponse.setMessage(_ctx.stringValue("GetIntegrationStateResponse.Message"));
	 
	 	return getIntegrationStateResponse;
	}
}