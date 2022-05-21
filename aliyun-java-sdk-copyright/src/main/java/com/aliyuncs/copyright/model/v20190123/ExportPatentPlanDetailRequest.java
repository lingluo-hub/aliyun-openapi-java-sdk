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
public class ExportPatentPlanDetailRequest extends RpcAcsRequest<ExportPatentPlanDetailResponse> {
	   

	private Long planId;
	public ExportPatentPlanDetailRequest() {
		super("Copyright", "2019-01-23", "ExportPatentPlanDetail");
		setMethod(MethodType.GET);
	}

	public Long getPlanId() {
		return this.planId;
	}

	public void setPlanId(Long planId) {
		this.planId = planId;
		if(planId != null){
			putQueryParameter("PlanId", planId.toString());
		}
	}

	@Override
	public Class<ExportPatentPlanDetailResponse> getResponseClass() {
		return ExportPatentPlanDetailResponse.class;
	}

}
