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

import com.aliyuncs.unimkt.model.v20181212.ModifySlotResponse;
import com.aliyuncs.unimkt.model.v20181212.ModifySlotResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifySlotResponseUnmarshaller {

	public static ModifySlotResponse unmarshall(ModifySlotResponse modifySlotResponse, UnmarshallerContext _ctx) {
		
		modifySlotResponse.setRequestId(_ctx.stringValue("ModifySlotResponse.RequestId"));
		modifySlotResponse.setCode(_ctx.stringValue("ModifySlotResponse.Code"));
		modifySlotResponse.setMessage(_ctx.stringValue("ModifySlotResponse.Message"));
		modifySlotResponse.setSuccess(_ctx.booleanValue("ModifySlotResponse.Success"));

		Model model = new Model();
		model.setCreateTime(_ctx.longValue("ModifySlotResponse.Model.CreateTime"));
		model.setMediaName(_ctx.stringValue("ModifySlotResponse.Model.MediaName"));
		model.setAdSlotType(_ctx.stringValue("ModifySlotResponse.Model.AdSlotType"));
		model.setAdSlotStatus(_ctx.stringValue("ModifySlotResponse.Model.AdSlotStatus"));
		model.setMediaId(_ctx.stringValue("ModifySlotResponse.Model.MediaId"));
		model.setExtInfo(_ctx.stringValue("ModifySlotResponse.Model.ExtInfo"));
		model.setAdSlotName(_ctx.stringValue("ModifySlotResponse.Model.AdSlotName"));
		model.setInspireScene(_ctx.stringValue("ModifySlotResponse.Model.InspireScene"));
		model.setBlockingRule(_ctx.stringValue("ModifySlotResponse.Model.BlockingRule"));
		model.setVersion(_ctx.longValue("ModifySlotResponse.Model.Version"));
		model.setAdSlotId(_ctx.stringValue("ModifySlotResponse.Model.AdSlotId"));
		model.setAdSlotCorporateStatus(_ctx.stringValue("ModifySlotResponse.Model.AdSlotCorporateStatus"));
		model.setAdSlotTemplateId(_ctx.stringValue("ModifySlotResponse.Model.AdSlotTemplateId"));
		model.setModifyTime(_ctx.longValue("ModifySlotResponse.Model.ModifyTime"));
		model.setTenantId(_ctx.stringValue("ModifySlotResponse.Model.TenantId"));
		modifySlotResponse.setModel(model);
	 
	 	return modifySlotResponse;
	}
}