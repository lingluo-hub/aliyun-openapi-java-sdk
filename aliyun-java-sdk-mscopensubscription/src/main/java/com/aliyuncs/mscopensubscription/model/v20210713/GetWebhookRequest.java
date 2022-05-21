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

package com.aliyuncs.mscopensubscription.model.v20210713;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetWebhookRequest extends RpcAcsRequest<GetWebhookResponse> {
	   

	private Long webhookId;

	private String locale;
	public GetWebhookRequest() {
		super("MscOpenSubscription", "2021-07-13", "GetWebhook");
		setMethod(MethodType.GET);
	}

	public Long getWebhookId() {
		return this.webhookId;
	}

	public void setWebhookId(Long webhookId) {
		this.webhookId = webhookId;
		if(webhookId != null){
			putQueryParameter("WebhookId", webhookId.toString());
		}
	}

	public String getLocale() {
		return this.locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
		if(locale != null){
			putQueryParameter("Locale", locale);
		}
	}

	@Override
	public Class<GetWebhookResponse> getResponseClass() {
		return GetWebhookResponse.class;
	}

}
