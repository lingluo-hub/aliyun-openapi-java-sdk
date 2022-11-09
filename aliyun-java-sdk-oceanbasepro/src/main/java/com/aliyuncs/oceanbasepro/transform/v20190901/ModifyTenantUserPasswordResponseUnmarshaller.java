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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import com.aliyuncs.oceanbasepro.model.v20190901.ModifyTenantUserPasswordResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyTenantUserPasswordResponseUnmarshaller {

	public static ModifyTenantUserPasswordResponse unmarshall(ModifyTenantUserPasswordResponse modifyTenantUserPasswordResponse, UnmarshallerContext _ctx) {
		
		modifyTenantUserPasswordResponse.setRequestId(_ctx.stringValue("ModifyTenantUserPasswordResponse.RequestId"));
	 
	 	return modifyTenantUserPasswordResponse;
	}
}