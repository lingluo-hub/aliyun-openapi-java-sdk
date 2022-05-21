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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.CreateApplicationResponse;
import com.aliyuncs.sae.model.v20190506.CreateApplicationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateApplicationResponseUnmarshaller {

	public static CreateApplicationResponse unmarshall(CreateApplicationResponse createApplicationResponse, UnmarshallerContext _ctx) {
		
		createApplicationResponse.setRequestId(_ctx.stringValue("CreateApplicationResponse.RequestId"));
		createApplicationResponse.setMessage(_ctx.stringValue("CreateApplicationResponse.Message"));
		createApplicationResponse.setTraceId(_ctx.stringValue("CreateApplicationResponse.TraceId"));
		createApplicationResponse.setErrorCode(_ctx.stringValue("CreateApplicationResponse.ErrorCode"));
		createApplicationResponse.setCode(_ctx.stringValue("CreateApplicationResponse.Code"));
		createApplicationResponse.setSuccess(_ctx.booleanValue("CreateApplicationResponse.Success"));

		Data data = new Data();
		data.setChangeOrderId(_ctx.stringValue("CreateApplicationResponse.Data.ChangeOrderId"));
		data.setAppId(_ctx.stringValue("CreateApplicationResponse.Data.AppId"));
		createApplicationResponse.setData(data);
	 
	 	return createApplicationResponse;
	}
}