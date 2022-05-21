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

package com.aliyuncs.cciotgw.transform.v20210721;

import com.aliyuncs.cciotgw.model.v20210721.GetFreeIpCountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFreeIpCountResponseUnmarshaller {

	public static GetFreeIpCountResponse unmarshall(GetFreeIpCountResponse getFreeIpCountResponse, UnmarshallerContext _ctx) {
		
		getFreeIpCountResponse.setRequestId(_ctx.stringValue("GetFreeIpCountResponse.RequestId"));
		getFreeIpCountResponse.setCode(_ctx.stringValue("GetFreeIpCountResponse.Code"));
		getFreeIpCountResponse.setMessage(_ctx.stringValue("GetFreeIpCountResponse.Message"));
		getFreeIpCountResponse.setSuccess(_ctx.stringValue("GetFreeIpCountResponse.Success"));
		getFreeIpCountResponse.setCount(_ctx.integerValue("GetFreeIpCountResponse.Count"));
	 
	 	return getFreeIpCountResponse;
	}
}