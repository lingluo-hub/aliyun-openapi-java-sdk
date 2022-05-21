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

import com.aliyuncs.mscopensubscription.model.v20210713.UpdateWebhookResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateWebhookResponseUnmarshaller {

	public static UpdateWebhookResponse unmarshall(UpdateWebhookResponse updateWebhookResponse, UnmarshallerContext _ctx) {
		
		updateWebhookResponse.setRequestId(_ctx.stringValue("UpdateWebhookResponse.RequestId"));
		updateWebhookResponse.setResult(_ctx.booleanValue("UpdateWebhookResponse.Result"));
		updateWebhookResponse.setSuccess(_ctx.booleanValue("UpdateWebhookResponse.Success"));
		updateWebhookResponse.setCode(_ctx.stringValue("UpdateWebhookResponse.Code"));
		updateWebhookResponse.setMessage(_ctx.stringValue("UpdateWebhookResponse.Message"));
	 
	 	return updateWebhookResponse;
	}
}