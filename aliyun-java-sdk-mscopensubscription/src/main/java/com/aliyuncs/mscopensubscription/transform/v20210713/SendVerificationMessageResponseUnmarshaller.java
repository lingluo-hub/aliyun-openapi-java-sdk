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

package com.aliyuncs.mscopensubscription.transform.v20210713;

import com.aliyuncs.mscopensubscription.model.v20210713.SendVerificationMessageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SendVerificationMessageResponseUnmarshaller {

	public static SendVerificationMessageResponse unmarshall(SendVerificationMessageResponse sendVerificationMessageResponse, UnmarshallerContext _ctx) {
		
		sendVerificationMessageResponse.setRequestId(_ctx.stringValue("SendVerificationMessageResponse.RequestId"));
		sendVerificationMessageResponse.setSuccess(_ctx.booleanValue("SendVerificationMessageResponse.Success"));
		sendVerificationMessageResponse.setCode(_ctx.stringValue("SendVerificationMessageResponse.Code"));
		sendVerificationMessageResponse.setMessage(_ctx.stringValue("SendVerificationMessageResponse.Message"));
		sendVerificationMessageResponse.setResult(_ctx.integerValue("SendVerificationMessageResponse.Result"));
	 
	 	return sendVerificationMessageResponse;
	}
}