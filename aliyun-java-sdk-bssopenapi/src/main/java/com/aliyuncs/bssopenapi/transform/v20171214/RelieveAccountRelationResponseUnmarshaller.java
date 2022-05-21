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

import com.aliyuncs.bssopenapi.model.v20171214.RelieveAccountRelationResponse;
import com.aliyuncs.bssopenapi.model.v20171214.RelieveAccountRelationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RelieveAccountRelationResponseUnmarshaller {

	public static RelieveAccountRelationResponse unmarshall(RelieveAccountRelationResponse relieveAccountRelationResponse, UnmarshallerContext _ctx) {
		
		relieveAccountRelationResponse.setRequestId(_ctx.stringValue("RelieveAccountRelationResponse.RequestId"));
		relieveAccountRelationResponse.setCode(_ctx.stringValue("RelieveAccountRelationResponse.Code"));
		relieveAccountRelationResponse.setMessage(_ctx.stringValue("RelieveAccountRelationResponse.Message"));
		relieveAccountRelationResponse.setSuccess(_ctx.booleanValue("RelieveAccountRelationResponse.Success"));

		Data data = new Data();
		data.setHostId(_ctx.stringValue("RelieveAccountRelationResponse.Data.HostId"));
		relieveAccountRelationResponse.setData(data);
	 
	 	return relieveAccountRelationResponse;
	}
}