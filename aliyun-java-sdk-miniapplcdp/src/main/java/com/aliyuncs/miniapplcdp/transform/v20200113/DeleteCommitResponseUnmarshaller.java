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

import com.aliyuncs.miniapplcdp.model.v20200113.DeleteCommitResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.DeleteCommitResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteCommitResponseUnmarshaller {

	public static DeleteCommitResponse unmarshall(DeleteCommitResponse deleteCommitResponse, UnmarshallerContext _ctx) {
		
		deleteCommitResponse.setRequestId(_ctx.stringValue("DeleteCommitResponse.RequestId"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("DeleteCommitResponse.Data.AppId"));
		data.setCommitId(_ctx.stringValue("DeleteCommitResponse.Data.CommitId"));
		data.setCreateTime(_ctx.stringValue("DeleteCommitResponse.Data.CreateTime"));
		data.setCommitLog(_ctx.stringValue("DeleteCommitResponse.Data.CommitLog"));
		data.setMainModuleCommitId(_ctx.stringValue("DeleteCommitResponse.Data.MainModuleCommitId"));
		data.setMainModuleId(_ctx.stringValue("DeleteCommitResponse.Data.MainModuleId"));
		data.setModelDataPath(_ctx.stringValue("DeleteCommitResponse.Data.ModelDataPath"));
		data.setModelDigest(_ctx.mapValue("DeleteCommitResponse.Data.ModelDigest"));
		data.setModifiedTime(_ctx.stringValue("DeleteCommitResponse.Data.ModifiedTime"));
		data.setModuleId(_ctx.stringValue("DeleteCommitResponse.Data.ModuleId"));
		data.setResourceDataPath(_ctx.stringValue("DeleteCommitResponse.Data.ResourceDataPath"));
		data.setResourceDigest(_ctx.mapValue("DeleteCommitResponse.Data.ResourceDigest"));
		data.setRollbackToCommitId(_ctx.stringValue("DeleteCommitResponse.Data.RollbackToCommitId"));
		data.setRollbackType(_ctx.stringValue("DeleteCommitResponse.Data.RollbackType"));
		data.setSchemaVersion(_ctx.stringValue("DeleteCommitResponse.Data.SchemaVersion"));
		data.setCommitType(_ctx.stringValue("DeleteCommitResponse.Data.CommitType"));
		deleteCommitResponse.setData(data);
	 
	 	return deleteCommitResponse;
	}
}