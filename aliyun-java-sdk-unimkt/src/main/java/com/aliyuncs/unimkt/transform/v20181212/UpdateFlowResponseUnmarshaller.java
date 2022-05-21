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

import com.aliyuncs.unimkt.model.v20181212.UpdateFlowResponse;
import com.aliyuncs.unimkt.model.v20181212.UpdateFlowResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateFlowResponseUnmarshaller {

	public static UpdateFlowResponse unmarshall(UpdateFlowResponse updateFlowResponse, UnmarshallerContext _ctx) {
		
		updateFlowResponse.setRequestId(_ctx.stringValue("UpdateFlowResponse.RequestId"));
		updateFlowResponse.setCode(_ctx.stringValue("UpdateFlowResponse.Code"));
		updateFlowResponse.setMessage(_ctx.stringValue("UpdateFlowResponse.Message"));
		updateFlowResponse.setSuccess(_ctx.booleanValue("UpdateFlowResponse.Success"));

		Model model = new Model();
		model.setType(_ctx.stringValue("UpdateFlowResponse.Model.Type"));
		model.setStatus(_ctx.stringValue("UpdateFlowResponse.Model.Status"));
		model.setChildStatus(_ctx.stringValue("UpdateFlowResponse.Model.ChildStatus"));
		model.setApplyUserId(_ctx.stringValue("UpdateFlowResponse.Model.ApplyUserId"));
		model.setApproveTime(_ctx.longValue("UpdateFlowResponse.Model.ApproveTime"));
		model.setFlowId(_ctx.stringValue("UpdateFlowResponse.Model.FlowId"));
		model.setExtInfo(_ctx.stringValue("UpdateFlowResponse.Model.ExtInfo"));
		model.setGmtModifiedTime(_ctx.longValue("UpdateFlowResponse.Model.GmtModifiedTime"));
		model.setOldData(_ctx.stringValue("UpdateFlowResponse.Model.OldData"));
		model.setGmtCreateTime(_ctx.longValue("UpdateFlowResponse.Model.GmtCreateTime"));
		model.setApproveUserId(_ctx.stringValue("UpdateFlowResponse.Model.ApproveUserId"));
		model.setNewData(_ctx.stringValue("UpdateFlowResponse.Model.NewData"));
		model.setBusinessKey(_ctx.stringValue("UpdateFlowResponse.Model.BusinessKey"));
		model.setReasonType(_ctx.stringValue("UpdateFlowResponse.Model.ReasonType"));
		model.setTenantId(_ctx.stringValue("UpdateFlowResponse.Model.TenantId"));
		updateFlowResponse.setModel(model);
	 
	 	return updateFlowResponse;
	}
}