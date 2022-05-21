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

package com.aliyuncs.dg.transform.v20190327;

import com.aliyuncs.dg.model.v20190327.DeleteDatabaseAccessPointResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDatabaseAccessPointResponseUnmarshaller {

	public static DeleteDatabaseAccessPointResponse unmarshall(DeleteDatabaseAccessPointResponse deleteDatabaseAccessPointResponse, UnmarshallerContext _ctx) {
		
		deleteDatabaseAccessPointResponse.setRequestId(_ctx.stringValue("DeleteDatabaseAccessPointResponse.RequestId"));
		deleteDatabaseAccessPointResponse.setSuccess(_ctx.booleanValue("DeleteDatabaseAccessPointResponse.Success"));
		deleteDatabaseAccessPointResponse.setCode(_ctx.stringValue("DeleteDatabaseAccessPointResponse.Code"));
		deleteDatabaseAccessPointResponse.setErrorMsg(_ctx.stringValue("DeleteDatabaseAccessPointResponse.ErrorMsg"));
		deleteDatabaseAccessPointResponse.setData(_ctx.stringValue("DeleteDatabaseAccessPointResponse.Data"));
	 
	 	return deleteDatabaseAccessPointResponse;
	}
}