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

import com.aliyuncs.unimkt.model.v20181212.CreateTenantUserResponse;
import com.aliyuncs.unimkt.model.v20181212.CreateTenantUserResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTenantUserResponseUnmarshaller {

	public static CreateTenantUserResponse unmarshall(CreateTenantUserResponse createTenantUserResponse, UnmarshallerContext _ctx) {
		
		createTenantUserResponse.setRequestId(_ctx.stringValue("CreateTenantUserResponse.RequestId"));
		createTenantUserResponse.setCode(_ctx.stringValue("CreateTenantUserResponse.Code"));
		createTenantUserResponse.setMessage(_ctx.stringValue("CreateTenantUserResponse.Message"));
		createTenantUserResponse.setSuccess(_ctx.booleanValue("CreateTenantUserResponse.Success"));

		Model model = new Model();
		model.setStatus(_ctx.stringValue("CreateTenantUserResponse.Model.Status"));
		model.setSettleInfo(_ctx.stringValue("CreateTenantUserResponse.Model.SettleInfo"));
		model.setOriginSiteUserId(_ctx.stringValue("CreateTenantUserResponse.Model.OriginSiteUserId"));
		model.setOriginSiteUserName(_ctx.stringValue("CreateTenantUserResponse.Model.OriginSiteUserName"));
		model.setCreateTime(_ctx.longValue("CreateTenantUserResponse.Model.CreateTime"));
		model.setTenantName(_ctx.stringValue("CreateTenantUserResponse.Model.TenantName"));
		model.setUserId(_ctx.stringValue("CreateTenantUserResponse.Model.UserId"));
		model.setBusiness(_ctx.stringValue("CreateTenantUserResponse.Model.Business"));
		model.setExtInfo(_ctx.stringValue("CreateTenantUserResponse.Model.ExtInfo"));
		model.setVersion(_ctx.stringValue("CreateTenantUserResponse.Model.Version"));
		model.setOriginSite(_ctx.stringValue("CreateTenantUserResponse.Model.OriginSite"));
		model.setUserName(_ctx.stringValue("CreateTenantUserResponse.Model.UserName"));
		model.setModifyTime(_ctx.longValue("CreateTenantUserResponse.Model.ModifyTime"));
		model.setTenantId(_ctx.stringValue("CreateTenantUserResponse.Model.TenantId"));
		createTenantUserResponse.setModel(model);
	 
	 	return createTenantUserResponse;
	}
}