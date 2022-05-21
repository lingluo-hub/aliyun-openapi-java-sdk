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

import com.aliyuncs.mscopensubscription.model.v20210713.CreateWebhookResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateWebhookResponseUnmarshaller {

	public static CreateWebhookResponse unmarshall(CreateWebhookResponse createWebhookResponse, UnmarshallerContext _ctx) {
		
		createWebhookResponse.setRequestId(_ctx.stringValue("CreateWebhookResponse.RequestId"));
		createWebhookResponse.setWebhookId(_ctx.longValue("CreateWebhookResponse.WebhookId"));
		createWebhookResponse.setSuccess(_ctx.booleanValue("CreateWebhookResponse.Success"));
		createWebhookResponse.setCode(_ctx.stringValue("CreateWebhookResponse.Code"));
		createWebhookResponse.setMessage(_ctx.stringValue("CreateWebhookResponse.Message"));
	 
	 	return createWebhookResponse;
	}
}