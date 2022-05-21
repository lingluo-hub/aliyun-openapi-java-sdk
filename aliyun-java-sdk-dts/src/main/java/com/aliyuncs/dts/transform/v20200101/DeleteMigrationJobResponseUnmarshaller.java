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

package com.aliyuncs.dts.transform.v20200101;

import com.aliyuncs.dts.model.v20200101.DeleteMigrationJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMigrationJobResponseUnmarshaller {

	public static DeleteMigrationJobResponse unmarshall(DeleteMigrationJobResponse deleteMigrationJobResponse, UnmarshallerContext _ctx) {
		
		deleteMigrationJobResponse.setRequestId(_ctx.stringValue("DeleteMigrationJobResponse.RequestId"));
		deleteMigrationJobResponse.setErrCode(_ctx.stringValue("DeleteMigrationJobResponse.ErrCode"));
		deleteMigrationJobResponse.setSuccess(_ctx.stringValue("DeleteMigrationJobResponse.Success"));
		deleteMigrationJobResponse.setErrMessage(_ctx.stringValue("DeleteMigrationJobResponse.ErrMessage"));
	 
	 	return deleteMigrationJobResponse;
	}
}