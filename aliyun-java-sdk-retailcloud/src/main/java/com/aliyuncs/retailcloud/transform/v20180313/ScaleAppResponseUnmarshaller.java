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

package com.aliyuncs.retailcloud.transform.v20180313;

import com.aliyuncs.retailcloud.model.v20180313.ScaleAppResponse;
import com.aliyuncs.retailcloud.model.v20180313.ScaleAppResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ScaleAppResponseUnmarshaller {

	public static ScaleAppResponse unmarshall(ScaleAppResponse scaleAppResponse, UnmarshallerContext _ctx) {
		
		scaleAppResponse.setRequestId(_ctx.stringValue("ScaleAppResponse.RequestId"));
		scaleAppResponse.setCode(_ctx.integerValue("ScaleAppResponse.Code"));
		scaleAppResponse.setErrMsg(_ctx.stringValue("ScaleAppResponse.ErrMsg"));
		scaleAppResponse.setSuccess(_ctx.booleanValue("ScaleAppResponse.Success"));

		Result result = new Result();
		result.setBusinessCode(_ctx.stringValue("ScaleAppResponse.Result.BusinessCode"));
		result.setDeployOrderId(_ctx.longValue("ScaleAppResponse.Result.DeployOrderId"));
		result.setAdmitted(_ctx.booleanValue("ScaleAppResponse.Result.Admitted"));
		scaleAppResponse.setResult(result);
	 
	 	return scaleAppResponse;
	}
}