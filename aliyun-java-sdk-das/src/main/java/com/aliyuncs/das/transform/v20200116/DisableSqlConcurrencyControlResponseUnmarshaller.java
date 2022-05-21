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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.DisableSqlConcurrencyControlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableSqlConcurrencyControlResponseUnmarshaller {

	public static DisableSqlConcurrencyControlResponse unmarshall(DisableSqlConcurrencyControlResponse disableSqlConcurrencyControlResponse, UnmarshallerContext _ctx) {
		
		disableSqlConcurrencyControlResponse.setRequestId(_ctx.stringValue("DisableSqlConcurrencyControlResponse.RequestId"));
		disableSqlConcurrencyControlResponse.setCode(_ctx.stringValue("DisableSqlConcurrencyControlResponse.Code"));
		disableSqlConcurrencyControlResponse.setMessage(_ctx.stringValue("DisableSqlConcurrencyControlResponse.Message"));
		disableSqlConcurrencyControlResponse.setData(_ctx.stringValue("DisableSqlConcurrencyControlResponse.Data"));
		disableSqlConcurrencyControlResponse.setSuccess(_ctx.stringValue("DisableSqlConcurrencyControlResponse.Success"));
	 
	 	return disableSqlConcurrencyControlResponse;
	}
}