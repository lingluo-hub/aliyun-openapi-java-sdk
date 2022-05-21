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

package com.aliyuncs.copyright.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class BatchAsynchronousAddRequest extends RpcAcsRequest<BatchAsynchronousAddResponse> {
	   

	private String cacheKey;

	private String planId;
	public BatchAsynchronousAddRequest() {
		super("Copyright", "2019-01-23", "BatchAsynchronousAdd");
		setMethod(MethodType.POST);
	}

	public String getCacheKey() {
		return this.cacheKey;
	}

	public void setCacheKey(String cacheKey) {
		this.cacheKey = cacheKey;
		if(cacheKey != null){
			putQueryParameter("CacheKey", cacheKey);
		}
	}

	public String getPlanId() {
		return this.planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
		if(planId != null){
			putQueryParameter("PlanId", planId);
		}
	}

	@Override
	public Class<BatchAsynchronousAddResponse> getResponseClass() {
		return BatchAsynchronousAddResponse.class;
	}

}
