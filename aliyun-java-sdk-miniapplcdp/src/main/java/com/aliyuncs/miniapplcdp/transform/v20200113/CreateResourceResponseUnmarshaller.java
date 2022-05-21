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

import com.aliyuncs.miniapplcdp.model.v20200113.CreateResourceResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.CreateResourceResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateResourceResponseUnmarshaller {

	public static CreateResourceResponse unmarshall(CreateResourceResponse createResourceResponse, UnmarshallerContext _ctx) {
		
		createResourceResponse.setRequestId(_ctx.stringValue("CreateResourceResponse.RequestId"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("CreateResourceResponse.Data.AppId"));
		data.setContent(_ctx.mapValue("CreateResourceResponse.Data.Content"));
		data.setCreateTime(_ctx.stringValue("CreateResourceResponse.Data.CreateTime"));
		data.setDescription(_ctx.stringValue("CreateResourceResponse.Data.Description"));
		data.setModifiedTime(_ctx.stringValue("CreateResourceResponse.Data.ModifiedTime"));
		data.setModuleId(_ctx.stringValue("CreateResourceResponse.Data.ModuleId"));
		data.setResourceName(_ctx.stringValue("CreateResourceResponse.Data.ResourceName"));
		data.setResourceId(_ctx.stringValue("CreateResourceResponse.Data.ResourceId"));
		data.setRevision(_ctx.integerValue("CreateResourceResponse.Data.Revision"));
		data.setSchemaVersion(_ctx.stringValue("CreateResourceResponse.Data.SchemaVersion"));
		data.setResourceType(_ctx.stringValue("CreateResourceResponse.Data.ResourceType"));
		createResourceResponse.setData(data);
	 
	 	return createResourceResponse;
	}
}