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

import com.aliyuncs.bssopenapi.model.v20171214.SetResellerUserQuotaResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetResellerUserQuotaResponseUnmarshaller {

	public static SetResellerUserQuotaResponse unmarshall(SetResellerUserQuotaResponse setResellerUserQuotaResponse, UnmarshallerContext _ctx) {
		
		setResellerUserQuotaResponse.setRequestId(_ctx.stringValue("SetResellerUserQuotaResponse.RequestId"));
		setResellerUserQuotaResponse.setCode(_ctx.stringValue("SetResellerUserQuotaResponse.Code"));
		setResellerUserQuotaResponse.setMessage(_ctx.stringValue("SetResellerUserQuotaResponse.Message"));
		setResellerUserQuotaResponse.setData(_ctx.booleanValue("SetResellerUserQuotaResponse.Data"));
		setResellerUserQuotaResponse.setSuccess(_ctx.booleanValue("SetResellerUserQuotaResponse.Success"));
	 
	 	return setResellerUserQuotaResponse;
	}
}