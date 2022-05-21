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

package com.aliyuncs.unimkt.transform.v20181212;

import com.aliyuncs.unimkt.model.v20181212.QueryTenantUserByUserIdResponse;
import com.aliyuncs.unimkt.model.v20181212.QueryTenantUserByUserIdResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTenantUserByUserIdResponseUnmarshaller {

	public static QueryTenantUserByUserIdResponse unmarshall(QueryTenantUserByUserIdResponse queryTenantUserByUserIdResponse, UnmarshallerContext _ctx) {
		
		queryTenantUserByUserIdResponse.setRequestId(_ctx.stringValue("QueryTenantUserByUserIdResponse.RequestId"));
		queryTenantUserByUserIdResponse.setCode(_ctx.stringValue("QueryTenantUserByUserIdResponse.Code"));
		queryTenantUserByUserIdResponse.setMessage(_ctx.stringValue("QueryTenantUserByUserIdResponse.Message"));
		queryTenantUserByUserIdResponse.setSuccess(_ctx.booleanValue("QueryTenantUserByUserIdResponse.Success"));

		Model model = new Model();
		model.setStatus(_ctx.stringValue("QueryTenantUserByUserIdResponse.Model.Status"));
		model.setOriginSiteUserId(_ctx.stringValue("QueryTenantUserByUserIdResponse.Model.OriginSiteUserId"));
		model.setCreateTime(_ctx.longValue("QueryTenantUserByUserIdResponse.Model.CreateTime"));
		model.setTenantName(_ctx.stringValue("QueryTenantUserByUserIdResponse.Model.TenantName"));
		model.setOriginSiteUserName(_ctx.stringValue("QueryTenantUserByUserIdResponse.Model.OriginSiteUserName"));
		model.setUserId(_ctx.stringValue("QueryTenantUserByUserIdResponse.Model.UserId"));
		model.setBusiness(_ctx.stringValue("QueryTenantUserByUserIdResponse.Model.Business"));
		model.setExtInfo(_ctx.stringValue("QueryTenantUserByUserIdResponse.Model.ExtInfo"));
		model.setVersion(_ctx.longValue("QueryTenantUserByUserIdResponse.Model.Version"));
		model.setOriginSite(_ctx.stringValue("QueryTenantUserByUserIdResponse.Model.OriginSite"));
		model.setUserName(_ctx.stringValue("QueryTenantUserByUserIdResponse.Model.UserName"));
		model.setModifyTime(_ctx.longValue("QueryTenantUserByUserIdResponse.Model.ModifyTime"));
		model.setTenantId(_ctx.stringValue("QueryTenantUserByUserIdResponse.Model.TenantId"));
		queryTenantUserByUserIdResponse.setModel(model);
	 
	 	return queryTenantUserByUserIdResponse;
	}
}