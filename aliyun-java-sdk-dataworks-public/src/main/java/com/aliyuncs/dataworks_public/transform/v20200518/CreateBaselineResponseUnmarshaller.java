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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.CreateBaselineResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateBaselineResponseUnmarshaller {

	public static CreateBaselineResponse unmarshall(CreateBaselineResponse createBaselineResponse, UnmarshallerContext _ctx) {
		
		createBaselineResponse.setRequestId(_ctx.stringValue("CreateBaselineResponse.RequestId"));
		createBaselineResponse.setSuccess(_ctx.booleanValue("CreateBaselineResponse.Success"));
		createBaselineResponse.setErrorCode(_ctx.stringValue("CreateBaselineResponse.ErrorCode"));
		createBaselineResponse.setErrorMessage(_ctx.stringValue("CreateBaselineResponse.ErrorMessage"));
		createBaselineResponse.setHttpStatusCode(_ctx.integerValue("CreateBaselineResponse.HttpStatusCode"));
		createBaselineResponse.setData(_ctx.longValue("CreateBaselineResponse.Data"));
		createBaselineResponse.setDynamicErrorCode(_ctx.stringValue("CreateBaselineResponse.DynamicErrorCode"));
		createBaselineResponse.setDynamicErrorMessage(_ctx.stringValue("CreateBaselineResponse.DynamicErrorMessage"));
	 
	 	return createBaselineResponse;
	}
}