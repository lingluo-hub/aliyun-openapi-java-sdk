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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.DisableUserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableUserResponseUnmarshaller {

	public static DisableUserResponse unmarshall(DisableUserResponse disableUserResponse, UnmarshallerContext _ctx) {
		
		disableUserResponse.setRequestId(_ctx.stringValue("DisableUserResponse.RequestId"));
		disableUserResponse.setErrorCode(_ctx.stringValue("DisableUserResponse.ErrorCode"));
		disableUserResponse.setErrorMessage(_ctx.stringValue("DisableUserResponse.ErrorMessage"));
		disableUserResponse.setSuccess(_ctx.booleanValue("DisableUserResponse.Success"));
	 
	 	return disableUserResponse;
	}
}