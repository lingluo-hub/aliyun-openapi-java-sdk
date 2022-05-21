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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import com.aliyuncs.retailadvqa_public.model.v20200515.WorkSaveAudienceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class WorkSaveAudienceResponseUnmarshaller {

	public static WorkSaveAudienceResponse unmarshall(WorkSaveAudienceResponse workSaveAudienceResponse, UnmarshallerContext _ctx) {
		
		workSaveAudienceResponse.setRequestId(_ctx.stringValue("WorkSaveAudienceResponse.RequestId"));
		workSaveAudienceResponse.setData(_ctx.stringValue("WorkSaveAudienceResponse.Data"));
		workSaveAudienceResponse.setErrorCode(_ctx.stringValue("WorkSaveAudienceResponse.ErrorCode"));
		workSaveAudienceResponse.setErrorDesc(_ctx.stringValue("WorkSaveAudienceResponse.ErrorDesc"));
		workSaveAudienceResponse.setSuccess(_ctx.booleanValue("WorkSaveAudienceResponse.Success"));
		workSaveAudienceResponse.setTraceId(_ctx.stringValue("WorkSaveAudienceResponse.TraceId"));
	 
	 	return workSaveAudienceResponse;
	}
}