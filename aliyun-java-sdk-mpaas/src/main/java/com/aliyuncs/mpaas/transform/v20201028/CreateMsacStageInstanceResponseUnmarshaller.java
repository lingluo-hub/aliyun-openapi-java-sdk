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

package com.aliyuncs.mpaas.transform.v20201028;

import com.aliyuncs.mpaas.model.v20201028.CreateMsacStageInstanceResponse;
import com.aliyuncs.mpaas.model.v20201028.CreateMsacStageInstanceResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMsacStageInstanceResponseUnmarshaller {

	public static CreateMsacStageInstanceResponse unmarshall(CreateMsacStageInstanceResponse createMsacStageInstanceResponse, UnmarshallerContext _ctx) {
		
		createMsacStageInstanceResponse.setRequestId(_ctx.stringValue("CreateMsacStageInstanceResponse.RequestId"));
		createMsacStageInstanceResponse.setResultMessage(_ctx.stringValue("CreateMsacStageInstanceResponse.ResultMessage"));
		createMsacStageInstanceResponse.setResultCode(_ctx.stringValue("CreateMsacStageInstanceResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("CreateMsacStageInstanceResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("CreateMsacStageInstanceResponse.ResultContent.Message"));
		resultContent.setData(_ctx.stringValue("CreateMsacStageInstanceResponse.ResultContent.Data"));
		resultContent.setSuccess(_ctx.booleanValue("CreateMsacStageInstanceResponse.ResultContent.Success"));
		createMsacStageInstanceResponse.setResultContent(resultContent);
	 
	 	return createMsacStageInstanceResponse;
	}
}