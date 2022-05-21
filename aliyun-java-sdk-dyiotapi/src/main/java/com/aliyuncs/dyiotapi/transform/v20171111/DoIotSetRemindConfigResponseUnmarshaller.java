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

package com.aliyuncs.dyiotapi.transform.v20171111;

import com.aliyuncs.dyiotapi.model.v20171111.DoIotSetRemindConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DoIotSetRemindConfigResponseUnmarshaller {

	public static DoIotSetRemindConfigResponse unmarshall(DoIotSetRemindConfigResponse doIotSetRemindConfigResponse, UnmarshallerContext _ctx) {
		
		doIotSetRemindConfigResponse.setRequestId(_ctx.stringValue("DoIotSetRemindConfigResponse.RequestId"));
		doIotSetRemindConfigResponse.setCode(_ctx.stringValue("DoIotSetRemindConfigResponse.Code"));
		doIotSetRemindConfigResponse.setMessage(_ctx.stringValue("DoIotSetRemindConfigResponse.Message"));
	 
	 	return doIotSetRemindConfigResponse;
	}
}