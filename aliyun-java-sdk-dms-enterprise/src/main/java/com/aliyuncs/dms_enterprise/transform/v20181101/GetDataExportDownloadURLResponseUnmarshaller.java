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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.GetDataExportDownloadURLResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataExportDownloadURLResponse.DownloadURLResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataExportDownloadURLResponseUnmarshaller {

	public static GetDataExportDownloadURLResponse unmarshall(GetDataExportDownloadURLResponse getDataExportDownloadURLResponse, UnmarshallerContext _ctx) {
		
		getDataExportDownloadURLResponse.setRequestId(_ctx.stringValue("GetDataExportDownloadURLResponse.RequestId"));
		getDataExportDownloadURLResponse.setErrorCode(_ctx.stringValue("GetDataExportDownloadURLResponse.ErrorCode"));
		getDataExportDownloadURLResponse.setErrorMessage(_ctx.stringValue("GetDataExportDownloadURLResponse.ErrorMessage"));
		getDataExportDownloadURLResponse.setSuccess(_ctx.booleanValue("GetDataExportDownloadURLResponse.Success"));

		DownloadURLResult downloadURLResult = new DownloadURLResult();
		downloadURLResult.setHasResult(_ctx.booleanValue("GetDataExportDownloadURLResponse.DownloadURLResult.HasResult"));
		downloadURLResult.setTipMessage(_ctx.stringValue("GetDataExportDownloadURLResponse.DownloadURLResult.TipMessage"));
		downloadURLResult.setURL(_ctx.stringValue("GetDataExportDownloadURLResponse.DownloadURLResult.URL"));
		getDataExportDownloadURLResponse.setDownloadURLResult(downloadURLResult);
	 
	 	return getDataExportDownloadURLResponse;
	}
}