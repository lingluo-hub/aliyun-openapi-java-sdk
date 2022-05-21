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

package com.aliyuncs.sgw.transform.v20180511;

import com.aliyuncs.sgw.model.v20180511.CreateGatewayLoggingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateGatewayLoggingResponseUnmarshaller {

	public static CreateGatewayLoggingResponse unmarshall(CreateGatewayLoggingResponse createGatewayLoggingResponse, UnmarshallerContext _ctx) {
		
		createGatewayLoggingResponse.setRequestId(_ctx.stringValue("CreateGatewayLoggingResponse.RequestId"));
		createGatewayLoggingResponse.setMessage(_ctx.stringValue("CreateGatewayLoggingResponse.Message"));
		createGatewayLoggingResponse.setCode(_ctx.stringValue("CreateGatewayLoggingResponse.Code"));
		createGatewayLoggingResponse.setSuccess(_ctx.booleanValue("CreateGatewayLoggingResponse.Success"));
	 
	 	return createGatewayLoggingResponse;
	}
}