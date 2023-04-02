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

import com.aliyuncs.linkvisual.model.v20180120.TriggerCapturePictureResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TriggerCapturePictureResponseUnmarshaller {

	public static TriggerCapturePictureResponse unmarshall(TriggerCapturePictureResponse triggerCapturePictureResponse, UnmarshallerContext _ctx) {
		
		triggerCapturePictureResponse.setRequestId(_ctx.stringValue("TriggerCapturePictureResponse.RequestId"));
		triggerCapturePictureResponse.setCode(_ctx.stringValue("TriggerCapturePictureResponse.Code"));
		triggerCapturePictureResponse.setData(_ctx.stringValue("TriggerCapturePictureResponse.Data"));
		triggerCapturePictureResponse.setErrorMessage(_ctx.stringValue("TriggerCapturePictureResponse.ErrorMessage"));
		triggerCapturePictureResponse.setSuccess(_ctx.booleanValue("TriggerCapturePictureResponse.Success"));
	 
	 	return triggerCapturePictureResponse;
	}
}