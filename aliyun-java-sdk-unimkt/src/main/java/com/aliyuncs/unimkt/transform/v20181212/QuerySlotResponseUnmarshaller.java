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

import com.aliyuncs.unimkt.model.v20181212.QuerySlotResponse;
import com.aliyuncs.unimkt.model.v20181212.QuerySlotResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySlotResponseUnmarshaller {

	public static QuerySlotResponse unmarshall(QuerySlotResponse querySlotResponse, UnmarshallerContext _ctx) {
		
		querySlotResponse.setRequestId(_ctx.stringValue("QuerySlotResponse.RequestId"));
		querySlotResponse.setCode(_ctx.stringValue("QuerySlotResponse.Code"));
		querySlotResponse.setMessage(_ctx.stringValue("QuerySlotResponse.Message"));
		querySlotResponse.setSuccess(_ctx.booleanValue("QuerySlotResponse.Success"));

		Model model = new Model();
		model.setCreateTime(_ctx.longValue("QuerySlotResponse.Model.CreateTime"));
		model.setMediaName(_ctx.stringValue("QuerySlotResponse.Model.MediaName"));
		model.setAdSlotType(_ctx.stringValue("QuerySlotResponse.Model.AdSlotType"));
		model.setAdSlotStatus(_ctx.stringValue("QuerySlotResponse.Model.AdSlotStatus"));
		model.setMediaId(_ctx.stringValue("QuerySlotResponse.Model.MediaId"));
		model.setExtInfo(_ctx.stringValue("QuerySlotResponse.Model.ExtInfo"));
		model.setAdSlotName(_ctx.stringValue("QuerySlotResponse.Model.AdSlotName"));
		model.setInspireScene(_ctx.stringValue("QuerySlotResponse.Model.InspireScene"));
		model.setBlockingRule(_ctx.stringValue("QuerySlotResponse.Model.BlockingRule"));
		model.setVersion(_ctx.longValue("QuerySlotResponse.Model.Version"));
		model.setAdSlotId(_ctx.stringValue("QuerySlotResponse.Model.AdSlotId"));
		model.setAdSlotCorporateStatus(_ctx.stringValue("QuerySlotResponse.Model.AdSlotCorporateStatus"));
		model.setAdSlotTemplateId(_ctx.stringValue("QuerySlotResponse.Model.AdSlotTemplateId"));
		model.setModifyTime(_ctx.longValue("QuerySlotResponse.Model.ModifyTime"));
		model.setTenantId(_ctx.stringValue("QuerySlotResponse.Model.TenantId"));
		querySlotResponse.setModel(model);
	 
	 	return querySlotResponse;
	}
}