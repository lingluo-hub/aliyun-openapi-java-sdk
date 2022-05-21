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

package com.aliyuncs.bssopenapi.transform.v20171214;

import com.aliyuncs.bssopenapi.model.v20171214.EnableBillGenerationResponse;
import com.aliyuncs.bssopenapi.model.v20171214.EnableBillGenerationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableBillGenerationResponseUnmarshaller {

	public static EnableBillGenerationResponse unmarshall(EnableBillGenerationResponse enableBillGenerationResponse, UnmarshallerContext _ctx) {
		
		enableBillGenerationResponse.setRequestId(_ctx.stringValue("EnableBillGenerationResponse.RequestId"));
		enableBillGenerationResponse.setCode(_ctx.stringValue("EnableBillGenerationResponse.Code"));
		enableBillGenerationResponse.setMessage(_ctx.stringValue("EnableBillGenerationResponse.Message"));
		enableBillGenerationResponse.setSuccess(_ctx.booleanValue("EnableBillGenerationResponse.Success"));

		Data data = new Data();
		data.set_Boolean(_ctx.booleanValue("EnableBillGenerationResponse.Data.Boolean"));
		enableBillGenerationResponse.setData(data);
	 
	 	return enableBillGenerationResponse;
	}
}