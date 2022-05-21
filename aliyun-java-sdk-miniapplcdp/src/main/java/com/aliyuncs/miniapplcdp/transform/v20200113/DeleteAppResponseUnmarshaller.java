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

import com.aliyuncs.miniapplcdp.model.v20200113.DeleteAppResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.DeleteAppResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteAppResponseUnmarshaller {

	public static DeleteAppResponse unmarshall(DeleteAppResponse deleteAppResponse, UnmarshallerContext _ctx) {
		
		deleteAppResponse.setRequestId(_ctx.stringValue("DeleteAppResponse.RequestId"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("DeleteAppResponse.Data.AppId"));
		data.setDescription(_ctx.stringValue("DeleteAppResponse.Data.Description"));
		data.setCreateTime(_ctx.stringValue("DeleteAppResponse.Data.CreateTime"));
		data.setModifiedTime(_ctx.stringValue("DeleteAppResponse.Data.ModifiedTime"));
		data.setIcon(_ctx.stringValue("DeleteAppResponse.Data.Icon"));
		data.setIsTemplate(_ctx.booleanValue("DeleteAppResponse.Data.IsTemplate"));
		data.setLastEditTime(_ctx.stringValue("DeleteAppResponse.Data.LastEditTime"));
		data.setMainModuleId(_ctx.stringValue("DeleteAppResponse.Data.MainModuleId"));
		data.setAppName(_ctx.stringValue("DeleteAppResponse.Data.AppName"));
		data.setSchemaVersion(_ctx.stringValue("DeleteAppResponse.Data.SchemaVersion"));
		data.setSource(_ctx.stringValue("DeleteAppResponse.Data.Source"));
		data.setAppStatus(_ctx.stringValue("DeleteAppResponse.Data.AppStatus"));
		data.setAppType(_ctx.stringValue("DeleteAppResponse.Data.AppType"));
		deleteAppResponse.setData(data);
	 
	 	return deleteAppResponse;
	}
}