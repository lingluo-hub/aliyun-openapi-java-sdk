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

import com.aliyuncs.sae.model.v20190506.RollbackApplicationResponse;
import com.aliyuncs.sae.model.v20190506.RollbackApplicationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RollbackApplicationResponseUnmarshaller {

	public static RollbackApplicationResponse unmarshall(RollbackApplicationResponse rollbackApplicationResponse, UnmarshallerContext _ctx) {
		
		rollbackApplicationResponse.setRequestId(_ctx.stringValue("RollbackApplicationResponse.RequestId"));
		rollbackApplicationResponse.setMessage(_ctx.stringValue("RollbackApplicationResponse.Message"));
		rollbackApplicationResponse.setTraceId(_ctx.stringValue("RollbackApplicationResponse.TraceId"));
		rollbackApplicationResponse.setErrorCode(_ctx.stringValue("RollbackApplicationResponse.ErrorCode"));
		rollbackApplicationResponse.setCode(_ctx.stringValue("RollbackApplicationResponse.Code"));
		rollbackApplicationResponse.setSuccess(_ctx.booleanValue("RollbackApplicationResponse.Success"));

		Data data = new Data();
		data.setChangeOrderId(_ctx.stringValue("RollbackApplicationResponse.Data.ChangeOrderId"));
		data.setIsNeedApproval(_ctx.booleanValue("RollbackApplicationResponse.Data.IsNeedApproval"));
		rollbackApplicationResponse.setData(data);
	 
	 	return rollbackApplicationResponse;
	}
}