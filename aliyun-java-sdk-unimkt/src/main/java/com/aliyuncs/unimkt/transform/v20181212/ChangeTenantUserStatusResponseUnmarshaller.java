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

import com.aliyuncs.unimkt.model.v20181212.ChangeTenantUserStatusResponse;
import com.aliyuncs.unimkt.model.v20181212.ChangeTenantUserStatusResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChangeTenantUserStatusResponseUnmarshaller {

	public static ChangeTenantUserStatusResponse unmarshall(ChangeTenantUserStatusResponse changeTenantUserStatusResponse, UnmarshallerContext _ctx) {
		
		changeTenantUserStatusResponse.setRequestId(_ctx.stringValue("ChangeTenantUserStatusResponse.RequestId"));
		changeTenantUserStatusResponse.setCode(_ctx.stringValue("ChangeTenantUserStatusResponse.Code"));
		changeTenantUserStatusResponse.setMessage(_ctx.stringValue("ChangeTenantUserStatusResponse.Message"));
		changeTenantUserStatusResponse.setSuccess(_ctx.booleanValue("ChangeTenantUserStatusResponse.Success"));

		Model model = new Model();
		model.setStatus(_ctx.stringValue("ChangeTenantUserStatusResponse.Model.Status"));
		model.setOriginSiteUserId(_ctx.stringValue("ChangeTenantUserStatusResponse.Model.OriginSiteUserId"));
		model.setCreateTime(_ctx.longValue("ChangeTenantUserStatusResponse.Model.CreateTime"));
		model.setTenantName(_ctx.stringValue("ChangeTenantUserStatusResponse.Model.TenantName"));
		model.setOriginSiteUserName(_ctx.stringValue("ChangeTenantUserStatusResponse.Model.OriginSiteUserName"));
		model.setUserId(_ctx.stringValue("ChangeTenantUserStatusResponse.Model.UserId"));
		model.setBusiness(_ctx.stringValue("ChangeTenantUserStatusResponse.Model.Business"));
		model.setExtInfo(_ctx.stringValue("ChangeTenantUserStatusResponse.Model.ExtInfo"));
		model.setVersion(_ctx.longValue("ChangeTenantUserStatusResponse.Model.Version"));
		model.setOriginSite(_ctx.stringValue("ChangeTenantUserStatusResponse.Model.OriginSite"));
		model.setUserName(_ctx.stringValue("ChangeTenantUserStatusResponse.Model.UserName"));
		model.setModifyTime(_ctx.longValue("ChangeTenantUserStatusResponse.Model.ModifyTime"));
		model.setTenantId(_ctx.stringValue("ChangeTenantUserStatusResponse.Model.TenantId"));
		changeTenantUserStatusResponse.setModel(model);
	 
	 	return changeTenantUserStatusResponse;
	}
}