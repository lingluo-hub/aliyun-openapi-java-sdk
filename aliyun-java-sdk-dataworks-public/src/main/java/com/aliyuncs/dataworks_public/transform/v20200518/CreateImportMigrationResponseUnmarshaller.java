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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.CreateImportMigrationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateImportMigrationResponseUnmarshaller {

	public static CreateImportMigrationResponse unmarshall(CreateImportMigrationResponse createImportMigrationResponse, UnmarshallerContext _ctx) {
		
		createImportMigrationResponse.setRequestId(_ctx.stringValue("CreateImportMigrationResponse.RequestId"));
		createImportMigrationResponse.setHttpStatusCode(_ctx.integerValue("CreateImportMigrationResponse.HttpStatusCode"));
		createImportMigrationResponse.setData(_ctx.longValue("CreateImportMigrationResponse.Data"));
		createImportMigrationResponse.setErrorMessage(_ctx.stringValue("CreateImportMigrationResponse.ErrorMessage"));
		createImportMigrationResponse.setErrorCode(_ctx.stringValue("CreateImportMigrationResponse.ErrorCode"));
		createImportMigrationResponse.setSuccess(_ctx.booleanValue("CreateImportMigrationResponse.Success"));
	 
	 	return createImportMigrationResponse;
	}
}