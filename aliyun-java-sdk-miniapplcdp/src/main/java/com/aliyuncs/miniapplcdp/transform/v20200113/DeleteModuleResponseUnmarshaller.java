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

package com.aliyuncs.miniapplcdp.transform.v20200113;

import com.aliyuncs.miniapplcdp.model.v20200113.DeleteModuleResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.DeleteModuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteModuleResponseUnmarshaller {

	public static DeleteModuleResponse unmarshall(DeleteModuleResponse deleteModuleResponse, UnmarshallerContext _ctx) {
		
		deleteModuleResponse.setRequestId(_ctx.stringValue("DeleteModuleResponse.RequestId"));

		Data data = new Data();
		data.setDescription(_ctx.stringValue("DeleteModuleResponse.Data.Description"));
		data.setCreateTime(_ctx.stringValue("DeleteModuleResponse.Data.CreateTime"));
		data.setModifiedTime(_ctx.stringValue("DeleteModuleResponse.Data.ModifiedTime"));
		data.setIcon(_ctx.stringValue("DeleteModuleResponse.Data.Icon"));
		data.setLatestPublishedCommit(_ctx.stringValue("DeleteModuleResponse.Data.LatestPublishedCommit"));
		data.setLatestPublishedVersion(_ctx.stringValue("DeleteModuleResponse.Data.LatestPublishedVersion"));
		data.setMinimumPlatformVersion(_ctx.stringValue("DeleteModuleResponse.Data.MinimumPlatformVersion"));
		data.setModuleId(_ctx.stringValue("DeleteModuleResponse.Data.ModuleId"));
		data.setModuleName(_ctx.stringValue("DeleteModuleResponse.Data.ModuleName"));
		data.setOwnerUserId(_ctx.stringValue("DeleteModuleResponse.Data.OwnerUserId"));
		data.setPlatform(_ctx.stringValue("DeleteModuleResponse.Data.Platform"));
		deleteModuleResponse.setData(data);
	 
	 	return deleteModuleResponse;
	}
}