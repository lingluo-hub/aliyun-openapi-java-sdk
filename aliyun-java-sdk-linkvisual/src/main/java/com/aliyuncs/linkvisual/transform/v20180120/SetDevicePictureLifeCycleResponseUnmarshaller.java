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

import com.aliyuncs.linkvisual.model.v20180120.SetDevicePictureLifeCycleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetDevicePictureLifeCycleResponseUnmarshaller {

	public static SetDevicePictureLifeCycleResponse unmarshall(SetDevicePictureLifeCycleResponse setDevicePictureLifeCycleResponse, UnmarshallerContext _ctx) {
		
		setDevicePictureLifeCycleResponse.setRequestId(_ctx.stringValue("SetDevicePictureLifeCycleResponse.RequestId"));
		setDevicePictureLifeCycleResponse.setCode(_ctx.stringValue("SetDevicePictureLifeCycleResponse.Code"));
		setDevicePictureLifeCycleResponse.setErrorMessage(_ctx.stringValue("SetDevicePictureLifeCycleResponse.ErrorMessage"));
		setDevicePictureLifeCycleResponse.setSuccess(_ctx.booleanValue("SetDevicePictureLifeCycleResponse.Success"));
	 
	 	return setDevicePictureLifeCycleResponse;
	}
}