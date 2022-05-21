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

import com.aliyuncs.miniapplcdp.model.v20200113.UpdateResourceResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.UpdateResourceResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateResourceResponseUnmarshaller {

	public static UpdateResourceResponse unmarshall(UpdateResourceResponse updateResourceResponse, UnmarshallerContext _ctx) {
		
		updateResourceResponse.setRequestId(_ctx.stringValue("UpdateResourceResponse.RequestId"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("UpdateResourceResponse.Data.AppId"));
		data.setContent(_ctx.mapValue("UpdateResourceResponse.Data.Content"));
		data.setCreateTime(_ctx.stringValue("UpdateResourceResponse.Data.CreateTime"));
		data.setDescription(_ctx.stringValue("UpdateResourceResponse.Data.Description"));
		data.setModifiedTime(_ctx.stringValue("UpdateResourceResponse.Data.ModifiedTime"));
		data.setModuleId(_ctx.stringValue("UpdateResourceResponse.Data.ModuleId"));
		data.setResourceName(_ctx.stringValue("UpdateResourceResponse.Data.ResourceName"));
		data.setResourceId(_ctx.stringValue("UpdateResourceResponse.Data.ResourceId"));
		data.setRevision(_ctx.integerValue("UpdateResourceResponse.Data.Revision"));
		data.setSchemaVersion(_ctx.stringValue("UpdateResourceResponse.Data.SchemaVersion"));
		data.setResourceType(_ctx.stringValue("UpdateResourceResponse.Data.ResourceType"));
		updateResourceResponse.setData(data);
	 
	 	return updateResourceResponse;
	}
}