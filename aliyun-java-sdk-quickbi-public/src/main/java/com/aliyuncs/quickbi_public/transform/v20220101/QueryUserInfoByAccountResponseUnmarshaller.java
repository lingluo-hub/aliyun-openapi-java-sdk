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

import com.aliyuncs.quickbi_public.model.v20220101.QueryUserInfoByAccountResponse;
import com.aliyuncs.quickbi_public.model.v20220101.QueryUserInfoByAccountResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUserInfoByAccountResponseUnmarshaller {

	public static QueryUserInfoByAccountResponse unmarshall(QueryUserInfoByAccountResponse queryUserInfoByAccountResponse, UnmarshallerContext _ctx) {
		
		queryUserInfoByAccountResponse.setRequestId(_ctx.stringValue("QueryUserInfoByAccountResponse.RequestId"));
		queryUserInfoByAccountResponse.setSuccess(_ctx.booleanValue("QueryUserInfoByAccountResponse.Success"));

		Result result = new Result();
		result.setUserType(_ctx.integerValue("QueryUserInfoByAccountResponse.Result.UserType"));
		result.setEmail(_ctx.stringValue("QueryUserInfoByAccountResponse.Result.Email"));
		result.setUserId(_ctx.stringValue("QueryUserInfoByAccountResponse.Result.UserId"));
		result.setAuthAdminUser(_ctx.booleanValue("QueryUserInfoByAccountResponse.Result.AuthAdminUser"));
		result.setAccountId(_ctx.stringValue("QueryUserInfoByAccountResponse.Result.AccountId"));
		result.setNickName(_ctx.stringValue("QueryUserInfoByAccountResponse.Result.NickName"));
		result.setAdminUser(_ctx.booleanValue("QueryUserInfoByAccountResponse.Result.AdminUser"));
		result.setPhone(_ctx.stringValue("QueryUserInfoByAccountResponse.Result.Phone"));
		result.setAccountName(_ctx.stringValue("QueryUserInfoByAccountResponse.Result.AccountName"));
		queryUserInfoByAccountResponse.setResult(result);
	 
	 	return queryUserInfoByAccountResponse;
	}
}