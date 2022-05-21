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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QueryOTAFirmwareResponse;
import com.aliyuncs.iot.model.v20180120.QueryOTAFirmwareResponse.FirmwareInfo;
import com.aliyuncs.iot.model.v20180120.QueryOTAFirmwareResponse.FirmwareInfo.OtaPackageFileDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOTAFirmwareResponseUnmarshaller {

	public static QueryOTAFirmwareResponse unmarshall(QueryOTAFirmwareResponse queryOTAFirmwareResponse, UnmarshallerContext _ctx) {
		
		queryOTAFirmwareResponse.setRequestId(_ctx.stringValue("QueryOTAFirmwareResponse.RequestId"));
		queryOTAFirmwareResponse.setSuccess(_ctx.booleanValue("QueryOTAFirmwareResponse.Success"));
		queryOTAFirmwareResponse.setCode(_ctx.stringValue("QueryOTAFirmwareResponse.Code"));
		queryOTAFirmwareResponse.setErrorMessage(_ctx.stringValue("QueryOTAFirmwareResponse.ErrorMessage"));

		FirmwareInfo firmwareInfo = new FirmwareInfo();
		firmwareInfo.setFirmwareName(_ctx.stringValue("QueryOTAFirmwareResponse.FirmwareInfo.FirmwareName"));
		firmwareInfo.setFirmwareId(_ctx.stringValue("QueryOTAFirmwareResponse.FirmwareInfo.FirmwareId"));
		firmwareInfo.setSrcVersion(_ctx.stringValue("QueryOTAFirmwareResponse.FirmwareInfo.SrcVersion"));
		firmwareInfo.setDestVersion(_ctx.stringValue("QueryOTAFirmwareResponse.FirmwareInfo.DestVersion"));
		firmwareInfo.setUtcCreate(_ctx.stringValue("QueryOTAFirmwareResponse.FirmwareInfo.UtcCreate"));
		firmwareInfo.setUtcModified(_ctx.stringValue("QueryOTAFirmwareResponse.FirmwareInfo.UtcModified"));
		firmwareInfo.setStatus(_ctx.integerValue("QueryOTAFirmwareResponse.FirmwareInfo.Status"));
		firmwareInfo.setFirmwareDesc(_ctx.stringValue("QueryOTAFirmwareResponse.FirmwareInfo.FirmwareDesc"));
		firmwareInfo.setFirmwareSign(_ctx.stringValue("QueryOTAFirmwareResponse.FirmwareInfo.FirmwareSign"));
		firmwareInfo.setFirmwareSize(_ctx.integerValue("QueryOTAFirmwareResponse.FirmwareInfo.FirmwareSize"));
		firmwareInfo.setFirmwareUrl(_ctx.stringValue("QueryOTAFirmwareResponse.FirmwareInfo.FirmwareUrl"));
		firmwareInfo.setProductKey(_ctx.stringValue("QueryOTAFirmwareResponse.FirmwareInfo.ProductKey"));
		firmwareInfo.setSignMethod(_ctx.stringValue("QueryOTAFirmwareResponse.FirmwareInfo.SignMethod"));
		firmwareInfo.setProductName(_ctx.stringValue("QueryOTAFirmwareResponse.FirmwareInfo.ProductName"));
		firmwareInfo.setType(_ctx.integerValue("QueryOTAFirmwareResponse.FirmwareInfo.Type"));
		firmwareInfo.setVerifyProgress(_ctx.integerValue("QueryOTAFirmwareResponse.FirmwareInfo.VerifyProgress"));
		firmwareInfo.setModuleName(_ctx.stringValue("QueryOTAFirmwareResponse.FirmwareInfo.ModuleName"));
		firmwareInfo.setUdi(_ctx.stringValue("QueryOTAFirmwareResponse.FirmwareInfo.Udi"));

		List<OtaPackageFileDTO> multiFiles = new ArrayList<OtaPackageFileDTO>();
		for (int i = 0; i < _ctx.lengthValue("QueryOTAFirmwareResponse.FirmwareInfo.MultiFiles.Length"); i++) {
			OtaPackageFileDTO otaPackageFileDTO = new OtaPackageFileDTO();
			otaPackageFileDTO.setName(_ctx.stringValue("QueryOTAFirmwareResponse.FirmwareInfo.MultiFiles["+ i +"].Name"));
			otaPackageFileDTO.setSize(_ctx.integerValue("QueryOTAFirmwareResponse.FirmwareInfo.MultiFiles["+ i +"].Size"));
			otaPackageFileDTO.setUrl(_ctx.stringValue("QueryOTAFirmwareResponse.FirmwareInfo.MultiFiles["+ i +"].Url"));
			otaPackageFileDTO.setSignValue(_ctx.stringValue("QueryOTAFirmwareResponse.FirmwareInfo.MultiFiles["+ i +"].SignValue"));
			otaPackageFileDTO.setFileMd5(_ctx.stringValue("QueryOTAFirmwareResponse.FirmwareInfo.MultiFiles["+ i +"].FileMd5"));

			multiFiles.add(otaPackageFileDTO);
		}
		firmwareInfo.setMultiFiles(multiFiles);
		queryOTAFirmwareResponse.setFirmwareInfo(firmwareInfo);
	 
	 	return queryOTAFirmwareResponse;
	}
}