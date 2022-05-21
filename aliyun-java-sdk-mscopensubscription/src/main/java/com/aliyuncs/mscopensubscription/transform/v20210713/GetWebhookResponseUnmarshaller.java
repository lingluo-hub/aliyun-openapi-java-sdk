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

import com.aliyuncs.mscopensubscription.model.v20210713.GetWebhookResponse;
import com.aliyuncs.mscopensubscription.model.v20210713.GetWebhookResponse.Webhook;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWebhookResponseUnmarshaller {

	public static GetWebhookResponse unmarshall(GetWebhookResponse getWebhookResponse, UnmarshallerContext _ctx) {
		
		getWebhookResponse.setRequestId(_ctx.stringValue("GetWebhookResponse.RequestId"));
		getWebhookResponse.setSuccess(_ctx.booleanValue("GetWebhookResponse.Success"));
		getWebhookResponse.setCode(_ctx.stringValue("GetWebhookResponse.Code"));
		getWebhookResponse.setMessage(_ctx.stringValue("GetWebhookResponse.Message"));

		Webhook webhook = new Webhook();
		webhook.setWebhookId(_ctx.longValue("GetWebhookResponse.Webhook.WebhookId"));
		webhook.setServerUrl(_ctx.stringValue("GetWebhookResponse.Webhook.ServerUrl"));
		webhook.setWebhookName(_ctx.stringValue("GetWebhookResponse.Webhook.WebhookName"));
		getWebhookResponse.setWebhook(webhook);
	 
	 	return getWebhookResponse;
	}
}