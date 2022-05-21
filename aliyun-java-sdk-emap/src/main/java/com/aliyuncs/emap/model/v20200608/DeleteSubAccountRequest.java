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

package com.aliyuncs.emap.model.v20200608;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteSubAccountRequest extends RpcAcsRequest<DeleteSubAccountResponse> {
	   

	private Long accountId;
	public DeleteSubAccountRequest() {
		super("emap", "2020-06-08", "DeleteSubAccount");
		setMethod(MethodType.POST);
	}

	public Long getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
		if(accountId != null){
			putBodyParameter("AccountId", accountId.toString());
		}
	}

	@Override
	public Class<DeleteSubAccountResponse> getResponseClass() {
		return DeleteSubAccountResponse.class;
	}

}
