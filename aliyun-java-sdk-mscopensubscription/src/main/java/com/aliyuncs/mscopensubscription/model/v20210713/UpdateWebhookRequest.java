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
public class UpdateWebhookRequest extends RpcAcsRequest<UpdateWebhookResponse> {
	   

	private Long webhookId;

	private String clientToken;

	private String webhookName;

	private String locale;

	private String serverUrl;
	public UpdateWebhookRequest() {
		super("MscOpenSubscription", "2021-07-13", "UpdateWebhook");
		setMethod(MethodType.POST);
	}

	public Long getWebhookId() {
		return this.webhookId;
	}

	public void setWebhookId(Long webhookId) {
		this.webhookId = webhookId;
		if(webhookId != null){
			putBodyParameter("WebhookId", webhookId.toString());
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getWebhookName() {
		return this.webhookName;
	}

	public void setWebhookName(String webhookName) {
		this.webhookName = webhookName;
		if(webhookName != null){
			putBodyParameter("WebhookName", webhookName);
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

	public String getServerUrl() {
		return this.serverUrl;
	}

	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
		if(serverUrl != null){
			putBodyParameter("ServerUrl", serverUrl);
		}
	}

	@Override
	public Class<UpdateWebhookResponse> getResponseClass() {
		return UpdateWebhookResponse.class;
	}

}
