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

package com.aliyuncs.quickbi_public.transform.v20220101;

import com.aliyuncs.quickbi_public.model.v20220101.AddUserResponse;
import com.aliyuncs.quickbi_public.model.v20220101.AddUserResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddUserResponseUnmarshaller {

	public static AddUserResponse unmarshall(AddUserResponse addUserResponse, UnmarshallerContext _ctx) {
		
		addUserResponse.setRequestId(_ctx.stringValue("AddUserResponse.RequestId"));
		addUserResponse.setSuccess(_ctx.booleanValue("AddUserResponse.Success"));

		Result result = new Result();
		result.setUserType(_ctx.integerValue("AddUserResponse.Result.UserType"));
		result.setEmail(_ctx.stringValue("AddUserResponse.Result.Email"));
		result.setUserId(_ctx.stringValue("AddUserResponse.Result.UserId"));
		result.setAuthAdminUser(_ctx.booleanValue("AddUserResponse.Result.AuthAdminUser"));
		result.setNickName(_ctx.stringValue("AddUserResponse.Result.NickName"));
		result.setAdminUser(_ctx.booleanValue("AddUserResponse.Result.AdminUser"));
		result.setPhone(_ctx.stringValue("AddUserResponse.Result.Phone"));
		result.setAccountName(_ctx.stringValue("AddUserResponse.Result.AccountName"));
		addUserResponse.setResult(result);
	 
	 	return addUserResponse;
	}
}