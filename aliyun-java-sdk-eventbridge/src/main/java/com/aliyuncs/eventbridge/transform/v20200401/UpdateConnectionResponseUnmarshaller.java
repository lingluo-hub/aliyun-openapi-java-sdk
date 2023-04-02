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

package com.aliyuncs.eventbridge.transform.v20200401;

import com.aliyuncs.eventbridge.model.v20200401.UpdateConnectionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateConnectionResponseUnmarshaller {

	public static UpdateConnectionResponse unmarshall(UpdateConnectionResponse updateConnectionResponse, UnmarshallerContext _ctx) {
		
		updateConnectionResponse.setRequestId(_ctx.stringValue("UpdateConnectionResponse.RequestId"));
		updateConnectionResponse.setMessage(_ctx.stringValue("UpdateConnectionResponse.Message"));
		updateConnectionResponse.setCode(_ctx.stringValue("UpdateConnectionResponse.Code"));
	 
	 	return updateConnectionResponse;
	}
}