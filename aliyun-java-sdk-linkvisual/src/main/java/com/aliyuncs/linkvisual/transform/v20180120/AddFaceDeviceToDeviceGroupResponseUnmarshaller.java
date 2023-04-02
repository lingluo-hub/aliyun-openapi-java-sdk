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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.AddFaceDeviceToDeviceGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddFaceDeviceToDeviceGroupResponseUnmarshaller {

	public static AddFaceDeviceToDeviceGroupResponse unmarshall(AddFaceDeviceToDeviceGroupResponse addFaceDeviceToDeviceGroupResponse, UnmarshallerContext _ctx) {
		
		addFaceDeviceToDeviceGroupResponse.setRequestId(_ctx.stringValue("AddFaceDeviceToDeviceGroupResponse.RequestId"));
		addFaceDeviceToDeviceGroupResponse.setCode(_ctx.stringValue("AddFaceDeviceToDeviceGroupResponse.Code"));
		addFaceDeviceToDeviceGroupResponse.setErrorMessage(_ctx.stringValue("AddFaceDeviceToDeviceGroupResponse.ErrorMessage"));
		addFaceDeviceToDeviceGroupResponse.setSuccess(_ctx.booleanValue("AddFaceDeviceToDeviceGroupResponse.Success"));
	 
	 	return addFaceDeviceToDeviceGroupResponse;
	}
}